<h3 align="center" style="margin:0px">
	<img width="200" src="https://2wz2rk1b7g6s3mm3mk3dj0lh-wpengine.netdna-ssl.com/wp-content/uploads/2018/08/kinetica_logo.svg" alt="Kinetica Logo"/>
</h3>
<h5 align="center" style="margin:0px">
	<a href="https://www.kinetica.com/">Website</a>
	|
	<a href="https://docs.kinetica.com/7.1/">Docs</a>
	|
	<a href="https://docs.kinetica.com/7.1/api/java/">API Docs</a>
	|
	<a href="https://join.slack.com/t/kinetica-community/shared_invite/zt-1bt9x3mvr-uMKrXlSDXfy3oU~sKi84qg">Community Slack</a>   
</h5>


# Kinetica Java API

-  [Overview](#overview)
-  [API](#api)
-  [Example](#example)
-  [Support](#support)
-  [Contact Us](#contact-us)
 

## Overview

There are two projects in this repository: the Kinetica Java API and an example
project.


## API

In the `api` directory, run the following command to create the API JAR:

```
> mvn clean package
```


In order to use the API JAR for the example, run the following command to
install the JAR in the local repository:

```
> mvn install
```


The documentation can be found at https://docs.kinetica.com/7.1/.
The Java specific documentation can be found at:

* https://docs.kinetica.com/7.1/guides/java_guide/
* https://docs.kinetica.com/7.1/api/java/


For changes to the client-side API, please refer to
[CHANGELOG.md](CHANGELOG.md).  For
changes to Kinetica functions, please refer to
[CHANGELOG-FUNCTIONS.md](CHANGELOG-FUNCTIONS.md).


### KIFS File upload and download facility

The purpose of this API is to facilitate uploading of files into KIFS from a
local directory and downloading from the KIFS into a local directory. There
are multiple methods available for uploading and downloading files. This new
facility is available for Kinetica version `7.1.4.0` onwards.

#### GPUdbFileHandler API

The `upload` and the `download` methods of the class
[GPUdbFileHandler](api/src/main/java/com/gpudb/filesystem/GPUdbFileHandler.java)
are overloaded to accommodate either a single file name, or a list of file names
to upload to or download from KIFS.

The following methods are available -
-    `upload` - Has multiple overloads for uploading single/multiple files.
-    `download` - Has similar overloads as uploads for downloading files.



### API Logging

The Java API uses the Simple Logging Facade for Java (SLF4J) with Logback as the
default backend for flexibility and convenience. Users of the API are encouraged
to use the SLF4J logging interface as well.

```
{
    // Example of creating and using a SLF4J logger a java class file.
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    ...
    private static Logger LOGGER = LoggerFactory.getLogger(Example.class);
    ...
    LOGGER.warn("..."); // trace(), debug(), info(), warn(), error()
}
```

The default logging level is `INFO` and output will be sent to a `STDOUT`
 appender.  The `com.gpudb` logging level can be set by a system property when
running a JAR with the arg `-Dlogging.level.com.gpudb=DEBUG` and a convenience
function has been added to change the level from Java code.

```
com.gpudb.GPUdbLogger.setLoggingLevel("DEBUG");
```

A complete Logback logging configuration can be specified with a
`logback.xml` resource file in the application POM or on the
command-line when running the JAR with a
`-Dlogback.configurationFile=/path/to/logback.xml` arg.  See the Kinetica API's
[logback.xml](api/src/main/resources/logback.xml) file for an example of a
`STDOUT` logger.  The full documentation, including examples, of a Logback
configuration file can be found here:
https://logback.qos.ch/manual/configuration.html

```
    <!-- Example resource for logback configuration file in an application pom.xml file. -->
    <resource>
        <directory>src/main/resources</directory>
        <includes>
            <include>logback.xml</include>
        </includes>
    </resource>
```

The SLF4J logger backend can be changed to any of the supported backends,
including log4j, by requiring the appropriate wrapper package and excluding the
`logback-classic` backend. See https://www.slf4j.org/legacy.html for
more information. Note that if the SLF4J backend is changed from Logback the
convenience function `GPUdbLogger.setLoggingLevel()` and the system parameter
`logging.level.com.gpudb` will not work to change the log level. The level
will have to be set using the new logger implementation.

```
    <!-- Example of log4j2 as the slf4j backend for the application and GPUdb API in a pom.xml file. -->
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-api</artifactId>
        <version>2.7</version>
    </dependency>
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.7</version>
    </dependency>
    <dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-slf4j-impl</artifactId>
        <version>2.7</version>
    </dependency>
    <dependency>
        <groupId>com.gpudb</groupId>
        <artifactId>gpudb-api</artifactId>
        <version>${gpudb-api.version}</version>
        <exclusions>
            <exclusion>
                <groupId>ch.qos.logback</groupId>
                <artifactId>logback-classic</artifactId>
            </exclusion>
        </exclusions>
    </dependency>

    ...

    <resource>
        <directory>src/main/resources</directory>
        <includes>
            <include>log4j2.xml</include>
        </includes>
    </resource>
```



### SSL Configuration

When the Kinetica server is configured to use SSL, the root certificate needs
to be installed in the client machine for the API to successfully make secured
connections with the server.  Please ensure that the root certificate is either
installed in the default java key store (JKS), or supply the separate certificate
JKS and its password to the API via the following two system environment
variables:

* `javax.net.ssl.trustStore`
* `javax.net.ssl.trustStorePassword`

This can be done by setting the Java Runtime Environment (JRE) variables at the
command line by using the following arguments:

* `-Djavax.net.ssl.trustStore`
* `-Djavax.net.ssl.trustStorePassword`

The environment variables can also be programmatically set from applications
that use the Java API:

```
System.setProperty( "javax.net.ssl.trustStore", trustStorePath );
System.setProperty( "javax.net.ssl.trustStorePassword", trustStorePassword );
```



## Example

To build the JAR, run the following command in the example directory:

```
> mvn clean package
```

Then, to run the example, in the target directory, run the following command:

```
> java -jar gpudb-api-example-1.0-jar-with-dependencies.jar
```

To provide the URL of the Kinetica server and/or configure the log level,
use the following options:

```
> java -DlogLevel=debug -Durl=http://172.42.0.80:9191 \
     -jar gpudb-api-example-1.0-jar-with-dependencies.jar
```

Note that the default URL is `http://localhost:9191`.
Also note that the two options, if given, must precede the `-jar` option.

Please make sure that Kinetica is running at the URL and port specified in
line 4 of [Example.java](example/src/main/java/com/gpudb/example/Example.java)
(the default is `http://localhost:9191`).

### GPUdbFileHandler Example
An example usage of the API can be found in the `gpudb-api-example` project
in the file
[GPUdbFileHandlerExample.java](example/src/main/java/com/gpudb/example/GPUdbFileHandlerExample.java).
The example can be run using the command -

```
> java -Durl="http://10.0.0.10:9191" -DlogLevel="INFO" \
-cp ./target/gpudb-api-example-1.0-jar-with-dependencies.jar \
com.gpudb.example.GPUdbFileHandlerExample
```

The URL VM argument needs to be changed suitably to match the exact environment.


## Support

For bugs, please submit an
[issue on Github](https://github.com/kineticadb/kinetica-api-java/issues).

For support, you can post on
[stackoverflow](https://stackoverflow.com/questions/tagged/kinetica) under the
``kinetica`` tag or
[Slack](https://join.slack.com/t/kinetica-community/shared_invite/zt-1bt9x3mvr-uMKrXlSDXfy3oU~sKi84qg).


## Contact Us

* Ask a question on Slack:
  [Slack](https://join.slack.com/t/kinetica-community/shared_invite/zt-1bt9x3mvr-uMKrXlSDXfy3oU~sKi84qg)
* Follow on GitHub:
  [Follow @kineticadb](https://github.com/kineticadb) 
* Email us:  <support@kinetica.com>
* Visit:  <https://www.kinetica.com/contact/>

package com.gpudb;

import java.util.Map;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.api.LayoutComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.apache.logging.log4j.core.layout.PatternLayout;

public class GPUdbLogger {

    // The default logging level--off
    protected static final Level DEFAULT_LOGGING_LEVEL = Level.OFF;

    // The name of the logger for this API
    protected static final String API_LOGGER_NAME = "Kinetica Java API";

    // The loggers used for dependent libraries that might have obnxious
    // default log levels
    protected static final String DEP_LIB_APACHE_CLIENT_LOGGER = "org.apache.http";


    // Actual logger used for the API
    private static Logger LOG = LogManager.getLogger( API_LOGGER_NAME );


    /**
     * Initializes the logger with the given logging level.  It is
     * **crucial** to call this method before using the logger.  This method
     * serves the following purpose:
     * * If no log4j.properties or any other properties file is found
     *   in the class path of the application that uses this API, log4j
     *   emits warnings about not finding any appender.  This method
     *   prevents that from happening.
     * * Older versions of the API did not have logging, so suddenly having
     *   logging might throw off end user applications.  So, by default,
     *   we turn off logging (controlled by the static final member above).
     * * If no logging properties were provided by the end-user, then suppress
     *   the obnoxious debug logging that is turned on by default by the Apache
     *   HTTPClient library.
     * * If the given log level is different from the default, set it explicitly.
     */
    public static void initializeLogger( Level loggingLevel ) {
        Logger rootLogger = LogManager.getRootLogger();

        // Check for appenders--if none found, then that means the
        // end-user application has not supplied any logging properties
        // (which indicates that they probably don't expect any logging).
        Map<String, Appender> appenders = ((org.apache.logging.log4j.core.Logger)rootLogger).getAppenders();
        boolean isLoggerConfiguredByUser = !appenders.isEmpty();

        if ( !isLoggerConfiguredByUser ) {
            // No appender is found; suppress log4j warnings by explicitly
            // getting the logger for the API
            LOG = LogManager.getLogger( API_LOGGER_NAME );

            ConfigurationBuilder<BuiltConfiguration> builder =
                    ConfigurationBuilderFactory.newConfigurationBuilder();
            
            LayoutComponentBuilder patternLayout = builder
                    .newLayout(PatternLayout.class.getSimpleName())
                    .addAttribute("pattern", "%d{yyyy-MM-dd HH:mm:ss} %-5p  %m%n");
            
            AppenderComponentBuilder consoleAppender = builder
                    .newAppender("stdout", "Console")
                    .add(patternLayout);
            
            Configurator.initialize(builder.add(consoleAppender).build());

            // Set the API's log level
            LOG.atLevel( loggingLevel );

            // Set the Apache HTTPClient log leve as well
            LogManager.getLogger( DEP_LIB_APACHE_CLIENT_LOGGER ).atLevel( loggingLevel );
        } else {
            // If the log level is different from the default, set it explicitly
            if ( !loggingLevel.equals( DEFAULT_LOGGING_LEVEL ) ) {
                LOG.atLevel( loggingLevel );
                LOG.warn( "Log properties set, but the log level is also "
                          + "programmatically set by the user ('"
                          + loggingLevel.toString()
                          + "'); using that one and ignoring the one in "
                          + "the properties.");
            }

            // Some logging properties found; check if the libraries that this
            // API uses have log levels defined in the properties.  If not, we
            // will turn them off (at least the obnoxious ones).  For that, first
            // look for such loggers in the user given properties.
            boolean isApacheHttpClientLoggerFound =
                LogManager.getContext().hasLogger(DEP_LIB_APACHE_CLIENT_LOGGER);

            // Mute the obnoxious logs if not set by the user
            if ( !isApacheHttpClientLoggerFound ) {
                LogManager.getLogger( DEP_LIB_APACHE_CLIENT_LOGGER ).atLevel( Level.OFF );
            }
        }
    }   // end initializeLogger


    public static void info(String message) {
        LOG.info( message );
    }

    public static void error(String message) {
        LOG.error( message );
    }

    public static void warn(String message) {
        LOG.warn( message );
    }

    public static void fatal(String message) {
        LOG.fatal( message );
    }


    public static void debug(String message) {
        LOG.debug( message );
    }


    public static void trace(String message) {
        LOG.trace( message );
    }


    /**
     * Print extra information with the debug message.
     */
    public static void debug_with_info(String message) {
        if ( ( LOG.getLevel() == Level.DEBUG )
             || ( LOG.getLevel() == Level.TRACE )
             || ( LOG.getLevel() == Level.ALL ) ) {
            // Getting the line number is expensive, so only do this
            // if the appropriate log level is chosen
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

            // We want the calling method and class name and the line number
            StackTraceElement callingPoint = stackTrace[ 2 ];

            // Build the message
            StringBuilder builder = new StringBuilder();
            builder.append( "[" );
            builder.append( callingPoint.toString() );
            builder.append( "] " );
            builder.append( message );

            // Finally, log the debug message
            LOG.debug( builder.toString() );
        } else {
            // Nothing fancy to calculate if the log level is not debug
            LOG.debug( message );
        }
    }


    /**
     * Print extra information with the trace message.
     */
    public static void trace_with_info(String message) {
        if ( ( LOG.getLevel() == Level.TRACE )
             || ( LOG.getLevel() == Level.ALL ) ) {
            // Getting the line number is expensive, so only do this
            // if the appropriate log level is chosen
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

            // We want the calling method and class name and the line number
            StackTraceElement callingPoint = stackTrace[ 2 ];

            // Build the message
            StringBuilder builder = new StringBuilder();
            builder.append( "[" );
            builder.append( callingPoint.toString() );
            builder.append( "] " );
            builder.append( message );

            // Finally, log the debug message
            LOG.trace( builder.toString() );
        } else {
            // Nothing fancy to calculate if the log level is not debug
            LOG.trace( message );
        }
    }

}  // end class GPUdbLogger

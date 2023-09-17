/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#alterEnvironment(AlterEnvironmentRequest)}.
 * <p>
 * Alters an existing environment which can be referenced by a <a
 * href="../../../../../../concepts/udf/" target="_top">user-defined
 * function</a> (UDF).
 */
public class AlterEnvironmentRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AlterEnvironmentRequest")
            .namespace("com.gpudb")
            .fields()
                .name("environmentName").type().stringType().noDefault()
                .name("action").type().stringType().noDefault()
                .name("value").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }


    /**
     * Modification operation to be applied
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_PACKAGE
     * INSTALL_PACKAGE}: Install a python package
     *         <li> {@link
     * com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_REQUIREMENTS
     * INSTALL_REQUIREMENTS}: Install packages from a requirements file
     *         <li> {@link
     * com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_PACKAGE
     * UNINSTALL_PACKAGE}: Uninstall a python package.
     *         <li> {@link
     * com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_REQUIREMENTS
     * UNINSTALL_REQUIREMENTS}: Uninstall packages from a requirements file
     *         <li> {@link
     * com.gpudb.protocol.AlterEnvironmentRequest.Action#RESET RESET}:
     * Uninstalls all packages in the environment and resets it to the original
     * state at time of creation
     * </ul>
     * A set of string constants for the parameter {@code action}.
     */
    public static final class Action {

        /**
         * Install a python package
         */
        public static final String INSTALL_PACKAGE = "install_package";

        /**
         * Install packages from a requirements file
         */
        public static final String INSTALL_REQUIREMENTS = "install_requirements";

        /**
         * Uninstall a python package.
         */
        public static final String UNINSTALL_PACKAGE = "uninstall_package";

        /**
         * Uninstall packages from a requirements file
         */
        public static final String UNINSTALL_REQUIREMENTS = "uninstall_requirements";

        /**
         * Uninstalls all packages in the environment and resets it to the
         * original state at time of creation
         */
        public static final String RESET = "reset";

        private Action() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterEnvironmentRequest.Options#DATASOURCE_NAME
     * DATASOURCE_NAME}: Name of an existing external data source from which
     * packages specified in {@code value} can be loaded
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of an existing external data source from which packages
         * specified in {@code value} can be loaded
         */
        public static final String DATASOURCE_NAME = "datasource_name";

        private Options() {  }
    }

    private String environmentName;
    private String action;
    private String value;
    private Map<String, String> options;


    /**
     * Constructs an AlterEnvironmentRequest object with default parameters.
     */
    public AlterEnvironmentRequest() {
        environmentName = "";
        action = "";
        value = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AlterEnvironmentRequest object with the specified
     * parameters.
     * 
     * @param environmentName  Name of the environment to be altered.
     * @param action  Modification operation to be applied
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_PACKAGE
     *                INSTALL_PACKAGE}: Install a python package
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_REQUIREMENTS
     *                INSTALL_REQUIREMENTS}: Install packages from a
     *                requirements file
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_PACKAGE
     *                UNINSTALL_PACKAGE}: Uninstall a python package.
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_REQUIREMENTS
     *                UNINSTALL_REQUIREMENTS}: Uninstall packages from a
     *                requirements file
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#RESET
     *                RESET}: Uninstalls all packages in the environment and
     *                resets it to the original state at time of creation
     *                </ul>
     * @param value  The value of the modification, depending on {@code
     *               action}.  For example, if {@code action} is {@code
     *               install_package}, this would be the python package name.
     *               If {@code action} is {@code install_requirements}, this
     *               would be the path of a requirements file from which to
     *               install packages.
     *               If an external data source is specified in {@code
     *               datasource_name}, this can be the path to a wheel file or
     *               source archive.
     *               Alternatively, if installing from a file (wheel or source
     *               archive), the value may be a reference to a file in <a
     *               href="../../../../../../tools/kifs/"
     *               target="_top">KiFS</a>.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterEnvironmentRequest.Options#DATASOURCE_NAME
     *                 DATASOURCE_NAME}: Name of an existing external data
     *                 source from which packages specified in {@code value}
     *                 can be loaded
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public AlterEnvironmentRequest(String environmentName, String action, String value, Map<String, String> options) {
        this.environmentName = (environmentName == null) ? "" : environmentName;
        this.action = (action == null) ? "" : action;
        this.value = (value == null) ? "" : value;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the environment to be altered.
     * 
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * 
     * @param environmentName  Name of the environment to be altered.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterEnvironmentRequest setEnvironmentName(String environmentName) {
        this.environmentName = (environmentName == null) ? "" : environmentName;
        return this;
    }

    /**
     * 
     * @return Modification operation to be applied
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_PACKAGE
     *         INSTALL_PACKAGE}: Install a python package
     *                 <li> {@link
     *         com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_REQUIREMENTS
     *         INSTALL_REQUIREMENTS}: Install packages from a requirements file
     *                 <li> {@link
     *         com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_PACKAGE
     *         UNINSTALL_PACKAGE}: Uninstall a python package.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_REQUIREMENTS
     *         UNINSTALL_REQUIREMENTS}: Uninstall packages from a requirements
     *         file
     *                 <li> {@link
     *         com.gpudb.protocol.AlterEnvironmentRequest.Action#RESET RESET}:
     *         Uninstalls all packages in the environment and resets it to the
     *         original state at time of creation
     *         </ul>
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action  Modification operation to be applied
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_PACKAGE
     *                INSTALL_PACKAGE}: Install a python package
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#INSTALL_REQUIREMENTS
     *                INSTALL_REQUIREMENTS}: Install packages from a
     *                requirements file
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_PACKAGE
     *                UNINSTALL_PACKAGE}: Uninstall a python package.
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#UNINSTALL_REQUIREMENTS
     *                UNINSTALL_REQUIREMENTS}: Uninstall packages from a
     *                requirements file
     *                        <li> {@link
     *                com.gpudb.protocol.AlterEnvironmentRequest.Action#RESET
     *                RESET}: Uninstalls all packages in the environment and
     *                resets it to the original state at time of creation
     *                </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterEnvironmentRequest setAction(String action) {
        this.action = (action == null) ? "" : action;
        return this;
    }

    /**
     * 
     * @return The value of the modification, depending on {@code action}.  For
     *         example, if {@code action} is {@code install_package}, this
     *         would be the python package name.
     *         If {@code action} is {@code install_requirements}, this would be
     *         the path of a requirements file from which to install packages.
     *         If an external data source is specified in {@code
     *         datasource_name}, this can be the path to a wheel file or source
     *         archive.
     *         Alternatively, if installing from a file (wheel or source
     *         archive), the value may be a reference to a file in <a
     *         href="../../../../../../tools/kifs/" target="_top">KiFS</a>.
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value  The value of the modification, depending on {@code
     *               action}.  For example, if {@code action} is {@code
     *               install_package}, this would be the python package name.
     *               If {@code action} is {@code install_requirements}, this
     *               would be the path of a requirements file from which to
     *               install packages.
     *               If an external data source is specified in {@code
     *               datasource_name}, this can be the path to a wheel file or
     *               source archive.
     *               Alternatively, if installing from a file (wheel or source
     *               archive), the value may be a reference to a file in <a
     *               href="../../../../../../tools/kifs/"
     *               target="_top">KiFS</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterEnvironmentRequest setValue(String value) {
        this.value = (value == null) ? "" : value;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterEnvironmentRequest.Options#DATASOURCE_NAME
     *         DATASOURCE_NAME}: Name of an existing external data source from
     *         which packages specified in {@code value} can be loaded
     *         </ul>
     *         The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterEnvironmentRequest.Options#DATASOURCE_NAME
     *                 DATASOURCE_NAME}: Name of an existing external data
     *                 source from which packages specified in {@code value}
     *                 can be loaded
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterEnvironmentRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to get
     * 
     * @return value of the field with the given index.
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.environmentName;

            case 1:
                return this.action;

            case 2:
                return this.value;

            case 3:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to set
     * @param value  the value to set
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.environmentName = (String)value;
                break;

            case 1:
                this.action = (String)value;
                break;

            case 2:
                this.value = (String)value;
                break;

            case 3:
                this.options = (Map<String, String>)value;
                break;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        AlterEnvironmentRequest that = (AlterEnvironmentRequest)obj;

        return ( this.environmentName.equals( that.environmentName )
                 && this.action.equals( that.action )
                 && this.value.equals( that.value )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "environmentName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.environmentName ) );
        builder.append( ", " );
        builder.append( gd.toString( "action" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.action ) );
        builder.append( ", " );
        builder.append( gd.toString( "value" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.value ) );
        builder.append( ", " );
        builder.append( gd.toString( "options" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.options ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.environmentName.hashCode();
        hashCode = (31 * hashCode) + this.action.hashCode();
        hashCode = (31 * hashCode) + this.value.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

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
 * com.gpudb.GPUdb#createUserExternal(CreateUserExternalRequest)}.
 * <p>
 * Creates a new external user (a user whose credentials are managed by an
 * external LDAP).
 */
public class CreateUserExternalRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateUserExternalRequest")
            .namespace("com.gpudb")
            .fields()
                .name("name").type().stringType().noDefault()
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
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateUserExternalRequest.Options#CREATE_HOME_DIRECTORY
     * CREATE_HOME_DIRECTORY}: when true, a home directory in KiFS is created
     * for this user
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.CreateUserExternalRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE TRUE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * when true, a home directory in KiFS is created for this user
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.CreateUserExternalRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE TRUE}.
         */
        public static final String CREATE_HOME_DIRECTORY = "create_home_directory";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String name;
    private Map<String, String> options;


    /**
     * Constructs a CreateUserExternalRequest object with default parameters.
     */
    public CreateUserExternalRequest() {
        name = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateUserExternalRequest object with the specified
     * parameters.
     * 
     * @param name  Name of the user to be created. Must exactly match the
     *              user's name in the external LDAP, prefixed with a @. Must
     *              not be the same name as an existing user.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#CREATE_HOME_DIRECTORY
     *                 CREATE_HOME_DIRECTORY}: when true, a home directory in
     *                 KiFS is created for this user
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE
     *                 TRUE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public CreateUserExternalRequest(String name, Map<String, String> options) {
        this.name = (name == null) ? "" : name;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the user to be created. Must exactly match the user's
     *         name in the external LDAP, prefixed with a @. Must not be the
     *         same name as an existing user.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name  Name of the user to be created. Must exactly match the
     *              user's name in the external LDAP, prefixed with a @. Must
     *              not be the same name as an existing user.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUserExternalRequest setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateUserExternalRequest.Options#CREATE_HOME_DIRECTORY
     *         CREATE_HOME_DIRECTORY}: when true, a home directory in KiFS is
     *         created for this user
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateUserExternalRequest.Options#FALSE
     *         FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE TRUE}.
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
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#CREATE_HOME_DIRECTORY
     *                 CREATE_HOME_DIRECTORY}: when true, a home directory in
     *                 KiFS is created for this user
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateUserExternalRequest.Options#TRUE
     *                 TRUE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateUserExternalRequest setOptions(Map<String, String> options) {
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
                return this.name;

            case 1:
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
                this.name = (String)value;
                break;

            case 1:
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

        CreateUserExternalRequest that = (CreateUserExternalRequest)obj;

        return ( this.name.equals( that.name )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "name" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.name ) );
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

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
 * com.gpudb.GPUdb#createDirectory(CreateDirectoryRequest)}.
 * <p>
 * Creates a new directory in <a href="../../../../../../tools/kifs/"
 * target="_top">KiFS</a>. The new
 * directory serves as a location in which the user can upload files using
 * {@link com.gpudb.GPUdb#uploadFiles(UploadFilesRequest)}.
 */
public class CreateDirectoryRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateDirectoryRequest")
            .namespace("com.gpudb")
            .fields()
                .name("directoryName").type().stringType().noDefault()
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
     * com.gpudb.protocol.CreateDirectoryRequest.Options#NO_ERROR_IF_EXISTS
     * NO_ERROR_IF_EXISTS}: If {@code true}, does not return an error if the
     * directory already exists
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateDirectoryRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE FALSE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code true}, does not return an error if the directory already
         * exists
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.CreateDirectoryRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE FALSE}.
         */
        public static final String NO_ERROR_IF_EXISTS = "no_error_if_exists";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String directoryName;
    private Map<String, String> options;


    /**
     * Constructs a CreateDirectoryRequest object with default parameters.
     */
    public CreateDirectoryRequest() {
        directoryName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateDirectoryRequest object with the specified
     * parameters.
     * 
     * @param directoryName  Name of the directory in KiFS to be created.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#NO_ERROR_IF_EXISTS
     *                 NO_ERROR_IF_EXISTS}: If {@code true}, does not return an
     *                 error if the directory already exists
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public CreateDirectoryRequest(String directoryName, Map<String, String> options) {
        this.directoryName = (directoryName == null) ? "" : directoryName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the directory in KiFS to be created.
     * 
     */
    public String getDirectoryName() {
        return directoryName;
    }

    /**
     * 
     * @param directoryName  Name of the directory in KiFS to be created.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = (directoryName == null) ? "" : directoryName;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateDirectoryRequest.Options#NO_ERROR_IF_EXISTS
     *         NO_ERROR_IF_EXISTS}: If {@code true}, does not return an error
     *         if the directory already exists
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateDirectoryRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE FALSE}.
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
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#NO_ERROR_IF_EXISTS
     *                 NO_ERROR_IF_EXISTS}: If {@code true}, does not return an
     *                 error if the directory already exists
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateDirectoryRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateDirectoryRequest setOptions(Map<String, String> options) {
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
                return this.directoryName;

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
                this.directoryName = (String)value;
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

        CreateDirectoryRequest that = (CreateDirectoryRequest)obj;

        return ( this.directoryName.equals( that.directoryName )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "directoryName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.directoryName ) );
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
        hashCode = (31 * hashCode) + this.directoryName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
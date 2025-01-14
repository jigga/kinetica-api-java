/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#showFiles(ShowFilesRequest)}.
 */
public class ShowFilesResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowFilesResponse")
            .namespace("com.gpudb")
            .fields()
                .name("fileNames").type().array().items().stringType().noDefault()
                .name("sizes").type().array().items().longType().noDefault()
                .name("users").type().array().items().stringType().noDefault()
                .name("creationTimes").type().array().items().longType().noDefault()
                .name("info").type().map().values().stringType().noDefault()
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
     * Additional information.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.ShowFilesResponse.Info#MULTIPART_UPLOADS
     * MULTIPART_UPLOADS}: JSON-encoded information about multipart uploads in
     * progress
     * </ul>
     * A set of string constants for the parameter {@code info}.
     */
    public static final class Info {

        /**
         * JSON-encoded information about multipart uploads in progress
         */
        public static final String MULTIPART_UPLOADS = "multipart_uploads";

        private Info() {  }
    }

    private List<String> fileNames;
    private List<Long> sizes;
    private List<String> users;
    private List<Long> creationTimes;
    private Map<String, String> info;


    /**
     * Constructs a ShowFilesResponse object with default parameters.
     */
    public ShowFilesResponse() {
    }

    /**
     * 
     * @return A listing of files in the paths specified
     * 
     */
    public List<String> getFileNames() {
        return fileNames;
    }

    /**
     * 
     * @param fileNames  A listing of files in the paths specified
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowFilesResponse setFileNames(List<String> fileNames) {
        this.fileNames = (fileNames == null) ? new ArrayList<String>() : fileNames;
        return this;
    }

    /**
     * 
     * @return Size of each file, in bytes
     * 
     */
    public List<Long> getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes  Size of each file, in bytes
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowFilesResponse setSizes(List<Long> sizes) {
        this.sizes = (sizes == null) ? new ArrayList<Long>() : sizes;
        return this;
    }

    /**
     * 
     * @return User that created the file
     * 
     */
    public List<String> getUsers() {
        return users;
    }

    /**
     * 
     * @param users  User that created the file
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowFilesResponse setUsers(List<String> users) {
        this.users = (users == null) ? new ArrayList<String>() : users;
        return this;
    }

    /**
     * 
     * @return Timestamp at creation time for each file
     * 
     */
    public List<Long> getCreationTimes() {
        return creationTimes;
    }

    /**
     * 
     * @param creationTimes  Timestamp at creation time for each file
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowFilesResponse setCreationTimes(List<Long> creationTimes) {
        this.creationTimes = (creationTimes == null) ? new ArrayList<Long>() : creationTimes;
        return this;
    }

    /**
     * 
     * @return Additional information.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowFilesResponse.Info#MULTIPART_UPLOADS
     *         MULTIPART_UPLOADS}: JSON-encoded information about multipart
     *         uploads in progress
     *         </ul>
     * 
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * 
     * @param info  Additional information.
     *              <ul>
     *                      <li> {@link
     *              com.gpudb.protocol.ShowFilesResponse.Info#MULTIPART_UPLOADS
     *              MULTIPART_UPLOADS}: JSON-encoded information about
     *              multipart uploads in progress
     *              </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowFilesResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
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
                return this.fileNames;

            case 1:
                return this.sizes;

            case 2:
                return this.users;

            case 3:
                return this.creationTimes;

            case 4:
                return this.info;

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
                this.fileNames = (List<String>)value;
                break;

            case 1:
                this.sizes = (List<Long>)value;
                break;

            case 2:
                this.users = (List<String>)value;
                break;

            case 3:
                this.creationTimes = (List<Long>)value;
                break;

            case 4:
                this.info = (Map<String, String>)value;
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

        ShowFilesResponse that = (ShowFilesResponse)obj;

        return ( this.fileNames.equals( that.fileNames )
                 && this.sizes.equals( that.sizes )
                 && this.users.equals( that.users )
                 && this.creationTimes.equals( that.creationTimes )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "fileNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.fileNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "sizes" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.sizes ) );
        builder.append( ", " );
        builder.append( gd.toString( "users" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.users ) );
        builder.append( ", " );
        builder.append( gd.toString( "creationTimes" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.creationTimes ) );
        builder.append( ", " );
        builder.append( gd.toString( "info" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.info ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.fileNames.hashCode();
        hashCode = (31 * hashCode) + this.sizes.hashCode();
        hashCode = (31 * hashCode) + this.users.hashCode();
        hashCode = (31 * hashCode) + this.creationTimes.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

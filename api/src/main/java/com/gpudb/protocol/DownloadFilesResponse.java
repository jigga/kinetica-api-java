/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.nio.ByteBuffer;
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
 * com.gpudb.GPUdb#downloadFiles(DownloadFilesRequest)}.
 */
public class DownloadFilesResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("DownloadFilesResponse")
            .namespace("com.gpudb")
            .fields()
                .name("fileNames").type().array().items().stringType().noDefault()
                .name("fileData").type().array().items().bytesType().noDefault()
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

    private List<String> fileNames;
    private List<ByteBuffer> fileData;
    private Map<String, String> info;


    /**
     * Constructs a DownloadFilesResponse object with default parameters.
     */
    public DownloadFilesResponse() {
    }

    /**
     * 
     * @return Names of the files downloaded from KiFS
     * 
     */
    public List<String> getFileNames() {
        return fileNames;
    }

    /**
     * 
     * @param fileNames  Names of the files downloaded from KiFS
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesResponse setFileNames(List<String> fileNames) {
        this.fileNames = (fileNames == null) ? new ArrayList<String>() : fileNames;
        return this;
    }

    /**
     * 
     * @return Data for the respective downloaded files listed in {@code
     *         fileNames}
     * 
     */
    public List<ByteBuffer> getFileData() {
        return fileData;
    }

    /**
     * 
     * @param fileData  Data for the respective downloaded files listed in
     *                  {@code fileNames}
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesResponse setFileData(List<ByteBuffer> fileData) {
        this.fileData = (fileData == null) ? new ArrayList<ByteBuffer>() : fileData;
        return this;
    }

    /**
     * 
     * @return Additional information.
     * 
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * 
     * @param info  Additional information.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesResponse setInfo(Map<String, String> info) {
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
                return this.fileData;

            case 2:
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
                this.fileData = (List<ByteBuffer>)value;
                break;

            case 2:
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

        DownloadFilesResponse that = (DownloadFilesResponse)obj;

        return ( this.fileNames.equals( that.fileNames )
                 && this.fileData.equals( that.fileData )
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
        builder.append( gd.toString( "fileData" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.fileData ) );
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
        hashCode = (31 * hashCode) + this.fileData.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

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
import org.apache.avro.generic.GenericData;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#getRecordsFromCollection(Object,
 * GetRecordsFromCollectionRequest)}.
 * 
 * @param <T>  The type of object being processed.
 * 
 */
public class GetRecordsFromCollectionResponse<T> {
    private String tableName;
    private List<String> typeNames;
    private List<T> data;
    private List<String> recordIds;
    private Map<String, String> info;


    /**
     * Constructs a GetRecordsFromCollectionResponse object with default
     * parameters.
     */
    public GetRecordsFromCollectionResponse() {
    }

    /**
     * 
     * @return Value of {@code tableName}.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Value of {@code tableName}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsFromCollectionResponse<T> setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return The type IDs of the corresponding records in {@code
     *         recordsBinary} or {@code recordsJson}. This is useful when
     *         {@code tableName} is a heterogeneous collection (collections
     *         containing tables of different types).
     * 
     */
    public List<String> getTypeNames() {
        return typeNames;
    }

    /**
     * 
     * @param typeNames  The type IDs of the corresponding records in {@code
     *                   recordsBinary} or {@code recordsJson}. This is useful
     *                   when {@code tableName} is a heterogeneous collection
     *                   (collections containing tables of different types).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsFromCollectionResponse<T> setTypeNames(List<String> typeNames) {
        this.typeNames = (typeNames == null) ? new ArrayList<String>() : typeNames;
        return this;
    }

    /**
     * 
     * @return If the encoding parameter of the request was 'binary' then this
     *         list contains the binary encoded records retrieved from the
     *         table/collection. Otherwise, empty list.
     * 
     */
    public List<T> getData() {
        return data;
    }

    /**
     * 
     * @param data  If the encoding parameter of the request was 'binary' then
     *              this list contains the binary encoded records retrieved
     *              from the table/collection. Otherwise, empty list.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsFromCollectionResponse<T> setData(List<T> data) {
        this.data = (data == null) ? new ArrayList<T>() : data;
        return this;
    }

    /**
     * 
     * @return If the 'return_record_ids' option of the request was 'true',
     *         then this list contains the internal ID for each object.
     *         Otherwise it will be empty.
     * 
     */
    public List<String> getRecordIds() {
        return recordIds;
    }

    /**
     * 
     * @param recordIds  If the 'return_record_ids' option of the request was
     *                   'true', then this list contains the internal ID for
     *                   each object. Otherwise it will be empty.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsFromCollectionResponse<T> setRecordIds(List<String> recordIds) {
        this.recordIds = (recordIds == null) ? new ArrayList<String>() : recordIds;
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
    public GetRecordsFromCollectionResponse<T> setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
        return this;
    }
    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        GetRecordsFromCollectionResponse that = (GetRecordsFromCollectionResponse)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.typeNames.equals( that.typeNames )
                 && this.data.equals( that.data )
                 && this.recordIds.equals( that.recordIds )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "typeNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "data" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.data ) );
        builder.append( ", " );
        builder.append( gd.toString( "recordIds" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.recordIds ) );
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
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.typeNames.hashCode();
        hashCode = (31 * hashCode) + this.data.hashCode();
        hashCode = (31 * hashCode) + this.recordIds.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

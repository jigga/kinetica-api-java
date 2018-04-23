/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.ArrayList;
import java.util.List;
import org.apache.avro.generic.GenericData;


/**
 * A set of results returned by {@link com.gpudb.GPUdb#getRecords(Object,
 * GetRecordsRequest)}.
 * 
 * @param <T>  The type of object being processed.
 * 
 */
public class GetRecordsResponse<T> {
    private String tableName;
    private String typeName;
    private String typeSchema;
    private List<T> data;
    private long totalNumberOfRecords;
    private boolean hasMoreRecords;


    /**
     * Constructs a GetRecordsResponse object with default parameters.
     */
    public GetRecordsResponse() {
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
    public GetRecordsResponse<T> setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }
    public String getTypeName() {
        return typeName;
    }

    /**
     * 
     * @param typeName
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsResponse<T> setTypeName(String typeName) {
        this.typeName = (typeName == null) ? "" : typeName;
        return this;
    }

    /**
     * 
     * @return Avro schema of {@code recordsBinary} or {@code recordsJson}
     * 
     */
    public String getTypeSchema() {
        return typeSchema;
    }

    /**
     * 
     * @param typeSchema  Avro schema of {@code recordsBinary} or {@code
     *                    recordsJson}
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsResponse<T> setTypeSchema(String typeSchema) {
        this.typeSchema = (typeSchema == null) ? "" : typeSchema;
        return this;
    }

    /**
     * 
     * @return If the {@code encoding} was 'binary', then this list contains
     *         the binary encoded records retrieved from the table, otherwise
     *         not populated.
     * 
     */
    public List<T> getData() {
        return data;
    }

    /**
     * 
     * @param data  If the {@code encoding} was 'binary', then this list
     *              contains the binary encoded records retrieved from the
     *              table, otherwise not populated.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsResponse<T> setData(List<T> data) {
        this.data = (data == null) ? new ArrayList<T>() : data;
        return this;
    }

    /**
     * 
     * @return Total/Filtered number of records.
     * 
     */
    public long getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }

    /**
     * 
     * @param totalNumberOfRecords  Total/Filtered number of records.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsResponse<T> setTotalNumberOfRecords(long totalNumberOfRecords) {
        this.totalNumberOfRecords = totalNumberOfRecords;
        return this;
    }

    /**
     * 
     * @return Too many records. Returned a partial set.
     * 
     */
    public boolean getHasMoreRecords() {
        return hasMoreRecords;
    }

    /**
     * 
     * @param hasMoreRecords  Too many records. Returned a partial set.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsResponse<T> setHasMoreRecords(boolean hasMoreRecords) {
        this.hasMoreRecords = hasMoreRecords;
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

        GetRecordsResponse that = (GetRecordsResponse)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.typeName.equals( that.typeName )
                 && this.typeSchema.equals( that.typeSchema )
                 && this.data.equals( that.data )
                 && ( this.totalNumberOfRecords == that.totalNumberOfRecords )
                 && ( this.hasMoreRecords == that.hasMoreRecords ) );
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
        builder.append( gd.toString( "typeName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeName ) );
        builder.append( ", " );
        builder.append( gd.toString( "typeSchema" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeSchema ) );
        builder.append( ", " );
        builder.append( gd.toString( "data" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.data ) );
        builder.append( ", " );
        builder.append( gd.toString( "totalNumberOfRecords" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.totalNumberOfRecords ) );
        builder.append( ", " );
        builder.append( gd.toString( "hasMoreRecords" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.hasMoreRecords ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.typeName.hashCode();
        hashCode = (31 * hashCode) + this.typeSchema.hashCode();
        hashCode = (31 * hashCode) + this.data.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.totalNumberOfRecords).hashCode();
        hashCode = (31 * hashCode) + ((Boolean)this.hasMoreRecords).hashCode();
        return hashCode;
    }

}

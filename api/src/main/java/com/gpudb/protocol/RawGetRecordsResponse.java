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
 * com.gpudb.GPUdb#getRecordsRaw(GetRecordsRequest)}.
 */
public class RawGetRecordsResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RawGetRecordsResponse")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("typeName").type().stringType().noDefault()
                .name("typeSchema").type().stringType().noDefault()
                .name("recordsBinary").type().array().items().bytesType().noDefault()
                .name("recordsJson").type().array().items().stringType().noDefault()
                .name("totalNumberOfRecords").type().longType().noDefault()
                .name("hasMoreRecords").type().booleanType().noDefault()
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

    private String tableName;
    private String typeName;
    private String typeSchema;
    private List<ByteBuffer> recordsBinary;
    private List<String> recordsJson;
    private long totalNumberOfRecords;
    private boolean hasMoreRecords;
    private Map<String, String> info;


    /**
     * Constructs a RawGetRecordsResponse object with default parameters.
     */
    public RawGetRecordsResponse() {
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
    public RawGetRecordsResponse setTableName(String tableName) {
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
    public RawGetRecordsResponse setTypeName(String typeName) {
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
    public RawGetRecordsResponse setTypeSchema(String typeSchema) {
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
    public List<ByteBuffer> getRecordsBinary() {
        return recordsBinary;
    }

    /**
     * 
     * @param recordsBinary  If the {@code encoding} was 'binary', then this
     *                       list contains the binary encoded records retrieved
     *                       from the table, otherwise not populated.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsResponse setRecordsBinary(List<ByteBuffer> recordsBinary) {
        this.recordsBinary = (recordsBinary == null) ? new ArrayList<ByteBuffer>() : recordsBinary;
        return this;
    }

    /**
     * 
     * @return If the {@code encoding} was 'json', then this list contains the
     *         JSON encoded records retrieved from the table. If the {@code
     *         encoding} was 'geojson' this list contains a single entry
     *         consisting of a GeoJSON FeatureCollection containing a feature
     *         per record. Otherwise not populated.
     * 
     */
    public List<String> getRecordsJson() {
        return recordsJson;
    }

    /**
     * 
     * @param recordsJson  If the {@code encoding} was 'json', then this list
     *                     contains the JSON encoded records retrieved from the
     *                     table. If the {@code encoding} was 'geojson' this
     *                     list contains a single entry consisting of a GeoJSON
     *                     FeatureCollection containing a feature per record.
     *                     Otherwise not populated.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsResponse setRecordsJson(List<String> recordsJson) {
        this.recordsJson = (recordsJson == null) ? new ArrayList<String>() : recordsJson;
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
    public RawGetRecordsResponse setTotalNumberOfRecords(long totalNumberOfRecords) {
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
    public RawGetRecordsResponse setHasMoreRecords(boolean hasMoreRecords) {
        this.hasMoreRecords = hasMoreRecords;
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
    public RawGetRecordsResponse setInfo(Map<String, String> info) {
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
                return this.tableName;

            case 1:
                return this.typeName;

            case 2:
                return this.typeSchema;

            case 3:
                return this.recordsBinary;

            case 4:
                return this.recordsJson;

            case 5:
                return this.totalNumberOfRecords;

            case 6:
                return this.hasMoreRecords;

            case 7:
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
                this.tableName = (String)value;
                break;

            case 1:
                this.typeName = (String)value;
                break;

            case 2:
                this.typeSchema = (String)value;
                break;

            case 3:
                this.recordsBinary = (List<ByteBuffer>)value;
                break;

            case 4:
                this.recordsJson = (List<String>)value;
                break;

            case 5:
                this.totalNumberOfRecords = (Long)value;
                break;

            case 6:
                this.hasMoreRecords = (Boolean)value;
                break;

            case 7:
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

        RawGetRecordsResponse that = (RawGetRecordsResponse)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.typeName.equals( that.typeName )
                 && this.typeSchema.equals( that.typeSchema )
                 && this.recordsBinary.equals( that.recordsBinary )
                 && this.recordsJson.equals( that.recordsJson )
                 && ( this.totalNumberOfRecords == that.totalNumberOfRecords )
                 && ( this.hasMoreRecords == that.hasMoreRecords )
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
        builder.append( gd.toString( "typeName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeName ) );
        builder.append( ", " );
        builder.append( gd.toString( "typeSchema" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeSchema ) );
        builder.append( ", " );
        builder.append( gd.toString( "recordsBinary" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.recordsBinary ) );
        builder.append( ", " );
        builder.append( gd.toString( "recordsJson" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.recordsJson ) );
        builder.append( ", " );
        builder.append( gd.toString( "totalNumberOfRecords" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.totalNumberOfRecords ) );
        builder.append( ", " );
        builder.append( gd.toString( "hasMoreRecords" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.hasMoreRecords ) );
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
        hashCode = (31 * hashCode) + this.typeName.hashCode();
        hashCode = (31 * hashCode) + this.typeSchema.hashCode();
        hashCode = (31 * hashCode) + this.recordsBinary.hashCode();
        hashCode = (31 * hashCode) + this.recordsJson.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.totalNumberOfRecords).hashCode();
        hashCode = (31 * hashCode) + ((Boolean)this.hasMoreRecords).hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

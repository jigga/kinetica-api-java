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
 * com.gpudb.GPUdb#getRecordsBySeriesRaw(GetRecordsBySeriesRequest)}.
 */
public class RawGetRecordsBySeriesResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RawGetRecordsBySeriesResponse")
            .namespace("com.gpudb")
            .fields()
                .name("tableNames").type().array().items().stringType().noDefault()
                .name("typeNames").type().array().items().stringType().noDefault()
                .name("typeSchemas").type().array().items().stringType().noDefault()
                .name("listRecordsBinary").type().array().items().array().items().bytesType().noDefault()
                .name("listRecordsJson").type().array().items().array().items().stringType().noDefault()
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

    private List<String> tableNames;
    private List<String> typeNames;
    private List<String> typeSchemas;
    private List<List<ByteBuffer>> listRecordsBinary;
    private List<List<String>> listRecordsJson;
    private Map<String, String> info;


    /**
     * Constructs a RawGetRecordsBySeriesResponse object with default
     * parameters.
     */
    public RawGetRecordsBySeriesResponse() {
    }

    /**
     * 
     * @return The table name (one per series/track) of the returned
     *         series/tracks.
     * 
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * 
     * @param tableNames  The table name (one per series/track) of the returned
     *                    series/tracks.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsBySeriesResponse setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * 
     * @return The type IDs (one per series/track) of the returned
     *         series/tracks. This is useful when {@code tableName} is a
     *         collection and the returned series/tracks belong to tables with
     *         different types.
     * 
     */
    public List<String> getTypeNames() {
        return typeNames;
    }

    /**
     * 
     * @param typeNames  The type IDs (one per series/track) of the returned
     *                   series/tracks. This is useful when {@code tableName}
     *                   is a collection and the returned series/tracks belong
     *                   to tables with different types.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsBySeriesResponse setTypeNames(List<String> typeNames) {
        this.typeNames = (typeNames == null) ? new ArrayList<String>() : typeNames;
        return this;
    }

    /**
     * 
     * @return The type schemas (one per series/track) of the returned
     *         series/tracks.
     * 
     */
    public List<String> getTypeSchemas() {
        return typeSchemas;
    }

    /**
     * 
     * @param typeSchemas  The type schemas (one per series/track) of the
     *                     returned series/tracks.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsBySeriesResponse setTypeSchemas(List<String> typeSchemas) {
        this.typeSchemas = (typeSchemas == null) ? new ArrayList<String>() : typeSchemas;
        return this;
    }

    /**
     * 
     * @return If the encoding parameter of the request was 'binary' then this
     *         list-of-lists contains the binary encoded records for each
     *         object (inner list) in each series/track (outer list).
     *         Otherwise, empty list-of-lists.
     * 
     */
    public List<List<ByteBuffer>> getListRecordsBinary() {
        return listRecordsBinary;
    }

    /**
     * 
     * @param listRecordsBinary  If the encoding parameter of the request was
     *                           'binary' then this list-of-lists contains the
     *                           binary encoded records for each object (inner
     *                           list) in each series/track (outer list).
     *                           Otherwise, empty list-of-lists.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsBySeriesResponse setListRecordsBinary(List<List<ByteBuffer>> listRecordsBinary) {
        this.listRecordsBinary = (listRecordsBinary == null) ? new ArrayList<List<ByteBuffer>>() : listRecordsBinary;
        return this;
    }

    /**
     * 
     * @return If the encoding parameter of the request was 'json' then this
     *         list-of-lists contains the json encoded records for each object
     *         (inner list) in each series/track (outer list). Otherwise, empty
     *         list-of-lists.
     * 
     */
    public List<List<String>> getListRecordsJson() {
        return listRecordsJson;
    }

    /**
     * 
     * @param listRecordsJson  If the encoding parameter of the request was
     *                         'json' then this list-of-lists contains the json
     *                         encoded records for each object (inner list) in
     *                         each series/track (outer list). Otherwise, empty
     *                         list-of-lists.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawGetRecordsBySeriesResponse setListRecordsJson(List<List<String>> listRecordsJson) {
        this.listRecordsJson = (listRecordsJson == null) ? new ArrayList<List<String>>() : listRecordsJson;
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
    public RawGetRecordsBySeriesResponse setInfo(Map<String, String> info) {
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
                return this.tableNames;

            case 1:
                return this.typeNames;

            case 2:
                return this.typeSchemas;

            case 3:
                return this.listRecordsBinary;

            case 4:
                return this.listRecordsJson;

            case 5:
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
                this.tableNames = (List<String>)value;
                break;

            case 1:
                this.typeNames = (List<String>)value;
                break;

            case 2:
                this.typeSchemas = (List<String>)value;
                break;

            case 3:
                this.listRecordsBinary = (List<List<ByteBuffer>>)value;
                break;

            case 4:
                this.listRecordsJson = (List<List<String>>)value;
                break;

            case 5:
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

        RawGetRecordsBySeriesResponse that = (RawGetRecordsBySeriesResponse)obj;

        return ( this.tableNames.equals( that.tableNames )
                 && this.typeNames.equals( that.typeNames )
                 && this.typeSchemas.equals( that.typeSchemas )
                 && this.listRecordsBinary.equals( that.listRecordsBinary )
                 && this.listRecordsJson.equals( that.listRecordsJson )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "typeNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "typeSchemas" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.typeSchemas ) );
        builder.append( ", " );
        builder.append( gd.toString( "listRecordsBinary" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.listRecordsBinary ) );
        builder.append( ", " );
        builder.append( gd.toString( "listRecordsJson" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.listRecordsJson ) );
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
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.typeNames.hashCode();
        hashCode = (31 * hashCode) + this.typeSchemas.hashCode();
        hashCode = (31 * hashCode) + this.listRecordsBinary.hashCode();
        hashCode = (31 * hashCode) + this.listRecordsJson.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

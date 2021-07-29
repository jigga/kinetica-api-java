
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


public class CreateStateTableResponse implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("CreateStateTableResponse")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("info").type().map().values().stringType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    private String tableName;
    private Map<String, String> info;


    public CreateStateTableResponse() {
    }

    public String getTableName() {
        return tableName;
    }

    public CreateStateTableResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public CreateStateTableResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
        return this;
    }

    @Override
    public Schema getSchema() {
        return schema$;
    }

    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.tableName;

            case 1:
                return this.info;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.tableName = (String)value;
                break;

            case 1:
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

        CreateStateTableResponse that = (CreateStateTableResponse)obj;

        return ( this.tableName.equals( that.tableName )
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
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }


}

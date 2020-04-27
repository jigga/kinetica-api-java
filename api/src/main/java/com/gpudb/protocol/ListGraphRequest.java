
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


public class ListGraphRequest implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("ListGraphRequest")
            .namespace("com.gpudb")
            .fields()
                .name("graphName").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    private String graphName;
    private Map<String, String> options;


    public ListGraphRequest() {
        graphName = "";
        options = new LinkedHashMap<>();
    }

    public ListGraphRequest(String graphName, Map<String, String> options) {
        this.graphName = (graphName == null) ? "" : graphName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    public String getGraphName() {
        return graphName;
    }

    public ListGraphRequest setGraphName(String graphName) {
        this.graphName = (graphName == null) ? "" : graphName;
        return this;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public ListGraphRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
                return this.graphName;

            case 1:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.graphName = (String)value;
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

        ListGraphRequest that = (ListGraphRequest)obj;

        return ( this.graphName.equals( that.graphName )
                 && this.options.equals( that.options ) );
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "graphName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.graphName ) );
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
        hashCode = (31 * hashCode) + this.graphName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }


}
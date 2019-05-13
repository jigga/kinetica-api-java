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
 * com.gpudb.GPUdb#queryGraph(QueryGraphRequest)}.
 */
public class QueryGraphResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("QueryGraphResponse")
            .namespace("com.gpudb")
            .fields()
                .name("result").type().booleanType().noDefault()
                .name("adjacencyListIntArray").type().array().items().longType().noDefault()
                .name("adjacencyListStringArray").type().array().items().stringType().noDefault()
                .name("adjacencyListWktArray").type().array().items().stringType().noDefault()
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

    private boolean result;
    private List<Long> adjacencyListIntArray;
    private List<String> adjacencyListStringArray;
    private List<String> adjacencyListWktArray;
    private Map<String, String> info;


    /**
     * Constructs a QueryGraphResponse object with default parameters.
     */
    public QueryGraphResponse() {
    }

    /**
     * 
     * @return Indicates a successful query.
     * 
     */
    public boolean getResult() {
        return result;
    }

    /**
     * 
     * @param result  Indicates a successful query.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public QueryGraphResponse setResult(boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 
     * @return The adjacency entity integer ID: either edge IDs per node
     *         requested (if using QUERY_EDGE_ID or QUERY_NODE1_ID and
     *         QUERY_NODE2_ID in the input) or two node IDs per edge requested
     *         (if using QUERY_NODE_ID in the input).
     * 
     */
    public List<Long> getAdjacencyListIntArray() {
        return adjacencyListIntArray;
    }

    /**
     * 
     * @param adjacencyListIntArray  The adjacency entity integer ID: either
     *                               edge IDs per node requested (if using
     *                               QUERY_EDGE_ID or QUERY_NODE1_ID and
     *                               QUERY_NODE2_ID in the input) or two node
     *                               IDs per edge requested (if using
     *                               QUERY_NODE_ID in the input).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public QueryGraphResponse setAdjacencyListIntArray(List<Long> adjacencyListIntArray) {
        this.adjacencyListIntArray = (adjacencyListIntArray == null) ? new ArrayList<Long>() : adjacencyListIntArray;
        return this;
    }

    /**
     * 
     * @return The adjacency entity string ID: either edge IDs per node
     *         requested (if using QUERY_EDGE_NAME or QUERY_NODE1_NAME and
     *         QUERY_NODE2_NAME in the input) or two node IDs per edge
     *         requested (if using QUERY_NODE_NAME in the input).
     * 
     */
    public List<String> getAdjacencyListStringArray() {
        return adjacencyListStringArray;
    }

    /**
     * 
     * @param adjacencyListStringArray  The adjacency entity string ID: either
     *                                  edge IDs per node requested (if using
     *                                  QUERY_EDGE_NAME or QUERY_NODE1_NAME and
     *                                  QUERY_NODE2_NAME in the input) or two
     *                                  node IDs per edge requested (if using
     *                                  QUERY_NODE_NAME in the input).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public QueryGraphResponse setAdjacencyListStringArray(List<String> adjacencyListStringArray) {
        this.adjacencyListStringArray = (adjacencyListStringArray == null) ? new ArrayList<String>() : adjacencyListStringArray;
        return this;
    }

    /**
     * 
     * @return The adjacency entity WKTPOINT or WKTLINE ID: either edge IDs per
     *         node requested (if using QUERY_EDGE_WKTLINE or
     *         QUERY_NODE1_WKTPOINT and QUERY_NODE2_WKTPOINT in the input) or
     *         two node IDs per edge requested (if using QUERY_NODE_WKTPOINT in
     *         the input).
     * 
     */
    public List<String> getAdjacencyListWktArray() {
        return adjacencyListWktArray;
    }

    /**
     * 
     * @param adjacencyListWktArray  The adjacency entity WKTPOINT or WKTLINE
     *                               ID: either edge IDs per node requested (if
     *                               using QUERY_EDGE_WKTLINE or
     *                               QUERY_NODE1_WKTPOINT and
     *                               QUERY_NODE2_WKTPOINT in the input) or two
     *                               node IDs per edge requested (if using
     *                               QUERY_NODE_WKTPOINT in the input).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public QueryGraphResponse setAdjacencyListWktArray(List<String> adjacencyListWktArray) {
        this.adjacencyListWktArray = (adjacencyListWktArray == null) ? new ArrayList<String>() : adjacencyListWktArray;
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
    public QueryGraphResponse setInfo(Map<String, String> info) {
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
                return this.result;

            case 1:
                return this.adjacencyListIntArray;

            case 2:
                return this.adjacencyListStringArray;

            case 3:
                return this.adjacencyListWktArray;

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
                this.result = (Boolean)value;
                break;

            case 1:
                this.adjacencyListIntArray = (List<Long>)value;
                break;

            case 2:
                this.adjacencyListStringArray = (List<String>)value;
                break;

            case 3:
                this.adjacencyListWktArray = (List<String>)value;
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

        QueryGraphResponse that = (QueryGraphResponse)obj;

        return ( ( this.result == that.result )
                 && this.adjacencyListIntArray.equals( that.adjacencyListIntArray )
                 && this.adjacencyListStringArray.equals( that.adjacencyListStringArray )
                 && this.adjacencyListWktArray.equals( that.adjacencyListWktArray )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "result" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.result ) );
        builder.append( ", " );
        builder.append( gd.toString( "adjacencyListIntArray" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.adjacencyListIntArray ) );
        builder.append( ", " );
        builder.append( gd.toString( "adjacencyListStringArray" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.adjacencyListStringArray ) );
        builder.append( ", " );
        builder.append( gd.toString( "adjacencyListWktArray" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.adjacencyListWktArray ) );
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
        hashCode = (31 * hashCode) + ((Boolean)this.result).hashCode();
        hashCode = (31 * hashCode) + this.adjacencyListIntArray.hashCode();
        hashCode = (31 * hashCode) + this.adjacencyListStringArray.hashCode();
        hashCode = (31 * hashCode) + this.adjacencyListWktArray.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

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
 * com.gpudb.GPUdb#modifyGraph(ModifyGraphRequest)}.
 */
public class ModifyGraphResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ModifyGraphResponse")
            .namespace("com.gpudb")
            .fields()
                .name("numNodes").type().longType().noDefault()
                .name("numEdges").type().longType().noDefault()
                .name("edgesIds").type().array().items().longType().noDefault()
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

    private long numNodes;
    private long numEdges;
    private List<Long> edgesIds;
    private Map<String, String> info;


    /**
     * Constructs a ModifyGraphResponse object with default parameters.
     */
    public ModifyGraphResponse() {
    }

    /**
     * 
     * @return Total number of nodes in the graph.
     * 
     */
    public long getNumNodes() {
        return numNodes;
    }

    /**
     * 
     * @param numNodes  Total number of nodes in the graph.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ModifyGraphResponse setNumNodes(long numNodes) {
        this.numNodes = numNodes;
        return this;
    }

    /**
     * 
     * @return Total number of edges in the graph.
     * 
     */
    public long getNumEdges() {
        return numEdges;
    }

    /**
     * 
     * @param numEdges  Total number of edges in the graph.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ModifyGraphResponse setNumEdges(long numEdges) {
        this.numEdges = numEdges;
        return this;
    }

    /**
     * 
     * @return Edges given as pairs of node indices. Only populated if {@code
     *         export_create_results} is set to {@code true}.
     * 
     */
    public List<Long> getEdgesIds() {
        return edgesIds;
    }

    /**
     * 
     * @param edgesIds  Edges given as pairs of node indices. Only populated if
     *                  {@code export_create_results} is set to {@code true}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ModifyGraphResponse setEdgesIds(List<Long> edgesIds) {
        this.edgesIds = (edgesIds == null) ? new ArrayList<Long>() : edgesIds;
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
    public ModifyGraphResponse setInfo(Map<String, String> info) {
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
                return this.numNodes;

            case 1:
                return this.numEdges;

            case 2:
                return this.edgesIds;

            case 3:
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
                this.numNodes = (Long)value;
                break;

            case 1:
                this.numEdges = (Long)value;
                break;

            case 2:
                this.edgesIds = (List<Long>)value;
                break;

            case 3:
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

        ModifyGraphResponse that = (ModifyGraphResponse)obj;

        return ( ( this.numNodes == that.numNodes )
                 && ( this.numEdges == that.numEdges )
                 && this.edgesIds.equals( that.edgesIds )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "numNodes" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.numNodes ) );
        builder.append( ", " );
        builder.append( gd.toString( "numEdges" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.numEdges ) );
        builder.append( ", " );
        builder.append( gd.toString( "edgesIds" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.edgesIds ) );
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
        hashCode = (31 * hashCode) + ((Long)this.numNodes).hashCode();
        hashCode = (31 * hashCode) + ((Long)this.numEdges).hashCode();
        hashCode = (31 * hashCode) + this.edgesIds.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
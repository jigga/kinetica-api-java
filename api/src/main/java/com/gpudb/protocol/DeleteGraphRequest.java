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


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#deleteGraph(DeleteGraphRequest)}.
 * <p>
 * Deletes an existing graph from the graph server and/or persist.
 */
public class DeleteGraphRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("DeleteGraphRequest")
            .namespace("com.gpudb")
            .fields()
                .name("graphName").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
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
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.DeleteGraphRequest.Options#DELETE_PERSIST
     * DELETE_PERSIST}: If set to {@code true}, the graph is removed from the
     * server and persist. If set to {@code false}, the graph is removed from
     * the server but is left in persist. The graph can be reloaded from
     * persist if it is recreated with the same 'graph_name'.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.DeleteGraphRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.DeleteGraphRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If set to {@code true}, the graph is removed from the server and
         * persist. If set to {@code false}, the graph is removed from the
         * server but is left in persist. The graph can be reloaded from
         * persist if it is recreated with the same 'graph_name'.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.DeleteGraphRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}.
         */
        public static final String DELETE_PERSIST = "delete_persist";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String graphName;
    private Map<String, String> options;


    /**
     * Constructs a DeleteGraphRequest object with default parameters.
     */
    public DeleteGraphRequest() {
        graphName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a DeleteGraphRequest object with the specified parameters.
     * 
     * @param graphName  Name of the graph to be deleted.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#DELETE_PERSIST
     *                 DELETE_PERSIST}: If set to {@code true}, the graph is
     *                 removed from the server and persist. If set to {@code
     *                 false}, the graph is removed from the server but is left
     *                 in persist. The graph can be reloaded from persist if it
     *                 is recreated with the same 'graph_name'.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#TRUE
     *                 TRUE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public DeleteGraphRequest(String graphName, Map<String, String> options) {
        this.graphName = (graphName == null) ? "" : graphName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the graph to be deleted.
     * 
     */
    public String getGraphName() {
        return graphName;
    }

    /**
     * 
     * @param graphName  Name of the graph to be deleted.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DeleteGraphRequest setGraphName(String graphName) {
        this.graphName = (graphName == null) ? "" : graphName;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.DeleteGraphRequest.Options#DELETE_PERSIST
     *         DELETE_PERSIST}: If set to {@code true}, the graph is removed
     *         from the server and persist. If set to {@code false}, the graph
     *         is removed from the server but is left in persist. The graph can
     *         be reloaded from persist if it is recreated with the same
     *         'graph_name'.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.DeleteGraphRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}.
     *         </ul>
     *         The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#DELETE_PERSIST
     *                 DELETE_PERSIST}: If set to {@code true}, the graph is
     *                 removed from the server and persist. If set to {@code
     *                 false}, the graph is removed from the server but is left
     *                 in persist. The graph can be reloaded from persist if it
     *                 is recreated with the same 'graph_name'.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.DeleteGraphRequest.Options#TRUE
     *                 TRUE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DeleteGraphRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
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
                return this.graphName;

            case 1:
                return this.options;

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

        DeleteGraphRequest that = (DeleteGraphRequest)obj;

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

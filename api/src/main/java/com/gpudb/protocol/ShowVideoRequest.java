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
 * A set of parameters for {@link com.gpudb.GPUdb#showVideo(ShowVideoRequest)}.
 * <p>
 * Retrieves information about rendered videos.
 */
public class ShowVideoRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowVideoRequest")
            .namespace("com.gpudb")
            .fields()
                .name("paths").type().array().items().stringType().noDefault()
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

    private List<String> paths;
    private Map<String, String> options;


    /**
     * Constructs a ShowVideoRequest object with default parameters.
     */
    public ShowVideoRequest() {
        paths = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a ShowVideoRequest object with the specified parameters.
     * 
     * @param paths  The fully-qualified <a
     *               href="../../../../../../tools/kifs/"
     *               target="_top">KiFS</a> paths for the videos to show. If
     *               empty, shows all videos.
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     */
    public ShowVideoRequest(List<String> paths, Map<String, String> options) {
        this.paths = (paths == null) ? new ArrayList<String>() : paths;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return The fully-qualified <a href="../../../../../../tools/kifs/"
     *         target="_top">KiFS</a> paths for the videos to show. If empty,
     *         shows all videos.
     * 
     */
    public List<String> getPaths() {
        return paths;
    }

    /**
     * 
     * @param paths  The fully-qualified <a
     *               href="../../../../../../tools/kifs/"
     *               target="_top">KiFS</a> paths for the videos to show. If
     *               empty, shows all videos.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowVideoRequest setPaths(List<String> paths) {
        this.paths = (paths == null) ? new ArrayList<String>() : paths;
        return this;
    }

    /**
     * 
     * @return Optional parameters.  The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowVideoRequest setOptions(Map<String, String> options) {
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
                return this.paths;

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
                this.paths = (List<String>)value;
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

        ShowVideoRequest that = (ShowVideoRequest)obj;

        return ( this.paths.equals( that.paths )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "paths" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.paths ) );
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
        hashCode = (31 * hashCode) + this.paths.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

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
 * A set of parameters for {@link
 * com.gpudb.GPUdb#updateRecordsBySeries(UpdateRecordsBySeriesRequest)}.
 * <p>
 * Updates the view specified by {@code tableName} to include full series
 * (track) information from the {@code worldTableName} for the series (tracks)
 * present in the {@code viewName}.
 */
public class UpdateRecordsBySeriesRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("UpdateRecordsBySeriesRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("worldTableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("reserved").type().array().items().stringType().noDefault()
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

    private String tableName;
    private String worldTableName;
    private String viewName;
    private List<String> reserved;
    private Map<String, String> options;


    /**
     * Constructs an UpdateRecordsBySeriesRequest object with default
     * parameters.
     */
    public UpdateRecordsBySeriesRequest() {
        tableName = "";
        worldTableName = "";
        viewName = "";
        reserved = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an UpdateRecordsBySeriesRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the view on which the update operation will be
     *                   performed. Must be an existing view.
     * @param worldTableName  Name of the table containing the complete series
     *                        (track) information.
     * @param viewName  name of the view containing the series (tracks) which
     *                  have to be updated.  The default value is ''.
     * @param reserved  The default value is an empty {@link List}.
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     */
    public UpdateRecordsBySeriesRequest(String tableName, String worldTableName, String viewName, List<String> reserved, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.worldTableName = (worldTableName == null) ? "" : worldTableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.reserved = (reserved == null) ? new ArrayList<String>() : reserved;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the view on which the update operation will be
     *         performed. Must be an existing view.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the view on which the update operation will be
     *                   performed. Must be an existing view.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UpdateRecordsBySeriesRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return Name of the table containing the complete series (track)
     *         information.
     * 
     */
    public String getWorldTableName() {
        return worldTableName;
    }

    /**
     * 
     * @param worldTableName  Name of the table containing the complete series
     *                        (track) information.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UpdateRecordsBySeriesRequest setWorldTableName(String worldTableName) {
        this.worldTableName = (worldTableName == null) ? "" : worldTableName;
        return this;
    }

    /**
     * 
     * @return name of the view containing the series (tracks) which have to be
     *         updated.  The default value is ''.
     * 
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * 
     * @param viewName  name of the view containing the series (tracks) which
     *                  have to be updated.  The default value is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UpdateRecordsBySeriesRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return The default value is an empty {@link List}.
     * 
     */
    public List<String> getReserved() {
        return reserved;
    }

    /**
     * 
     * @param reserved  The default value is an empty {@link List}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UpdateRecordsBySeriesRequest setReserved(List<String> reserved) {
        this.reserved = (reserved == null) ? new ArrayList<String>() : reserved;
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
    public UpdateRecordsBySeriesRequest setOptions(Map<String, String> options) {
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
                return this.tableName;

            case 1:
                return this.worldTableName;

            case 2:
                return this.viewName;

            case 3:
                return this.reserved;

            case 4:
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
                this.tableName = (String)value;
                break;

            case 1:
                this.worldTableName = (String)value;
                break;

            case 2:
                this.viewName = (String)value;
                break;

            case 3:
                this.reserved = (List<String>)value;
                break;

            case 4:
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

        UpdateRecordsBySeriesRequest that = (UpdateRecordsBySeriesRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.worldTableName.equals( that.worldTableName )
                 && this.viewName.equals( that.viewName )
                 && this.reserved.equals( that.reserved )
                 && this.options.equals( that.options ) );
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
        builder.append( gd.toString( "worldTableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.worldTableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "viewName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.viewName ) );
        builder.append( ", " );
        builder.append( gd.toString( "reserved" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.reserved ) );
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
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.worldTableName.hashCode();
        hashCode = (31 * hashCode) + this.viewName.hashCode();
        hashCode = (31 * hashCode) + this.reserved.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

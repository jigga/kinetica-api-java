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
 * com.gpudb.GPUdb#filterByArea(FilterByAreaRequest)}.
 * <p>
 * Calculates which objects from a table are within a named area of interest
 * (NAI/polygon). The operation is synchronous, meaning that a response will
 * not be returned until all the matching objects are fully available. The
 * response payload provides the count of the resulting set. A new resultant
 * set (view) which satisfies the input NAI restriction specification is
 * created with the name {@code viewName} passed in as part of the input.
 */
public class FilterByAreaRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterByAreaRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("xColumnName").type().stringType().noDefault()
                .name("xVector").type().array().items().doubleType().noDefault()
                .name("yColumnName").type().stringType().noDefault()
                .name("yVector").type().array().items().doubleType().noDefault()
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
     * com.gpudb.protocol.FilterByAreaRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: Name of a collection which is to contain the newly
     * created view. If the collection provided is non-existent, the collection
     * will be automatically created.  If empty, then the newly created view
     * will be top-level.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of a collection which is to contain the newly created view. If
         * the collection provided is non-existent, the collection will be
         * automatically created.  If empty, then the newly created view will
         * be top-level.
         */
        public static final String COLLECTION_NAME = "collection_name";

        private Options() {  }
    }

    private String tableName;
    private String viewName;
    private String xColumnName;
    private List<Double> xVector;
    private String yColumnName;
    private List<Double> yVector;
    private Map<String, String> options;


    /**
     * Constructs a FilterByAreaRequest object with default parameters.
     */
    public FilterByAreaRequest() {
        tableName = "";
        viewName = "";
        xColumnName = "";
        xVector = new ArrayList<>();
        yColumnName = "";
        yVector = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterByAreaRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table to filter.  This may be the name of
     *                   a collection, a table or a view (when chaining
     *                   queries). If filtering a collection, all child tables
     *                   where the filter expression is valid will be filtered;
     *                   the filtered result tables will then be placed in a
     *                   collection specified by {@code viewName}.
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results. Has the same naming
     *                  restrictions as <a
     *                  href="../../../../../concepts/tables.html"
     *                  target="_top">tables</a>.  The default value is ''.
     * @param xColumnName  Name of the column containing the x values to be
     *                     filtered.
     * @param xVector  List of x coordinates of the vertices of the polygon
     *                 representing the area to be filtered.
     * @param yColumnName  Name of the column containing the y values to be
     *                     filtered.
     * @param yVector  List of y coordinates of the vertices of the polygon
     *                 representing the area to be filtered.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByAreaRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the newly created view. If the collection
     *                 provided is non-existent, the collection will be
     *                 automatically created.  If empty, then the newly created
     *                 view will be top-level.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public FilterByAreaRequest(String tableName, String viewName, String xColumnName, List<Double> xVector, String yColumnName, List<Double> yVector, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        this.xVector = (xVector == null) ? new ArrayList<Double>() : xVector;
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        this.yVector = (yVector == null) ? new ArrayList<Double>() : yVector;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table to filter.  This may be the name of a
     *         collection, a table or a view (when chaining queries). If
     *         filtering a collection, all child tables where the filter
     *         expression is valid will be filtered; the filtered result tables
     *         will then be placed in a collection specified by {@code
     *         viewName}.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table to filter.  This may be the name of
     *                   a collection, a table or a view (when chaining
     *                   queries). If filtering a collection, all child tables
     *                   where the filter expression is valid will be filtered;
     *                   the filtered result tables will then be placed in a
     *                   collection specified by {@code viewName}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return If provided, then this will be the name of the view containing
     *         the results. Has the same naming restrictions as <a
     *         href="../../../../../concepts/tables.html"
     *         target="_top">tables</a>.  The default value is ''.
     * 
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * 
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results. Has the same naming
     *                  restrictions as <a
     *                  href="../../../../../concepts/tables.html"
     *                  target="_top">tables</a>.  The default value is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return Name of the column containing the x values to be filtered.
     * 
     */
    public String getXColumnName() {
        return xColumnName;
    }

    /**
     * 
     * @param xColumnName  Name of the column containing the x values to be
     *                     filtered.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setXColumnName(String xColumnName) {
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        return this;
    }

    /**
     * 
     * @return List of x coordinates of the vertices of the polygon
     *         representing the area to be filtered.
     * 
     */
    public List<Double> getXVector() {
        return xVector;
    }

    /**
     * 
     * @param xVector  List of x coordinates of the vertices of the polygon
     *                 representing the area to be filtered.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setXVector(List<Double> xVector) {
        this.xVector = (xVector == null) ? new ArrayList<Double>() : xVector;
        return this;
    }

    /**
     * 
     * @return Name of the column containing the y values to be filtered.
     * 
     */
    public String getYColumnName() {
        return yColumnName;
    }

    /**
     * 
     * @param yColumnName  Name of the column containing the y values to be
     *                     filtered.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setYColumnName(String yColumnName) {
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        return this;
    }

    /**
     * 
     * @return List of y coordinates of the vertices of the polygon
     *         representing the area to be filtered.
     * 
     */
    public List<Double> getYVector() {
        return yVector;
    }

    /**
     * 
     * @param yVector  List of y coordinates of the vertices of the polygon
     *                 representing the area to be filtered.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setYVector(List<Double> yVector) {
        this.yVector = (yVector == null) ? new ArrayList<Double>() : yVector;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterByAreaRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: Name of a collection which is to contain the
     *         newly created view. If the collection provided is non-existent,
     *         the collection will be automatically created.  If empty, then
     *         the newly created view will be top-level.
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
     *                 com.gpudb.protocol.FilterByAreaRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the newly created view. If the collection
     *                 provided is non-existent, the collection will be
     *                 automatically created.  If empty, then the newly created
     *                 view will be top-level.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByAreaRequest setOptions(Map<String, String> options) {
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
                return this.viewName;

            case 2:
                return this.xColumnName;

            case 3:
                return this.xVector;

            case 4:
                return this.yColumnName;

            case 5:
                return this.yVector;

            case 6:
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
                this.viewName = (String)value;
                break;

            case 2:
                this.xColumnName = (String)value;
                break;

            case 3:
                this.xVector = (List<Double>)value;
                break;

            case 4:
                this.yColumnName = (String)value;
                break;

            case 5:
                this.yVector = (List<Double>)value;
                break;

            case 6:
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

        FilterByAreaRequest that = (FilterByAreaRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && this.xColumnName.equals( that.xColumnName )
                 && this.xVector.equals( that.xVector )
                 && this.yColumnName.equals( that.yColumnName )
                 && this.yVector.equals( that.yVector )
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
        builder.append( gd.toString( "viewName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.viewName ) );
        builder.append( ", " );
        builder.append( gd.toString( "xColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.xColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "xVector" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.xVector ) );
        builder.append( ", " );
        builder.append( gd.toString( "yColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.yColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "yVector" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.yVector ) );
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
        hashCode = (31 * hashCode) + this.viewName.hashCode();
        hashCode = (31 * hashCode) + this.xColumnName.hashCode();
        hashCode = (31 * hashCode) + this.xVector.hashCode();
        hashCode = (31 * hashCode) + this.yColumnName.hashCode();
        hashCode = (31 * hashCode) + this.yVector.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

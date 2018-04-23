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
 * com.gpudb.GPUdb#filterBySeries(FilterBySeriesRequest)}.
 * <p>
 * Filters objects matching all points of the given track (works only on track
 * type data).  It allows users to specify a particular track to find all other
 * points in the table that fall within specified ranges-spatial and
 * temporal-of all points of the given track. Additionally, the user can
 * specify another track to see if the two intersect (or go close to each other
 * within the specified ranges). The user also has the flexibility of using
 * different metrics for the spatial distance calculation: Euclidean (flat
 * geometry) or Great Circle (spherical geometry to approximate the Earth's
 * surface distances). The filtered points are stored in a newly created result
 * set. The return value of the function is the number of points in the
 * resultant set (view).
 * <p>
 * This operation is synchronous, meaning that a response will not be returned
 * until all the objects are fully available.
 */
public class FilterBySeriesRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterBySeriesRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("trackId").type().stringType().noDefault()
                .name("targetTrackIds").type().array().items().stringType().noDefault()
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
     * com.gpudb.protocol.FilterBySeriesRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: Name of a collection which is to contain the newly
     * created view. If the collection provided is non-existent, the collection
     * will be automatically created. If empty, then the newly created view
     * will be top-level.
     *         <li> {@link
     * com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_RADIUS
     * SPATIAL_RADIUS}: A positive number passed as a string representing the
     * radius of the search area centered around each track point's geospatial
     * coordinates. The value is interpreted in meters. Required parameter.
     *         <li> {@link
     * com.gpudb.protocol.FilterBySeriesRequest.Options#TIME_RADIUS
     * TIME_RADIUS}: A positive number passed as a string representing the
     * maximum allowable time difference between the timestamps of a filtered
     * object and the given track's points. The value is interpreted in
     * seconds. Required parameter.
     *         <li> {@link
     * com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_DISTANCE_METRIC
     * SPATIAL_DISTANCE_METRIC}: A string representing the coordinate system to
     * use for the spatial search criteria. Acceptable values are 'euclidean'
     * and 'great_circle'. Optional parameter; default is 'euclidean'.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.FilterBySeriesRequest.Options#EUCLIDEAN EUCLIDEAN}
     *         <li> {@link
     * com.gpudb.protocol.FilterBySeriesRequest.Options#GREAT_CIRCLE
     * GREAT_CIRCLE}
     * </ul>
     * </ul>
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of a collection which is to contain the newly created view. If
         * the collection provided is non-existent, the collection will be
         * automatically created. If empty, then the newly created view will be
         * top-level.
         */
        public static final String COLLECTION_NAME = "collection_name";

        /**
         * A positive number passed as a string representing the radius of the
         * search area centered around each track point's geospatial
         * coordinates. The value is interpreted in meters. Required parameter.
         */
        public static final String SPATIAL_RADIUS = "spatial_radius";

        /**
         * A positive number passed as a string representing the maximum
         * allowable time difference between the timestamps of a filtered
         * object and the given track's points. The value is interpreted in
         * seconds. Required parameter.
         */
        public static final String TIME_RADIUS = "time_radius";

        /**
         * A string representing the coordinate system to use for the spatial
         * search criteria. Acceptable values are 'euclidean' and
         * 'great_circle'. Optional parameter; default is 'euclidean'.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.FilterBySeriesRequest.Options#EUCLIDEAN
         * EUCLIDEAN}
         *         <li> {@link
         * com.gpudb.protocol.FilterBySeriesRequest.Options#GREAT_CIRCLE
         * GREAT_CIRCLE}
         * </ul>
         */
        public static final String SPATIAL_DISTANCE_METRIC = "spatial_distance_metric";
        public static final String EUCLIDEAN = "euclidean";
        public static final String GREAT_CIRCLE = "great_circle";

        private Options() {  }
    }

    private String tableName;
    private String viewName;
    private String trackId;
    private List<String> targetTrackIds;
    private Map<String, String> options;


    /**
     * Constructs a FilterBySeriesRequest object with default parameters.
     */
    public FilterBySeriesRequest() {
        tableName = "";
        viewName = "";
        trackId = "";
        targetTrackIds = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterBySeriesRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table on which the filter by track
     *                   operation will be performed. Must be a currently
     *                   existing table with track semantic type.
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results. Has the same naming
     *                  restrictions as <a
     *                  href="../../../../../concepts/tables.html"
     *                  target="_top">tables</a>.
     * @param trackId  The ID of the track which will act as the filtering
     *                 points. Must be an existing track within the given
     *                 table.
     * @param targetTrackIds  Up to one track ID to intersect with the "filter"
     *                        track. If any provided, it must be an valid track
     *                        ID within the given set.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the newly created view. If the collection
     *                 provided is non-existent, the collection will be
     *                 automatically created. If empty, then the newly created
     *                 view will be top-level.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_RADIUS
     *                 SPATIAL_RADIUS}: A positive number passed as a string
     *                 representing the radius of the search area centered
     *                 around each track point's geospatial coordinates. The
     *                 value is interpreted in meters. Required parameter.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#TIME_RADIUS
     *                 TIME_RADIUS}: A positive number passed as a string
     *                 representing the maximum allowable time difference
     *                 between the timestamps of a filtered object and the
     *                 given track's points. The value is interpreted in
     *                 seconds. Required parameter.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_DISTANCE_METRIC
     *                 SPATIAL_DISTANCE_METRIC}: A string representing the
     *                 coordinate system to use for the spatial search
     *                 criteria. Acceptable values are 'euclidean' and
     *                 'great_circle'. Optional parameter; default is
     *                 'euclidean'.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#EUCLIDEAN
     *                 EUCLIDEAN}
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#GREAT_CIRCLE
     *                 GREAT_CIRCLE}
     *                 </ul>
     *                 </ul>
     * 
     */
    public FilterBySeriesRequest(String tableName, String viewName, String trackId, List<String> targetTrackIds, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.trackId = (trackId == null) ? "" : trackId;
        this.targetTrackIds = (targetTrackIds == null) ? new ArrayList<String>() : targetTrackIds;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the filter by track operation will be
     *         performed. Must be a currently existing table with track
     *         semantic type.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the filter by track
     *                   operation will be performed. Must be a currently
     *                   existing table with track semantic type.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterBySeriesRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return If provided, then this will be the name of the view containing
     *         the results. Has the same naming restrictions as <a
     *         href="../../../../../concepts/tables.html"
     *         target="_top">tables</a>.
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
     *                  target="_top">tables</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterBySeriesRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return The ID of the track which will act as the filtering points. Must
     *         be an existing track within the given table.
     * 
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * 
     * @param trackId  The ID of the track which will act as the filtering
     *                 points. Must be an existing track within the given
     *                 table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterBySeriesRequest setTrackId(String trackId) {
        this.trackId = (trackId == null) ? "" : trackId;
        return this;
    }

    /**
     * 
     * @return Up to one track ID to intersect with the "filter" track. If any
     *         provided, it must be an valid track ID within the given set.
     * 
     */
    public List<String> getTargetTrackIds() {
        return targetTrackIds;
    }

    /**
     * 
     * @param targetTrackIds  Up to one track ID to intersect with the "filter"
     *                        track. If any provided, it must be an valid track
     *                        ID within the given set.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterBySeriesRequest setTargetTrackIds(List<String> targetTrackIds) {
        this.targetTrackIds = (targetTrackIds == null) ? new ArrayList<String>() : targetTrackIds;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterBySeriesRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: Name of a collection which is to contain the
     *         newly created view. If the collection provided is non-existent,
     *         the collection will be automatically created. If empty, then the
     *         newly created view will be top-level.
     *                 <li> {@link
     *         com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_RADIUS
     *         SPATIAL_RADIUS}: A positive number passed as a string
     *         representing the radius of the search area centered around each
     *         track point's geospatial coordinates. The value is interpreted
     *         in meters. Required parameter.
     *                 <li> {@link
     *         com.gpudb.protocol.FilterBySeriesRequest.Options#TIME_RADIUS
     *         TIME_RADIUS}: A positive number passed as a string representing
     *         the maximum allowable time difference between the timestamps of
     *         a filtered object and the given track's points. The value is
     *         interpreted in seconds. Required parameter.
     *                 <li> {@link
     *         com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_DISTANCE_METRIC
     *         SPATIAL_DISTANCE_METRIC}: A string representing the coordinate
     *         system to use for the spatial search criteria. Acceptable values
     *         are 'euclidean' and 'great_circle'. Optional parameter; default
     *         is 'euclidean'.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterBySeriesRequest.Options#EUCLIDEAN
     *         EUCLIDEAN}
     *                 <li> {@link
     *         com.gpudb.protocol.FilterBySeriesRequest.Options#GREAT_CIRCLE
     *         GREAT_CIRCLE}
     *         </ul>
     *         </ul>
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
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the newly created view. If the collection
     *                 provided is non-existent, the collection will be
     *                 automatically created. If empty, then the newly created
     *                 view will be top-level.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_RADIUS
     *                 SPATIAL_RADIUS}: A positive number passed as a string
     *                 representing the radius of the search area centered
     *                 around each track point's geospatial coordinates. The
     *                 value is interpreted in meters. Required parameter.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#TIME_RADIUS
     *                 TIME_RADIUS}: A positive number passed as a string
     *                 representing the maximum allowable time difference
     *                 between the timestamps of a filtered object and the
     *                 given track's points. The value is interpreted in
     *                 seconds. Required parameter.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#SPATIAL_DISTANCE_METRIC
     *                 SPATIAL_DISTANCE_METRIC}: A string representing the
     *                 coordinate system to use for the spatial search
     *                 criteria. Acceptable values are 'euclidean' and
     *                 'great_circle'. Optional parameter; default is
     *                 'euclidean'.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#EUCLIDEAN
     *                 EUCLIDEAN}
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterBySeriesRequest.Options#GREAT_CIRCLE
     *                 GREAT_CIRCLE}
     *                 </ul>
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterBySeriesRequest setOptions(Map<String, String> options) {
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
                return this.trackId;

            case 3:
                return this.targetTrackIds;

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
                this.viewName = (String)value;
                break;

            case 2:
                this.trackId = (String)value;
                break;

            case 3:
                this.targetTrackIds = (List<String>)value;
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

        FilterBySeriesRequest that = (FilterBySeriesRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && this.trackId.equals( that.trackId )
                 && this.targetTrackIds.equals( that.targetTrackIds )
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
        builder.append( gd.toString( "trackId" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.trackId ) );
        builder.append( ", " );
        builder.append( gd.toString( "targetTrackIds" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.targetTrackIds ) );
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
        hashCode = (31 * hashCode) + this.trackId.hashCode();
        hashCode = (31 * hashCode) + this.targetTrackIds.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

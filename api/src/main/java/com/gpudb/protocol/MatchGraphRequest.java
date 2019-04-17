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
 * com.gpudb.GPUdb#matchGraph(MatchGraphRequest)}.
 * <p>
 * Matches measured lon/lat points to an underlying graph network.
 */
public class MatchGraphRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("MatchGraphRequest")
            .namespace("com.gpudb")
            .fields()
                .name("graphName").type().stringType().noDefault()
                .name("samplePoints").type().array().items().stringType().noDefault()
                .name("solveMethod").type().stringType().noDefault()
                .name("solutionTable").type().stringType().noDefault()
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
     * Solver used for mapmatching.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.SolveMethod#MARKOV_CHAIN
     * MARKOV_CHAIN}: Hidden Markov Model (HMM) based method.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     * INCREMENTAL_WEIGHTED}: Uses time and/or distance to influence one or
     * more shortest paths along the sample points.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     * INCREMENTAL_WEIGHTED}.
     * A set of string constants for the parameter {@code solveMethod}.
     */
    public static final class SolveMethod {

        /**
         * Hidden Markov Model (HMM) based method.
         */
        public static final String MARKOV_CHAIN = "markov_chain";

        /**
         * Uses time and/or distance to influence one or more shortest paths
         * along the sample points.
         */
        public static final String INCREMENTAL_WEIGHTED = "incremental_weighted";

        private SolveMethod() {  }
    }


    /**
     * Additional parameters
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#GPS_NOISE GPS_NOISE}: GPS
     * noise value - in meters - to remove redundant samplespoints (95th
     * percentile). -1 to disable.  The default value is '5.0'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#NUM_SEGMENTS NUM_SEGMENTS}:
     * Number of potentially matching road segments for each sample point.
     * (Defaults to 3 for 'markov_chain' and 5 for 'incremental_weighted').
     * The default value is '0'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#SEARCH_RADIUS
     * SEARCH_RADIUS}: Maximum search radius used when snapping samples points
     * onto potentially matching road segments. This corresponds to
     * approximately 100m when using geodesic coordinates.  The default value
     * is '0.001'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#CHAIN_WIDTH CHAIN_WIDTH}:
     * Only applicable if method is 'markov_chain'. Length of the sample points
     * window within the Markov kernel.  The default value is '9'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#MAX_SOLVE_LENGTH
     * MAX_SOLVE_LENGTH}: Only applicable if method is 'incremental_weighted'.
     * Maximum number of samples along the path to solve on.  The default value
     * is '200'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#TIME_WINDOW_WIDTH
     * TIME_WINDOW_WIDTH}: Only applicable if method is 'incremental_weighted'.
     * Time window in which sample points are favored (dt of 1 is the most
     * attractive).  The default value is '30'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#DETECT_LOOPS DETECT_LOOPS}:
     * Only applicable if method is 'incremental_weighted'. If true, add a
     * break point within any loop.  The default value is 'true'.
     *         <li> {@link com.gpudb.protocol.MatchGraphRequest.Options#SOURCE
     * SOURCE}: Optional WKT point on the trace; otherwise the beginning (in
     * time) is taken as the source.  The default value is 'POINT NULL'.
     *         <li> {@link
     * com.gpudb.protocol.MatchGraphRequest.Options#DESTINATION DESTINATION}:
     * Optional WKT point on the trace; otherwise the end (in time) is taken as
     * the destination.  The default value is 'POINT NULL'.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * GPS noise value - in meters - to remove redundant samplespoints
         * (95th percentile). -1 to disable.  The default value is '5.0'.
         */
        public static final String GPS_NOISE = "gps_noise";

        /**
         * Number of potentially matching road segments for each sample point.
         * (Defaults to 3 for 'markov_chain' and 5 for 'incremental_weighted').
         * The default value is '0'.
         */
        public static final String NUM_SEGMENTS = "num_segments";

        /**
         * Maximum search radius used when snapping samples points onto
         * potentially matching road segments. This corresponds to
         * approximately 100m when using geodesic coordinates.  The default
         * value is '0.001'.
         */
        public static final String SEARCH_RADIUS = "search_radius";

        /**
         * Only applicable if method is 'markov_chain'. Length of the sample
         * points window within the Markov kernel.  The default value is '9'.
         */
        public static final String CHAIN_WIDTH = "chain_width";

        /**
         * Only applicable if method is 'incremental_weighted'. Maximum number
         * of samples along the path to solve on.  The default value is '200'.
         */
        public static final String MAX_SOLVE_LENGTH = "max_solve_length";

        /**
         * Only applicable if method is 'incremental_weighted'. Time window in
         * which sample points are favored (dt of 1 is the most attractive).
         * The default value is '30'.
         */
        public static final String TIME_WINDOW_WIDTH = "time_window_width";

        /**
         * Only applicable if method is 'incremental_weighted'. If true, add a
         * break point within any loop.  The default value is 'true'.
         */
        public static final String DETECT_LOOPS = "detect_loops";

        /**
         * Optional WKT point on the trace; otherwise the beginning (in time)
         * is taken as the source.  The default value is 'POINT NULL'.
         */
        public static final String SOURCE = "source";

        /**
         * Optional WKT point on the trace; otherwise the end (in time) is
         * taken as the destination.  The default value is 'POINT NULL'.
         */
        public static final String DESTINATION = "destination";

        private Options() {  }
    }

    private String graphName;
    private List<String> samplePoints;
    private String solveMethod;
    private String solutionTable;
    private Map<String, String> options;


    /**
     * Constructs a MatchGraphRequest object with default parameters.
     */
    public MatchGraphRequest() {
        graphName = "";
        samplePoints = new ArrayList<>();
        solveMethod = "";
        solutionTable = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a MatchGraphRequest object with the specified parameters.
     * 
     * @param graphName  Name of the underlying graph network.
     * @param samplePoints  ['Table.column AS node_identifier', 'Table.column
     *                      AS SAMPLE_TIME' ]; e.g., 't1.wkt' AS
     *                      'SAMPLE_WKTPOINT', t1.t' AS 'SAMPLE_TIME'
     * @param solveMethod  Solver used for mapmatching.
     *                     Supported values:
     *                     <ul>
     *                             <li> {@link
     *                     com.gpudb.protocol.MatchGraphRequest.SolveMethod#MARKOV_CHAIN
     *                     MARKOV_CHAIN}: Hidden Markov Model (HMM) based
     *                     method.
     *                             <li> {@link
     *                     com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     *                     INCREMENTAL_WEIGHTED}: Uses time and/or distance to
     *                     influence one or more shortest paths along the
     *                     sample points.
     *                     </ul>
     *                     The default value is {@link
     *                     com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     *                     INCREMENTAL_WEIGHTED}.
     * @param solutionTable  Name of the table to store the solution. Error if
     *                       table already exists.  The default value is
     *                       'map_matching_solution'.
     * @param options  Additional parameters
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#GPS_NOISE
     *                 GPS_NOISE}: GPS noise value - in meters - to remove
     *                 redundant samplespoints (95th percentile). -1 to
     *                 disable.  The default value is '5.0'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#NUM_SEGMENTS
     *                 NUM_SEGMENTS}: Number of potentially matching road
     *                 segments for each sample point. (Defaults to 3 for
     *                 'markov_chain' and 5 for 'incremental_weighted').  The
     *                 default value is '0'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#SEARCH_RADIUS
     *                 SEARCH_RADIUS}: Maximum search radius used when snapping
     *                 samples points onto potentially matching road segments.
     *                 This corresponds to approximately 100m when using
     *                 geodesic coordinates.  The default value is '0.001'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#CHAIN_WIDTH
     *                 CHAIN_WIDTH}: Only applicable if method is
     *                 'markov_chain'. Length of the sample points window
     *                 within the Markov kernel.  The default value is '9'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#MAX_SOLVE_LENGTH
     *                 MAX_SOLVE_LENGTH}: Only applicable if method is
     *                 'incremental_weighted'. Maximum number of samples along
     *                 the path to solve on.  The default value is '200'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#TIME_WINDOW_WIDTH
     *                 TIME_WINDOW_WIDTH}: Only applicable if method is
     *                 'incremental_weighted'. Time window in which sample
     *                 points are favored (dt of 1 is the most attractive).
     *                 The default value is '30'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#DETECT_LOOPS
     *                 DETECT_LOOPS}: Only applicable if method is
     *                 'incremental_weighted'. If true, add a break point
     *                 within any loop.  The default value is 'true'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#SOURCE
     *                 SOURCE}: Optional WKT point on the trace; otherwise the
     *                 beginning (in time) is taken as the source.  The default
     *                 value is 'POINT NULL'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#DESTINATION
     *                 DESTINATION}: Optional WKT point on the trace; otherwise
     *                 the end (in time) is taken as the destination.  The
     *                 default value is 'POINT NULL'.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public MatchGraphRequest(String graphName, List<String> samplePoints, String solveMethod, String solutionTable, Map<String, String> options) {
        this.graphName = (graphName == null) ? "" : graphName;
        this.samplePoints = (samplePoints == null) ? new ArrayList<String>() : samplePoints;
        this.solveMethod = (solveMethod == null) ? "" : solveMethod;
        this.solutionTable = (solutionTable == null) ? "" : solutionTable;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the underlying graph network.
     * 
     */
    public String getGraphName() {
        return graphName;
    }

    /**
     * 
     * @param graphName  Name of the underlying graph network.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public MatchGraphRequest setGraphName(String graphName) {
        this.graphName = (graphName == null) ? "" : graphName;
        return this;
    }

    /**
     * 
     * @return ['Table.column AS node_identifier', 'Table.column AS
     *         SAMPLE_TIME' ]; e.g., 't1.wkt' AS 'SAMPLE_WKTPOINT', t1.t' AS
     *         'SAMPLE_TIME'
     * 
     */
    public List<String> getSamplePoints() {
        return samplePoints;
    }

    /**
     * 
     * @param samplePoints  ['Table.column AS node_identifier', 'Table.column
     *                      AS SAMPLE_TIME' ]; e.g., 't1.wkt' AS
     *                      'SAMPLE_WKTPOINT', t1.t' AS 'SAMPLE_TIME'
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public MatchGraphRequest setSamplePoints(List<String> samplePoints) {
        this.samplePoints = (samplePoints == null) ? new ArrayList<String>() : samplePoints;
        return this;
    }

    /**
     * 
     * @return Solver used for mapmatching.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.SolveMethod#MARKOV_CHAIN
     *         MARKOV_CHAIN}: Hidden Markov Model (HMM) based method.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     *         INCREMENTAL_WEIGHTED}: Uses time and/or distance to influence
     *         one or more shortest paths along the sample points.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     *         INCREMENTAL_WEIGHTED}.
     * 
     */
    public String getSolveMethod() {
        return solveMethod;
    }

    /**
     * 
     * @param solveMethod  Solver used for mapmatching.
     *                     Supported values:
     *                     <ul>
     *                             <li> {@link
     *                     com.gpudb.protocol.MatchGraphRequest.SolveMethod#MARKOV_CHAIN
     *                     MARKOV_CHAIN}: Hidden Markov Model (HMM) based
     *                     method.
     *                             <li> {@link
     *                     com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     *                     INCREMENTAL_WEIGHTED}: Uses time and/or distance to
     *                     influence one or more shortest paths along the
     *                     sample points.
     *                     </ul>
     *                     The default value is {@link
     *                     com.gpudb.protocol.MatchGraphRequest.SolveMethod#INCREMENTAL_WEIGHTED
     *                     INCREMENTAL_WEIGHTED}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public MatchGraphRequest setSolveMethod(String solveMethod) {
        this.solveMethod = (solveMethod == null) ? "" : solveMethod;
        return this;
    }

    /**
     * 
     * @return Name of the table to store the solution. Error if table already
     *         exists.  The default value is 'map_matching_solution'.
     * 
     */
    public String getSolutionTable() {
        return solutionTable;
    }

    /**
     * 
     * @param solutionTable  Name of the table to store the solution. Error if
     *                       table already exists.  The default value is
     *                       'map_matching_solution'.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public MatchGraphRequest setSolutionTable(String solutionTable) {
        this.solutionTable = (solutionTable == null) ? "" : solutionTable;
        return this;
    }

    /**
     * 
     * @return Additional parameters
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#GPS_NOISE
     *         GPS_NOISE}: GPS noise value - in meters - to remove redundant
     *         samplespoints (95th percentile). -1 to disable.  The default
     *         value is '5.0'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#NUM_SEGMENTS
     *         NUM_SEGMENTS}: Number of potentially matching road segments for
     *         each sample point. (Defaults to 3 for 'markov_chain' and 5 for
     *         'incremental_weighted').  The default value is '0'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#SEARCH_RADIUS
     *         SEARCH_RADIUS}: Maximum search radius used when snapping samples
     *         points onto potentially matching road segments. This corresponds
     *         to approximately 100m when using geodesic coordinates.  The
     *         default value is '0.001'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#CHAIN_WIDTH
     *         CHAIN_WIDTH}: Only applicable if method is 'markov_chain'.
     *         Length of the sample points window within the Markov kernel.
     *         The default value is '9'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#MAX_SOLVE_LENGTH
     *         MAX_SOLVE_LENGTH}: Only applicable if method is
     *         'incremental_weighted'. Maximum number of samples along the path
     *         to solve on.  The default value is '200'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#TIME_WINDOW_WIDTH
     *         TIME_WINDOW_WIDTH}: Only applicable if method is
     *         'incremental_weighted'. Time window in which sample points are
     *         favored (dt of 1 is the most attractive).  The default value is
     *         '30'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#DETECT_LOOPS
     *         DETECT_LOOPS}: Only applicable if method is
     *         'incremental_weighted'. If true, add a break point within any
     *         loop.  The default value is 'true'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#SOURCE SOURCE}:
     *         Optional WKT point on the trace; otherwise the beginning (in
     *         time) is taken as the source.  The default value is 'POINT
     *         NULL'.
     *                 <li> {@link
     *         com.gpudb.protocol.MatchGraphRequest.Options#DESTINATION
     *         DESTINATION}: Optional WKT point on the trace; otherwise the end
     *         (in time) is taken as the destination.  The default value is
     *         'POINT NULL'.
     *         </ul>
     *         The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Additional parameters
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#GPS_NOISE
     *                 GPS_NOISE}: GPS noise value - in meters - to remove
     *                 redundant samplespoints (95th percentile). -1 to
     *                 disable.  The default value is '5.0'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#NUM_SEGMENTS
     *                 NUM_SEGMENTS}: Number of potentially matching road
     *                 segments for each sample point. (Defaults to 3 for
     *                 'markov_chain' and 5 for 'incremental_weighted').  The
     *                 default value is '0'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#SEARCH_RADIUS
     *                 SEARCH_RADIUS}: Maximum search radius used when snapping
     *                 samples points onto potentially matching road segments.
     *                 This corresponds to approximately 100m when using
     *                 geodesic coordinates.  The default value is '0.001'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#CHAIN_WIDTH
     *                 CHAIN_WIDTH}: Only applicable if method is
     *                 'markov_chain'. Length of the sample points window
     *                 within the Markov kernel.  The default value is '9'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#MAX_SOLVE_LENGTH
     *                 MAX_SOLVE_LENGTH}: Only applicable if method is
     *                 'incremental_weighted'. Maximum number of samples along
     *                 the path to solve on.  The default value is '200'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#TIME_WINDOW_WIDTH
     *                 TIME_WINDOW_WIDTH}: Only applicable if method is
     *                 'incremental_weighted'. Time window in which sample
     *                 points are favored (dt of 1 is the most attractive).
     *                 The default value is '30'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#DETECT_LOOPS
     *                 DETECT_LOOPS}: Only applicable if method is
     *                 'incremental_weighted'. If true, add a break point
     *                 within any loop.  The default value is 'true'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#SOURCE
     *                 SOURCE}: Optional WKT point on the trace; otherwise the
     *                 beginning (in time) is taken as the source.  The default
     *                 value is 'POINT NULL'.
     *                         <li> {@link
     *                 com.gpudb.protocol.MatchGraphRequest.Options#DESTINATION
     *                 DESTINATION}: Optional WKT point on the trace; otherwise
     *                 the end (in time) is taken as the destination.  The
     *                 default value is 'POINT NULL'.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public MatchGraphRequest setOptions(Map<String, String> options) {
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
                return this.samplePoints;

            case 2:
                return this.solveMethod;

            case 3:
                return this.solutionTable;

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
                this.graphName = (String)value;
                break;

            case 1:
                this.samplePoints = (List<String>)value;
                break;

            case 2:
                this.solveMethod = (String)value;
                break;

            case 3:
                this.solutionTable = (String)value;
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

        MatchGraphRequest that = (MatchGraphRequest)obj;

        return ( this.graphName.equals( that.graphName )
                 && this.samplePoints.equals( that.samplePoints )
                 && this.solveMethod.equals( that.solveMethod )
                 && this.solutionTable.equals( that.solutionTable )
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
        builder.append( gd.toString( "samplePoints" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.samplePoints ) );
        builder.append( ", " );
        builder.append( gd.toString( "solveMethod" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.solveMethod ) );
        builder.append( ", " );
        builder.append( gd.toString( "solutionTable" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.solutionTable ) );
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
        hashCode = (31 * hashCode) + this.samplePoints.hashCode();
        hashCode = (31 * hashCode) + this.solveMethod.hashCode();
        hashCode = (31 * hashCode) + this.solutionTable.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

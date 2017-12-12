
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


public class VisualizeImageClassbreakRequest implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("VisualizeImageClassbreakRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableNames").type().array().items().stringType().noDefault()
                .name("worldTableNames").type().array().items().stringType().noDefault()
                .name("xColumnName").type().stringType().noDefault()
                .name("yColumnName").type().stringType().noDefault()
                .name("geometryColumnName").type().stringType().noDefault()
                .name("trackIds").type().array().items().array().items().stringType().noDefault()
                .name("cbColumnName").type().stringType().noDefault()
                .name("cbVals").type().array().items().stringType().noDefault()
                .name("minX").type().doubleType().noDefault()
                .name("maxX").type().doubleType().noDefault()
                .name("minY").type().doubleType().noDefault()
                .name("maxY").type().doubleType().noDefault()
                .name("width").type().intType().noDefault()
                .name("height").type().intType().noDefault()
                .name("projection").type().stringType().noDefault()
                .name("bgColor").type().longType().noDefault()
                .name("styleOptions").type().map().values().array().items().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    public static final class Projection {

        public static final String EPSG_4326 = "EPSG:4326";

        public static final String PLATE_CARREE = "PLATE_CARREE";

        public static final String _900913 = "900913";

        public static final String EPSG_900913 = "EPSG:900913";

        public static final String _102100 = "102100";

        public static final String EPSG_102100 = "EPSG:102100";

        public static final String _3857 = "3857";

        public static final String EPSG_3857 = "EPSG:3857";

        public static final String WEB_MERCATOR = "WEB_MERCATOR";


        private Projection() {  }
    }


    public static final class StyleOptions {

        public static final String DO_POINTS = "do_points";

        public static final String TRUE = "true";

        public static final String FALSE = "false";

        public static final String DO_SHAPES = "do_shapes";

        public static final String DO_TRACKS = "do_tracks";

        public static final String DO_SYMBOLOGY = "do_symbology";

        public static final String POINTCOLORS = "pointcolors";

        public static final String POINTSIZES = "pointsizes";

        public static final String POINTOFFSET_X = "pointoffset_x";

        public static final String POINTOFFSET_Y = "pointoffset_y";

        public static final String POINTSHAPES = "pointshapes";

        public static final String NONE = "none";

        public static final String CIRCLE = "circle";

        public static final String SQUARE = "square";

        public static final String DIAMOND = "diamond";

        public static final String HOLLOWCIRCLE = "hollowcircle";

        public static final String HOLLOWSQUARE = "hollowsquare";

        public static final String HOLLOWDIAMOND = "hollowdiamond";

        public static final String SYMBOLCODE = "SYMBOLCODE";

        public static final String SHAPELINEWIDTHS = "shapelinewidths";

        public static final String SHAPELINECOLORS = "shapelinecolors";

        public static final String SHAPELINEPATTERNS = "shapelinepatterns";

        public static final String SHAPELINEPATTERNLEN = "shapelinepatternlen";

        public static final String SHAPEFILLCOLORS = "shapefillcolors";

        public static final String TRACKLINEWIDTHS = "tracklinewidths";

        public static final String TRACKLINECOLORS = "tracklinecolors";

        public static final String TRACKMARKERSIZES = "trackmarkersizes";

        public static final String TRACKMARKERCOLORS = "trackmarkercolors";

        public static final String TRACKMARKERSHAPES = "trackmarkershapes";

        public static final String TRACKHEADCOLORS = "trackheadcolors";

        public static final String TRACKHEADSIZES = "trackheadsizes";

        public static final String TRACKHEADSHAPES = "trackheadshapes";


        private StyleOptions() {  }
    }


    private List<String> tableNames;
    private List<String> worldTableNames;
    private String xColumnName;
    private String yColumnName;
    private String geometryColumnName;
    private List<List<String>> trackIds;
    private String cbColumnName;
    private List<String> cbVals;
    private double minX;
    private double maxX;
    private double minY;
    private double maxY;
    private int width;
    private int height;
    private String projection;
    private long bgColor;
    private Map<String, List<String>> styleOptions;
    private Map<String, String> options;


    public VisualizeImageClassbreakRequest() {
        tableNames = new ArrayList<>();
        worldTableNames = new ArrayList<>();
        xColumnName = "";
        yColumnName = "";
        geometryColumnName = "";
        trackIds = new ArrayList<>();
        cbColumnName = "";
        cbVals = new ArrayList<>();
        projection = "";
        styleOptions = new LinkedHashMap<>();
        options = new LinkedHashMap<>();
    }

    public VisualizeImageClassbreakRequest(List<String> tableNames, List<String> worldTableNames, String xColumnName, String yColumnName, String geometryColumnName, List<List<String>> trackIds, String cbColumnName, List<String> cbVals, double minX, double maxX, double minY, double maxY, int width, int height, String projection, long bgColor, Map<String, List<String>> styleOptions, Map<String, String> options) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        this.worldTableNames = (worldTableNames == null) ? new ArrayList<String>() : worldTableNames;
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        this.geometryColumnName = (geometryColumnName == null) ? "" : geometryColumnName;
        this.trackIds = (trackIds == null) ? new ArrayList<List<String>>() : trackIds;
        this.cbColumnName = (cbColumnName == null) ? "" : cbColumnName;
        this.cbVals = (cbVals == null) ? new ArrayList<String>() : cbVals;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.width = width;
        this.height = height;
        this.projection = (projection == null) ? "" : projection;
        this.bgColor = bgColor;
        this.styleOptions = (styleOptions == null) ? new LinkedHashMap<String, List<String>>() : styleOptions;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    public List<String> getTableNames() {
        return tableNames;
    }

    public VisualizeImageClassbreakRequest setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    public List<String> getWorldTableNames() {
        return worldTableNames;
    }

    public VisualizeImageClassbreakRequest setWorldTableNames(List<String> worldTableNames) {
        this.worldTableNames = (worldTableNames == null) ? new ArrayList<String>() : worldTableNames;
        return this;
    }

    public String getXColumnName() {
        return xColumnName;
    }

    public VisualizeImageClassbreakRequest setXColumnName(String xColumnName) {
        this.xColumnName = (xColumnName == null) ? "" : xColumnName;
        return this;
    }

    public String getYColumnName() {
        return yColumnName;
    }

    public VisualizeImageClassbreakRequest setYColumnName(String yColumnName) {
        this.yColumnName = (yColumnName == null) ? "" : yColumnName;
        return this;
    }

    public String getGeometryColumnName() {
        return geometryColumnName;
    }

    public VisualizeImageClassbreakRequest setGeometryColumnName(String geometryColumnName) {
        this.geometryColumnName = (geometryColumnName == null) ? "" : geometryColumnName;
        return this;
    }

    public List<List<String>> getTrackIds() {
        return trackIds;
    }

    public VisualizeImageClassbreakRequest setTrackIds(List<List<String>> trackIds) {
        this.trackIds = (trackIds == null) ? new ArrayList<List<String>>() : trackIds;
        return this;
    }

    public String getCbColumnName() {
        return cbColumnName;
    }

    public VisualizeImageClassbreakRequest setCbColumnName(String cbColumnName) {
        this.cbColumnName = (cbColumnName == null) ? "" : cbColumnName;
        return this;
    }

    public List<String> getCbVals() {
        return cbVals;
    }

    public VisualizeImageClassbreakRequest setCbVals(List<String> cbVals) {
        this.cbVals = (cbVals == null) ? new ArrayList<String>() : cbVals;
        return this;
    }

    public double getMinX() {
        return minX;
    }

    public VisualizeImageClassbreakRequest setMinX(double minX) {
        this.minX = minX;
        return this;
    }

    public double getMaxX() {
        return maxX;
    }

    public VisualizeImageClassbreakRequest setMaxX(double maxX) {
        this.maxX = maxX;
        return this;
    }

    public double getMinY() {
        return minY;
    }

    public VisualizeImageClassbreakRequest setMinY(double minY) {
        this.minY = minY;
        return this;
    }

    public double getMaxY() {
        return maxY;
    }

    public VisualizeImageClassbreakRequest setMaxY(double maxY) {
        this.maxY = maxY;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public VisualizeImageClassbreakRequest setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public VisualizeImageClassbreakRequest setHeight(int height) {
        this.height = height;
        return this;
    }

    public String getProjection() {
        return projection;
    }

    public VisualizeImageClassbreakRequest setProjection(String projection) {
        this.projection = (projection == null) ? "" : projection;
        return this;
    }

    public long getBgColor() {
        return bgColor;
    }

    public VisualizeImageClassbreakRequest setBgColor(long bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public Map<String, List<String>> getStyleOptions() {
        return styleOptions;
    }

    public VisualizeImageClassbreakRequest setStyleOptions(Map<String, List<String>> styleOptions) {
        this.styleOptions = (styleOptions == null) ? new LinkedHashMap<String, List<String>>() : styleOptions;
        return this;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public VisualizeImageClassbreakRequest setOptions(Map<String, String> options) {
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
                return this.tableNames;

            case 1:
                return this.worldTableNames;

            case 2:
                return this.xColumnName;

            case 3:
                return this.yColumnName;

            case 4:
                return this.geometryColumnName;

            case 5:
                return this.trackIds;

            case 6:
                return this.cbColumnName;

            case 7:
                return this.cbVals;

            case 8:
                return this.minX;

            case 9:
                return this.maxX;

            case 10:
                return this.minY;

            case 11:
                return this.maxY;

            case 12:
                return this.width;

            case 13:
                return this.height;

            case 14:
                return this.projection;

            case 15:
                return this.bgColor;

            case 16:
                return this.styleOptions;

            case 17:
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
                this.tableNames = (List<String>)value;
                break;

            case 1:
                this.worldTableNames = (List<String>)value;
                break;

            case 2:
                this.xColumnName = (String)value;
                break;

            case 3:
                this.yColumnName = (String)value;
                break;

            case 4:
                this.geometryColumnName = (String)value;
                break;

            case 5:
                this.trackIds = (List<List<String>>)value;
                break;

            case 6:
                this.cbColumnName = (String)value;
                break;

            case 7:
                this.cbVals = (List<String>)value;
                break;

            case 8:
                this.minX = (Double)value;
                break;

            case 9:
                this.maxX = (Double)value;
                break;

            case 10:
                this.minY = (Double)value;
                break;

            case 11:
                this.maxY = (Double)value;
                break;

            case 12:
                this.width = (Integer)value;
                break;

            case 13:
                this.height = (Integer)value;
                break;

            case 14:
                this.projection = (String)value;
                break;

            case 15:
                this.bgColor = (Long)value;
                break;

            case 16:
                this.styleOptions = (Map<String, List<String>>)value;
                break;

            case 17:
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

        VisualizeImageClassbreakRequest that = (VisualizeImageClassbreakRequest)obj;

        return ( this.tableNames.equals( that.tableNames )
                 && this.worldTableNames.equals( that.worldTableNames )
                 && this.xColumnName.equals( that.xColumnName )
                 && this.yColumnName.equals( that.yColumnName )
                 && this.geometryColumnName.equals( that.geometryColumnName )
                 && this.trackIds.equals( that.trackIds )
                 && this.cbColumnName.equals( that.cbColumnName )
                 && this.cbVals.equals( that.cbVals )
                 && ( (Double)this.minX ).equals( (Double)that.minX )
                 && ( (Double)this.maxX ).equals( (Double)that.maxX )
                 && ( (Double)this.minY ).equals( (Double)that.minY )
                 && ( (Double)this.maxY ).equals( (Double)that.maxY )
                 && ( this.width == that.width )
                 && ( this.height == that.height )
                 && this.projection.equals( that.projection )
                 && ( this.bgColor == that.bgColor )
                 && this.styleOptions.equals( that.styleOptions )
                 && this.options.equals( that.options ) );
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "worldTableNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.worldTableNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "xColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.xColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "yColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.yColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "geometryColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.geometryColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "trackIds" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.trackIds ) );
        builder.append( ", " );
        builder.append( gd.toString( "cbColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.cbColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "cbVals" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.cbVals ) );
        builder.append( ", " );
        builder.append( gd.toString( "minX" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.minX ) );
        builder.append( ", " );
        builder.append( gd.toString( "maxX" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.maxX ) );
        builder.append( ", " );
        builder.append( gd.toString( "minY" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.minY ) );
        builder.append( ", " );
        builder.append( gd.toString( "maxY" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.maxY ) );
        builder.append( ", " );
        builder.append( gd.toString( "width" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.width ) );
        builder.append( ", " );
        builder.append( gd.toString( "height" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.height ) );
        builder.append( ", " );
        builder.append( gd.toString( "projection" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.projection ) );
        builder.append( ", " );
        builder.append( gd.toString( "bgColor" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.bgColor ) );
        builder.append( ", " );
        builder.append( gd.toString( "styleOptions" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.styleOptions ) );
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
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.worldTableNames.hashCode();
        hashCode = (31 * hashCode) + this.xColumnName.hashCode();
        hashCode = (31 * hashCode) + this.yColumnName.hashCode();
        hashCode = (31 * hashCode) + this.geometryColumnName.hashCode();
        hashCode = (31 * hashCode) + this.trackIds.hashCode();
        hashCode = (31 * hashCode) + this.cbColumnName.hashCode();
        hashCode = (31 * hashCode) + this.cbVals.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.minX).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.maxX).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.minY).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.maxY).hashCode();
        hashCode = (31 * hashCode) + this.width;
        hashCode = (31 * hashCode) + this.height;
        hashCode = (31 * hashCode) + this.projection.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.bgColor).hashCode();
        hashCode = (31 * hashCode) + this.styleOptions.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }


}

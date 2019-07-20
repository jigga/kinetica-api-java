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
 * com.gpudb.GPUdb#createTriggerByRange(CreateTriggerByRangeRequest)}.
 * <p>
 * Sets up a simple range trigger for a column_name for one or more tables.
 * Once the trigger has been activated, any record added to the listed
 * tables(s) via {@link
 * com.gpudb.GPUdb#insertRecordsRaw(RawInsertRecordsRequest)} with the chosen
 * column_name's value falling within the specified range will trip the
 * trigger. All such records will be queued at the trigger port (by default
 * '9001' but able to be retrieved via {@link
 * com.gpudb.GPUdb#showSystemStatus(ShowSystemStatusRequest)}) for any
 * listening client to collect. Active triggers can be cancelled by using the
 * {@link com.gpudb.GPUdb#clearTrigger(ClearTriggerRequest)} endpoint or by
 * clearing all relevant tables.
 * <p>
 * The output returns the trigger handle as well as indicating success or
 * failure of the trigger activation.
 */
public class CreateTriggerByRangeRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateTriggerByRangeRequest")
            .namespace("com.gpudb")
            .fields()
                .name("requestId").type().stringType().noDefault()
                .name("tableNames").type().array().items().stringType().noDefault()
                .name("columnName").type().stringType().noDefault()
                .name("min").type().doubleType().noDefault()
                .name("max").type().doubleType().noDefault()
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

    private String requestId;
    private List<String> tableNames;
    private String columnName;
    private double min;
    private double max;
    private Map<String, String> options;


    /**
     * Constructs a CreateTriggerByRangeRequest object with default parameters.
     */
    public CreateTriggerByRangeRequest() {
        requestId = "";
        tableNames = new ArrayList<>();
        columnName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateTriggerByRangeRequest object with the specified
     * parameters.
     * 
     * @param requestId  User-created ID for the trigger. The ID can be
     *                   alphanumeric, contain symbols, and must contain at
     *                   least one character.
     * @param tableNames  Tables on which the trigger will be active.
     * @param columnName  Name of a numeric column_name on which the trigger is
     *                    activated.
     * @param min  The lower bound (inclusive) for the trigger range.
     * @param max  The upper bound (inclusive) for the trigger range.
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     */
    public CreateTriggerByRangeRequest(String requestId, List<String> tableNames, String columnName, double min, double max, Map<String, String> options) {
        this.requestId = (requestId == null) ? "" : requestId;
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        this.columnName = (columnName == null) ? "" : columnName;
        this.min = min;
        this.max = max;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return User-created ID for the trigger. The ID can be alphanumeric,
     *         contain symbols, and must contain at least one character.
     * 
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId  User-created ID for the trigger. The ID can be
     *                   alphanumeric, contain symbols, and must contain at
     *                   least one character.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTriggerByRangeRequest setRequestId(String requestId) {
        this.requestId = (requestId == null) ? "" : requestId;
        return this;
    }

    /**
     * 
     * @return Tables on which the trigger will be active.
     * 
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * 
     * @param tableNames  Tables on which the trigger will be active.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTriggerByRangeRequest setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * 
     * @return Name of a numeric column_name on which the trigger is activated.
     * 
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 
     * @param columnName  Name of a numeric column_name on which the trigger is
     *                    activated.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTriggerByRangeRequest setColumnName(String columnName) {
        this.columnName = (columnName == null) ? "" : columnName;
        return this;
    }

    /**
     * 
     * @return The lower bound (inclusive) for the trigger range.
     * 
     */
    public double getMin() {
        return min;
    }

    /**
     * 
     * @param min  The lower bound (inclusive) for the trigger range.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTriggerByRangeRequest setMin(double min) {
        this.min = min;
        return this;
    }

    /**
     * 
     * @return The upper bound (inclusive) for the trigger range.
     * 
     */
    public double getMax() {
        return max;
    }

    /**
     * 
     * @param max  The upper bound (inclusive) for the trigger range.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTriggerByRangeRequest setMax(double max) {
        this.max = max;
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
    public CreateTriggerByRangeRequest setOptions(Map<String, String> options) {
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
                return this.requestId;

            case 1:
                return this.tableNames;

            case 2:
                return this.columnName;

            case 3:
                return this.min;

            case 4:
                return this.max;

            case 5:
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
                this.requestId = (String)value;
                break;

            case 1:
                this.tableNames = (List<String>)value;
                break;

            case 2:
                this.columnName = (String)value;
                break;

            case 3:
                this.min = (Double)value;
                break;

            case 4:
                this.max = (Double)value;
                break;

            case 5:
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

        CreateTriggerByRangeRequest that = (CreateTriggerByRangeRequest)obj;

        return ( this.requestId.equals( that.requestId )
                 && this.tableNames.equals( that.tableNames )
                 && this.columnName.equals( that.columnName )
                 && ( (Double)this.min ).equals( (Double)that.min )
                 && ( (Double)this.max ).equals( (Double)that.max )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "requestId" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.requestId ) );
        builder.append( ", " );
        builder.append( gd.toString( "tableNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "columnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "min" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.min ) );
        builder.append( ", " );
        builder.append( gd.toString( "max" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.max ) );
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
        hashCode = (31 * hashCode) + this.requestId.hashCode();
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.columnName.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.min).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.max).hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

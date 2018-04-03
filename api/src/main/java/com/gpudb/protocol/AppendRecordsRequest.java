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
 * com.gpudb.GPUdb#appendRecords(AppendRecordsRequest)}.
 * <p>
 * Append (or insert) all records from a source table (specified by {@code
 * sourceTableName}) to a particular target table (specified by {@code
 * tableName}). The field map (specified by {@code fieldMap}) holds the user
 * specified map of target table column names with their mapped source column
 * names.
 */
public class AppendRecordsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AppendRecordsRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("sourceTableName").type().stringType().noDefault()
                .name("fieldMap").type().map().values().stringType().noDefault()
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
     * com.gpudb.protocol.AppendRecordsRequest.Options#OFFSET OFFSET}: A
     * positive integer indicating the number of initial results to skip from
     * source table (specified by {@code sourceTableName}). Default is 0. The
     * minimum allowed value is 0. The maximum allowed value is MAX_INT.
     *         <li> {@link
     * com.gpudb.protocol.AppendRecordsRequest.Options#LIMIT LIMIT}: A positive
     * integer indicating the maximum number of results to be returned from
     * source table (specified by {@code sourceTableName}). Or END_OF_SET
     * (-9999) to indicate that the max number of results should be returned.
     *         <li> {@link
     * com.gpudb.protocol.AppendRecordsRequest.Options#EXPRESSION EXPRESSION}:
     * Optional filter expression to apply to the source table (specified by
     * {@code sourceTableName}). Empty by default.
     *         <li> {@link
     * com.gpudb.protocol.AppendRecordsRequest.Options#ORDER_BY ORDER_BY}:
     * Comma-separated list of the columns to be sorted from source table
     * (specified by {@code sourceTableName}) by; e.g. 'timestamp asc, x desc'.
     * The columns specified must be present in {@code fieldMap}.  If any alias
     * is given for any column name, the alias must be used, rather than the
     * original column name.
     *         <li> {@link
     * com.gpudb.protocol.AppendRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     * UPDATE_ON_EXISTING_PK}: Specifies the record collision policy for
     * inserting the source table records (specified by {@code
     * sourceTableName}) into the target table (specified by {@code tableName})
     * table with a <a href="../../../../../concepts/tables.html#primary-keys"
     * target="_top">primary key</a>.  If set to {@code true}, any existing
     * target table record with primary key values that match those of a source
     * table record being inserted will be replaced by that new record.  If set
     * to {@code false}, any existing target table record with primary key
     * values that match those of a source table record being inserted will
     * remain unchanged and the new record discarded.  If the specified table
     * does not have a primary key, then this option is ignored.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.AppendRecordsRequest.Options#TRUE
     * TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AppendRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AppendRecordsRequest.Options#FALSE FALSE}.
     * </ul>
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * A positive integer indicating the number of initial results to skip
         * from source table (specified by {@code sourceTableName}). Default is
         * 0. The minimum allowed value is 0. The maximum allowed value is
         * MAX_INT.
         */
        public static final String OFFSET = "offset";

        /**
         * A positive integer indicating the maximum number of results to be
         * returned from source table (specified by {@code sourceTableName}).
         * Or END_OF_SET (-9999) to indicate that the max number of results
         * should be returned.
         */
        public static final String LIMIT = "limit";

        /**
         * Optional filter expression to apply to the source table (specified
         * by {@code sourceTableName}). Empty by default.
         */
        public static final String EXPRESSION = "expression";

        /**
         * Comma-separated list of the columns to be sorted from source table
         * (specified by {@code sourceTableName}) by; e.g. 'timestamp asc, x
         * desc'.  The columns specified must be present in {@code fieldMap}.
         * If any alias is given for any column name, the alias must be used,
         * rather than the original column name.
         */
        public static final String ORDER_BY = "order_by";

        /**
         * Specifies the record collision policy for inserting the source table
         * records (specified by {@code sourceTableName}) into the target table
         * (specified by {@code tableName}) table with a <a
         * href="../../../../../concepts/tables.html#primary-keys"
         * target="_top">primary key</a>.  If set to {@code true}, any existing
         * target table record with primary key values that match those of a
         * source table record being inserted will be replaced by that new
         * record.  If set to {@code false}, any existing target table record
         * with primary key values that match those of a source table record
         * being inserted will remain unchanged and the new record discarded.
         * If the specified table does not have a primary key, then this option
         * is ignored.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AppendRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AppendRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AppendRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String UPDATE_ON_EXISTING_PK = "update_on_existing_pk";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String tableName;
    private String sourceTableName;
    private Map<String, String> fieldMap;
    private Map<String, String> options;


    /**
     * Constructs an AppendRecordsRequest object with default parameters.
     */
    public AppendRecordsRequest() {
        tableName = "";
        sourceTableName = "";
        fieldMap = new LinkedHashMap<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AppendRecordsRequest object with the specified parameters.
     * 
     * @param tableName  The table name for the records to be appended. Must be
     *                   an existing table.
     * @param sourceTableName  The source table name to get records from. Must
     *                         be an existing table name.
     * @param fieldMap  Contains the mapping of column names from the target
     *                  table (specified by {@code tableName}) as the keys, and
     *                  corresponding column names from the source table
     *                  (specified by {@code sourceTableName}). Must be
     *                  existing column names in source table and target table,
     *                  and their types must be matched.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#OFFSET
     *                 OFFSET}: A positive integer indicating the number of
     *                 initial results to skip from source table (specified by
     *                 {@code sourceTableName}). Default is 0. The minimum
     *                 allowed value is 0. The maximum allowed value is
     *                 MAX_INT.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#LIMIT
     *                 LIMIT}: A positive integer indicating the maximum number
     *                 of results to be returned from source table (specified
     *                 by {@code sourceTableName}). Or END_OF_SET (-9999) to
     *                 indicate that the max number of results should be
     *                 returned.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#EXPRESSION
     *                 EXPRESSION}: Optional filter expression to apply to the
     *                 source table (specified by {@code sourceTableName}).
     *                 Empty by default.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted from source table (specified by {@code
     *                 sourceTableName}) by; e.g. 'timestamp asc, x desc'.  The
     *                 columns specified must be present in {@code fieldMap}.
     *                 If any alias is given for any column name, the alias
     *                 must be used, rather than the original column name.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *                 UPDATE_ON_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting the source table records (specified
     *                 by {@code sourceTableName}) into the target table
     *                 (specified by {@code tableName}) table with a <a
     *                 href="../../../../../concepts/tables.html#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing target table record with primary key values
     *                 that match those of a source table record being inserted
     *                 will be replaced by that new record.  If set to {@code
     *                 false}, any existing target table record with primary
     *                 key values that match those of a source table record
     *                 being inserted will remain unchanged and the new record
     *                 discarded.  If the specified table does not have a
     *                 primary key, then this option is ignored.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     * 
     */
    public AppendRecordsRequest(String tableName, String sourceTableName, Map<String, String> fieldMap, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.sourceTableName = (sourceTableName == null) ? "" : sourceTableName;
        this.fieldMap = (fieldMap == null) ? new LinkedHashMap<String, String>() : fieldMap;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return The table name for the records to be appended. Must be an
     *         existing table.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  The table name for the records to be appended. Must be
     *                   an existing table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AppendRecordsRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return The source table name to get records from. Must be an existing
     *         table name.
     * 
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * 
     * @param sourceTableName  The source table name to get records from. Must
     *                         be an existing table name.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AppendRecordsRequest setSourceTableName(String sourceTableName) {
        this.sourceTableName = (sourceTableName == null) ? "" : sourceTableName;
        return this;
    }

    /**
     * 
     * @return Contains the mapping of column names from the target table
     *         (specified by {@code tableName}) as the keys, and corresponding
     *         column names from the source table (specified by {@code
     *         sourceTableName}). Must be existing column names in source table
     *         and target table, and their types must be matched.
     * 
     */
    public Map<String, String> getFieldMap() {
        return fieldMap;
    }

    /**
     * 
     * @param fieldMap  Contains the mapping of column names from the target
     *                  table (specified by {@code tableName}) as the keys, and
     *                  corresponding column names from the source table
     *                  (specified by {@code sourceTableName}). Must be
     *                  existing column names in source table and target table,
     *                  and their types must be matched.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AppendRecordsRequest setFieldMap(Map<String, String> fieldMap) {
        this.fieldMap = (fieldMap == null) ? new LinkedHashMap<String, String>() : fieldMap;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#OFFSET OFFSET}:
     *         A positive integer indicating the number of initial results to
     *         skip from source table (specified by {@code sourceTableName}).
     *         Default is 0. The minimum allowed value is 0. The maximum
     *         allowed value is MAX_INT.
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#LIMIT LIMIT}: A
     *         positive integer indicating the maximum number of results to be
     *         returned from source table (specified by {@code
     *         sourceTableName}). Or END_OF_SET (-9999) to indicate that the
     *         max number of results should be returned.
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#EXPRESSION
     *         EXPRESSION}: Optional filter expression to apply to the source
     *         table (specified by {@code sourceTableName}). Empty by default.
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#ORDER_BY
     *         ORDER_BY}: Comma-separated list of the columns to be sorted from
     *         source table (specified by {@code sourceTableName}) by; e.g.
     *         'timestamp asc, x desc'.  The columns specified must be present
     *         in {@code fieldMap}.  If any alias is given for any column name,
     *         the alias must be used, rather than the original column name.
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *         UPDATE_ON_EXISTING_PK}: Specifies the record collision policy
     *         for inserting the source table records (specified by {@code
     *         sourceTableName}) into the target table (specified by {@code
     *         tableName}) table with a <a
     *         href="../../../../../concepts/tables.html#primary-keys"
     *         target="_top">primary key</a>.  If set to {@code true}, any
     *         existing target table record with primary key values that match
     *         those of a source table record being inserted will be replaced
     *         by that new record.  If set to {@code false}, any existing
     *         target table record with primary key values that match those of
     *         a source table record being inserted will remain unchanged and
     *         the new record discarded.  If the specified table does not have
     *         a primary key, then this option is ignored.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AppendRecordsRequest.Options#FALSE FALSE}.
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
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#OFFSET
     *                 OFFSET}: A positive integer indicating the number of
     *                 initial results to skip from source table (specified by
     *                 {@code sourceTableName}). Default is 0. The minimum
     *                 allowed value is 0. The maximum allowed value is
     *                 MAX_INT.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#LIMIT
     *                 LIMIT}: A positive integer indicating the maximum number
     *                 of results to be returned from source table (specified
     *                 by {@code sourceTableName}). Or END_OF_SET (-9999) to
     *                 indicate that the max number of results should be
     *                 returned.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#EXPRESSION
     *                 EXPRESSION}: Optional filter expression to apply to the
     *                 source table (specified by {@code sourceTableName}).
     *                 Empty by default.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted from source table (specified by {@code
     *                 sourceTableName}) by; e.g. 'timestamp asc, x desc'.  The
     *                 columns specified must be present in {@code fieldMap}.
     *                 If any alias is given for any column name, the alias
     *                 must be used, rather than the original column name.
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *                 UPDATE_ON_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting the source table records (specified
     *                 by {@code sourceTableName}) into the target table
     *                 (specified by {@code tableName}) table with a <a
     *                 href="../../../../../concepts/tables.html#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing target table record with primary key values
     *                 that match those of a source table record being inserted
     *                 will be replaced by that new record.  If set to {@code
     *                 false}, any existing target table record with primary
     *                 key values that match those of a source table record
     *                 being inserted will remain unchanged and the new record
     *                 discarded.  If the specified table does not have a
     *                 primary key, then this option is ignored.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AppendRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AppendRecordsRequest setOptions(Map<String, String> options) {
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
                return this.sourceTableName;

            case 2:
                return this.fieldMap;

            case 3:
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
                this.sourceTableName = (String)value;
                break;

            case 2:
                this.fieldMap = (Map<String, String>)value;
                break;

            case 3:
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

        AppendRecordsRequest that = (AppendRecordsRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.sourceTableName.equals( that.sourceTableName )
                 && this.fieldMap.equals( that.fieldMap )
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
        builder.append( gd.toString( "sourceTableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.sourceTableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "fieldMap" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.fieldMap ) );
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
        hashCode = (31 * hashCode) + this.sourceTableName.hashCode();
        hashCode = (31 * hashCode) + this.fieldMap.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
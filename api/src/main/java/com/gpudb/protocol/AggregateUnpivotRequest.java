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
 * com.gpudb.GPUdb#aggregateUnpivotRaw(AggregateUnpivotRequest)}.
 * <p>
 * Rotate the column values into rows values.
 * <p>
 * The aggregate unpivot is used to normalize tables that are built for cross
 * tabular reporting purposes. The unpivot operator rotates the column values
 * for all the pivoted columns. A variable column, value column and all columns
 * from the source table except the unpivot columns are projected into the
 * result table. The variable column and value columns in the result table
 * indicate the pivoted column name and values respectively.
 * <p>
 * The response is returned as a dynamic schema. For details see: <a
 * href="../../../../../api/index.html#dynamic-schemas" target="_top">dynamic
 * schemas documentation</a>.
 */
public class AggregateUnpivotRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateUnpivotRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("variableColumnName").type().stringType().noDefault()
                .name("valueColumnName").type().stringType().noDefault()
                .name("pivotedColumns").type().array().items().stringType().noDefault()
                .name("encoding").type().stringType().noDefault()
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
     * Specifies the encoding for returned records.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY BINARY}:
     * Indicates that the returned records should be binary encoded.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Encoding#JSON JSON}:
     * Indicates that the returned records should be json encoded.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY BINARY}.
     * A set of string constants for the parameter {@code encoding}.
     */
    public static final class Encoding {

        /**
         * Indicates that the returned records should be binary encoded.
         */
        public static final String BINARY = "binary";

        /**
         * Indicates that the returned records should be json encoded.
         */
        public static final String JSON = "json";

        private Encoding() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: Name of a collection which is to contain the table
     * specified in {@code result_table}. If the collection provided is
     * non-existent, the collection will be automatically created. If empty,
     * then the table will be a top-level table.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE
     * RESULT_TABLE}: The name of the table used to store the results. Has the
     * same naming restrictions as <a
     * href="../../../../../concepts/tables.html" target="_top">tables</a>. If
     * present, no results are returned in the response.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE_PERSIST
     * RESULT_TABLE_PERSIST}: If {@code true}, then the result table specified
     * in {@code result_table} will be persisted and will not expire unless a
     * {@code ttl} is specified.   If {@code false}, then the result table will
     * be an in-memory table and will expire unless a {@code ttl} is specified
     * otherwise.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#EXPRESSION
     * EXPRESSION}: Filter expression to apply to the table prior to unpivot
     * processing.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#ORDER_BY ORDER_BY}:
     * Comma-separated list of the columns to be sorted by; e.g. 'timestamp
     * asc, x desc'.  The columns specified must be present in input table.  If
     * any alias is given for any column name, the alias must be used, rather
     * than the original column name.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#CHUNK_SIZE
     * CHUNK_SIZE}: Indicates the chunk size to be used for the result table.
     * Must be used in combination with the {@code result_table} option.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#LIMIT LIMIT}: The
     * number of records to keep.
     *         <li> {@link
     * com.gpudb.protocol.AggregateUnpivotRequest.Options#TTL TTL}: Sets the <a
     * href="../../../../../concepts/ttl.html" target="_top">TTL</a> of the
     * table specified in {@code result_table}.
     * </ul>
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of a collection which is to contain the table specified in
         * {@code result_table}. If the collection provided is non-existent,
         * the collection will be automatically created. If empty, then the
         * table will be a top-level table.
         */
        public static final String COLLECTION_NAME = "collection_name";

        /**
         * The name of the table used to store the results. Has the same naming
         * restrictions as <a href="../../../../../concepts/tables.html"
         * target="_top">tables</a>. If present, no results are returned in the
         * response.
         */
        public static final String RESULT_TABLE = "result_table";

        /**
         * If {@code true}, then the result table specified in {@code
         * result_table} will be persisted and will not expire unless a {@code
         * ttl} is specified.   If {@code false}, then the result table will be
         * an in-memory table and will expire unless a {@code ttl} is specified
         * otherwise.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AggregateUnpivotRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE FALSE}.
         */
        public static final String RESULT_TABLE_PERSIST = "result_table_persist";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * Filter expression to apply to the table prior to unpivot processing.
         */
        public static final String EXPRESSION = "expression";

        /**
         * Comma-separated list of the columns to be sorted by; e.g. 'timestamp
         * asc, x desc'.  The columns specified must be present in input table.
         * If any alias is given for any column name, the alias must be used,
         * rather than the original column name.
         */
        public static final String ORDER_BY = "order_by";

        /**
         * Indicates the chunk size to be used for the result table. Must be
         * used in combination with the {@code result_table} option.
         */
        public static final String CHUNK_SIZE = "chunk_size";

        /**
         * The number of records to keep.
         */
        public static final String LIMIT = "limit";

        /**
         * Sets the <a href="../../../../../concepts/ttl.html"
         * target="_top">TTL</a> of the table specified in {@code
         * result_table}.
         */
        public static final String TTL = "ttl";

        private Options() {  }
    }

    private String tableName;
    private String variableColumnName;
    private String valueColumnName;
    private List<String> pivotedColumns;
    private String encoding;
    private Map<String, String> options;


    /**
     * Constructs an AggregateUnpivotRequest object with default parameters.
     */
    public AggregateUnpivotRequest() {
        tableName = "";
        variableColumnName = "";
        valueColumnName = "";
        pivotedColumns = new ArrayList<>();
        encoding = Encoding.BINARY;
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AggregateUnpivotRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which the operation will be
     *                   performed. Must be an existing table/view.
     * @param variableColumnName  Specifies the variable/parameter column name.
     * @param valueColumnName  Specifies the value column name.
     * @param pivotedColumns  List of one or more values typically the column
     *                        names of the input table. All the columns in the
     *                        source table must have the same data type.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the table specified in {@code result_table}. If
     *                 the collection provided is non-existent, the collection
     *                 will be automatically created. If empty, then the table
     *                 will be a top-level table.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE
     *                 RESULT_TABLE}: The name of the table used to store the
     *                 results. Has the same naming restrictions as <a
     *                 href="../../../../../concepts/tables.html"
     *                 target="_top">tables</a>. If present, no results are
     *                 returned in the response.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE_PERSIST
     *                 RESULT_TABLE_PERSIST}: If {@code true}, then the result
     *                 table specified in {@code result_table} will be
     *                 persisted and will not expire unless a {@code ttl} is
     *                 specified.   If {@code false}, then the result table
     *                 will be an in-memory table and will expire unless a
     *                 {@code ttl} is specified otherwise.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#EXPRESSION
     *                 EXPRESSION}: Filter expression to apply to the table
     *                 prior to unpivot processing.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted by; e.g. 'timestamp asc, x desc'.  The columns
     *                 specified must be present in input table.  If any alias
     *                 is given for any column name, the alias must be used,
     *                 rather than the original column name.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#CHUNK_SIZE
     *                 CHUNK_SIZE}: Indicates the chunk size to be used for the
     *                 result table. Must be used in combination with the
     *                 {@code result_table} option.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#LIMIT
     *                 LIMIT}: The number of records to keep.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#TTL
     *                 TTL}: Sets the <a
     *                 href="../../../../../concepts/ttl.html"
     *                 target="_top">TTL</a> of the table specified in {@code
     *                 result_table}.
     *                 </ul>
     * 
     */
    public AggregateUnpivotRequest(String tableName, String variableColumnName, String valueColumnName, List<String> pivotedColumns, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.variableColumnName = (variableColumnName == null) ? "" : variableColumnName;
        this.valueColumnName = (valueColumnName == null) ? "" : valueColumnName;
        this.pivotedColumns = (pivotedColumns == null) ? new ArrayList<String>() : pivotedColumns;
        this.encoding = Encoding.BINARY;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * Constructs an AggregateUnpivotRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which the operation will be
     *                   performed. Must be an existing table/view.
     * @param variableColumnName  Specifies the variable/parameter column name.
     * @param valueColumnName  Specifies the value column name.
     * @param pivotedColumns  List of one or more values typically the column
     *                        names of the input table. All the columns in the
     *                        source table must have the same data type.
     * @param encoding  Specifies the encoding for returned records.
     *                  Supported values:
     *                  <ul>
     *                          <li> {@link
     *                  com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY
     *                  BINARY}: Indicates that the returned records should be
     *                  binary encoded.
     *                          <li> {@link
     *                  com.gpudb.protocol.AggregateUnpivotRequest.Encoding#JSON
     *                  JSON}: Indicates that the returned records should be
     *                  json encoded.
     *                  </ul>
     *                  The default value is {@link
     *                  com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY
     *                  BINARY}.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the table specified in {@code result_table}. If
     *                 the collection provided is non-existent, the collection
     *                 will be automatically created. If empty, then the table
     *                 will be a top-level table.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE
     *                 RESULT_TABLE}: The name of the table used to store the
     *                 results. Has the same naming restrictions as <a
     *                 href="../../../../../concepts/tables.html"
     *                 target="_top">tables</a>. If present, no results are
     *                 returned in the response.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE_PERSIST
     *                 RESULT_TABLE_PERSIST}: If {@code true}, then the result
     *                 table specified in {@code result_table} will be
     *                 persisted and will not expire unless a {@code ttl} is
     *                 specified.   If {@code false}, then the result table
     *                 will be an in-memory table and will expire unless a
     *                 {@code ttl} is specified otherwise.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#EXPRESSION
     *                 EXPRESSION}: Filter expression to apply to the table
     *                 prior to unpivot processing.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted by; e.g. 'timestamp asc, x desc'.  The columns
     *                 specified must be present in input table.  If any alias
     *                 is given for any column name, the alias must be used,
     *                 rather than the original column name.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#CHUNK_SIZE
     *                 CHUNK_SIZE}: Indicates the chunk size to be used for the
     *                 result table. Must be used in combination with the
     *                 {@code result_table} option.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#LIMIT
     *                 LIMIT}: The number of records to keep.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#TTL
     *                 TTL}: Sets the <a
     *                 href="../../../../../concepts/ttl.html"
     *                 target="_top">TTL</a> of the table specified in {@code
     *                 result_table}.
     *                 </ul>
     * 
     */
    public AggregateUnpivotRequest(String tableName, String variableColumnName, String valueColumnName, List<String> pivotedColumns, String encoding, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.variableColumnName = (variableColumnName == null) ? "" : variableColumnName;
        this.valueColumnName = (valueColumnName == null) ? "" : valueColumnName;
        this.pivotedColumns = (pivotedColumns == null) ? new ArrayList<String>() : pivotedColumns;
        this.encoding = (encoding == null) ? Encoding.BINARY : encoding;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the operation will be performed. Must
     *         be an existing table/view.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the operation will be
     *                   performed. Must be an existing table/view.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateUnpivotRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return Specifies the variable/parameter column name.
     * 
     */
    public String getVariableColumnName() {
        return variableColumnName;
    }

    /**
     * 
     * @param variableColumnName  Specifies the variable/parameter column name.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateUnpivotRequest setVariableColumnName(String variableColumnName) {
        this.variableColumnName = (variableColumnName == null) ? "" : variableColumnName;
        return this;
    }

    /**
     * 
     * @return Specifies the value column name.
     * 
     */
    public String getValueColumnName() {
        return valueColumnName;
    }

    /**
     * 
     * @param valueColumnName  Specifies the value column name.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateUnpivotRequest setValueColumnName(String valueColumnName) {
        this.valueColumnName = (valueColumnName == null) ? "" : valueColumnName;
        return this;
    }

    /**
     * 
     * @return List of one or more values typically the column names of the
     *         input table. All the columns in the source table must have the
     *         same data type.
     * 
     */
    public List<String> getPivotedColumns() {
        return pivotedColumns;
    }

    /**
     * 
     * @param pivotedColumns  List of one or more values typically the column
     *                        names of the input table. All the columns in the
     *                        source table must have the same data type.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateUnpivotRequest setPivotedColumns(List<String> pivotedColumns) {
        this.pivotedColumns = (pivotedColumns == null) ? new ArrayList<String>() : pivotedColumns;
        return this;
    }

    /**
     * 
     * @return Specifies the encoding for returned records.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY
     *         BINARY}: Indicates that the returned records should be binary
     *         encoded.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Encoding#JSON JSON}:
     *         Indicates that the returned records should be json encoded.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY
     *         BINARY}.
     * 
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * 
     * @param encoding  Specifies the encoding for returned records.
     *                  Supported values:
     *                  <ul>
     *                          <li> {@link
     *                  com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY
     *                  BINARY}: Indicates that the returned records should be
     *                  binary encoded.
     *                          <li> {@link
     *                  com.gpudb.protocol.AggregateUnpivotRequest.Encoding#JSON
     *                  JSON}: Indicates that the returned records should be
     *                  json encoded.
     *                  </ul>
     *                  The default value is {@link
     *                  com.gpudb.protocol.AggregateUnpivotRequest.Encoding#BINARY
     *                  BINARY}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateUnpivotRequest setEncoding(String encoding) {
        this.encoding = (encoding == null) ? Encoding.BINARY : encoding;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: Name of a collection which is to contain the
     *         table specified in {@code result_table}. If the collection
     *         provided is non-existent, the collection will be automatically
     *         created. If empty, then the table will be a top-level table.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE
     *         RESULT_TABLE}: The name of the table used to store the results.
     *         Has the same naming restrictions as <a
     *         href="../../../../../concepts/tables.html"
     *         target="_top">tables</a>. If present, no results are returned in
     *         the response.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE_PERSIST
     *         RESULT_TABLE_PERSIST}: If {@code true}, then the result table
     *         specified in {@code result_table} will be persisted and will not
     *         expire unless a {@code ttl} is specified.   If {@code false},
     *         then the result table will be an in-memory table and will expire
     *         unless a {@code ttl} is specified otherwise.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#EXPRESSION
     *         EXPRESSION}: Filter expression to apply to the table prior to
     *         unpivot processing.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#ORDER_BY
     *         ORDER_BY}: Comma-separated list of the columns to be sorted by;
     *         e.g. 'timestamp asc, x desc'.  The columns specified must be
     *         present in input table.  If any alias is given for any column
     *         name, the alias must be used, rather than the original column
     *         name.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#CHUNK_SIZE
     *         CHUNK_SIZE}: Indicates the chunk size to be used for the result
     *         table. Must be used in combination with the {@code result_table}
     *         option.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#LIMIT LIMIT}:
     *         The number of records to keep.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateUnpivotRequest.Options#TTL TTL}:
     *         Sets the <a href="../../../../../concepts/ttl.html"
     *         target="_top">TTL</a> of the table specified in {@code
     *         result_table}.
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
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the table specified in {@code result_table}. If
     *                 the collection provided is non-existent, the collection
     *                 will be automatically created. If empty, then the table
     *                 will be a top-level table.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE
     *                 RESULT_TABLE}: The name of the table used to store the
     *                 results. Has the same naming restrictions as <a
     *                 href="../../../../../concepts/tables.html"
     *                 target="_top">tables</a>. If present, no results are
     *                 returned in the response.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#RESULT_TABLE_PERSIST
     *                 RESULT_TABLE_PERSIST}: If {@code true}, then the result
     *                 table specified in {@code result_table} will be
     *                 persisted and will not expire unless a {@code ttl} is
     *                 specified.   If {@code false}, then the result table
     *                 will be an in-memory table and will expire unless a
     *                 {@code ttl} is specified otherwise.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#EXPRESSION
     *                 EXPRESSION}: Filter expression to apply to the table
     *                 prior to unpivot processing.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted by; e.g. 'timestamp asc, x desc'.  The columns
     *                 specified must be present in input table.  If any alias
     *                 is given for any column name, the alias must be used,
     *                 rather than the original column name.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#CHUNK_SIZE
     *                 CHUNK_SIZE}: Indicates the chunk size to be used for the
     *                 result table. Must be used in combination with the
     *                 {@code result_table} option.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#LIMIT
     *                 LIMIT}: The number of records to keep.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateUnpivotRequest.Options#TTL
     *                 TTL}: Sets the <a
     *                 href="../../../../../concepts/ttl.html"
     *                 target="_top">TTL</a> of the table specified in {@code
     *                 result_table}.
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateUnpivotRequest setOptions(Map<String, String> options) {
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
                return this.variableColumnName;

            case 2:
                return this.valueColumnName;

            case 3:
                return this.pivotedColumns;

            case 4:
                return this.encoding;

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
                this.tableName = (String)value;
                break;

            case 1:
                this.variableColumnName = (String)value;
                break;

            case 2:
                this.valueColumnName = (String)value;
                break;

            case 3:
                this.pivotedColumns = (List<String>)value;
                break;

            case 4:
                this.encoding = (String)value;
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

        AggregateUnpivotRequest that = (AggregateUnpivotRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.variableColumnName.equals( that.variableColumnName )
                 && this.valueColumnName.equals( that.valueColumnName )
                 && this.pivotedColumns.equals( that.pivotedColumns )
                 && this.encoding.equals( that.encoding )
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
        builder.append( gd.toString( "variableColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.variableColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "valueColumnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.valueColumnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "pivotedColumns" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.pivotedColumns ) );
        builder.append( ", " );
        builder.append( gd.toString( "encoding" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.encoding ) );
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
        hashCode = (31 * hashCode) + this.variableColumnName.hashCode();
        hashCode = (31 * hashCode) + this.valueColumnName.hashCode();
        hashCode = (31 * hashCode) + this.pivotedColumns.hashCode();
        hashCode = (31 * hashCode) + this.encoding.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

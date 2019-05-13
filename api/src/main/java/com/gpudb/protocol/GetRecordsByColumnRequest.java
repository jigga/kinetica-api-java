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
 * com.gpudb.GPUdb#getRecordsByColumnRaw(GetRecordsByColumnRequest)}.
 * <p>
 * For a given table, retrieves the values from the requested column(s). Maps
 * of column name to the array of values as well as the column data type are
 * returned. This endpoint supports pagination with the {@code offset} and
 * {@code limit} parameters.
 * <p>
 * <a href="../../../../../concepts/window.html" target="_top">Window
 * functions</a>, which can perform operations like moving averages, are
 * available through this endpoint as well as {@link
 * com.gpudb.GPUdb#createProjection(CreateProjectionRequest)}.
 * <p>
 * When using pagination, if the table (or the underlying table in the case of
 * a view) is modified (records are inserted, updated, or deleted) during a
 * call to the endpoint, the records or values retrieved may differ between
 * calls based on the type of the update, e.g., the contiguity across pages
 * cannot be relied upon.
 * <p>
 * The response is returned as a dynamic schema. For details see: <a
 * href="../../../../../api/index.html#dynamic-schemas" target="_top">dynamic
 * schemas documentation</a>.
 */
public class GetRecordsByColumnRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("GetRecordsByColumnRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("columnNames").type().array().items().stringType().noDefault()
                .name("offset").type().longType().noDefault()
                .name("limit").type().longType().noDefault()
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
     * Specifies the encoding for returned records; either 'binary' or 'json'.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY BINARY}
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#JSON JSON}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY BINARY}.
     * A set of string constants for the parameter {@code encoding}.
     */
    public static final class Encoding {
        public static final String BINARY = "binary";
        public static final String JSON = "json";

        private Encoding() {  }
    }


    /**
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#EXPRESSION
     * EXPRESSION}: Optional filter expression to apply to the table.
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_BY SORT_BY}:
     * Optional column that the data should be sorted by. Used in conjunction
     * with {@code sort_order}. The {@code order_by} option can be used in lieu
     * of {@code sort_by} / {@code sort_order}.  The default value is ''.
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_ORDER
     * SORT_ORDER}: String indicating how the returned values should be sorted
     * - {@code ascending} or {@code descending}. If {@code sort_order} is
     * provided, {@code sort_by} has to be provided.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     * ASCENDING}
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#DESCENDING
     * DESCENDING}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     * ASCENDING}.
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#ORDER_BY ORDER_BY}:
     * Comma-separated list of the columns to be sorted by as well as the sort
     * direction, e.g., 'timestamp asc, x desc'.  The default value is ''.
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#CONVERT_WKTS_TO_WKBS
     * CONVERT_WKTS_TO_WKBS}: If true, then WKT string columns will be returned
     * as WKB bytes.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE FALSE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Optional filter expression to apply to the table.
         */
        public static final String EXPRESSION = "expression";

        /**
         * Optional column that the data should be sorted by. Used in
         * conjunction with {@code sort_order}. The {@code order_by} option can
         * be used in lieu of {@code sort_by} / {@code sort_order}.  The
         * default value is ''.
         */
        public static final String SORT_BY = "sort_by";

        /**
         * String indicating how the returned values should be sorted - {@code
         * ascending} or {@code descending}. If {@code sort_order} is provided,
         * {@code sort_by} has to be provided.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
         * ASCENDING}
         *         <li> {@link
         * com.gpudb.protocol.GetRecordsByColumnRequest.Options#DESCENDING
         * DESCENDING}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
         * ASCENDING}.
         */
        public static final String SORT_ORDER = "sort_order";
        public static final String ASCENDING = "ascending";
        public static final String DESCENDING = "descending";

        /**
         * Comma-separated list of the columns to be sorted by as well as the
         * sort direction, e.g., 'timestamp asc, x desc'.  The default value is
         * ''.
         */
        public static final String ORDER_BY = "order_by";

        /**
         * If true, then WKT string columns will be returned as WKB bytes.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.GetRecordsByColumnRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE FALSE}.
         */
        public static final String CONVERT_WKTS_TO_WKBS = "convert_wkts_to_wkbs";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String tableName;
    private List<String> columnNames;
    private long offset;
    private long limit;
    private String encoding;
    private Map<String, String> options;


    /**
     * Constructs a GetRecordsByColumnRequest object with default parameters.
     */
    public GetRecordsByColumnRequest() {
        tableName = "";
        columnNames = new ArrayList<>();
        encoding = Encoding.BINARY;
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a GetRecordsByColumnRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which this operation will be
     *                   performed. The table cannot be a parent set.
     * @param columnNames  The list of column values to retrieve.
     * @param offset  A positive integer indicating the number of initial
     *                results to skip (this can be useful for paging through
     *                the results).  The minimum allowed value is 0. The
     *                maximum allowed value is MAX_INT.
     * @param limit  A positive integer indicating the maximum number of
     *               results to be returned (if not provided the default is
     *               10000), or END_OF_SET (-9999) to indicate that the maximum
     *               number of results allowed by the server should be
     *               returned.
     * @param options
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#EXPRESSION
     *                 EXPRESSION}: Optional filter expression to apply to the
     *                 table.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_BY
     *                 SORT_BY}: Optional column that the data should be sorted
     *                 by. Used in conjunction with {@code sort_order}. The
     *                 {@code order_by} option can be used in lieu of {@code
     *                 sort_by} / {@code sort_order}.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_ORDER
     *                 SORT_ORDER}: String indicating how the returned values
     *                 should be sorted - {@code ascending} or {@code
     *                 descending}. If {@code sort_order} is provided, {@code
     *                 sort_by} has to be provided.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *                 ASCENDING}
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#DESCENDING
     *                 DESCENDING}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *                 ASCENDING}.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted by as well as the sort direction, e.g.,
     *                 'timestamp asc, x desc'.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#CONVERT_WKTS_TO_WKBS
     *                 CONVERT_WKTS_TO_WKBS}: If true, then WKT string columns
     *                 will be returned as WKB bytes.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public GetRecordsByColumnRequest(String tableName, List<String> columnNames, long offset, long limit, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        this.offset = offset;
        this.limit = limit;
        this.encoding = Encoding.BINARY;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * Constructs a GetRecordsByColumnRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which this operation will be
     *                   performed. The table cannot be a parent set.
     * @param columnNames  The list of column values to retrieve.
     * @param offset  A positive integer indicating the number of initial
     *                results to skip (this can be useful for paging through
     *                the results).  The minimum allowed value is 0. The
     *                maximum allowed value is MAX_INT.
     * @param limit  A positive integer indicating the maximum number of
     *               results to be returned (if not provided the default is
     *               10000), or END_OF_SET (-9999) to indicate that the maximum
     *               number of results allowed by the server should be
     *               returned.
     * @param encoding  Specifies the encoding for returned records; either
     *                  'binary' or 'json'.
     *                  Supported values:
     *                  <ul>
     *                          <li> {@link
     *                  com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY
     *                  BINARY}
     *                          <li> {@link
     *                  com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#JSON
     *                  JSON}
     *                  </ul>
     *                  The default value is {@link
     *                  com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY
     *                  BINARY}.
     * @param options
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#EXPRESSION
     *                 EXPRESSION}: Optional filter expression to apply to the
     *                 table.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_BY
     *                 SORT_BY}: Optional column that the data should be sorted
     *                 by. Used in conjunction with {@code sort_order}. The
     *                 {@code order_by} option can be used in lieu of {@code
     *                 sort_by} / {@code sort_order}.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_ORDER
     *                 SORT_ORDER}: String indicating how the returned values
     *                 should be sorted - {@code ascending} or {@code
     *                 descending}. If {@code sort_order} is provided, {@code
     *                 sort_by} has to be provided.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *                 ASCENDING}
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#DESCENDING
     *                 DESCENDING}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *                 ASCENDING}.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted by as well as the sort direction, e.g.,
     *                 'timestamp asc, x desc'.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#CONVERT_WKTS_TO_WKBS
     *                 CONVERT_WKTS_TO_WKBS}: If true, then WKT string columns
     *                 will be returned as WKB bytes.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public GetRecordsByColumnRequest(String tableName, List<String> columnNames, long offset, long limit, String encoding, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        this.offset = offset;
        this.limit = limit;
        this.encoding = (encoding == null) ? Encoding.BINARY : encoding;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which this operation will be performed. The
     *         table cannot be a parent set.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which this operation will be
     *                   performed. The table cannot be a parent set.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsByColumnRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return The list of column values to retrieve.
     * 
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * 
     * @param columnNames  The list of column values to retrieve.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsByColumnRequest setColumnNames(List<String> columnNames) {
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        return this;
    }

    /**
     * 
     * @return A positive integer indicating the number of initial results to
     *         skip (this can be useful for paging through the results).  The
     *         minimum allowed value is 0. The maximum allowed value is
     *         MAX_INT.
     * 
     */
    public long getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset  A positive integer indicating the number of initial
     *                results to skip (this can be useful for paging through
     *                the results).  The minimum allowed value is 0. The
     *                maximum allowed value is MAX_INT.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsByColumnRequest setOffset(long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 
     * @return A positive integer indicating the maximum number of results to
     *         be returned (if not provided the default is 10000), or
     *         END_OF_SET (-9999) to indicate that the maximum number of
     *         results allowed by the server should be returned.
     * 
     */
    public long getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit  A positive integer indicating the maximum number of
     *               results to be returned (if not provided the default is
     *               10000), or END_OF_SET (-9999) to indicate that the maximum
     *               number of results allowed by the server should be
     *               returned.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsByColumnRequest setLimit(long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 
     * @return Specifies the encoding for returned records; either 'binary' or
     *         'json'.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY
     *         BINARY}
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#JSON JSON}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY
     *         BINARY}.
     * 
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * 
     * @param encoding  Specifies the encoding for returned records; either
     *                  'binary' or 'json'.
     *                  Supported values:
     *                  <ul>
     *                          <li> {@link
     *                  com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY
     *                  BINARY}
     *                          <li> {@link
     *                  com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#JSON
     *                  JSON}
     *                  </ul>
     *                  The default value is {@link
     *                  com.gpudb.protocol.GetRecordsByColumnRequest.Encoding#BINARY
     *                  BINARY}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsByColumnRequest setEncoding(String encoding) {
        this.encoding = (encoding == null) ? Encoding.BINARY : encoding;
        return this;
    }

    /**
     * 
     * @return
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#EXPRESSION
     *         EXPRESSION}: Optional filter expression to apply to the table.
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_BY
     *         SORT_BY}: Optional column that the data should be sorted by.
     *         Used in conjunction with {@code sort_order}. The {@code
     *         order_by} option can be used in lieu of {@code sort_by} / {@code
     *         sort_order}.  The default value is ''.
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_ORDER
     *         SORT_ORDER}: String indicating how the returned values should be
     *         sorted - {@code ascending} or {@code descending}. If {@code
     *         sort_order} is provided, {@code sort_by} has to be provided.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *         ASCENDING}
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#DESCENDING
     *         DESCENDING}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *         ASCENDING}.
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#ORDER_BY
     *         ORDER_BY}: Comma-separated list of the columns to be sorted by
     *         as well as the sort direction, e.g., 'timestamp asc, x desc'.
     *         The default value is ''.
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#CONVERT_WKTS_TO_WKBS
     *         CONVERT_WKTS_TO_WKBS}: If true, then WKT string columns will be
     *         returned as WKB bytes.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *         FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *         FALSE}.
     *         </ul>
     *         The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#EXPRESSION
     *                 EXPRESSION}: Optional filter expression to apply to the
     *                 table.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_BY
     *                 SORT_BY}: Optional column that the data should be sorted
     *                 by. Used in conjunction with {@code sort_order}. The
     *                 {@code order_by} option can be used in lieu of {@code
     *                 sort_by} / {@code sort_order}.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#SORT_ORDER
     *                 SORT_ORDER}: String indicating how the returned values
     *                 should be sorted - {@code ascending} or {@code
     *                 descending}. If {@code sort_order} is provided, {@code
     *                 sort_by} has to be provided.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *                 ASCENDING}
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#DESCENDING
     *                 DESCENDING}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ASCENDING
     *                 ASCENDING}.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#ORDER_BY
     *                 ORDER_BY}: Comma-separated list of the columns to be
     *                 sorted by as well as the sort direction, e.g.,
     *                 'timestamp asc, x desc'.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#CONVERT_WKTS_TO_WKBS
     *                 CONVERT_WKTS_TO_WKBS}: If true, then WKT string columns
     *                 will be returned as WKB bytes.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.GetRecordsByColumnRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GetRecordsByColumnRequest setOptions(Map<String, String> options) {
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
                return this.columnNames;

            case 2:
                return this.offset;

            case 3:
                return this.limit;

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
                this.columnNames = (List<String>)value;
                break;

            case 2:
                this.offset = (Long)value;
                break;

            case 3:
                this.limit = (Long)value;
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

        GetRecordsByColumnRequest that = (GetRecordsByColumnRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.columnNames.equals( that.columnNames )
                 && ( this.offset == that.offset )
                 && ( this.limit == that.limit )
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
        builder.append( gd.toString( "columnNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "offset" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.offset ) );
        builder.append( ", " );
        builder.append( gd.toString( "limit" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.limit ) );
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
        hashCode = (31 * hashCode) + this.columnNames.hashCode();
        hashCode = (31 * hashCode) + ((Long)this.offset).hashCode();
        hashCode = (31 * hashCode) + ((Long)this.limit).hashCode();
        hashCode = (31 * hashCode) + this.encoding.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

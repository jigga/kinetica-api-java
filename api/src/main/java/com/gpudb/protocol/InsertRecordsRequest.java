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
import org.apache.avro.generic.GenericData;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#insertRecords(InsertRecordsRequest)}.
 * <p>
 * Adds multiple records to the specified table. The operation is
 * synchronous, meaning that a response will not be returned until all the
 * records
 * are fully inserted and available. The response payload provides the counts
 * of
 * the number of records actually inserted and/or updated, and can provide the
 * unique identifier of each added record.
 * <p>
 * The {@code options} parameter can be used to customize this function's
 * behavior.
 * <p>
 * The {@code update_on_existing_pk} option specifies the record
 * collision policy for inserting into a table with a
 * <a href="../../../../../../concepts/tables/#primary-keys"
 * target="_top">primary key</a>, but is ignored if
 * no primary key exists.
 * <p>
 * The {@code return_record_ids} option indicates that the
 * database should return the unique identifiers of inserted records.
 * 
 * @param <T>  The type of object being processed.
 * 
 */
public class InsertRecordsRequest<T> {

    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     * UPDATE_ON_EXISTING_PK}: Specifies the record collision policy for
     * inserting into a table with a <a
     * href="../../../../../../concepts/tables/#primary-keys"
     * target="_top">primary key</a>.  If set to {@code true}, any existing
     * table record with primary key values that match those of a record being
     * inserted will be replaced by that new record.  If set to {@code false},
     * any existing table record with primary key values that match those of a
     * record being inserted will remain unchanged and the new record
     * discarded.  If the specified table does not have a primary key, then
     * this option has no affect.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#IGNORE_EXISTING_PK
     * IGNORE_EXISTING_PK}: Specifies the record collision policy for inserting
     * into a table with a <a
     * href="../../../../../../concepts/tables/#primary-keys"
     * target="_top">primary key</a>.  If set to {@code true}, any record being
     * inserted with primary key values that match those of an existing table
     * record will be ignored with no error generated.  If the specified table
     * does not have a primary key, then this option has no affect.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_RECORD_IDS
     * RETURN_RECORD_IDS}: If {@code true} then return the internal record id
     * along for each inserted record.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUNCATE_STRINGS
     * TRUNCATE_STRINGS}: If set to {@code true}, any strings which are too
     * long for their target charN string columns will be truncated to fit.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_INDIVIDUAL_ERRORS
     * RETURN_INDIVIDUAL_ERRORS}: If set to {@code true}, success will always
     * be returned, and any errors found will be included in the info map.  The
     * "bad_record_indices" entry is a comma-separated list of bad records
     * (0-based).  And if so, there will also be an "error_N" entry for each
     * record with an error, where N is the index (0-based).
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#ALLOW_PARTIAL_BATCH
     * ALLOW_PARTIAL_BATCH}: If set to {@code true}, all correct records will
     * be inserted and incorrect records will be rejected and reported.
     * Otherwise, the entire batch will be rejected if any records are
     * incorrect.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#DRY_RUN DRY_RUN}: If
     * set to {@code true}, no data will be saved and any errors will be
     * returned.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Specifies the record collision policy for inserting into a table
         * with a <a href="../../../../../../concepts/tables/#primary-keys"
         * target="_top">primary key</a>.  If set to {@code true}, any existing
         * table record with primary key values that match those of a record
         * being inserted will be replaced by that new record.  If set to
         * {@code false}, any existing table record with primary key values
         * that match those of a record being inserted will remain unchanged
         * and the new record discarded.  If the specified table does not have
         * a primary key, then this option has no affect.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String UPDATE_ON_EXISTING_PK = "update_on_existing_pk";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * Specifies the record collision policy for inserting into a table
         * with a <a href="../../../../../../concepts/tables/#primary-keys"
         * target="_top">primary key</a>.  If set to {@code true}, any record
         * being inserted with primary key values that match those of an
         * existing table record will be ignored with no error generated.  If
         * the specified table does not have a primary key, then this option
         * has no affect.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String IGNORE_EXISTING_PK = "ignore_existing_pk";

        /**
         * If {@code true} then return the internal record id along for each
         * inserted record.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String RETURN_RECORD_IDS = "return_record_ids";

        /**
         * If set to {@code true}, any strings which are too long for their
         * target charN string columns will be truncated to fit.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String TRUNCATE_STRINGS = "truncate_strings";

        /**
         * If set to {@code true}, success will always be returned, and any
         * errors found will be included in the info map.  The
         * "bad_record_indices" entry is a comma-separated list of bad records
         * (0-based).  And if so, there will also be an "error_N" entry for
         * each record with an error, where N is the index (0-based).
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String RETURN_INDIVIDUAL_ERRORS = "return_individual_errors";

        /**
         * If set to {@code true}, all correct records will be inserted and
         * incorrect records will be rejected and reported.  Otherwise, the
         * entire batch will be rejected if any records are incorrect.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String ALLOW_PARTIAL_BATCH = "allow_partial_batch";

        /**
         * If set to {@code true}, no data will be saved and any errors will be
         * returned.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
         */
        public static final String DRY_RUN = "dry_run";

        private Options() {  }
    }

    private String tableName;
    private List<T> data;
    private Map<String, String> options;


    /**
     * Constructs an InsertRecordsRequest object with default parameters.
     */
    public InsertRecordsRequest() {
        tableName = "";
        data = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an InsertRecordsRequest object with the specified parameters.
     * 
     * @param tableName  Name of table to which the records are to be added, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.  Must be an
     *                   existing table.
     * @param data  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *                 UPDATE_ON_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting into a table with a <a
     *                 href="../../../../../../concepts/tables/#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing table record with primary key values that
     *                 match those of a record being inserted will be replaced
     *                 by that new record.  If set to {@code false}, any
     *                 existing table record with primary key values that match
     *                 those of a record being inserted will remain unchanged
     *                 and the new record discarded.  If the specified table
     *                 does not have a primary key, then this option has no
     *                 affect.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#IGNORE_EXISTING_PK
     *                 IGNORE_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting into a table with a <a
     *                 href="../../../../../../concepts/tables/#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any record being inserted with primary key values that
     *                 match those of an existing table record will be ignored
     *                 with no error generated.  If the specified table does
     *                 not have a primary key, then this option has no affect.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_RECORD_IDS
     *                 RETURN_RECORD_IDS}: If {@code true} then return the
     *                 internal record id along for each inserted record.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUNCATE_STRINGS
     *                 TRUNCATE_STRINGS}: If set to {@code true}, any strings
     *                 which are too long for their target charN string columns
     *                 will be truncated to fit.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_INDIVIDUAL_ERRORS
     *                 RETURN_INDIVIDUAL_ERRORS}: If set to {@code true},
     *                 success will always be returned, and any errors found
     *                 will be included in the info map.  The
     *                 "bad_record_indices" entry is a comma-separated list of
     *                 bad records (0-based).  And if so, there will also be an
     *                 "error_N" entry for each record with an error, where N
     *                 is the index (0-based).
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#ALLOW_PARTIAL_BATCH
     *                 ALLOW_PARTIAL_BATCH}: If set to {@code true}, all
     *                 correct records will be inserted and incorrect records
     *                 will be rejected and reported.  Otherwise, the entire
     *                 batch will be rejected if any records are incorrect.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#DRY_RUN
     *                 DRY_RUN}: If set to {@code true}, no data will be saved
     *                 and any errors will be returned.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public InsertRecordsRequest(String tableName, List<T> data, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.data = (data == null) ? new ArrayList<T>() : data;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of table to which the records are to be added, in
     *         [schema_name.]table_name format, using standard <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a>.  Must be an existing
     *         table.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of table to which the records are to be added, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.  Must be an
     *                   existing table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsRequest<T> setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return An array of binary-encoded data for the records to be added. All
     *         records must be of the same type as that of the table. Empty
     *         array if {@code listEncoding} is {@code json}.
     * 
     */
    public List<T> getData() {
        return data;
    }

    /**
     * 
     * @param data  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsRequest<T> setData(List<T> data) {
        this.data = (data == null) ? new ArrayList<T>() : data;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *         UPDATE_ON_EXISTING_PK}: Specifies the record collision policy
     *         for inserting into a table with a <a
     *         href="../../../../../../concepts/tables/#primary-keys"
     *         target="_top">primary key</a>.  If set to {@code true}, any
     *         existing table record with primary key values that match those
     *         of a record being inserted will be replaced by that new record.
     *         If set to {@code false}, any existing table record with primary
     *         key values that match those of a record being inserted will
     *         remain unchanged and the new record discarded.  If the specified
     *         table does not have a primary key, then this option has no
     *         affect.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#IGNORE_EXISTING_PK
     *         IGNORE_EXISTING_PK}: Specifies the record collision policy for
     *         inserting into a table with a <a
     *         href="../../../../../../concepts/tables/#primary-keys"
     *         target="_top">primary key</a>.  If set to {@code true}, any
     *         record being inserted with primary key values that match those
     *         of an existing table record will be ignored with no error
     *         generated.  If the specified table does not have a primary key,
     *         then this option has no affect.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_RECORD_IDS
     *         RETURN_RECORD_IDS}: If {@code true} then return the internal
     *         record id along for each inserted record.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUNCATE_STRINGS
     *         TRUNCATE_STRINGS}: If set to {@code true}, any strings which are
     *         too long for their target charN string columns will be truncated
     *         to fit.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_INDIVIDUAL_ERRORS
     *         RETURN_INDIVIDUAL_ERRORS}: If set to {@code true}, success will
     *         always be returned, and any errors found will be included in the
     *         info map.  The "bad_record_indices" entry is a comma-separated
     *         list of bad records (0-based).  And if so, there will also be an
     *         "error_N" entry for each record with an error, where N is the
     *         index (0-based).
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#ALLOW_PARTIAL_BATCH
     *         ALLOW_PARTIAL_BATCH}: If set to {@code true}, all correct
     *         records will be inserted and incorrect records will be rejected
     *         and reported.  Otherwise, the entire batch will be rejected if
     *         any records are incorrect.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#DRY_RUN
     *         DRY_RUN}: If set to {@code true}, no data will be saved and any
     *         errors will be returned.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE FALSE}.
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
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *                 UPDATE_ON_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting into a table with a <a
     *                 href="../../../../../../concepts/tables/#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing table record with primary key values that
     *                 match those of a record being inserted will be replaced
     *                 by that new record.  If set to {@code false}, any
     *                 existing table record with primary key values that match
     *                 those of a record being inserted will remain unchanged
     *                 and the new record discarded.  If the specified table
     *                 does not have a primary key, then this option has no
     *                 affect.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#IGNORE_EXISTING_PK
     *                 IGNORE_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting into a table with a <a
     *                 href="../../../../../../concepts/tables/#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any record being inserted with primary key values that
     *                 match those of an existing table record will be ignored
     *                 with no error generated.  If the specified table does
     *                 not have a primary key, then this option has no affect.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_RECORD_IDS
     *                 RETURN_RECORD_IDS}: If {@code true} then return the
     *                 internal record id along for each inserted record.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUNCATE_STRINGS
     *                 TRUNCATE_STRINGS}: If set to {@code true}, any strings
     *                 which are too long for their target charN string columns
     *                 will be truncated to fit.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#RETURN_INDIVIDUAL_ERRORS
     *                 RETURN_INDIVIDUAL_ERRORS}: If set to {@code true},
     *                 success will always be returned, and any errors found
     *                 will be included in the info map.  The
     *                 "bad_record_indices" entry is a comma-separated list of
     *                 bad records (0-based).  And if so, there will also be an
     *                 "error_N" entry for each record with an error, where N
     *                 is the index (0-based).
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#ALLOW_PARTIAL_BATCH
     *                 ALLOW_PARTIAL_BATCH}: If set to {@code true}, all
     *                 correct records will be inserted and incorrect records
     *                 will be rejected and reported.  Otherwise, the entire
     *                 batch will be rejected if any records are incorrect.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#DRY_RUN
     *                 DRY_RUN}: If set to {@code true}, no data will be saved
     *                 and any errors will be returned.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsRequest<T> setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }
    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        InsertRecordsRequest that = (InsertRecordsRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.data.equals( that.data )
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
        builder.append( gd.toString( "data" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.data ) );
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
        hashCode = (31 * hashCode) + this.data.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

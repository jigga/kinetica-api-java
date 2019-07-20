/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.nio.ByteBuffer;
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
 * com.gpudb.GPUdb#insertRecordsRaw(RawInsertRecordsRequest)}.
 * <p>
 * Adds multiple records to the specified table. The operation is synchronous,
 * meaning that a response will not be returned until all the records are fully
 * inserted and available. The response payload provides the counts of the
 * number of records actually inserted and/or updated, and can provide the
 * unique identifier of each added record.
 * <p>
 * The {@code options} parameter can be used to customize this function's
 * behavior.
 * <p>
 * The {@code update_on_existing_pk} option specifies the record collision
 * policy for inserting into a table with a <a
 * href="../../../../../concepts/tables.html#primary-keys"
 * target="_top">primary key</a>, but is ignored if no primary key exists.
 * <p>
 * The {@code return_record_ids} option indicates that the database should
 * return the unique identifiers of inserted records.
 */
public class RawInsertRecordsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RawInsertRecordsRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("list").type().array().items().bytesType().noDefault()
                .name("listStr").type().array().items().stringType().noDefault()
                .name("listEncoding").type().stringType().noDefault()
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
     * The encoding of the records to be inserted.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY BINARY}
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#JSON JSON}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY BINARY}.
     * A set of string constants for the parameter {@code listEncoding}.
     */
    public static final class ListEncoding {
        public static final String BINARY = "binary";
        public static final String JSON = "json";

        private ListEncoding() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     * UPDATE_ON_EXISTING_PK}: Specifies the record collision policy for
     * inserting into a table with a <a
     * href="../../../../../concepts/tables.html#primary-keys"
     * target="_top">primary key</a>.  If set to {@code true}, any existing
     * table record with primary key values that match those of a record being
     * inserted will be replaced by that new record.  If set to {@code false},
     * any existing table record with primary key values that match those of a
     * record being inserted will remain unchanged and the new record
     * discarded.  If the specified table does not have a primary key, then
     * this option is ignored.
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
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Specifies the record collision policy for inserting into a table
         * with a <a href="../../../../../concepts/tables.html#primary-keys"
         * target="_top">primary key</a>.  If set to {@code true}, any existing
         * table record with primary key values that match those of a record
         * being inserted will be replaced by that new record.  If set to
         * {@code false}, any existing table record with primary key values
         * that match those of a record being inserted will remain unchanged
         * and the new record discarded.  If the specified table does not have
         * a primary key, then this option is ignored.
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

        private Options() {  }
    }

    private String tableName;
    private List<ByteBuffer> list;
    private List<String> listStr;
    private String listEncoding;
    private Map<String, String> options;


    /**
     * Constructs a RawInsertRecordsRequest object with default parameters.
     */
    public RawInsertRecordsRequest() {
        tableName = "";
        list = new ArrayList<>();
        listStr = new ArrayList<>();
        listEncoding = ListEncoding.BINARY;
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a RawInsertRecordsRequest object with the specified
     * parameters.
     * 
     * @param tableName  Table to which the records are to be added. Must be an
     *                   existing table.
     * @param list  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *                 UPDATE_ON_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting into a table with a <a
     *                 href="../../../../../concepts/tables.html#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing table record with primary key values that
     *                 match those of a record being inserted will be replaced
     *                 by that new record.  If set to {@code false}, any
     *                 existing table record with primary key values that match
     *                 those of a record being inserted will remain unchanged
     *                 and the new record discarded.  If the specified table
     *                 does not have a primary key, then this option is
     *                 ignored.
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
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public RawInsertRecordsRequest(String tableName, List<ByteBuffer> list, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.list = (list == null) ? new ArrayList<ByteBuffer>() : list;
        this.listStr = new ArrayList<String>();
        this.listEncoding = ListEncoding.BINARY;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * Constructs a RawInsertRecordsRequest object with the specified
     * parameters.
     * 
     * @param tableName  Table to which the records are to be added. Must be an
     *                   existing table.
     * @param list  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * @param listStr  An array of JSON encoded data for the records to be
     *                 added. All records must be of the same type as that of
     *                 the table. Empty array if {@code listEncoding} is {@code
     *                 binary}.
     * @param listEncoding  The encoding of the records to be inserted.
     *                      Supported values:
     *                      <ul>
     *                              <li> {@link
     *                      com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY
     *                      BINARY}
     *                              <li> {@link
     *                      com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#JSON
     *                      JSON}
     *                      </ul>
     *                      The default value is {@link
     *                      com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY
     *                      BINARY}.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.RawInsertRecordsRequest.Options#UPDATE_ON_EXISTING_PK
     *                 UPDATE_ON_EXISTING_PK}: Specifies the record collision
     *                 policy for inserting into a table with a <a
     *                 href="../../../../../concepts/tables.html#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing table record with primary key values that
     *                 match those of a record being inserted will be replaced
     *                 by that new record.  If set to {@code false}, any
     *                 existing table record with primary key values that match
     *                 those of a record being inserted will remain unchanged
     *                 and the new record discarded.  If the specified table
     *                 does not have a primary key, then this option is
     *                 ignored.
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
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public RawInsertRecordsRequest(String tableName, List<ByteBuffer> list, List<String> listStr, String listEncoding, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.list = (list == null) ? new ArrayList<ByteBuffer>() : list;
        this.listStr = (listStr == null) ? new ArrayList<String>() : listStr;
        this.listEncoding = (listEncoding == null) ? ListEncoding.BINARY : listEncoding;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Table to which the records are to be added. Must be an existing
     *         table.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Table to which the records are to be added. Must be an
     *                   existing table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawInsertRecordsRequest setTableName(String tableName) {
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
    public List<ByteBuffer> getList() {
        return list;
    }

    /**
     * 
     * @param list  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawInsertRecordsRequest setList(List<ByteBuffer> list) {
        this.list = (list == null) ? new ArrayList<ByteBuffer>() : list;
        return this;
    }

    /**
     * 
     * @return An array of JSON encoded data for the records to be added. All
     *         records must be of the same type as that of the table. Empty
     *         array if {@code listEncoding} is {@code binary}.
     * 
     */
    public List<String> getListStr() {
        return listStr;
    }

    /**
     * 
     * @param listStr  An array of JSON encoded data for the records to be
     *                 added. All records must be of the same type as that of
     *                 the table. Empty array if {@code listEncoding} is {@code
     *                 binary}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawInsertRecordsRequest setListStr(List<String> listStr) {
        this.listStr = (listStr == null) ? new ArrayList<String>() : listStr;
        return this;
    }

    /**
     * 
     * @return The encoding of the records to be inserted.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY
     *         BINARY}
     *                 <li> {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#JSON
     *         JSON}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY
     *         BINARY}.
     * 
     */
    public String getListEncoding() {
        return listEncoding;
    }

    /**
     * 
     * @param listEncoding  The encoding of the records to be inserted.
     *                      Supported values:
     *                      <ul>
     *                              <li> {@link
     *                      com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY
     *                      BINARY}
     *                              <li> {@link
     *                      com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#JSON
     *                      JSON}
     *                      </ul>
     *                      The default value is {@link
     *                      com.gpudb.protocol.RawInsertRecordsRequest.ListEncoding#BINARY
     *                      BINARY}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawInsertRecordsRequest setListEncoding(String listEncoding) {
        this.listEncoding = (listEncoding == null) ? ListEncoding.BINARY : listEncoding;
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
     *         href="../../../../../concepts/tables.html#primary-keys"
     *         target="_top">primary key</a>.  If set to {@code true}, any
     *         existing table record with primary key values that match those
     *         of a record being inserted will be replaced by that new record.
     *         If set to {@code false}, any existing table record with primary
     *         key values that match those of a record being inserted will
     *         remain unchanged and the new record discarded.  If the specified
     *         table does not have a primary key, then this option is ignored.
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
     *                 href="../../../../../concepts/tables.html#primary-keys"
     *                 target="_top">primary key</a>.  If set to {@code true},
     *                 any existing table record with primary key values that
     *                 match those of a record being inserted will be replaced
     *                 by that new record.  If set to {@code false}, any
     *                 existing table record with primary key values that match
     *                 those of a record being inserted will remain unchanged
     *                 and the new record discarded.  If the specified table
     *                 does not have a primary key, then this option is
     *                 ignored.
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
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RawInsertRecordsRequest setOptions(Map<String, String> options) {
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
                return this.list;

            case 2:
                return this.listStr;

            case 3:
                return this.listEncoding;

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
                this.list = (List<ByteBuffer>)value;
                break;

            case 2:
                this.listStr = (List<String>)value;
                break;

            case 3:
                this.listEncoding = (String)value;
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

        RawInsertRecordsRequest that = (RawInsertRecordsRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.list.equals( that.list )
                 && this.listStr.equals( that.listStr )
                 && this.listEncoding.equals( that.listEncoding )
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
        builder.append( gd.toString( "list" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.list ) );
        builder.append( ", " );
        builder.append( gd.toString( "listStr" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.listStr ) );
        builder.append( ", " );
        builder.append( gd.toString( "listEncoding" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.listEncoding ) );
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
        hashCode = (31 * hashCode) + this.list.hashCode();
        hashCode = (31 * hashCode) + this.listStr.hashCode();
        hashCode = (31 * hashCode) + this.listEncoding.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

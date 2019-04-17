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
 * com.gpudb.GPUdb#adminRebalance(AdminRebalanceRequest)}.
 * <p>
 * Rebalance the cluster so that all the nodes contain approximately an equal
 * number of records.  The rebalance will also cause the shards to be equally
 * distributed (as much as possible) across all the ranks.
 * <p>
 * This endpoint may take a long time to run, depending on the amount of data
 * in the system. The API call may time out if run directly.  It is recommended
 * to run this endpoint asynchronously via {@link
 * com.gpudb.GPUdb#createJob(CreateJobRequest)}.
 */
public class AdminRebalanceRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminRebalanceRequest")
            .namespace("com.gpudb")
            .fields()
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
     * com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_SHARDED_DATA
     * REBALANCE_SHARDED_DATA}: If {@code true}, sharded data will be
     * rebalanced approximately equally across the cluster. Note that for big
     * clusters, this data transfer could be time consuming and result in
     * delayed query responses.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}.
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_UNSHARDED_DATA
     * REBALANCE_UNSHARDED_DATA}: If {@code true}, unsharded data (data without
     * primary keys and without shard keys) will be rebalanced approximately
     * equally across the cluster. Note that for big clusters, this data
     * transfer could be time consuming and result in delayed query responses.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}.
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_WHITELIST
     * TABLE_WHITELIST}: Comma-separated list of unsharded table names to
     * rebalance. Not applicable to sharded tables because they are always
     * balanced in accordance with their primary key or shard key. Cannot be
     * used simultaneously with {@code table_blacklist}.
     *         <li> {@link
     * com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_BLACKLIST
     * TABLE_BLACKLIST}: Comma-separated list of unsharded table names to not
     * rebalance. Not applicable to sharded tables because they are always
     * balanced in accordance with their primary key or shard key. Cannot be
     * used simultaneously with {@code table_whitelist}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code true}, sharded data will be rebalanced approximately
         * equally across the cluster. Note that for big clusters, this data
         * transfer could be time consuming and result in delayed query
         * responses.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}.
         */
        public static final String REBALANCE_SHARDED_DATA = "rebalance_sharded_data";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * If {@code true}, unsharded data (data without primary keys and
         * without shard keys) will be rebalanced approximately equally across
         * the cluster. Note that for big clusters, this data transfer could be
         * time consuming and result in delayed query responses.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}.
         */
        public static final String REBALANCE_UNSHARDED_DATA = "rebalance_unsharded_data";

        /**
         * Comma-separated list of unsharded table names to rebalance. Not
         * applicable to sharded tables because they are always balanced in
         * accordance with their primary key or shard key. Cannot be used
         * simultaneously with {@code table_blacklist}.
         */
        public static final String TABLE_WHITELIST = "table_whitelist";

        /**
         * Comma-separated list of unsharded table names to not rebalance. Not
         * applicable to sharded tables because they are always balanced in
         * accordance with their primary key or shard key. Cannot be used
         * simultaneously with {@code table_whitelist}.
         */
        public static final String TABLE_BLACKLIST = "table_blacklist";

        private Options() {  }
    }

    private Map<String, String> options;


    /**
     * Constructs an AdminRebalanceRequest object with default parameters.
     */
    public AdminRebalanceRequest() {
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AdminRebalanceRequest object with the specified
     * parameters.
     * 
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_SHARDED_DATA
     *                 REBALANCE_SHARDED_DATA}: If {@code true}, sharded data
     *                 will be rebalanced approximately equally across the
     *                 cluster. Note that for big clusters, this data transfer
     *                 could be time consuming and result in delayed query
     *                 responses.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_UNSHARDED_DATA
     *                 REBALANCE_UNSHARDED_DATA}: If {@code true}, unsharded
     *                 data (data without primary keys and without shard keys)
     *                 will be rebalanced approximately equally across the
     *                 cluster. Note that for big clusters, this data transfer
     *                 could be time consuming and result in delayed query
     *                 responses.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_WHITELIST
     *                 TABLE_WHITELIST}: Comma-separated list of unsharded
     *                 table names to rebalance. Not applicable to sharded
     *                 tables because they are always balanced in accordance
     *                 with their primary key or shard key. Cannot be used
     *                 simultaneously with {@code table_blacklist}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_BLACKLIST
     *                 TABLE_BLACKLIST}: Comma-separated list of unsharded
     *                 table names to not rebalance. Not applicable to sharded
     *                 tables because they are always balanced in accordance
     *                 with their primary key or shard key. Cannot be used
     *                 simultaneously with {@code table_whitelist}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public AdminRebalanceRequest(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_SHARDED_DATA
     *         REBALANCE_SHARDED_DATA}: If {@code true}, sharded data will be
     *         rebalanced approximately equally across the cluster. Note that
     *         for big clusters, this data transfer could be time consuming and
     *         result in delayed query responses.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}.
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_UNSHARDED_DATA
     *         REBALANCE_UNSHARDED_DATA}: If {@code true}, unsharded data (data
     *         without primary keys and without shard keys) will be rebalanced
     *         approximately equally across the cluster. Note that for big
     *         clusters, this data transfer could be time consuming and result
     *         in delayed query responses.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE TRUE}.
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_WHITELIST
     *         TABLE_WHITELIST}: Comma-separated list of unsharded table names
     *         to rebalance. Not applicable to sharded tables because they are
     *         always balanced in accordance with their primary key or shard
     *         key. Cannot be used simultaneously with {@code table_blacklist}.
     *                 <li> {@link
     *         com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_BLACKLIST
     *         TABLE_BLACKLIST}: Comma-separated list of unsharded table names
     *         to not rebalance. Not applicable to sharded tables because they
     *         are always balanced in accordance with their primary key or
     *         shard key. Cannot be used simultaneously with {@code
     *         table_whitelist}.
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
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_SHARDED_DATA
     *                 REBALANCE_SHARDED_DATA}: If {@code true}, sharded data
     *                 will be rebalanced approximately equally across the
     *                 cluster. Note that for big clusters, this data transfer
     *                 could be time consuming and result in delayed query
     *                 responses.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#REBALANCE_UNSHARDED_DATA
     *                 REBALANCE_UNSHARDED_DATA}: If {@code true}, unsharded
     *                 data (data without primary keys and without shard keys)
     *                 will be rebalanced approximately equally across the
     *                 cluster. Note that for big clusters, this data transfer
     *                 could be time consuming and result in delayed query
     *                 responses.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TRUE
     *                 TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_WHITELIST
     *                 TABLE_WHITELIST}: Comma-separated list of unsharded
     *                 table names to rebalance. Not applicable to sharded
     *                 tables because they are always balanced in accordance
     *                 with their primary key or shard key. Cannot be used
     *                 simultaneously with {@code table_blacklist}.
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminRebalanceRequest.Options#TABLE_BLACKLIST
     *                 TABLE_BLACKLIST}: Comma-separated list of unsharded
     *                 table names to not rebalance. Not applicable to sharded
     *                 tables because they are always balanced in accordance
     *                 with their primary key or shard key. Cannot be used
     *                 simultaneously with {@code table_whitelist}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminRebalanceRequest setOptions(Map<String, String> options) {
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

        AdminRebalanceRequest that = (AdminRebalanceRequest)obj;

        return ( this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "options" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.options ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

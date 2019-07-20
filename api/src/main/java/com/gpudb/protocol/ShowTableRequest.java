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
 * A set of parameters for {@link com.gpudb.GPUdb#showTable(ShowTableRequest)}.
 * <p>
 * Retrieves detailed information about tables, views, and collections.
 * <p>
 * If {@code tableName} specifies a table or view, information specific to that
 * entity will be returned.
 * <p>
 * If {@code tableName} specifies a collection, the call can return information
 * about either the collection itself (setting the {@code show_children} option
 * to {@code false}) or the tables and views it contains (setting {@code
 * show_children} to {@code true}).
 * <p>
 * If {@code tableName} is empty, information about all collections and
 * top-level tables and views can be returned.  Note:  {@code show_children}
 * must be set to {@code true}.
 * <p>
 * If {@code tableName} is '*', information about all tables, collections, and
 * views will be returned.  Note:  {@code show_children} must be set to {@code
 * true}.
 * <p>
 * If the option {@code get_sizes} is set to {@code true}, then the sizes
 * (objects and elements) of each table are returned (in {@code sizes} and
 * {@code fullSizes}), along with the total number of objects in the requested
 * table (in {@code totalSize} and {@code totalFullSize}).
 */
public class ShowTableRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowTableRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
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
     * com.gpudb.protocol.ShowTableRequest.Options#FORCE_SYNCHRONOUS
     * FORCE_SYNCHRONOUS}: If {@code true} then the table sizes will wait for
     * read lock before returning.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *         <li> {@link
     * com.gpudb.protocol.ShowTableRequest.Options#GET_SIZES GET_SIZES}: If
     * {@code true} then the table sizes will be returned; blank, otherwise.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.ShowTableRequest.Options#SHOW_CHILDREN
     * SHOW_CHILDREN}: If {@code tableName} is a collection, then {@code true}
     * will return information about the children of the collection, while
     * {@code false} will return information about the collection itself.
     * <p>
     * If {@code tableName} is empty or '*', then {@code show_children} must be
     * {@code true} (or not specified); otherwise, no results will be returned.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *         <li> {@link
     * com.gpudb.protocol.ShowTableRequest.Options#NO_ERROR_IF_NOT_EXISTS
     * NO_ERROR_IF_NOT_EXISTS}: If {@code false} will return an error if the
     * provided {@code tableName} does not exist. If {@code true} then it will
     * return an empty result.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.ShowTableRequest.Options#GET_COLUMN_INFO
     * GET_COLUMN_INFO}: If {@code true} then column info (memory usage, etc)
     * will be returned.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code true} then the table sizes will wait for read lock before
         * returning.
         * Supported values:
         * <ul>
         *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
         * TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
         */
        public static final String FORCE_SYNCHRONOUS = "force_synchronous";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * If {@code true} then the table sizes will be returned; blank,
         * otherwise.
         * Supported values:
         * <ul>
         *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
         * TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
         */
        public static final String GET_SIZES = "get_sizes";

        /**
         * If {@code tableName} is a collection, then {@code true} will return
         * information about the children of the collection, while {@code
         * false} will return information about the collection itself.
         * <p>
         * If {@code tableName} is empty or '*', then {@code show_children}
         * must be {@code true} (or not specified); otherwise, no results will
         * be returned.
         * Supported values:
         * <ul>
         *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
         * TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
         */
        public static final String SHOW_CHILDREN = "show_children";

        /**
         * If {@code false} will return an error if the provided {@code
         * tableName} does not exist. If {@code true} then it will return an
         * empty result.
         * Supported values:
         * <ul>
         *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
         * TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
         */
        public static final String NO_ERROR_IF_NOT_EXISTS = "no_error_if_not_exists";

        /**
         * If {@code true} then column info (memory usage, etc) will be
         * returned.
         * Supported values:
         * <ul>
         *         <li> {@link com.gpudb.protocol.ShowTableRequest.Options#TRUE
         * TRUE}
         *         <li> {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
         */
        public static final String GET_COLUMN_INFO = "get_column_info";

        private Options() {  }
    }

    private String tableName;
    private Map<String, String> options;


    /**
     * Constructs a ShowTableRequest object with default parameters.
     */
    public ShowTableRequest() {
        tableName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a ShowTableRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table for which to retrieve the
     *                   information. If blank, then information about all
     *                   collections and top-level tables and views is
     *                   returned.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FORCE_SYNCHRONOUS
     *                 FORCE_SYNCHRONOUS}: If {@code true} then the table sizes
     *                 will wait for read lock before returning.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#GET_SIZES
     *                 GET_SIZES}: If {@code true} then the table sizes will be
     *                 returned; blank, otherwise.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#SHOW_CHILDREN
     *                 SHOW_CHILDREN}: If {@code tableName} is a collection,
     *                 then {@code true} will return information about the
     *                 children of the collection, while {@code false} will
     *                 return information about the collection itself.
     *                 If {@code tableName} is empty or '*', then {@code
     *                 show_children} must be {@code true} (or not specified);
     *                 otherwise, no results will be returned.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#NO_ERROR_IF_NOT_EXISTS
     *                 NO_ERROR_IF_NOT_EXISTS}: If {@code false} will return an
     *                 error if the provided {@code tableName} does not exist.
     *                 If {@code true} then it will return an empty result.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#GET_COLUMN_INFO
     *                 GET_COLUMN_INFO}: If {@code true} then column info
     *                 (memory usage, etc) will be returned.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public ShowTableRequest(String tableName, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table for which to retrieve the information. If
     *         blank, then information about all collections and top-level
     *         tables and views is returned.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table for which to retrieve the
     *                   information. If blank, then information about all
     *                   collections and top-level tables and views is
     *                   returned.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowTableRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FORCE_SYNCHRONOUS
     *         FORCE_SYNCHRONOUS}: If {@code true} then the table sizes will
     *         wait for read lock before returning.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#GET_SIZES
     *         GET_SIZES}: If {@code true} then the table sizes will be
     *         returned; blank, otherwise.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#SHOW_CHILDREN
     *         SHOW_CHILDREN}: If {@code tableName} is a collection, then
     *         {@code true} will return information about the children of the
     *         collection, while {@code false} will return information about
     *         the collection itself.
     *         If {@code tableName} is empty or '*', then {@code show_children}
     *         must be {@code true} (or not specified); otherwise, no results
     *         will be returned.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#NO_ERROR_IF_NOT_EXISTS
     *         NO_ERROR_IF_NOT_EXISTS}: If {@code false} will return an error
     *         if the provided {@code tableName} does not exist. If {@code
     *         true} then it will return an empty result.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#GET_COLUMN_INFO
     *         GET_COLUMN_INFO}: If {@code true} then column info (memory
     *         usage, etc) will be returned.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}.
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
     *                 com.gpudb.protocol.ShowTableRequest.Options#FORCE_SYNCHRONOUS
     *                 FORCE_SYNCHRONOUS}: If {@code true} then the table sizes
     *                 will wait for read lock before returning.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#GET_SIZES
     *                 GET_SIZES}: If {@code true} then the table sizes will be
     *                 returned; blank, otherwise.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#SHOW_CHILDREN
     *                 SHOW_CHILDREN}: If {@code tableName} is a collection,
     *                 then {@code true} will return information about the
     *                 children of the collection, while {@code false} will
     *                 return information about the collection itself.
     *                 If {@code tableName} is empty or '*', then {@code
     *                 show_children} must be {@code true} (or not specified);
     *                 otherwise, no results will be returned.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#NO_ERROR_IF_NOT_EXISTS
     *                 NO_ERROR_IF_NOT_EXISTS}: If {@code false} will return an
     *                 error if the provided {@code tableName} does not exist.
     *                 If {@code true} then it will return an empty result.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#GET_COLUMN_INFO
     *                 GET_COLUMN_INFO}: If {@code true} then column info
     *                 (memory usage, etc) will be returned.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.ShowTableRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowTableRequest setOptions(Map<String, String> options) {
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

        ShowTableRequest that = (ShowTableRequest)obj;

        return ( this.tableName.equals( that.tableName )
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
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

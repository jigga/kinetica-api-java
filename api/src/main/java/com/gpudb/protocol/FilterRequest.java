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
 * A set of parameters for {@link com.gpudb.GPUdb#filter(FilterRequest)}.
 * <p>
 * Filters data based on the specified expression.  The results are
 * stored in a <a href="../../../../../../concepts/filtered_views/"
 * target="_top">result set</a> with the
 * given {@code viewName}.
 * <p>
 * For details see <a href="../../../../../../concepts/expressions/"
 * target="_top">Expressions</a>.
 * <p>
 * The response message contains the number of points for which the expression
 * evaluated to be true, which is equivalent to the size of the result view.
 */
public class FilterRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("expression").type().stringType().noDefault()
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
     * com.gpudb.protocol.FilterRequest.Options#CREATE_TEMP_TABLE
     * CREATE_TEMP_TABLE}: If {@code true}, a unique temporary table name will
     * be generated in the sys_temp schema and used in place of {@code
     * viewName}. This is always allowed even if the caller does not have
     * permission to create tables. The generated name is returned in {@code
     * qualified_view_name}.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.FilterRequest.Options#TRUE TRUE}
     *         <li> {@link com.gpudb.protocol.FilterRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.FilterRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: [DEPRECATED--please specify the containing schema for
     * the view as part of {@code viewName} and use {@link
     * com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the schema
     * if non-existent]  Name of a schema for the newly created view. If the
     * schema is non-existent, it will be automatically created.
     *         <li> {@link com.gpudb.protocol.FilterRequest.Options#VIEW_ID
     * VIEW_ID}: view this filtered-view is part of.  The default value is ''.
     *         <li> {@link com.gpudb.protocol.FilterRequest.Options#TTL TTL}:
     * Sets the <a href="../../../../../../concepts/ttl/" target="_top">TTL</a>
     * of the view specified in {@code viewName}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code true}, a unique temporary table name will be generated in
         * the sys_temp schema and used in place of {@code viewName}. This is
         * always allowed even if the caller does not have permission to create
         * tables. The generated name is returned in {@code
         * qualified_view_name}.
         * Supported values:
         * <ul>
         *         <li> {@link com.gpudb.protocol.FilterRequest.Options#TRUE
         * TRUE}
         *         <li> {@link com.gpudb.protocol.FilterRequest.Options#FALSE
         * FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}.
         */
        public static final String CREATE_TEMP_TABLE = "create_temp_table";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * [DEPRECATED--please specify the containing schema for the view as
         * part of {@code viewName} and use {@link
         * com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the
         * schema if non-existent]  Name of a schema for the newly created
         * view. If the schema is non-existent, it will be automatically
         * created.
         */
        public static final String COLLECTION_NAME = "collection_name";

        /**
         * view this filtered-view is part of.  The default value is ''.
         */
        public static final String VIEW_ID = "view_id";

        /**
         * Sets the <a href="../../../../../../concepts/ttl/"
         * target="_top">TTL</a> of the view specified in {@code viewName}.
         */
        public static final String TTL = "ttl";

        private Options() {  }
    }

    private String tableName;
    private String viewName;
    private String expression;
    private Map<String, String> options;


    /**
     * Constructs a FilterRequest object with default parameters.
     */
    public FilterRequest() {
        tableName = "";
        viewName = "";
        expression = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterRequest object with the specified parameters.
     * 
     * @param tableName  Name of the table to filter, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.  This may be
     *                   the name of a table or a view (when chaining queries).
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results, in [schema_name.]view_name
     *                  format, using standard <a
     *                  href="../../../../../../concepts/tables/#table-name-resolution"
     *                  target="_top">name resolution rules</a> and meeting <a
     *                  href="../../../../../../concepts/tables/#table-naming-criteria"
     *                  target="_top">table naming criteria</a>.  Must not be
     *                  an already existing table or view.  The default value
     *                  is ''.
     * @param expression  The select expression to filter the specified table.
     *                    For details see <a
     *                    href="../../../../../../concepts/expressions/"
     *                    target="_top">Expressions</a>.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#CREATE_TEMP_TABLE
     *                 CREATE_TEMP_TABLE}: If {@code true}, a unique temporary
     *                 table name will be generated in the sys_temp schema and
     *                 used in place of {@code viewName}. This is always
     *                 allowed even if the caller does not have permission to
     *                 create tables. The generated name is returned in {@code
     *                 qualified_view_name}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: [DEPRECATED--please specify the
     *                 containing schema for the view as part of {@code
     *                 viewName} and use {@link
     *                 com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to
     *                 create the schema if non-existent]  Name of a schema for
     *                 the newly created view. If the schema is non-existent,
     *                 it will be automatically created.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#VIEW_ID
     *                 VIEW_ID}: view this filtered-view is part of.  The
     *                 default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#TTL TTL}: Sets
     *                 the <a href="../../../../../../concepts/ttl/"
     *                 target="_top">TTL</a> of the view specified in {@code
     *                 viewName}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public FilterRequest(String tableName, String viewName, String expression, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.expression = (expression == null) ? "" : expression;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table to filter, in [schema_name.]table_name format,
     *         using standard <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a>.  This may be the name
     *         of a table or a view (when chaining queries).
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table to filter, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.  This may be
     *                   the name of a table or a view (when chaining queries).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return If provided, then this will be the name of the view containing
     *         the results, in [schema_name.]view_name format, using standard
     *         <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a> and meeting <a
     *         href="../../../../../../concepts/tables/#table-naming-criteria"
     *         target="_top">table naming criteria</a>.  Must not be an already
     *         existing table or view.  The default value is ''.
     * 
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * 
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results, in [schema_name.]view_name
     *                  format, using standard <a
     *                  href="../../../../../../concepts/tables/#table-name-resolution"
     *                  target="_top">name resolution rules</a> and meeting <a
     *                  href="../../../../../../concepts/tables/#table-naming-criteria"
     *                  target="_top">table naming criteria</a>.  Must not be
     *                  an already existing table or view.  The default value
     *                  is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return The select expression to filter the specified table.  For
     *         details see <a href="../../../../../../concepts/expressions/"
     *         target="_top">Expressions</a>.
     * 
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 
     * @param expression  The select expression to filter the specified table.
     *                    For details see <a
     *                    href="../../../../../../concepts/expressions/"
     *                    target="_top">Expressions</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterRequest setExpression(String expression) {
        this.expression = (expression == null) ? "" : expression;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterRequest.Options#CREATE_TEMP_TABLE
     *         CREATE_TEMP_TABLE}: If {@code true}, a unique temporary table
     *         name will be generated in the sys_temp schema and used in place
     *         of {@code viewName}. This is always allowed even if the caller
     *         does not have permission to create tables. The generated name is
     *         returned in {@code qualified_view_name}.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.FilterRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: [DEPRECATED--please specify the containing
     *         schema for the view as part of {@code viewName} and use {@link
     *         com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the
     *         schema if non-existent]  Name of a schema for the newly created
     *         view. If the schema is non-existent, it will be automatically
     *         created.
     *                 <li> {@link
     *         com.gpudb.protocol.FilterRequest.Options#VIEW_ID VIEW_ID}: view
     *         this filtered-view is part of.  The default value is ''.
     *                 <li> {@link com.gpudb.protocol.FilterRequest.Options#TTL
     *         TTL}: Sets the <a href="../../../../../../concepts/ttl/"
     *         target="_top">TTL</a> of the view specified in {@code viewName}.
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
     *                 com.gpudb.protocol.FilterRequest.Options#CREATE_TEMP_TABLE
     *                 CREATE_TEMP_TABLE}: If {@code true}, a unique temporary
     *                 table name will be generated in the sys_temp schema and
     *                 used in place of {@code viewName}. This is always
     *                 allowed even if the caller does not have permission to
     *                 create tables. The generated name is returned in {@code
     *                 qualified_view_name}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.FilterRequest.Options#FALSE FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: [DEPRECATED--please specify the
     *                 containing schema for the view as part of {@code
     *                 viewName} and use {@link
     *                 com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to
     *                 create the schema if non-existent]  Name of a schema for
     *                 the newly created view. If the schema is non-existent,
     *                 it will be automatically created.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#VIEW_ID
     *                 VIEW_ID}: view this filtered-view is part of.  The
     *                 default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterRequest.Options#TTL TTL}: Sets
     *                 the <a href="../../../../../../concepts/ttl/"
     *                 target="_top">TTL</a> of the view specified in {@code
     *                 viewName}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterRequest setOptions(Map<String, String> options) {
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
                return this.viewName;

            case 2:
                return this.expression;

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
                this.viewName = (String)value;
                break;

            case 2:
                this.expression = (String)value;
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

        FilterRequest that = (FilterRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && this.expression.equals( that.expression )
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
        builder.append( gd.toString( "viewName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.viewName ) );
        builder.append( ", " );
        builder.append( gd.toString( "expression" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.expression ) );
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
        hashCode = (31 * hashCode) + this.viewName.hashCode();
        hashCode = (31 * hashCode) + this.expression.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

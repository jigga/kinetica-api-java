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
 * com.gpudb.GPUdb#filterByValue(FilterByValueRequest)}.
 * <p>
 * Calculates which objects from a table has a particular value for a
 * particular column. The input parameters provide a way to specify either a
 * String
 * or a Double valued column and a desired value for the column on which the
 * filter
 * is performed. The operation is synchronous, meaning that a response will not
 * be
 * returned until all the objects are fully available. The response payload
 * provides the count of the resulting set. A new result view which satisfies
 * the
 * input filter restriction specification is also created with a view name
 * passed
 * in as part of the input payload.  Although this functionality can also be
 * accomplished with the standard filter function, it is more efficient.
 */
public class FilterByValueRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterByValueRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("isString").type().booleanType().noDefault()
                .name("value").type().doubleType().noDefault()
                .name("valueStr").type().stringType().noDefault()
                .name("columnName").type().stringType().noDefault()
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
     * com.gpudb.protocol.FilterByValueRequest.Options#CREATE_TEMP_TABLE
     * CREATE_TEMP_TABLE}: If {@code true}, a unique temporary table name will
     * be generated in the sys_temp schema and used in place of {@code
     * viewName}. This is always allowed even if the caller does not have
     * permission to create tables. The generated name is returned in {@code
     * qualified_view_name}.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.FilterByValueRequest.Options#TRUE
     * TRUE}
     *         <li> {@link
     * com.gpudb.protocol.FilterByValueRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.FilterByValueRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.FilterByValueRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: [DEPRECATED--please specify the containing schema for
     * the view as part of {@code viewName} and use {@link
     * com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the schema
     * if non-existent]  Name of a schema for the newly created view. If the
     * schema is non-existent, it will be automatically created.
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
         *         <li> {@link
         * com.gpudb.protocol.FilterByValueRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.FilterByValueRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.FilterByValueRequest.Options#FALSE FALSE}.
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

        private Options() {  }
    }

    private String tableName;
    private String viewName;
    private boolean isString;
    private double value;
    private String valueStr;
    private String columnName;
    private Map<String, String> options;


    /**
     * Constructs a FilterByValueRequest object with default parameters.
     */
    public FilterByValueRequest() {
        tableName = "";
        viewName = "";
        valueStr = "";
        columnName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterByValueRequest object with the specified parameters.
     * 
     * @param tableName  Name of an existing table on which to perform the
     *                   calculation, in [schema_name.]table_name format, using
     *                   standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results, in [schema_name.]view_name
     *                  format, using standard <a
     *                  href="../../../../../../concepts/tables/#table-name-resolution"
     *                  target="_top">name resolution rules</a> and meeting <a
     *                  href="../../../../../../concepts/tables/#table-naming-criteria"
     *                  target="_top">table naming criteria</a>.  Must not be
     *                  an already existing table or view.  The default value
     *                  is ''.
     * @param isString  Indicates whether the value being searched for is
     *                  string or numeric.
     * @param value  The value to search for.  The default value is 0.
     * @param valueStr  The string value to search for.  The default value is
     *                  ''.
     * @param columnName  Name of a column on which the filter by value would
     *                    be applied.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#CREATE_TEMP_TABLE
     *                 CREATE_TEMP_TABLE}: If {@code true}, a unique temporary
     *                 table name will be generated in the sys_temp schema and
     *                 used in place of {@code viewName}. This is always
     *                 allowed even if the caller does not have permission to
     *                 create tables. The generated name is returned in {@code
     *                 qualified_view_name}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: [DEPRECATED--please specify the
     *                 containing schema for the view as part of {@code
     *                 viewName} and use {@link
     *                 com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to
     *                 create the schema if non-existent]  Name of a schema for
     *                 the newly created view. If the schema is non-existent,
     *                 it will be automatically created.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public FilterByValueRequest(String tableName, String viewName, boolean isString, double value, String valueStr, String columnName, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.isString = isString;
        this.value = value;
        this.valueStr = (valueStr == null) ? "" : valueStr;
        this.columnName = (columnName == null) ? "" : columnName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of an existing table on which to perform the calculation,
     *         in [schema_name.]table_name format, using standard <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a>.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of an existing table on which to perform the
     *                   calculation, in [schema_name.]table_name format, using
     *                   standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByValueRequest setTableName(String tableName) {
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
    public FilterByValueRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return Indicates whether the value being searched for is string or
     *         numeric.
     * 
     */
    public boolean getIsString() {
        return isString;
    }

    /**
     * 
     * @param isString  Indicates whether the value being searched for is
     *                  string or numeric.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByValueRequest setIsString(boolean isString) {
        this.isString = isString;
        return this;
    }

    /**
     * 
     * @return The value to search for.  The default value is 0.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * 
     * @param value  The value to search for.  The default value is 0.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByValueRequest setValue(double value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return The string value to search for.  The default value is ''.
     * 
     */
    public String getValueStr() {
        return valueStr;
    }

    /**
     * 
     * @param valueStr  The string value to search for.  The default value is
     *                  ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByValueRequest setValueStr(String valueStr) {
        this.valueStr = (valueStr == null) ? "" : valueStr;
        return this;
    }

    /**
     * 
     * @return Name of a column on which the filter by value would be applied.
     * 
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 
     * @param columnName  Name of a column on which the filter by value would
     *                    be applied.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByValueRequest setColumnName(String columnName) {
        this.columnName = (columnName == null) ? "" : columnName;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterByValueRequest.Options#CREATE_TEMP_TABLE
     *         CREATE_TEMP_TABLE}: If {@code true}, a unique temporary table
     *         name will be generated in the sys_temp schema and used in place
     *         of {@code viewName}. This is always allowed even if the caller
     *         does not have permission to create tables. The generated name is
     *         returned in {@code qualified_view_name}.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterByValueRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.FilterByValueRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.FilterByValueRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.FilterByValueRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: [DEPRECATED--please specify the containing
     *         schema for the view as part of {@code viewName} and use {@link
     *         com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the
     *         schema if non-existent]  Name of a schema for the newly created
     *         view. If the schema is non-existent, it will be automatically
     *         created.
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
     *                 com.gpudb.protocol.FilterByValueRequest.Options#CREATE_TEMP_TABLE
     *                 CREATE_TEMP_TABLE}: If {@code true}, a unique temporary
     *                 table name will be generated in the sys_temp schema and
     *                 used in place of {@code viewName}. This is always
     *                 allowed even if the caller does not have permission to
     *                 create tables. The generated name is returned in {@code
     *                 qualified_view_name}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByValueRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: [DEPRECATED--please specify the
     *                 containing schema for the view as part of {@code
     *                 viewName} and use {@link
     *                 com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to
     *                 create the schema if non-existent]  Name of a schema for
     *                 the newly created view. If the schema is non-existent,
     *                 it will be automatically created.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByValueRequest setOptions(Map<String, String> options) {
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
                return this.isString;

            case 3:
                return this.value;

            case 4:
                return this.valueStr;

            case 5:
                return this.columnName;

            case 6:
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
                this.isString = (Boolean)value;
                break;

            case 3:
                this.value = (Double)value;
                break;

            case 4:
                this.valueStr = (String)value;
                break;

            case 5:
                this.columnName = (String)value;
                break;

            case 6:
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

        FilterByValueRequest that = (FilterByValueRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && ( this.isString == that.isString )
                 && ( (Double)this.value ).equals( (Double)that.value )
                 && this.valueStr.equals( that.valueStr )
                 && this.columnName.equals( that.columnName )
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
        builder.append( gd.toString( "isString" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.isString ) );
        builder.append( ", " );
        builder.append( gd.toString( "value" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.value ) );
        builder.append( ", " );
        builder.append( gd.toString( "valueStr" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.valueStr ) );
        builder.append( ", " );
        builder.append( gd.toString( "columnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnName ) );
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
        hashCode = (31 * hashCode) + ((Boolean)this.isString).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.value).hashCode();
        hashCode = (31 * hashCode) + this.valueStr.hashCode();
        hashCode = (31 * hashCode) + this.columnName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

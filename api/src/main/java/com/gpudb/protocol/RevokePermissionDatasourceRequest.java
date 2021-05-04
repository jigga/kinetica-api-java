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
 * com.gpudb.GPUdb#revokePermissionDatasource(RevokePermissionDatasourceRequest)}.
 * <p>
 * Revokes a <a href="../../../../../../concepts/data_sources/"
 * target="_top">data source</a> permission from a user or role.
 */
public class RevokePermissionDatasourceRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RevokePermissionDatasourceRequest")
            .namespace("com.gpudb")
            .fields()
                .name("name").type().stringType().noDefault()
                .name("permission").type().stringType().noDefault()
                .name("datasourceName").type().stringType().noDefault()
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
     * Permission to revoke from the user or role
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.RevokePermissionDatasourceRequest.Permission#CONNECT
     * CONNECT}: Connect access on the given data source
     * </ul>
     * A set of string constants for the parameter {@code permission}.
     */
    public static final class Permission {

        /**
         * Connect access on the given data source
         */
        public static final String CONNECT = "connect";

        private Permission() {  }
    }

    private String name;
    private String permission;
    private String datasourceName;
    private Map<String, String> options;


    /**
     * Constructs a RevokePermissionDatasourceRequest object with default
     * parameters.
     */
    public RevokePermissionDatasourceRequest() {
        name = "";
        permission = "";
        datasourceName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a RevokePermissionDatasourceRequest object with the specified
     * parameters.
     * 
     * @param name  Name of the user or role from which the permission will be
     *              revoked. Must be an existing user or role.
     * @param permission  Permission to revoke from the user or role
     *                    Supported values:
     *                    <ul>
     *                            <li> {@link
     *                    com.gpudb.protocol.RevokePermissionDatasourceRequest.Permission#CONNECT
     *                    CONNECT}: Connect access on the given data source
     *                    </ul>
     * @param datasourceName  Name of the data source on which the permission
     *                        will be revoked. Must be an existing data source,
     *                        or an empty string to revoke permission from all
     *                        data sources.
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     */
    public RevokePermissionDatasourceRequest(String name, String permission, String datasourceName, Map<String, String> options) {
        this.name = (name == null) ? "" : name;
        this.permission = (permission == null) ? "" : permission;
        this.datasourceName = (datasourceName == null) ? "" : datasourceName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the user or role from which the permission will be
     *         revoked. Must be an existing user or role.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name  Name of the user or role from which the permission will be
     *              revoked. Must be an existing user or role.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RevokePermissionDatasourceRequest setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * 
     * @return Permission to revoke from the user or role
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.RevokePermissionDatasourceRequest.Permission#CONNECT
     *         CONNECT}: Connect access on the given data source
     *         </ul>
     * 
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 
     * @param permission  Permission to revoke from the user or role
     *                    Supported values:
     *                    <ul>
     *                            <li> {@link
     *                    com.gpudb.protocol.RevokePermissionDatasourceRequest.Permission#CONNECT
     *                    CONNECT}: Connect access on the given data source
     *                    </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RevokePermissionDatasourceRequest setPermission(String permission) {
        this.permission = (permission == null) ? "" : permission;
        return this;
    }

    /**
     * 
     * @return Name of the data source on which the permission will be revoked.
     *         Must be an existing data source, or an empty string to revoke
     *         permission from all data sources.
     * 
     */
    public String getDatasourceName() {
        return datasourceName;
    }

    /**
     * 
     * @param datasourceName  Name of the data source on which the permission
     *                        will be revoked. Must be an existing data source,
     *                        or an empty string to revoke permission from all
     *                        data sources.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RevokePermissionDatasourceRequest setDatasourceName(String datasourceName) {
        this.datasourceName = (datasourceName == null) ? "" : datasourceName;
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
    public RevokePermissionDatasourceRequest setOptions(Map<String, String> options) {
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
                return this.name;

            case 1:
                return this.permission;

            case 2:
                return this.datasourceName;

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
                this.name = (String)value;
                break;

            case 1:
                this.permission = (String)value;
                break;

            case 2:
                this.datasourceName = (String)value;
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

        RevokePermissionDatasourceRequest that = (RevokePermissionDatasourceRequest)obj;

        return ( this.name.equals( that.name )
                 && this.permission.equals( that.permission )
                 && this.datasourceName.equals( that.datasourceName )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "name" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.name ) );
        builder.append( ", " );
        builder.append( gd.toString( "permission" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.permission ) );
        builder.append( ", " );
        builder.append( gd.toString( "datasourceName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.datasourceName ) );
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.permission.hashCode();
        hashCode = (31 * hashCode) + this.datasourceName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
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
 * com.gpudb.GPUdb#grantPermission(GrantPermissionRequest)}.
 * <p>
 * Grant user or role the specified permission on the specified object.
 */
public class GrantPermissionRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("GrantPermissionRequest")
            .namespace("com.gpudb")
            .fields()
                .name("principal").type().stringType().noDefault()
                .name("object").type().stringType().noDefault()
                .name("objectType").type().stringType().noDefault()
                .name("permission").type().stringType().noDefault()
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
     * The type of object being granted to
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#CREDENTIAL
     * CREDENTIAL}: Credential
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASINK DATASINK}:
     * Data Sink
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASOURCE
     * DATASOURCE}: Data Source
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#DIRECTORY
     * DIRECTORY}: KIFS File Directory
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#GRAPH GRAPH}: A
     * Graph object
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#PROC PROC}: UDF
     * Procedure
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#SCHEMA SCHEMA}:
     * Schema
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#SQL_PROC SQL_PROC}:
     * SQL Procedure
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#SYSTEM SYSTEM}:
     * System-level access
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE TABLE}:
     * Database Table
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE_MONITOR
     * TABLE_MONITOR}: Table monitor
     * </ul>
     * A set of string constants for the parameter {@code objectType}.
     */
    public static final class ObjectType {

        /**
         * Credential
         */
        public static final String CREDENTIAL = "credential";

        /**
         * Data Sink
         */
        public static final String DATASINK = "datasink";

        /**
         * Data Source
         */
        public static final String DATASOURCE = "datasource";

        /**
         * KIFS File Directory
         */
        public static final String DIRECTORY = "directory";

        /**
         * A Graph object
         */
        public static final String GRAPH = "graph";

        /**
         * UDF Procedure
         */
        public static final String PROC = "proc";

        /**
         * Schema
         */
        public static final String SCHEMA = "schema";

        /**
         * SQL Procedure
         */
        public static final String SQL_PROC = "sql_proc";

        /**
         * System-level access
         */
        public static final String SYSTEM = "system";

        /**
         * Database Table
         */
        public static final String TABLE = "table";

        /**
         * Table monitor
         */
        public static final String TABLE_MONITOR = "table_monitor";

        private ObjectType() {  }
    }


    /**
     * Permission being granted.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#ADMIN ADMIN}: Full
     * read/write and administrative access on the object.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#CONNECT CONNECT}:
     * Connect access on the given data source or data sink.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#DELETE DELETE}:
     * Delete rows from tables.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#EXECUTE EXECUTE}:
     * Ability to Execute the Procedure object.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#INSERT INSERT}:
     * Insert access to tables.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#READ READ}: Ability
     * to read, list and use the object.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#UPDATE UPDATE}:
     * Update access to the table.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#USER_ADMIN
     * USER_ADMIN}: Access to administer users and roles that do not have
     * system_admin permission.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Permission#WRITE WRITE}:
     * Access to write, change and delete objects.
     * </ul>
     * A set of string constants for the parameter {@code permission}.
     */
    public static final class Permission {

        /**
         * Full read/write and administrative access on the object.
         */
        public static final String ADMIN = "admin";

        /**
         * Connect access on the given data source or data sink.
         */
        public static final String CONNECT = "connect";

        /**
         * Delete rows from tables.
         */
        public static final String DELETE = "delete";

        /**
         * Ability to Execute the Procedure object.
         */
        public static final String EXECUTE = "execute";

        /**
         * Insert access to tables.
         */
        public static final String INSERT = "insert";

        /**
         * Ability to read, list and use the object.
         */
        public static final String READ = "read";

        /**
         * Update access to the table.
         */
        public static final String UPDATE = "update";

        /**
         * Access to administer users and roles that do not have system_admin
         * permission.
         */
        public static final String USER_ADMIN = "user_admin";

        /**
         * Access to write, change and delete objects.
         */
        public static final String WRITE = "write";

        private Permission() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Options#COLUMNS COLUMNS}:
     * Apply table security to these columns, comma-separated.  The default
     * value is ''.
     *         <li> {@link
     * com.gpudb.protocol.GrantPermissionRequest.Options#FILTER_EXPRESSION
     * FILTER_EXPRESSION}: Optional filter expression to apply to this grant.
     * Only rows that match the filter will be affected.  The default value is
     * ''.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Apply table security to these columns, comma-separated.  The default
         * value is ''.
         */
        public static final String COLUMNS = "columns";

        /**
         * Optional filter expression to apply to this grant.  Only rows that
         * match the filter will be affected.  The default value is ''.
         */
        public static final String FILTER_EXPRESSION = "filter_expression";

        private Options() {  }
    }

    private String principal;
    private String object;
    private String objectType;
    private String permission;
    private Map<String, String> options;


    /**
     * Constructs a GrantPermissionRequest object with default parameters.
     */
    public GrantPermissionRequest() {
        principal = "";
        object = "";
        objectType = "";
        permission = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a GrantPermissionRequest object with the specified
     * parameters.
     * 
     * @param principal  Name of the user or role for which the permission is
     *                   being granted.  Must be an existing user or role.  The
     *                   default value is ''.
     * @param object  Name of object permission is being granted to.  It is
     *                recommended to use a fully-qualified name when possible.
     * @param objectType  The type of object being granted to
     *                    Supported values:
     *                    <ul>
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#CREDENTIAL
     *                    CREDENTIAL}: Credential
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASINK
     *                    DATASINK}: Data Sink
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASOURCE
     *                    DATASOURCE}: Data Source
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#DIRECTORY
     *                    DIRECTORY}: KIFS File Directory
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#GRAPH
     *                    GRAPH}: A Graph object
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#PROC
     *                    PROC}: UDF Procedure
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#SCHEMA
     *                    SCHEMA}: Schema
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#SQL_PROC
     *                    SQL_PROC}: SQL Procedure
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#SYSTEM
     *                    SYSTEM}: System-level access
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE
     *                    TABLE}: Database Table
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE_MONITOR
     *                    TABLE_MONITOR}: Table monitor
     *                    </ul>
     * @param permission  Permission being granted.
     *                    Supported values:
     *                    <ul>
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#ADMIN
     *                    ADMIN}: Full read/write and administrative access on
     *                    the object.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#CONNECT
     *                    CONNECT}: Connect access on the given data source or
     *                    data sink.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#DELETE
     *                    DELETE}: Delete rows from tables.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#EXECUTE
     *                    EXECUTE}: Ability to Execute the Procedure object.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#INSERT
     *                    INSERT}: Insert access to tables.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#READ
     *                    READ}: Ability to read, list and use the object.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#UPDATE
     *                    UPDATE}: Update access to the table.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#USER_ADMIN
     *                    USER_ADMIN}: Access to administer users and roles
     *                    that do not have system_admin permission.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#WRITE
     *                    WRITE}: Access to write, change and delete objects.
     *                    </ul>
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.GrantPermissionRequest.Options#COLUMNS
     *                 COLUMNS}: Apply table security to these columns,
     *                 comma-separated.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GrantPermissionRequest.Options#FILTER_EXPRESSION
     *                 FILTER_EXPRESSION}: Optional filter expression to apply
     *                 to this grant.  Only rows that match the filter will be
     *                 affected.  The default value is ''.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public GrantPermissionRequest(String principal, String object, String objectType, String permission, Map<String, String> options) {
        this.principal = (principal == null) ? "" : principal;
        this.object = (object == null) ? "" : object;
        this.objectType = (objectType == null) ? "" : objectType;
        this.permission = (permission == null) ? "" : permission;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the user or role for which the permission is being
     *         granted.  Must be an existing user or role.  The default value
     *         is ''.
     * 
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * 
     * @param principal  Name of the user or role for which the permission is
     *                   being granted.  Must be an existing user or role.  The
     *                   default value is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionRequest setPrincipal(String principal) {
        this.principal = (principal == null) ? "" : principal;
        return this;
    }

    /**
     * 
     * @return Name of object permission is being granted to.  It is
     *         recommended to use a fully-qualified name when possible.
     * 
     */
    public String getObject() {
        return object;
    }

    /**
     * 
     * @param object  Name of object permission is being granted to.  It is
     *                recommended to use a fully-qualified name when possible.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionRequest setObject(String object) {
        this.object = (object == null) ? "" : object;
        return this;
    }

    /**
     * 
     * @return The type of object being granted to
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#CREDENTIAL
     *         CREDENTIAL}: Credential
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASINK
     *         DATASINK}: Data Sink
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASOURCE
     *         DATASOURCE}: Data Source
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#DIRECTORY
     *         DIRECTORY}: KIFS File Directory
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#GRAPH
     *         GRAPH}: A Graph object
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#PROC PROC}:
     *         UDF Procedure
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#SCHEMA
     *         SCHEMA}: Schema
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#SQL_PROC
     *         SQL_PROC}: SQL Procedure
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#SYSTEM
     *         SYSTEM}: System-level access
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE
     *         TABLE}: Database Table
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE_MONITOR
     *         TABLE_MONITOR}: Table monitor
     *         </ul>
     * 
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * 
     * @param objectType  The type of object being granted to
     *                    Supported values:
     *                    <ul>
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#CREDENTIAL
     *                    CREDENTIAL}: Credential
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASINK
     *                    DATASINK}: Data Sink
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#DATASOURCE
     *                    DATASOURCE}: Data Source
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#DIRECTORY
     *                    DIRECTORY}: KIFS File Directory
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#GRAPH
     *                    GRAPH}: A Graph object
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#PROC
     *                    PROC}: UDF Procedure
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#SCHEMA
     *                    SCHEMA}: Schema
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#SQL_PROC
     *                    SQL_PROC}: SQL Procedure
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#SYSTEM
     *                    SYSTEM}: System-level access
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE
     *                    TABLE}: Database Table
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.ObjectType#TABLE_MONITOR
     *                    TABLE_MONITOR}: Table monitor
     *                    </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionRequest setObjectType(String objectType) {
        this.objectType = (objectType == null) ? "" : objectType;
        return this;
    }

    /**
     * 
     * @return Permission being granted.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#ADMIN
     *         ADMIN}: Full read/write and administrative access on the object.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#CONNECT
     *         CONNECT}: Connect access on the given data source or data sink.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#DELETE
     *         DELETE}: Delete rows from tables.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#EXECUTE
     *         EXECUTE}: Ability to Execute the Procedure object.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#INSERT
     *         INSERT}: Insert access to tables.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#READ READ}:
     *         Ability to read, list and use the object.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#UPDATE
     *         UPDATE}: Update access to the table.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#USER_ADMIN
     *         USER_ADMIN}: Access to administer users and roles that do not
     *         have system_admin permission.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Permission#WRITE
     *         WRITE}: Access to write, change and delete objects.
     *         </ul>
     * 
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 
     * @param permission  Permission being granted.
     *                    Supported values:
     *                    <ul>
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#ADMIN
     *                    ADMIN}: Full read/write and administrative access on
     *                    the object.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#CONNECT
     *                    CONNECT}: Connect access on the given data source or
     *                    data sink.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#DELETE
     *                    DELETE}: Delete rows from tables.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#EXECUTE
     *                    EXECUTE}: Ability to Execute the Procedure object.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#INSERT
     *                    INSERT}: Insert access to tables.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#READ
     *                    READ}: Ability to read, list and use the object.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#UPDATE
     *                    UPDATE}: Update access to the table.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#USER_ADMIN
     *                    USER_ADMIN}: Access to administer users and roles
     *                    that do not have system_admin permission.
     *                            <li> {@link
     *                    com.gpudb.protocol.GrantPermissionRequest.Permission#WRITE
     *                    WRITE}: Access to write, change and delete objects.
     *                    </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionRequest setPermission(String permission) {
        this.permission = (permission == null) ? "" : permission;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Options#COLUMNS
     *         COLUMNS}: Apply table security to these columns,
     *         comma-separated.  The default value is ''.
     *                 <li> {@link
     *         com.gpudb.protocol.GrantPermissionRequest.Options#FILTER_EXPRESSION
     *         FILTER_EXPRESSION}: Optional filter expression to apply to this
     *         grant.  Only rows that match the filter will be affected.  The
     *         default value is ''.
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
     *                 com.gpudb.protocol.GrantPermissionRequest.Options#COLUMNS
     *                 COLUMNS}: Apply table security to these columns,
     *                 comma-separated.  The default value is ''.
     *                         <li> {@link
     *                 com.gpudb.protocol.GrantPermissionRequest.Options#FILTER_EXPRESSION
     *                 FILTER_EXPRESSION}: Optional filter expression to apply
     *                 to this grant.  Only rows that match the filter will be
     *                 affected.  The default value is ''.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionRequest setOptions(Map<String, String> options) {
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
                return this.principal;

            case 1:
                return this.object;

            case 2:
                return this.objectType;

            case 3:
                return this.permission;

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
                this.principal = (String)value;
                break;

            case 1:
                this.object = (String)value;
                break;

            case 2:
                this.objectType = (String)value;
                break;

            case 3:
                this.permission = (String)value;
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

        GrantPermissionRequest that = (GrantPermissionRequest)obj;

        return ( this.principal.equals( that.principal )
                 && this.object.equals( that.object )
                 && this.objectType.equals( that.objectType )
                 && this.permission.equals( that.permission )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "principal" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.principal ) );
        builder.append( ", " );
        builder.append( gd.toString( "object" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.object ) );
        builder.append( ", " );
        builder.append( gd.toString( "objectType" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.objectType ) );
        builder.append( ", " );
        builder.append( gd.toString( "permission" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.permission ) );
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
        hashCode = (31 * hashCode) + this.principal.hashCode();
        hashCode = (31 * hashCode) + this.object.hashCode();
        hashCode = (31 * hashCode) + this.objectType.hashCode();
        hashCode = (31 * hashCode) + this.permission.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

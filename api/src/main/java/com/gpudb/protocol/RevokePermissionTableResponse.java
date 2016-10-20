/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link com.gpudb.GPUdb#revokePermissionTable(RevokePermissionTableRequest)}.
 */
public class RevokePermissionTableResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("RevokePermissionTableResponse")
            .namespace("com.gpudb")
            .fields()
                .name("name").type().stringType().noDefault()
                .name("permission").type().stringType().noDefault()
                .name("tableName").type().stringType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }

    private String name;
    private String permission;
    private String tableName;


    /**
     * Constructs a RevokePermissionTableResponse object with default parameters.
     */
    public RevokePermissionTableResponse() {
    }

    /**
     * 
     * @return Value of {@code name}.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name  Value of {@code name}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RevokePermissionTableResponse setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * 
     * @return Value of {@code permission}.
     * 
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 
     * @param permission  Value of {@code permission}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RevokePermissionTableResponse setPermission(String permission) {
        this.permission = (permission == null) ? "" : permission;
        return this;
    }

    /**
     * 
     * @return Value of {@code tableName}.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Value of {@code tableName}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public RevokePermissionTableResponse setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                return this.tableName;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                this.tableName = (String)value;
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

        RevokePermissionTableResponse that = (RevokePermissionTableResponse)obj;

        return ( this.name.equals( that.name )
                 && this.permission.equals( that.permission )
                 && this.tableName.equals( that.tableName ) );
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
        builder.append( gd.toString( "tableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableName ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.permission.hashCode();
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        return hashCode;
    }

}

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
 * A set of results returned by {@link
 * com.gpudb.GPUdb#grantPermission(GrantPermissionRequest)}.
 */
public class GrantPermissionResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("GrantPermissionResponse")
            .namespace("com.gpudb")
            .fields()
                .name("principal").type().stringType().noDefault()
                .name("object").type().stringType().noDefault()
                .name("objectType").type().stringType().noDefault()
                .name("permission").type().stringType().noDefault()
                .name("info").type().map().values().stringType().noDefault()
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

    private String principal;
    private String object;
    private String objectType;
    private String permission;
    private Map<String, String> info;


    /**
     * Constructs a GrantPermissionResponse object with default parameters.
     */
    public GrantPermissionResponse() {
    }

    /**
     * 
     * @return Value of {@code principal}.
     * 
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * 
     * @param principal  Value of {@code principal}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionResponse setPrincipal(String principal) {
        this.principal = (principal == null) ? "" : principal;
        return this;
    }

    /**
     * 
     * @return Value of {@code object}.
     * 
     */
    public String getObject() {
        return object;
    }

    /**
     * 
     * @param object  Value of {@code object}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionResponse setObject(String object) {
        this.object = (object == null) ? "" : object;
        return this;
    }

    /**
     * 
     * @return Value of {@code objectType}.
     * 
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * 
     * @param objectType  Value of {@code objectType}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionResponse setObjectType(String objectType) {
        this.objectType = (objectType == null) ? "" : objectType;
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
    public GrantPermissionResponse setPermission(String permission) {
        this.permission = (permission == null) ? "" : permission;
        return this;
    }

    /**
     * 
     * @return Additional information.
     * 
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * 
     * @param info  Additional information.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
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
                return this.info;

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
                this.info = (Map<String, String>)value;
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

        GrantPermissionResponse that = (GrantPermissionResponse)obj;

        return ( this.principal.equals( that.principal )
                 && this.object.equals( that.object )
                 && this.objectType.equals( that.objectType )
                 && this.permission.equals( that.permission )
                 && this.info.equals( that.info ) );
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
        builder.append( gd.toString( "info" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.info ) );
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
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}
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
 * com.gpudb.GPUdb#grantPermissionDirectory(GrantPermissionDirectoryRequest)}.
 */
public class GrantPermissionDirectoryResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("GrantPermissionDirectoryResponse")
            .namespace("com.gpudb")
            .fields()
                .name("name").type().stringType().noDefault()
                .name("permission").type().stringType().noDefault()
                .name("directoryName").type().stringType().noDefault()
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

    private String name;
    private String permission;
    private String directoryName;
    private Map<String, String> info;


    /**
     * Constructs a GrantPermissionDirectoryResponse object with default
     * parameters.
     */
    public GrantPermissionDirectoryResponse() {
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
    public GrantPermissionDirectoryResponse setName(String name) {
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
    public GrantPermissionDirectoryResponse setPermission(String permission) {
        this.permission = (permission == null) ? "" : permission;
        return this;
    }

    /**
     * 
     * @return Value of {@code directoryName}.
     * 
     */
    public String getDirectoryName() {
        return directoryName;
    }

    /**
     * 
     * @param directoryName  Value of {@code directoryName}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public GrantPermissionDirectoryResponse setDirectoryName(String directoryName) {
        this.directoryName = (directoryName == null) ? "" : directoryName;
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
    public GrantPermissionDirectoryResponse setInfo(Map<String, String> info) {
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
                return this.name;

            case 1:
                return this.permission;

            case 2:
                return this.directoryName;

            case 3:
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
                this.name = (String)value;
                break;

            case 1:
                this.permission = (String)value;
                break;

            case 2:
                this.directoryName = (String)value;
                break;

            case 3:
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

        GrantPermissionDirectoryResponse that = (GrantPermissionDirectoryResponse)obj;

        return ( this.name.equals( that.name )
                 && this.permission.equals( that.permission )
                 && this.directoryName.equals( that.directoryName )
                 && this.info.equals( that.info ) );
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
        builder.append( gd.toString( "directoryName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.directoryName ) );
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.permission.hashCode();
        hashCode = (31 * hashCode) + this.directoryName.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

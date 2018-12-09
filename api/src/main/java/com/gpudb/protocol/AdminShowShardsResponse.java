/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of results returned by {@link
 * com.gpudb.GPUdb#adminShowShards(AdminShowShardsRequest)}.
 */
public class AdminShowShardsResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminShowShardsResponse")
            .namespace("com.gpudb")
            .fields()
                .name("version").type().longType().noDefault()
                .name("rank").type().array().items().intType().noDefault()
                .name("tom").type().array().items().intType().noDefault()
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

    private long version;
    private List<Integer> rank;
    private List<Integer> tom;
    private Map<String, String> info;


    /**
     * Constructs an AdminShowShardsResponse object with default parameters.
     */
    public AdminShowShardsResponse() {
    }

    /**
     * 
     * @return Current shard array version number.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * 
     * @param version  Current shard array version number.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminShowShardsResponse setVersion(long version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * @return Array of ranks indexed by the shard number.
     * 
     */
    public List<Integer> getRank() {
        return rank;
    }

    /**
     * 
     * @param rank  Array of ranks indexed by the shard number.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminShowShardsResponse setRank(List<Integer> rank) {
        this.rank = (rank == null) ? new ArrayList<Integer>() : rank;
        return this;
    }

    /**
     * 
     * @return Array of toms to which the corresponding shard belongs.
     * 
     */
    public List<Integer> getTom() {
        return tom;
    }

    /**
     * 
     * @param tom  Array of toms to which the corresponding shard belongs.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminShowShardsResponse setTom(List<Integer> tom) {
        this.tom = (tom == null) ? new ArrayList<Integer>() : tom;
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
    public AdminShowShardsResponse setInfo(Map<String, String> info) {
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
                return this.version;

            case 1:
                return this.rank;

            case 2:
                return this.tom;

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
                this.version = (Long)value;
                break;

            case 1:
                this.rank = (List<Integer>)value;
                break;

            case 2:
                this.tom = (List<Integer>)value;
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

        AdminShowShardsResponse that = (AdminShowShardsResponse)obj;

        return ( ( this.version == that.version )
                 && this.rank.equals( that.rank )
                 && this.tom.equals( that.tom )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "version" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.version ) );
        builder.append( ", " );
        builder.append( gd.toString( "rank" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.rank ) );
        builder.append( ", " );
        builder.append( gd.toString( "tom" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tom ) );
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
        hashCode = (31 * hashCode) + ((Long)this.version).hashCode();
        hashCode = (31 * hashCode) + this.rank.hashCode();
        hashCode = (31 * hashCode) + this.tom.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

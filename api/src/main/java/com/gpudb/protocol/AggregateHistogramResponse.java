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
 * com.gpudb.GPUdb#aggregateHistogram(AggregateHistogramRequest)}.
 */
public class AggregateHistogramResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateHistogramResponse")
            .namespace("com.gpudb")
            .fields()
                .name("counts").type().array().items().doubleType().noDefault()
                .name("start").type().doubleType().noDefault()
                .name("end").type().doubleType().noDefault()
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

    private List<Double> counts;
    private double start;
    private double end;
    private Map<String, String> info;


    /**
     * Constructs an AggregateHistogramResponse object with default parameters.
     */
    public AggregateHistogramResponse() {
    }

    /**
     * 
     * @return The array of calculated values that represents the histogram
     *         data points.
     * 
     */
    public List<Double> getCounts() {
        return counts;
    }

    /**
     * 
     * @param counts  The array of calculated values that represents the
     *                histogram data points.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateHistogramResponse setCounts(List<Double> counts) {
        this.counts = (counts == null) ? new ArrayList<Double>() : counts;
        return this;
    }

    /**
     * 
     * @return Value of {@code start}.
     * 
     */
    public double getStart() {
        return start;
    }

    /**
     * 
     * @param start  Value of {@code start}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateHistogramResponse setStart(double start) {
        this.start = start;
        return this;
    }

    /**
     * 
     * @return Value of {@code end}.
     * 
     */
    public double getEnd() {
        return end;
    }

    /**
     * 
     * @param end  Value of {@code end}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateHistogramResponse setEnd(double end) {
        this.end = end;
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
    public AggregateHistogramResponse setInfo(Map<String, String> info) {
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
                return this.counts;

            case 1:
                return this.start;

            case 2:
                return this.end;

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
                this.counts = (List<Double>)value;
                break;

            case 1:
                this.start = (Double)value;
                break;

            case 2:
                this.end = (Double)value;
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

        AggregateHistogramResponse that = (AggregateHistogramResponse)obj;

        return ( this.counts.equals( that.counts )
                 && ( (Double)this.start ).equals( (Double)that.start )
                 && ( (Double)this.end ).equals( (Double)that.end )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "counts" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.counts ) );
        builder.append( ", " );
        builder.append( gd.toString( "start" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.start ) );
        builder.append( ", " );
        builder.append( gd.toString( "end" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.end ) );
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
        hashCode = (31 * hashCode) + this.counts.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.start).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.end).hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

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
 * com.gpudb.GPUdb#alterResourceGroup(AlterResourceGroupRequest)}.
 * <p>
 * Alters the properties of an exisiting resource group to facilitate resource
 * management.
 */
public class AlterResourceGroupRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AlterResourceGroupRequest")
            .namespace("com.gpudb")
            .fields()
                .name("name").type().stringType().noDefault()
                .name("tierAttributes").type().map().values().map().values().stringType().noDefault()
                .name("ranking").type().stringType().noDefault()
                .name("adjoiningResourceGroup").type().stringType().noDefault()
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
     * Optional map containing tier names and their respective attribute group
     * limits.  The only valid attribute limit that can be set is max_memory
     * (in bytes) for the VRAM & RAM tiers.
     * <p>
     * For instance, to set max VRAM capacity to 1GB and max RAM capacity to
     * 10GB, use:  {'VRAM':{'max_memory':'1000000000'},
     * 'RAM':{'max_memory':'10000000000'}}
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     * MAX_MEMORY}: Maximum amount of memory usable in the given tier at one
     * time for this group.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code tierAttributes}.
     */
    public static final class TierAttributes {

        /**
         * Maximum amount of memory usable in the given tier at one time for
         * this group.
         */
        public static final String MAX_MEMORY = "max_memory";

        private TierAttributes() {  }
    }


    /**
     * If the resource group ranking is to be updated, this indicates the
     * relative ranking among existing resource groups where this resource
     * group will be moved; leave blank if not changing the ranking.  When
     * using {@code before} or {@code after}, specify which resource group this
     * one will be inserted before or after in {@code adjoiningResourceGroup}.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     * EMPTY_STRING}
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Ranking#FIRST FIRST}
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Ranking#LAST LAST}
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Ranking#BEFORE BEFORE}
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Ranking#AFTER AFTER}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     * EMPTY_STRING}.
     * A set of string constants for the parameter {@code ranking}.
     */
    public static final class Ranking {
        public static final String EMPTY_STRING = "";
        public static final String FIRST = "first";
        public static final String LAST = "last";
        public static final String BEFORE = "before";
        public static final String AFTER = "after";

        private Ranking() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     * MAX_CPU_CONCURRENCY}: Maximum number of simultaneous threads that will
     * be used to execute a request for this group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_DATA MAX_DATA}:
     * Maximum amount of cumulative ram usage regardless of tier status for
     * this group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     * MAX_SCHEDULING_PRIORITY}: Maximum priority of a scheduled task for this
     * group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     * MAX_TIER_PRIORITY}: Maximum priority of a tiered object for this group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     * IS_DEFAULT_GROUP}: If {@code true}, this request applies to the global
     * default resource group. It is an error for this field to be {@code true}
     * when the {@code name} field is also populated.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Maximum number of simultaneous threads that will be used to execute
         * a request for this group.
         */
        public static final String MAX_CPU_CONCURRENCY = "max_cpu_concurrency";

        /**
         * Maximum amount of cumulative ram usage regardless of tier status for
         * this group.
         */
        public static final String MAX_DATA = "max_data";

        /**
         * Maximum priority of a scheduled task for this group.
         */
        public static final String MAX_SCHEDULING_PRIORITY = "max_scheduling_priority";

        /**
         * Maximum priority of a tiered object for this group.
         */
        public static final String MAX_TIER_PRIORITY = "max_tier_priority";

        /**
         * If {@code true}, this request applies to the global default resource
         * group. It is an error for this field to be {@code true} when the
         * {@code name} field is also populated.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}.
         */
        public static final String IS_DEFAULT_GROUP = "is_default_group";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String name;
    private Map<String, Map<String, String>> tierAttributes;
    private String ranking;
    private String adjoiningResourceGroup;
    private Map<String, String> options;


    /**
     * Constructs an AlterResourceGroupRequest object with default parameters.
     */
    public AlterResourceGroupRequest() {
        name = "";
        tierAttributes = new LinkedHashMap<>();
        ranking = "";
        adjoiningResourceGroup = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AlterResourceGroupRequest object with the specified
     * parameters.
     * 
     * @param name  Name of the group to be altered. Must be an existing
     *              resource group name.
     * @param tierAttributes  Optional map containing tier names and their
     *                        respective attribute group limits.  The only
     *                        valid attribute limit that can be set is
     *                        max_memory (in bytes) for the VRAM & RAM tiers.
     *                        For instance, to set max VRAM capacity to 1GB and
     *                        max RAM capacity to 10GB, use:
     *                        {'VRAM':{'max_memory':'1000000000'},
     *                        'RAM':{'max_memory':'10000000000'}}
     *                        <ul>
     *                                <li> {@link
     *                        com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     *                        MAX_MEMORY}: Maximum amount of memory usable in
     *                        the given tier at one time for this group.
     *                        </ul>
     *                        The default value is an empty {@link Map}.
     * @param ranking  If the resource group ranking is to be updated, this
     *                 indicates the relative ranking among existing resource
     *                 groups where this resource group will be moved; leave
     *                 blank if not changing the ranking.  When using {@code
     *                 before} or {@code after}, specify which resource group
     *                 this one will be inserted before or after in {@code
     *                 adjoiningResourceGroup}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     *                 EMPTY_STRING}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#FIRST
     *                 FIRST}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#LAST
     *                 LAST}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#BEFORE
     *                 BEFORE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#AFTER
     *                 AFTER}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     *                 EMPTY_STRING}.
     * @param adjoiningResourceGroup  If {@code ranking} is {@code before} or
     *                                {@code after}, this field indicates the
     *                                resource group before or after which the
     *                                current group will be placed; otherwise,
     *                                leave blank.  The default value is ''.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     *                 MAX_CPU_CONCURRENCY}: Maximum number of simultaneous
     *                 threads that will be used to execute a request for this
     *                 group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_DATA
     *                 MAX_DATA}: Maximum amount of cumulative ram usage
     *                 regardless of tier status for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     *                 MAX_SCHEDULING_PRIORITY}: Maximum priority of a
     *                 scheduled task for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     *                 MAX_TIER_PRIORITY}: Maximum priority of a tiered object
     *                 for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     *                 IS_DEFAULT_GROUP}: If {@code true}, this request applies
     *                 to the global default resource group. It is an error for
     *                 this field to be {@code true} when the {@code name}
     *                 field is also populated.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public AlterResourceGroupRequest(String name, Map<String, Map<String, String>> tierAttributes, String ranking, String adjoiningResourceGroup, Map<String, String> options) {
        this.name = (name == null) ? "" : name;
        this.tierAttributes = (tierAttributes == null) ? new LinkedHashMap<String, Map<String, String>>() : tierAttributes;
        this.ranking = (ranking == null) ? "" : ranking;
        this.adjoiningResourceGroup = (adjoiningResourceGroup == null) ? "" : adjoiningResourceGroup;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the group to be altered. Must be an existing resource
     *         group name.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name  Name of the group to be altered. Must be an existing
     *              resource group name.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * 
     * @return Optional map containing tier names and their respective
     *         attribute group limits.  The only valid attribute limit that can
     *         be set is max_memory (in bytes) for the VRAM & RAM tiers.
     *         For instance, to set max VRAM capacity to 1GB and max RAM
     *         capacity to 10GB, use:  {'VRAM':{'max_memory':'1000000000'},
     *         'RAM':{'max_memory':'10000000000'}}
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     *         MAX_MEMORY}: Maximum amount of memory usable in the given tier
     *         at one time for this group.
     *         </ul>
     *         The default value is an empty {@link Map}.
     * 
     */
    public Map<String, Map<String, String>> getTierAttributes() {
        return tierAttributes;
    }

    /**
     * 
     * @param tierAttributes  Optional map containing tier names and their
     *                        respective attribute group limits.  The only
     *                        valid attribute limit that can be set is
     *                        max_memory (in bytes) for the VRAM & RAM tiers.
     *                        For instance, to set max VRAM capacity to 1GB and
     *                        max RAM capacity to 10GB, use:
     *                        {'VRAM':{'max_memory':'1000000000'},
     *                        'RAM':{'max_memory':'10000000000'}}
     *                        <ul>
     *                                <li> {@link
     *                        com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     *                        MAX_MEMORY}: Maximum amount of memory usable in
     *                        the given tier at one time for this group.
     *                        </ul>
     *                        The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setTierAttributes(Map<String, Map<String, String>> tierAttributes) {
        this.tierAttributes = (tierAttributes == null) ? new LinkedHashMap<String, Map<String, String>>() : tierAttributes;
        return this;
    }

    /**
     * 
     * @return If the resource group ranking is to be updated, this indicates
     *         the relative ranking among existing resource groups where this
     *         resource group will be moved; leave blank if not changing the
     *         ranking.  When using {@code before} or {@code after}, specify
     *         which resource group this one will be inserted before or after
     *         in {@code adjoiningResourceGroup}.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     *         EMPTY_STRING}
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Ranking#FIRST
     *         FIRST}
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Ranking#LAST LAST}
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Ranking#BEFORE
     *         BEFORE}
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Ranking#AFTER
     *         AFTER}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     *         EMPTY_STRING}.
     * 
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * 
     * @param ranking  If the resource group ranking is to be updated, this
     *                 indicates the relative ranking among existing resource
     *                 groups where this resource group will be moved; leave
     *                 blank if not changing the ranking.  When using {@code
     *                 before} or {@code after}, specify which resource group
     *                 this one will be inserted before or after in {@code
     *                 adjoiningResourceGroup}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     *                 EMPTY_STRING}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#FIRST
     *                 FIRST}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#LAST
     *                 LAST}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#BEFORE
     *                 BEFORE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#AFTER
     *                 AFTER}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Ranking#EMPTY_STRING
     *                 EMPTY_STRING}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setRanking(String ranking) {
        this.ranking = (ranking == null) ? "" : ranking;
        return this;
    }

    /**
     * 
     * @return If {@code ranking} is {@code before} or {@code after}, this
     *         field indicates the resource group before or after which the
     *         current group will be placed; otherwise, leave blank.  The
     *         default value is ''.
     * 
     */
    public String getAdjoiningResourceGroup() {
        return adjoiningResourceGroup;
    }

    /**
     * 
     * @param adjoiningResourceGroup  If {@code ranking} is {@code before} or
     *                                {@code after}, this field indicates the
     *                                resource group before or after which the
     *                                current group will be placed; otherwise,
     *                                leave blank.  The default value is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setAdjoiningResourceGroup(String adjoiningResourceGroup) {
        this.adjoiningResourceGroup = (adjoiningResourceGroup == null) ? "" : adjoiningResourceGroup;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     *         MAX_CPU_CONCURRENCY}: Maximum number of simultaneous threads
     *         that will be used to execute a request for this group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_DATA
     *         MAX_DATA}: Maximum amount of cumulative ram usage regardless of
     *         tier status for this group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     *         MAX_SCHEDULING_PRIORITY}: Maximum priority of a scheduled task
     *         for this group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     *         MAX_TIER_PRIORITY}: Maximum priority of a tiered object for this
     *         group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     *         IS_DEFAULT_GROUP}: If {@code true}, this request applies to the
     *         global default resource group. It is an error for this field to
     *         be {@code true} when the {@code name} field is also populated.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *         FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *         FALSE}.
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
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     *                 MAX_CPU_CONCURRENCY}: Maximum number of simultaneous
     *                 threads that will be used to execute a request for this
     *                 group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_DATA
     *                 MAX_DATA}: Maximum amount of cumulative ram usage
     *                 regardless of tier status for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     *                 MAX_SCHEDULING_PRIORITY}: Maximum priority of a
     *                 scheduled task for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     *                 MAX_TIER_PRIORITY}: Maximum priority of a tiered object
     *                 for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     *                 IS_DEFAULT_GROUP}: If {@code true}, this request applies
     *                 to the global default resource group. It is an error for
     *                 this field to be {@code true} when the {@code name}
     *                 field is also populated.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setOptions(Map<String, String> options) {
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
                return this.tierAttributes;

            case 2:
                return this.ranking;

            case 3:
                return this.adjoiningResourceGroup;

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
                this.name = (String)value;
                break;

            case 1:
                this.tierAttributes = (Map<String, Map<String, String>>)value;
                break;

            case 2:
                this.ranking = (String)value;
                break;

            case 3:
                this.adjoiningResourceGroup = (String)value;
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

        AlterResourceGroupRequest that = (AlterResourceGroupRequest)obj;

        return ( this.name.equals( that.name )
                 && this.tierAttributes.equals( that.tierAttributes )
                 && this.ranking.equals( that.ranking )
                 && this.adjoiningResourceGroup.equals( that.adjoiningResourceGroup )
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
        builder.append( gd.toString( "tierAttributes" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tierAttributes ) );
        builder.append( ", " );
        builder.append( gd.toString( "ranking" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.ranking ) );
        builder.append( ", " );
        builder.append( gd.toString( "adjoiningResourceGroup" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.adjoiningResourceGroup ) );
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
        hashCode = (31 * hashCode) + this.tierAttributes.hashCode();
        hashCode = (31 * hashCode) + this.ranking.hashCode();
        hashCode = (31 * hashCode) + this.adjoiningResourceGroup.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

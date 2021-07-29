/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb;


/**
 * Column properties used for GPUdb types.
 */
public final class ColumnProperty {

    /**
     * Default property for all numeric and string type columns; makes the
     * column available for GPU queries.
     */
    public static final String DATA = "data";

    /**
     * Valid only for select 'string' columns. Enables full text search--see <a
     * href="../../../../../concepts/full_text_search/" target="_top">Full Text
     * Search</a> for details and applicable string column types. Can be set
     * independently of {@code data} and {@code store_only}.
     */
    public static final String TEXT_SEARCH = "text_search";

    /**
     * Persist the column value but do not make it available to queries (e.g.
     * {@link GPUdb#filter(FilterRequest)})-i.e. it is mutually exclusive to
     * the {@code data} property. Any 'bytes' type column must have a {@code
     * store_only} property. This property reduces system memory usage.
     */
    public static final String STORE_ONLY = "store_only";

    /**
     * Works in conjunction with the {@code data} property for string columns.
     * This property reduces system disk usage by disabling reverse string
     * lookups. Queries like {@link GPUdb#filter(FilterRequest)}, {@link
     * GPUdb#filterByList(FilterByListRequest)}, and {@link
     * GPUdb#filterByValue(FilterByValueRequest)} work as usual but {@link
     * GPUdb#aggregateUniqueRaw(AggregateUniqueRequest)} and {@link
     * GPUdb#aggregateGroupByRaw(AggregateGroupByRequest)} are not allowed on
     * columns with this property.
     */
    public static final String DISK_OPTIMIZED = "disk_optimized";

    /**
     * Valid only for 'long' columns. Indicates that this field represents a
     * timestamp and will be provided in milliseconds since the Unix epoch:
     * 00:00:00 Jan 1 1970.  Dates represented by a timestamp must fall between
     * the year 1000 and the year 2900.
     */
    public static final String TIMESTAMP = "timestamp";

    /**
     * Valid only for 'string' columns.  It represents an unsigned long integer
     * data type. The string can only be interpreted as an unsigned long data
     * type with minimum value of zero, and maximum value of
     * 18446744073709551615.
     */
    public static final String ULONG = "ulong";

    /**
     * Valid only for 'string' columns.  It represents an uuid data type.
     * Internally, it is stored as a 128-bit integer.
     */
    public static final String UUID = "uuid";

    /**
     * Valid only for 'string' columns.  It represents a SQL type NUMERIC(19,
     * 4) data type.  There can be up to 15 digits before the decimal point and
     * up to four digits in the fractional part.  The value can be positive or
     * negative (indicated by a minus sign at the beginning).  This property is
     * mutually exclusive with the {@code text_search} property.
     */
    public static final String DECIMAL = "decimal";

    /**
     * Valid only for 'string' columns.  Indicates that this field represents a
     * date and will be provided in the format 'YYYY-MM-DD'.  The allowable
     * range is 1000-01-01 through 2900-01-01.  This property is mutually
     * exclusive with the {@code text_search} property.
     */
    public static final String DATE = "date";

    /**
     * Valid only for 'string' columns.  Indicates that this field represents a
     * time-of-day and will be provided in the format 'HH:MM:SS.mmm'.  The
     * allowable range is 00:00:00.000 through 23:59:59.999.  This property is
     * mutually exclusive with the {@code text_search} property.
     */
    public static final String TIME = "time";

    /**
     * Valid only for 'string' columns.  Indicates that this field represents a
     * datetime and will be provided in the format 'YYYY-MM-DD HH:MM:SS.mmm'.
     * The allowable range is 1000-01-01 00:00:00.000 through 2900-01-01
     * 23:59:59.999.  This property is mutually exclusive with the {@code
     * text_search} property.
     */
    public static final String DATETIME = "datetime";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 1
     * character.
     */
    public static final String CHAR1 = "char1";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 2
     * characters.
     */
    public static final String CHAR2 = "char2";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 4
     * characters.
     */
    public static final String CHAR4 = "char4";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 8
     * characters.
     */
    public static final String CHAR8 = "char8";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 16
     * characters.
     */
    public static final String CHAR16 = "char16";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 32
     * characters.
     */
    public static final String CHAR32 = "char32";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 64
     * characters.
     */
    public static final String CHAR64 = "char64";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 128
     * characters.
     */
    public static final String CHAR128 = "char128";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns. Strings with this property must be no longer than 256
     * characters.
     */
    public static final String CHAR256 = "char256";

    /**
     * This property provides optimized memory and query performance for int
     * columns. Ints with this property must be between -128 and +127
     * (inclusive)
     */
    public static final String INT8 = "int8";

    /**
     * This property provides optimized memory and query performance for int
     * columns. Ints with this property must be between -32768 and +32767
     * (inclusive)
     */
    public static final String INT16 = "int16";

    /**
     * This property provides optimized memory, disk and query performance for
     * string columns representing IPv4 addresses (i.e. 192.168.1.1). Strings
     * with this property must be of the form: A.B.C.D where A, B, C and D are
     * in the range of 0-255.
     */
    public static final String IPV4 = "ipv4";

    /**
     * Valid only for 'string' and 'bytes' columns. Indicates that this field
     * contains geospatial geometry objects in Well-Known Text (WKT) or
     * Well-Known Binary (WKB) format.
     */
    public static final String WKT = "wkt";

    /**
     * This property indicates that this column will be part of (or the entire)
     * <a href="../../../../../concepts/tables/#primary-keys"
     * target="_top">primary key</a>.
     */
    public static final String PRIMARY_KEY = "primary_key";

    /**
     * This property indicates that this column will be part of (or the entire)
     * <a href="../../../../../concepts/tables/#shard-keys" target="_top">shard
     * key</a>.
     */
    public static final String SHARD_KEY = "shard_key";

    /**
     * This property indicates that this column is nullable.  However, setting
     * this property is insufficient for making the column nullable.  The user
     * must declare the type of the column as a union between its regular type
     * and 'null' in the avro schema for the record type in {@code
     * typeDefinition}.  For example, if a column is of type integer and is
     * nullable, then the entry for the column in the avro schema must be:
     * ['int', 'null'].
     * <p>
     * The C++, C#, Java, and Python APIs have built-in convenience for
     * bypassing setting the avro schema by hand.  For those languages, one can
     * use this property as usual and not have to worry about the avro schema
     * for the record.
     */
    public static final String NULLABLE = "nullable";

    /**
     * This property indicates that this column should be <a
     * href="../../../../../concepts/dictionary_encoding/"
     * target="_top">dictionary encoded</a>. It can only be used in conjunction
     * with restricted string (charN), int, long or date columns. Dictionary
     * encoding is best for columns where the cardinality (the number of unique
     * values) is expected to be low. This property can save a large amount of
     * memory.
     */
    public static final String DICT = "dict";

    /**
     * For 'date', 'time', 'datetime', or 'timestamp' column types, replace
     * empty strings and invalid timestamps with 'NOW()' upon insert.
     */
    public static final String INIT_WITH_NOW = "init_with_now";

    /**
     * For 'uuid' type,  repalce empty strings and invalid uuid values with
     * new_uuid()' upon insert.
     */
    public static final String INIT_WITH_UUID = "init_with_uuid";

    private ColumnProperty() {  }
}


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
 * A set of parameters for {@link
 * com.gpudb.GPUdb#downloadFiles(DownloadFilesRequest)}.
 * <p>
 * Downloads one or more files from <a href="../../../../../../tools/kifs/"
 * target="_top">KiFS</a>.
 */
public class DownloadFilesRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("DownloadFilesRequest")
            .namespace("com.gpudb")
            .fields()
                .name("fileNames").type().array().items().stringType().noDefault()
                .name("readOffsets").type().array().items().longType().noDefault()
                .name("readLengths").type().array().items().longType().noDefault()
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
     * com.gpudb.protocol.DownloadFilesRequest.Options#FILE_ENCODING
     * FILE_ENCODING}: Encoding to be applied to the output file data. When
     * using JSON serialization it is recommended to specify this as {@code
     * base64}.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.DownloadFilesRequest.Options#BASE64 BASE64}: Apply
     * base64 encoding to the output file data.
     *         <li> {@link com.gpudb.protocol.DownloadFilesRequest.Options#NONE
     * NONE}: Do not apply any encoding to the output file data.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.DownloadFilesRequest.Options#NONE NONE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Encoding to be applied to the output file data. When using JSON
         * serialization it is recommended to specify this as {@code base64}.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.DownloadFilesRequest.Options#BASE64 BASE64}:
         * Apply base64 encoding to the output file data.
         *         <li> {@link
         * com.gpudb.protocol.DownloadFilesRequest.Options#NONE NONE}: Do not
         * apply any encoding to the output file data.
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.DownloadFilesRequest.Options#NONE NONE}.
         */
        public static final String FILE_ENCODING = "file_encoding";

        /**
         * Apply base64 encoding to the output file data.
         */
        public static final String BASE64 = "base64";

        /**
         * Do not apply any encoding to the output file data.
         */
        public static final String NONE = "none";

        private Options() {  }
    }

    private List<String> fileNames;
    private List<Long> readOffsets;
    private List<Long> readLengths;
    private Map<String, String> options;


    /**
     * Constructs a DownloadFilesRequest object with default parameters.
     */
    public DownloadFilesRequest() {
        fileNames = new ArrayList<>();
        readOffsets = new ArrayList<>();
        readLengths = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a DownloadFilesRequest object with the specified parameters.
     * 
     * @param fileNames  An array of the file names to download from KiFS. The
     *                   full path must be provided.
     * @param readOffsets  An array of starting byte offsets from which to read
     *                     each
     *                     respective file in {@code fileNames}. Must either be
     *                     empty or the same length
     *                     as {@code fileNames}. If empty, files are downloaded
     *                     in their entirety. If not
     *                     empty, {@code readLengths} must also not be empty.
     * @param readLengths  Array of number of bytes to read from each
     *                     respective file
     *                     in {@code fileNames}. Must either be empty or the
     *                     same length as
     *                     {@code fileNames}. If empty, files are downloaded in
     *                     their entirety. If not
     *                     empty, {@code readOffsets} must also not be empty.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#FILE_ENCODING
     *                 FILE_ENCODING}: Encoding to be applied to the output
     *                 file data. When using JSON serialization it is
     *                 recommended to specify this as {@code base64}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#BASE64
     *                 BASE64}: Apply base64 encoding to the output file data.
     *                         <li> {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#NONE
     *                 NONE}: Do not apply any encoding to the output file
     *                 data.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#NONE
     *                 NONE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public DownloadFilesRequest(List<String> fileNames, List<Long> readOffsets, List<Long> readLengths, Map<String, String> options) {
        this.fileNames = (fileNames == null) ? new ArrayList<String>() : fileNames;
        this.readOffsets = (readOffsets == null) ? new ArrayList<Long>() : readOffsets;
        this.readLengths = (readLengths == null) ? new ArrayList<Long>() : readLengths;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return An array of the file names to download from KiFS. The full path
     *         must be provided.
     * 
     */
    public List<String> getFileNames() {
        return fileNames;
    }

    /**
     * 
     * @param fileNames  An array of the file names to download from KiFS. The
     *                   full path must be provided.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesRequest setFileNames(List<String> fileNames) {
        this.fileNames = (fileNames == null) ? new ArrayList<String>() : fileNames;
        return this;
    }

    /**
     * 
     * @return An array of starting byte offsets from which to read each
     *         respective file in {@code fileNames}. Must either be empty or
     *         the same length
     *         as {@code fileNames}. If empty, files are downloaded in their
     *         entirety. If not
     *         empty, {@code readLengths} must also not be empty.
     * 
     */
    public List<Long> getReadOffsets() {
        return readOffsets;
    }

    /**
     * 
     * @param readOffsets  An array of starting byte offsets from which to read
     *                     each
     *                     respective file in {@code fileNames}. Must either be
     *                     empty or the same length
     *                     as {@code fileNames}. If empty, files are downloaded
     *                     in their entirety. If not
     *                     empty, {@code readLengths} must also not be empty.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesRequest setReadOffsets(List<Long> readOffsets) {
        this.readOffsets = (readOffsets == null) ? new ArrayList<Long>() : readOffsets;
        return this;
    }

    /**
     * 
     * @return Array of number of bytes to read from each respective file
     *         in {@code fileNames}. Must either be empty or the same length as
     *         {@code fileNames}. If empty, files are downloaded in their
     *         entirety. If not
     *         empty, {@code readOffsets} must also not be empty.
     * 
     */
    public List<Long> getReadLengths() {
        return readLengths;
    }

    /**
     * 
     * @param readLengths  Array of number of bytes to read from each
     *                     respective file
     *                     in {@code fileNames}. Must either be empty or the
     *                     same length as
     *                     {@code fileNames}. If empty, files are downloaded in
     *                     their entirety. If not
     *                     empty, {@code readOffsets} must also not be empty.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesRequest setReadLengths(List<Long> readLengths) {
        this.readLengths = (readLengths == null) ? new ArrayList<Long>() : readLengths;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.DownloadFilesRequest.Options#FILE_ENCODING
     *         FILE_ENCODING}: Encoding to be applied to the output file data.
     *         When using JSON serialization it is recommended to specify this
     *         as {@code base64}.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.DownloadFilesRequest.Options#BASE64 BASE64}:
     *         Apply base64 encoding to the output file data.
     *                 <li> {@link
     *         com.gpudb.protocol.DownloadFilesRequest.Options#NONE NONE}: Do
     *         not apply any encoding to the output file data.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.DownloadFilesRequest.Options#NONE NONE}.
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
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#FILE_ENCODING
     *                 FILE_ENCODING}: Encoding to be applied to the output
     *                 file data. When using JSON serialization it is
     *                 recommended to specify this as {@code base64}.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#BASE64
     *                 BASE64}: Apply base64 encoding to the output file data.
     *                         <li> {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#NONE
     *                 NONE}: Do not apply any encoding to the output file
     *                 data.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.DownloadFilesRequest.Options#NONE
     *                 NONE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public DownloadFilesRequest setOptions(Map<String, String> options) {
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
                return this.fileNames;

            case 1:
                return this.readOffsets;

            case 2:
                return this.readLengths;

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
                this.fileNames = (List<String>)value;
                break;

            case 1:
                this.readOffsets = (List<Long>)value;
                break;

            case 2:
                this.readLengths = (List<Long>)value;
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

        DownloadFilesRequest that = (DownloadFilesRequest)obj;

        return ( this.fileNames.equals( that.fileNames )
                 && this.readOffsets.equals( that.readOffsets )
                 && this.readLengths.equals( that.readLengths )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "fileNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.fileNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "readOffsets" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.readOffsets ) );
        builder.append( ", " );
        builder.append( gd.toString( "readLengths" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.readLengths ) );
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
        hashCode = (31 * hashCode) + this.fileNames.hashCode();
        hashCode = (31 * hashCode) + this.readOffsets.hashCode();
        hashCode = (31 * hashCode) + this.readLengths.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.nio.ByteBuffer;
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
 * com.gpudb.GPUdb#uploadFiles(UploadFilesRequest)}.
 * <p>
 * Uploads one or more files to <a href="../../../../../../tools/kifs/"
 * target="_top">KiFS</a>. There are
 * two methods for uploading files: load files in their entirety, or load files
 * in
 * parts. The latter is recommeded for files of approximately 60 MB or larger.
 * <p>
 * To upload files in their entirety, populate {@code fileNames} with the file
 * names to upload into on KiFS, and their respective byte content in
 * {@code fileData}.
 * <p>
 * Multiple steps are involved when uploading in multiple parts. Only one file
 * at a
 * time can be uploaded in this manner. A user-provided UUID is utilized to tie
 * all
 * the upload steps together for a given file.  To upload a file in multiple
 * parts:
 * <p>
 * 1. Provide the file name in {@code fileNames}, the UUID in
 *    the {@code multipart_upload_uuid} key in {@code options}, and
 *    a {@code multipart_operation} value of
 *    {@code init}.
 * 2. Upload one or more parts by providing the file name, the part data
 *    in {@code fileData}, the UUID, a {@code multipart_operation}
 *    value of {@code upload_part}, and
 *    the part number in the {@code multipart_upload_part_number}.
 *    The part numbers must start at 1 and increase incrementally.
 *    Parts may not be uploaded out of order.
 * 3. Complete the upload by providing the file name, the UUID, and a
 *    {@code multipart_operation} value of
 *    {@code complete}.
 * <p>
 * Multipart uploads in progress may be canceled by providing the file name,
 * the
 * UUID, and a {@code multipart_operation} value of
 * {@code cancel}.  If an new upload is
 * initialized with a different UUID for an existing upload in progress, the
 * pre-existing upload is automatically canceled in favor of the new upload.
 * <p>
 * The multipart upload must be completed for the file to be usable in KiFS.
 * Information about multipart uploads in progress is available in
 * {@link com.gpudb.GPUdb#showFiles(ShowFilesRequest)}.
 * <p>
 * File data may be pre-encoded using base64 encoding. This should be indicated
 * using the {@code file_encoding} option, and is recommended when
 * using JSON serialization.
 * <p>
 * Each file path must reside in a top-level KiFS directory, i.e. one of the
 * directories listed in {@link
 * com.gpudb.GPUdb#showDirectories(ShowDirectoriesRequest)}. The user must have
 * write
 * permission on the directory. Nested directories are permitted in file name
 * paths. Directories are deliniated with the directory separator of '/'.  For
 * example, given the file path '/a/b/c/d.txt', 'a' must be a KiFS directory.
 * <p>
 * These characters are allowed in file name paths: letters, numbers, spaces,
 * the
 * path delimiter of '/', and the characters: '.' '-' ':' '[' ']' '(' ')' '#'
 * '='.
 */
public class UploadFilesRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("UploadFilesRequest")
            .namespace("com.gpudb")
            .fields()
                .name("fileNames").type().array().items().stringType().noDefault()
                .name("fileData").type().array().items().bytesType().noDefault()
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
     * com.gpudb.protocol.UploadFilesRequest.Options#FILE_ENCODING
     * FILE_ENCODING}: Encoding that has been applied to the uploaded
     * file data. When using JSON serialization it is recommended to utilize
     * {@code base64}. The caller is responsible
     * for encoding the data provided in this payload
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#BASE64
     * BASE64}: Specifies that the file data being uploaded has been base64
     * encoded.
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#NONE
     * NONE}: The uploaded file data has not been encoded.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}.
     *         <li> {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_OPERATION
     * MULTIPART_OPERATION}: Multipart upload operation to perform
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#NONE
     * NONE}: Default, indicates this is not a multipart upload
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#INIT
     * INIT}: Initialize a multipart file upload
     *         <li> {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#UPLOAD_PART UPLOAD_PART}:
     * Uploads a part of the specified multipart file upload
     *         <li> {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#COMPLETE COMPLETE}:
     * Complete the specified multipart file upload
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#CANCEL
     * CANCEL}: Cancel the specified multipart file upload
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}.
     *         <li> {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_UUID
     * MULTIPART_UPLOAD_UUID}: UUID to uniquely identify a multipart upload
     *         <li> {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_PART_NUMBER
     * MULTIPART_UPLOAD_PART_NUMBER}: Incremental part number for each part in
     * a
     * multipart upload. Part numbers start at 1, increment by 1, and must be
     * uploaded
     * sequentially
     *         <li> {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#DELETE_IF_EXISTS
     * DELETE_IF_EXISTS}: If {@code true},
     * any existing files specified in {@code fileNames} will be deleted prior
     * to start of upload.
     * Otherwise the file is replaced once the upload completes.  Rollback of
     * the original file is
     * no longer possible if the upload is cancelled, aborted or fails if the
     * file was deleted beforehand.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#TRUE
     * TRUE}
     *         <li> {@link com.gpudb.protocol.UploadFilesRequest.Options#FALSE
     * FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.UploadFilesRequest.Options#FALSE FALSE}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Encoding that has been applied to the uploaded
         * file data. When using JSON serialization it is recommended to
         * utilize
         * {@code base64}. The caller is responsible
         * for encoding the data provided in this payload
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#BASE64 BASE64}:
         * Specifies that the file data being uploaded has been base64 encoded.
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}: The
         * uploaded file data has not been encoded.
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}.
         */
        public static final String FILE_ENCODING = "file_encoding";

        /**
         * Specifies that the file data being uploaded has been base64 encoded.
         */
        public static final String BASE64 = "base64";

        /**
         * Default, indicates this is not a multipart upload
         */
        public static final String NONE = "none";

        /**
         * Multipart upload operation to perform
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}: Default,
         * indicates this is not a multipart upload
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#INIT INIT}: Initialize
         * a multipart file upload
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#UPLOAD_PART
         * UPLOAD_PART}: Uploads a part of the specified multipart file upload
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#COMPLETE COMPLETE}:
         * Complete the specified multipart file upload
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#CANCEL CANCEL}: Cancel
         * the specified multipart file upload
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}.
         */
        public static final String MULTIPART_OPERATION = "multipart_operation";

        /**
         * Initialize a multipart file upload
         */
        public static final String INIT = "init";

        /**
         * Uploads a part of the specified multipart file upload
         */
        public static final String UPLOAD_PART = "upload_part";

        /**
         * Complete the specified multipart file upload
         */
        public static final String COMPLETE = "complete";

        /**
         * Cancel the specified multipart file upload
         */
        public static final String CANCEL = "cancel";

        /**
         * UUID to uniquely identify a multipart upload
         */
        public static final String MULTIPART_UPLOAD_UUID = "multipart_upload_uuid";

        /**
         * Incremental part number for each part in a
         * multipart upload. Part numbers start at 1, increment by 1, and must
         * be uploaded
         * sequentially
         */
        public static final String MULTIPART_UPLOAD_PART_NUMBER = "multipart_upload_part_number";

        /**
         * If {@code true},
         * any existing files specified in {@code fileNames} will be deleted
         * prior to start of upload.
         * Otherwise the file is replaced once the upload completes.  Rollback
         * of the original file is
         * no longer possible if the upload is cancelled, aborted or fails if
         * the file was deleted beforehand.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.UploadFilesRequest.Options#FALSE FALSE}.
         */
        public static final String DELETE_IF_EXISTS = "delete_if_exists";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private List<String> fileNames;
    private List<ByteBuffer> fileData;
    private Map<String, String> options;


    /**
     * Constructs an UploadFilesRequest object with default parameters.
     */
    public UploadFilesRequest() {
        fileNames = new ArrayList<>();
        fileData = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an UploadFilesRequest object with the specified parameters.
     * 
     * @param fileNames  An array of full file name paths to be used for the
     *                   files
     *                   uploaded to KiFS. File names may have any number of
     *                   nested directories in their
     *                   paths, but the top-level directory must be an existing
     *                   KiFS directory. Each file
     *                   must reside in or under a top-level directory. A full
     *                   file name path cannot be
     *                   larger than 1024 characters.
     * @param fileData  File data for the files being uploaded, for the
     *                  respective files in {@code fileNames}.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#FILE_ENCODING
     *                 FILE_ENCODING}: Encoding that has been applied to the
     *                 uploaded
     *                 file data. When using JSON serialization it is
     *                 recommended to utilize
     *                 {@code base64}. The caller is responsible
     *                 for encoding the data provided in this payload
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#BASE64
     *                 BASE64}: Specifies that the file data being uploaded has
     *                 been base64 encoded.
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}: The uploaded file data has not been encoded.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_OPERATION
     *                 MULTIPART_OPERATION}: Multipart upload operation to
     *                 perform
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}: Default, indicates this is not a multipart upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#INIT
     *                 INIT}: Initialize a multipart file upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#UPLOAD_PART
     *                 UPLOAD_PART}: Uploads a part of the specified multipart
     *                 file upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#COMPLETE
     *                 COMPLETE}: Complete the specified multipart file upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#CANCEL
     *                 CANCEL}: Cancel the specified multipart file upload
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_UUID
     *                 MULTIPART_UPLOAD_UUID}: UUID to uniquely identify a
     *                 multipart upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_PART_NUMBER
     *                 MULTIPART_UPLOAD_PART_NUMBER}: Incremental part number
     *                 for each part in a
     *                 multipart upload. Part numbers start at 1, increment by
     *                 1, and must be uploaded
     *                 sequentially
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#DELETE_IF_EXISTS
     *                 DELETE_IF_EXISTS}: If {@code true},
     *                 any existing files specified in {@code fileNames} will
     *                 be deleted prior to start of upload.
     *                 Otherwise the file is replaced once the upload
     *                 completes.  Rollback of the original file is
     *                 no longer possible if the upload is cancelled, aborted
     *                 or fails if the file was deleted beforehand.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public UploadFilesRequest(List<String> fileNames, List<ByteBuffer> fileData, Map<String, String> options) {
        this.fileNames = (fileNames == null) ? new ArrayList<String>() : fileNames;
        this.fileData = (fileData == null) ? new ArrayList<ByteBuffer>() : fileData;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return An array of full file name paths to be used for the files
     *         uploaded to KiFS. File names may have any number of nested
     *         directories in their
     *         paths, but the top-level directory must be an existing KiFS
     *         directory. Each file
     *         must reside in or under a top-level directory. A full file name
     *         path cannot be
     *         larger than 1024 characters.
     * 
     */
    public List<String> getFileNames() {
        return fileNames;
    }

    /**
     * 
     * @param fileNames  An array of full file name paths to be used for the
     *                   files
     *                   uploaded to KiFS. File names may have any number of
     *                   nested directories in their
     *                   paths, but the top-level directory must be an existing
     *                   KiFS directory. Each file
     *                   must reside in or under a top-level directory. A full
     *                   file name path cannot be
     *                   larger than 1024 characters.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UploadFilesRequest setFileNames(List<String> fileNames) {
        this.fileNames = (fileNames == null) ? new ArrayList<String>() : fileNames;
        return this;
    }

    /**
     * 
     * @return File data for the files being uploaded, for the respective files
     *         in {@code fileNames}.
     * 
     */
    public List<ByteBuffer> getFileData() {
        return fileData;
    }

    /**
     * 
     * @param fileData  File data for the files being uploaded, for the
     *                  respective files in {@code fileNames}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UploadFilesRequest setFileData(List<ByteBuffer> fileData) {
        this.fileData = (fileData == null) ? new ArrayList<ByteBuffer>() : fileData;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#FILE_ENCODING
     *         FILE_ENCODING}: Encoding that has been applied to the uploaded
     *         file data. When using JSON serialization it is recommended to
     *         utilize
     *         {@code base64}. The caller is responsible
     *         for encoding the data provided in this payload
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#BASE64 BASE64}:
     *         Specifies that the file data being uploaded has been base64
     *         encoded.
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}: The
     *         uploaded file data has not been encoded.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}.
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_OPERATION
     *         MULTIPART_OPERATION}: Multipart upload operation to perform
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}:
     *         Default, indicates this is not a multipart upload
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#INIT INIT}:
     *         Initialize a multipart file upload
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#UPLOAD_PART
     *         UPLOAD_PART}: Uploads a part of the specified multipart file
     *         upload
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#COMPLETE
     *         COMPLETE}: Complete the specified multipart file upload
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#CANCEL CANCEL}:
     *         Cancel the specified multipart file upload
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#NONE NONE}.
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_UUID
     *         MULTIPART_UPLOAD_UUID}: UUID to uniquely identify a multipart
     *         upload
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_PART_NUMBER
     *         MULTIPART_UPLOAD_PART_NUMBER}: Incremental part number for each
     *         part in a
     *         multipart upload. Part numbers start at 1, increment by 1, and
     *         must be uploaded
     *         sequentially
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#DELETE_IF_EXISTS
     *         DELETE_IF_EXISTS}: If {@code true},
     *         any existing files specified in {@code fileNames} will be
     *         deleted prior to start of upload.
     *         Otherwise the file is replaced once the upload completes.
     *         Rollback of the original file is
     *         no longer possible if the upload is cancelled, aborted or fails
     *         if the file was deleted beforehand.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.UploadFilesRequest.Options#FALSE FALSE}.
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
     *                 com.gpudb.protocol.UploadFilesRequest.Options#FILE_ENCODING
     *                 FILE_ENCODING}: Encoding that has been applied to the
     *                 uploaded
     *                 file data. When using JSON serialization it is
     *                 recommended to utilize
     *                 {@code base64}. The caller is responsible
     *                 for encoding the data provided in this payload
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#BASE64
     *                 BASE64}: Specifies that the file data being uploaded has
     *                 been base64 encoded.
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}: The uploaded file data has not been encoded.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_OPERATION
     *                 MULTIPART_OPERATION}: Multipart upload operation to
     *                 perform
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}: Default, indicates this is not a multipart upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#INIT
     *                 INIT}: Initialize a multipart file upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#UPLOAD_PART
     *                 UPLOAD_PART}: Uploads a part of the specified multipart
     *                 file upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#COMPLETE
     *                 COMPLETE}: Complete the specified multipart file upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#CANCEL
     *                 CANCEL}: Cancel the specified multipart file upload
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#NONE
     *                 NONE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_UUID
     *                 MULTIPART_UPLOAD_UUID}: UUID to uniquely identify a
     *                 multipart upload
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#MULTIPART_UPLOAD_PART_NUMBER
     *                 MULTIPART_UPLOAD_PART_NUMBER}: Incremental part number
     *                 for each part in a
     *                 multipart upload. Part numbers start at 1, increment by
     *                 1, and must be uploaded
     *                 sequentially
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#DELETE_IF_EXISTS
     *                 DELETE_IF_EXISTS}: If {@code true},
     *                 any existing files specified in {@code fileNames} will
     *                 be deleted prior to start of upload.
     *                 Otherwise the file is replaced once the upload
     *                 completes.  Rollback of the original file is
     *                 no longer possible if the upload is cancelled, aborted
     *                 or fails if the file was deleted beforehand.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#TRUE TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.UploadFilesRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public UploadFilesRequest setOptions(Map<String, String> options) {
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
                return this.fileData;

            case 2:
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
                this.fileData = (List<ByteBuffer>)value;
                break;

            case 2:
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

        UploadFilesRequest that = (UploadFilesRequest)obj;

        return ( this.fileNames.equals( that.fileNames )
                 && this.fileData.equals( that.fileData )
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
        builder.append( gd.toString( "fileData" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.fileData ) );
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
        hashCode = (31 * hashCode) + this.fileData.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

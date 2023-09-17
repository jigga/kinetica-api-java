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
 * com.gpudb.GPUdb#createProc(CreateProcRequest)}.
 * <p>
 * Creates an instance (proc) of the
 * <a href="../../../../../../concepts/udf/" target="_top">user-defined
 * functions</a> (UDF) specified by the
 * given command, options, and files, and makes it available for execution.
 */
public class CreateProcRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateProcRequest")
            .namespace("com.gpudb")
            .fields()
                .name("procName").type().stringType().noDefault()
                .name("executionMode").type().stringType().noDefault()
                .name("files").type().map().values().bytesType().noDefault()
                .name("command").type().stringType().noDefault()
                .name("args").type().array().items().stringType().noDefault()
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
     * The execution mode of the proc.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     * DISTRIBUTED}: Input table data will be divided into data
     * segments that are distributed across all nodes in the cluster, and the
     * proc
     * command will be invoked once per data segment in parallel. Output table
     * data
     * from each invocation will be saved to the same node as the corresponding
     * input
     * data.
     *         <li> {@link
     * com.gpudb.protocol.CreateProcRequest.ExecutionMode#NONDISTRIBUTED
     * NONDISTRIBUTED}: The proc command will be invoked only once per
     * execution, and will not have direct access to any tables named as input
     * or
     * output table parameters in the call to {@link
     * com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.  It will,
     * however, be able to access the database using native API calls.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     * DISTRIBUTED}.
     * A set of string constants for the parameter {@code executionMode}.
     */
    public static final class ExecutionMode {

        /**
         * Input table data will be divided into data
         * segments that are distributed across all nodes in the cluster, and
         * the proc
         * command will be invoked once per data segment in parallel. Output
         * table data
         * from each invocation will be saved to the same node as the
         * corresponding input
         * data.
         */
        public static final String DISTRIBUTED = "distributed";

        /**
         * The proc command will be invoked only once per
         * execution, and will not have direct access to any tables named as
         * input or
         * output table parameters in the call to {@link
         * com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.  It will,
         * however, be able to access the database using native API calls.
         */
        public static final String NONDISTRIBUTED = "nondistributed";

        private ExecutionMode() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateProcRequest.Options#MAX_CONCURRENCY_PER_NODE
     * MAX_CONCURRENCY_PER_NODE}: The maximum number of concurrent instances of
     * the proc that will be executed per node. 0 allows unlimited concurrency.
     * The default value is '0'.
     *         <li> {@link
     * com.gpudb.protocol.CreateProcRequest.Options#SET_ENVIRONMENT
     * SET_ENVIRONMENT}: A python environment to use when executing the proc.
     * Must be an existing environment, else an error will be returned.  The
     * default value is ''.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * The maximum number of concurrent instances of the proc that will be
         * executed per node. 0 allows unlimited concurrency.  The default
         * value is '0'.
         */
        public static final String MAX_CONCURRENCY_PER_NODE = "max_concurrency_per_node";

        /**
         * A python environment to use when executing the proc. Must be an
         * existing environment, else an error will be returned.  The default
         * value is ''.
         */
        public static final String SET_ENVIRONMENT = "set_environment";

        private Options() {  }
    }

    private String procName;
    private String executionMode;
    private Map<String, ByteBuffer> files;
    private String command;
    private List<String> args;
    private Map<String, String> options;


    /**
     * Constructs a CreateProcRequest object with default parameters.
     */
    public CreateProcRequest() {
        procName = "";
        executionMode = "";
        files = new LinkedHashMap<>();
        command = "";
        args = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateProcRequest object with the specified parameters.
     * 
     * @param procName  Name of the proc to be created. Must not be the name of
     *                  a currently existing proc.
     * @param executionMode  The execution mode of the proc.
     *                       Supported values:
     *                       <ul>
     *                               <li> {@link
     *                       com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     *                       DISTRIBUTED}: Input table data will be divided
     *                       into data
     *                       segments that are distributed across all nodes in
     *                       the cluster, and the proc
     *                       command will be invoked once per data segment in
     *                       parallel. Output table data
     *                       from each invocation will be saved to the same
     *                       node as the corresponding input
     *                       data.
     *                               <li> {@link
     *                       com.gpudb.protocol.CreateProcRequest.ExecutionMode#NONDISTRIBUTED
     *                       NONDISTRIBUTED}: The proc command will be invoked
     *                       only once per
     *                       execution, and will not have direct access to any
     *                       tables named as input or
     *                       output table parameters in the call to {@link
     *                       com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.
     *                       It will,
     *                       however, be able to access the database using
     *                       native API calls.
     *                       </ul>
     *                       The default value is {@link
     *                       com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     *                       DISTRIBUTED}.
     * @param files  A map of the files that make up the proc. The keys of the
     *               map are file names, and the values are the binary contents
     *               of the files. The
     *               file names may include subdirectory names (e.g.
     *               'subdir/file') but must not
     *               resolve to a directory above the root for the proc.
     *               Files may be loaded from existing files in KiFS. Those
     *               file names should be
     *               prefixed with the uri kifs:// and the values in the map
     *               should be empty.  The default value is an empty {@link
     *               Map}.
     * @param command  The command (excluding arguments) that will be invoked
     *                 when
     *                 the proc is executed. It will be invoked from the
     *                 directory containing the proc
     *                 {@code files} and may be any command that can be
     *                 resolved from that directory.
     *                 It need not refer to a file actually in that directory;
     *                 for example, it could be
     *                 'java' if the proc is a Java application; however, any
     *                 necessary external
     *                 programs must be preinstalled on every database node. If
     *                 the command refers to a
     *                 file in that directory, it must be preceded with './' as
     *                 per Linux convention.
     *                 If not specified, and exactly one file is provided in
     *                 {@code files}, that file
     *                 will be invoked.  The default value is ''.
     * @param args  An array of command-line arguments that will be passed to
     *              {@code command} when the proc is executed.  The default
     *              value is an empty {@link List}.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateProcRequest.Options#MAX_CONCURRENCY_PER_NODE
     *                 MAX_CONCURRENCY_PER_NODE}: The maximum number of
     *                 concurrent instances of the proc that will be executed
     *                 per node. 0 allows unlimited concurrency.  The default
     *                 value is '0'.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateProcRequest.Options#SET_ENVIRONMENT
     *                 SET_ENVIRONMENT}: A python environment to use when
     *                 executing the proc. Must be an existing environment,
     *                 else an error will be returned.  The default value is
     *                 ''.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public CreateProcRequest(String procName, String executionMode, Map<String, ByteBuffer> files, String command, List<String> args, Map<String, String> options) {
        this.procName = (procName == null) ? "" : procName;
        this.executionMode = (executionMode == null) ? "" : executionMode;
        this.files = (files == null) ? new LinkedHashMap<String, ByteBuffer>() : files;
        this.command = (command == null) ? "" : command;
        this.args = (args == null) ? new ArrayList<String>() : args;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the proc to be created. Must not be the name of a
     *         currently existing proc.
     * 
     */
    public String getProcName() {
        return procName;
    }

    /**
     * 
     * @param procName  Name of the proc to be created. Must not be the name of
     *                  a currently existing proc.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateProcRequest setProcName(String procName) {
        this.procName = (procName == null) ? "" : procName;
        return this;
    }

    /**
     * 
     * @return The execution mode of the proc.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     *         DISTRIBUTED}: Input table data will be divided into data
     *         segments that are distributed across all nodes in the cluster,
     *         and the proc
     *         command will be invoked once per data segment in parallel.
     *         Output table data
     *         from each invocation will be saved to the same node as the
     *         corresponding input
     *         data.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateProcRequest.ExecutionMode#NONDISTRIBUTED
     *         NONDISTRIBUTED}: The proc command will be invoked only once per
     *         execution, and will not have direct access to any tables named
     *         as input or
     *         output table parameters in the call to {@link
     *         com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.  It will,
     *         however, be able to access the database using native API calls.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     *         DISTRIBUTED}.
     * 
     */
    public String getExecutionMode() {
        return executionMode;
    }

    /**
     * 
     * @param executionMode  The execution mode of the proc.
     *                       Supported values:
     *                       <ul>
     *                               <li> {@link
     *                       com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     *                       DISTRIBUTED}: Input table data will be divided
     *                       into data
     *                       segments that are distributed across all nodes in
     *                       the cluster, and the proc
     *                       command will be invoked once per data segment in
     *                       parallel. Output table data
     *                       from each invocation will be saved to the same
     *                       node as the corresponding input
     *                       data.
     *                               <li> {@link
     *                       com.gpudb.protocol.CreateProcRequest.ExecutionMode#NONDISTRIBUTED
     *                       NONDISTRIBUTED}: The proc command will be invoked
     *                       only once per
     *                       execution, and will not have direct access to any
     *                       tables named as input or
     *                       output table parameters in the call to {@link
     *                       com.gpudb.GPUdb#executeProc(ExecuteProcRequest)}.
     *                       It will,
     *                       however, be able to access the database using
     *                       native API calls.
     *                       </ul>
     *                       The default value is {@link
     *                       com.gpudb.protocol.CreateProcRequest.ExecutionMode#DISTRIBUTED
     *                       DISTRIBUTED}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateProcRequest setExecutionMode(String executionMode) {
        this.executionMode = (executionMode == null) ? "" : executionMode;
        return this;
    }

    /**
     * 
     * @return A map of the files that make up the proc. The keys of the
     *         map are file names, and the values are the binary contents of
     *         the files. The
     *         file names may include subdirectory names (e.g. 'subdir/file')
     *         but must not
     *         resolve to a directory above the root for the proc.
     *         Files may be loaded from existing files in KiFS. Those file
     *         names should be
     *         prefixed with the uri kifs:// and the values in the map should
     *         be empty.  The default value is an empty {@link Map}.
     * 
     */
    public Map<String, ByteBuffer> getFiles() {
        return files;
    }

    /**
     * 
     * @param files  A map of the files that make up the proc. The keys of the
     *               map are file names, and the values are the binary contents
     *               of the files. The
     *               file names may include subdirectory names (e.g.
     *               'subdir/file') but must not
     *               resolve to a directory above the root for the proc.
     *               Files may be loaded from existing files in KiFS. Those
     *               file names should be
     *               prefixed with the uri kifs:// and the values in the map
     *               should be empty.  The default value is an empty {@link
     *               Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateProcRequest setFiles(Map<String, ByteBuffer> files) {
        this.files = (files == null) ? new LinkedHashMap<String, ByteBuffer>() : files;
        return this;
    }

    /**
     * 
     * @return The command (excluding arguments) that will be invoked when
     *         the proc is executed. It will be invoked from the directory
     *         containing the proc
     *         {@code files} and may be any command that can be resolved from
     *         that directory.
     *         It need not refer to a file actually in that directory; for
     *         example, it could be
     *         'java' if the proc is a Java application; however, any necessary
     *         external
     *         programs must be preinstalled on every database node. If the
     *         command refers to a
     *         file in that directory, it must be preceded with './' as per
     *         Linux convention.
     *         If not specified, and exactly one file is provided in {@code
     *         files}, that file
     *         will be invoked.  The default value is ''.
     * 
     */
    public String getCommand() {
        return command;
    }

    /**
     * 
     * @param command  The command (excluding arguments) that will be invoked
     *                 when
     *                 the proc is executed. It will be invoked from the
     *                 directory containing the proc
     *                 {@code files} and may be any command that can be
     *                 resolved from that directory.
     *                 It need not refer to a file actually in that directory;
     *                 for example, it could be
     *                 'java' if the proc is a Java application; however, any
     *                 necessary external
     *                 programs must be preinstalled on every database node. If
     *                 the command refers to a
     *                 file in that directory, it must be preceded with './' as
     *                 per Linux convention.
     *                 If not specified, and exactly one file is provided in
     *                 {@code files}, that file
     *                 will be invoked.  The default value is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateProcRequest setCommand(String command) {
        this.command = (command == null) ? "" : command;
        return this;
    }

    /**
     * 
     * @return An array of command-line arguments that will be passed to {@code
     *         command} when the proc is executed.  The default value is an
     *         empty {@link List}.
     * 
     */
    public List<String> getArgs() {
        return args;
    }

    /**
     * 
     * @param args  An array of command-line arguments that will be passed to
     *              {@code command} when the proc is executed.  The default
     *              value is an empty {@link List}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateProcRequest setArgs(List<String> args) {
        this.args = (args == null) ? new ArrayList<String>() : args;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateProcRequest.Options#MAX_CONCURRENCY_PER_NODE
     *         MAX_CONCURRENCY_PER_NODE}: The maximum number of concurrent
     *         instances of the proc that will be executed per node. 0 allows
     *         unlimited concurrency.  The default value is '0'.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateProcRequest.Options#SET_ENVIRONMENT
     *         SET_ENVIRONMENT}: A python environment to use when executing the
     *         proc. Must be an existing environment, else an error will be
     *         returned.  The default value is ''.
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
     *                 com.gpudb.protocol.CreateProcRequest.Options#MAX_CONCURRENCY_PER_NODE
     *                 MAX_CONCURRENCY_PER_NODE}: The maximum number of
     *                 concurrent instances of the proc that will be executed
     *                 per node. 0 allows unlimited concurrency.  The default
     *                 value is '0'.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateProcRequest.Options#SET_ENVIRONMENT
     *                 SET_ENVIRONMENT}: A python environment to use when
     *                 executing the proc. Must be an existing environment,
     *                 else an error will be returned.  The default value is
     *                 ''.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateProcRequest setOptions(Map<String, String> options) {
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
                return this.procName;

            case 1:
                return this.executionMode;

            case 2:
                return this.files;

            case 3:
                return this.command;

            case 4:
                return this.args;

            case 5:
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
                this.procName = (String)value;
                break;

            case 1:
                this.executionMode = (String)value;
                break;

            case 2:
                this.files = (Map<String, ByteBuffer>)value;
                break;

            case 3:
                this.command = (String)value;
                break;

            case 4:
                this.args = (List<String>)value;
                break;

            case 5:
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

        CreateProcRequest that = (CreateProcRequest)obj;

        return ( this.procName.equals( that.procName )
                 && this.executionMode.equals( that.executionMode )
                 && this.files.equals( that.files )
                 && this.command.equals( that.command )
                 && this.args.equals( that.args )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "procName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.procName ) );
        builder.append( ", " );
        builder.append( gd.toString( "executionMode" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.executionMode ) );
        builder.append( ", " );
        builder.append( gd.toString( "files" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.files ) );
        builder.append( ", " );
        builder.append( gd.toString( "command" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.command ) );
        builder.append( ", " );
        builder.append( gd.toString( "args" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.args ) );
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
        hashCode = (31 * hashCode) + this.procName.hashCode();
        hashCode = (31 * hashCode) + this.executionMode.hashCode();
        hashCode = (31 * hashCode) + this.files.hashCode();
        hashCode = (31 * hashCode) + this.command.hashCode();
        hashCode = (31 * hashCode) + this.args.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

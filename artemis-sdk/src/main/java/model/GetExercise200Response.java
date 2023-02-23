/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.Attachment;
import org.openapitools.client.model.AuxiliaryRepository;
import org.openapitools.client.model.Course;
import org.openapitools.client.model.DueDateStat;
import org.openapitools.client.model.ExampleSubmission;
import org.openapitools.client.model.ExerciseGroup;
import org.openapitools.client.model.ExerciseHint;
import org.openapitools.client.model.FileUploadExercise;
import org.openapitools.client.model.GradingCriterion;
import org.openapitools.client.model.ModelingExercise;
import org.openapitools.client.model.PlagiarismCase;
import org.openapitools.client.model.Post;
import org.openapitools.client.model.ProgrammingExercise;
import org.openapitools.client.model.ProgrammingExerciseTask;
import org.openapitools.client.model.ProgrammingExerciseTestCase;
import org.openapitools.client.model.QuizBatch;
import org.openapitools.client.model.QuizExercise;
import org.openapitools.client.model.QuizPointStatistic;
import org.openapitools.client.model.QuizQuestion;
import org.openapitools.client.model.SolutionProgrammingExerciseParticipation;
import org.openapitools.client.model.StaticCodeAnalysisCategory;
import org.openapitools.client.model.StudentParticipation;
import org.openapitools.client.model.SubmissionPolicy;
import org.openapitools.client.model.Team;
import org.openapitools.client.model.TeamAssignmentConfig;
import org.openapitools.client.model.TemplateProgrammingExerciseParticipation;
import org.openapitools.client.model.TextExercise;
import org.openapitools.client.model.TutorParticipation;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class GetExercise200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetExercise200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetExercise200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetExercise200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FileUploadExercise> adapterFileUploadExercise = gson.getDelegateAdapter(this, TypeToken.get(FileUploadExercise.class));
            final TypeAdapter<ModelingExercise> adapterModelingExercise = gson.getDelegateAdapter(this, TypeToken.get(ModelingExercise.class));
            final TypeAdapter<ProgrammingExercise> adapterProgrammingExercise = gson.getDelegateAdapter(this, TypeToken.get(ProgrammingExercise.class));
            final TypeAdapter<QuizExercise> adapterQuizExercise = gson.getDelegateAdapter(this, TypeToken.get(QuizExercise.class));
            final TypeAdapter<TextExercise> adapterTextExercise = gson.getDelegateAdapter(this, TypeToken.get(TextExercise.class));

            return (TypeAdapter<T>) new TypeAdapter<GetExercise200Response>() {
                @Override
                public void write(JsonWriter out, GetExercise200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FileUploadExercise`
                    if (value.getActualInstance() instanceof FileUploadExercise) {
                        JsonObject obj = adapterFileUploadExercise.toJsonTree((FileUploadExercise)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ModelingExercise`
                    if (value.getActualInstance() instanceof ModelingExercise) {
                        JsonObject obj = adapterModelingExercise.toJsonTree((ModelingExercise)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ProgrammingExercise`
                    if (value.getActualInstance() instanceof ProgrammingExercise) {
                        JsonObject obj = adapterProgrammingExercise.toJsonTree((ProgrammingExercise)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `QuizExercise`
                    if (value.getActualInstance() instanceof QuizExercise) {
                        JsonObject obj = adapterQuizExercise.toJsonTree((QuizExercise)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TextExercise`
                    if (value.getActualInstance() instanceof TextExercise) {
                        JsonObject obj = adapterTextExercise.toJsonTree((TextExercise)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise");
                }

                @Override
                public GetExercise200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FileUploadExercise
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FileUploadExercise.validateJsonObject(jsonObject);
                        actualAdapter = adapterFileUploadExercise;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FileUploadExercise'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FileUploadExercise failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FileUploadExercise'", e);
                    }

                    // deserialize ModelingExercise
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ModelingExercise.validateJsonObject(jsonObject);
                        actualAdapter = adapterModelingExercise;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ModelingExercise'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ModelingExercise failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ModelingExercise'", e);
                    }

                    // deserialize ProgrammingExercise
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ProgrammingExercise.validateJsonObject(jsonObject);
                        actualAdapter = adapterProgrammingExercise;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ProgrammingExercise'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ProgrammingExercise failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ProgrammingExercise'", e);
                    }

                    // deserialize QuizExercise
                    try {
                        // validate the JSON object to see if any exception is thrown
                        QuizExercise.validateJsonObject(jsonObject);
                        actualAdapter = adapterQuizExercise;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'QuizExercise'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for QuizExercise failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'QuizExercise'", e);
                    }

                    // deserialize TextExercise
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TextExercise.validateJsonObject(jsonObject);
                        actualAdapter = adapterTextExercise;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TextExercise'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TextExercise failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TextExercise'", e);
                    }

                    if (match == 1) {
                        GetExercise200Response ret = new GetExercise200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetExercise200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetExercise200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public GetExercise200Response(FileUploadExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(ModelingExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(ProgrammingExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(QuizExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetExercise200Response(TextExercise o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FileUploadExercise", new GenericType<FileUploadExercise>() {
        });
        schemas.put("ModelingExercise", new GenericType<ModelingExercise>() {
        });
        schemas.put("ProgrammingExercise", new GenericType<ProgrammingExercise>() {
        });
        schemas.put("QuizExercise", new GenericType<QuizExercise>() {
        });
        schemas.put("TextExercise", new GenericType<TextExercise>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetExercise200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FileUploadExercise) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ModelingExercise) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ProgrammingExercise) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof QuizExercise) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TextExercise) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise");
    }

    /**
     * Get the actual instance, which can be the following:
     * FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise
     *
     * @return The actual instance (FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FileUploadExercise`. If the actual instance is not `FileUploadExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FileUploadExercise`
     * @throws ClassCastException if the instance is not `FileUploadExercise`
     */
    public FileUploadExercise getFileUploadExercise() throws ClassCastException {
        return (FileUploadExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ModelingExercise`. If the actual instance is not `ModelingExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ModelingExercise`
     * @throws ClassCastException if the instance is not `ModelingExercise`
     */
    public ModelingExercise getModelingExercise() throws ClassCastException {
        return (ModelingExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProgrammingExercise`. If the actual instance is not `ProgrammingExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProgrammingExercise`
     * @throws ClassCastException if the instance is not `ProgrammingExercise`
     */
    public ProgrammingExercise getProgrammingExercise() throws ClassCastException {
        return (ProgrammingExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `QuizExercise`. If the actual instance is not `QuizExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `QuizExercise`
     * @throws ClassCastException if the instance is not `QuizExercise`
     */
    public QuizExercise getQuizExercise() throws ClassCastException {
        return (QuizExercise)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TextExercise`. If the actual instance is not `TextExercise`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TextExercise`
     * @throws ClassCastException if the instance is not `TextExercise`
     */
    public TextExercise getTextExercise() throws ClassCastException {
        return (TextExercise)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetExercise200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with FileUploadExercise
    try {
      FileUploadExercise.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for FileUploadExercise failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ModelingExercise
    try {
      ModelingExercise.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ModelingExercise failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ProgrammingExercise
    try {
      ProgrammingExercise.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ProgrammingExercise failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with QuizExercise
    try {
      QuizExercise.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for QuizExercise failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TextExercise
    try {
      TextExercise.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TextExercise failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetExercise200Response with oneOf schemas: FileUploadExercise, ModelingExercise, ProgrammingExercise, QuizExercise, TextExercise. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetExercise200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetExercise200Response
  * @throws IOException if the JSON string is invalid with respect to GetExercise200Response
  */
  public static GetExercise200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetExercise200Response.class);
  }

 /**
  * Convert an instance of GetExercise200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

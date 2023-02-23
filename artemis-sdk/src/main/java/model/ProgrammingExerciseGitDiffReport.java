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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.ProgrammingExercise;
import org.openapitools.client.model.ProgrammingExerciseGitDiffEntry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ProgrammingExerciseGitDiffReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ProgrammingExerciseGitDiffReport {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PROGRAMMING_EXERCISE = "programmingExercise";
  @SerializedName(SERIALIZED_NAME_PROGRAMMING_EXERCISE)
  private ProgrammingExercise programmingExercise;

  public static final String SERIALIZED_NAME_TEMPLATE_REPOSITORY_COMMIT_HASH = "templateRepositoryCommitHash";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REPOSITORY_COMMIT_HASH)
  private String templateRepositoryCommitHash;

  public static final String SERIALIZED_NAME_SOLUTION_REPOSITORY_COMMIT_HASH = "solutionRepositoryCommitHash";
  @SerializedName(SERIALIZED_NAME_SOLUTION_REPOSITORY_COMMIT_HASH)
  private String solutionRepositoryCommitHash;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private Set<ProgrammingExerciseGitDiffEntry> entries = new LinkedHashSet<>();

  public ProgrammingExerciseGitDiffReport() {
  }

  public ProgrammingExerciseGitDiffReport id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ProgrammingExerciseGitDiffReport programmingExercise(ProgrammingExercise programmingExercise) {
    
    this.programmingExercise = programmingExercise;
    return this;
  }

   /**
   * Get programmingExercise
   * @return programmingExercise
  **/
  @javax.annotation.Nullable

  public ProgrammingExercise getProgrammingExercise() {
    return programmingExercise;
  }


  public void setProgrammingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
  }


  public ProgrammingExerciseGitDiffReport templateRepositoryCommitHash(String templateRepositoryCommitHash) {
    
    this.templateRepositoryCommitHash = templateRepositoryCommitHash;
    return this;
  }

   /**
   * Get templateRepositoryCommitHash
   * @return templateRepositoryCommitHash
  **/
  @javax.annotation.Nullable

  public String getTemplateRepositoryCommitHash() {
    return templateRepositoryCommitHash;
  }


  public void setTemplateRepositoryCommitHash(String templateRepositoryCommitHash) {
    this.templateRepositoryCommitHash = templateRepositoryCommitHash;
  }


  public ProgrammingExerciseGitDiffReport solutionRepositoryCommitHash(String solutionRepositoryCommitHash) {
    
    this.solutionRepositoryCommitHash = solutionRepositoryCommitHash;
    return this;
  }

   /**
   * Get solutionRepositoryCommitHash
   * @return solutionRepositoryCommitHash
  **/
  @javax.annotation.Nullable

  public String getSolutionRepositoryCommitHash() {
    return solutionRepositoryCommitHash;
  }


  public void setSolutionRepositoryCommitHash(String solutionRepositoryCommitHash) {
    this.solutionRepositoryCommitHash = solutionRepositoryCommitHash;
  }


  public ProgrammingExerciseGitDiffReport entries(Set<ProgrammingExerciseGitDiffEntry> entries) {
    
    this.entries = entries;
    return this;
  }

  public ProgrammingExerciseGitDiffReport addEntriesItem(ProgrammingExerciseGitDiffEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new LinkedHashSet<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable

  public Set<ProgrammingExerciseGitDiffEntry> getEntries() {
    return entries;
  }


  public void setEntries(Set<ProgrammingExerciseGitDiffEntry> entries) {
    this.entries = entries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseGitDiffReport programmingExerciseGitDiffReport = (ProgrammingExerciseGitDiffReport) o;
    return Objects.equals(this.id, programmingExerciseGitDiffReport.id) &&
        Objects.equals(this.programmingExercise, programmingExerciseGitDiffReport.programmingExercise) &&
        Objects.equals(this.templateRepositoryCommitHash, programmingExerciseGitDiffReport.templateRepositoryCommitHash) &&
        Objects.equals(this.solutionRepositoryCommitHash, programmingExerciseGitDiffReport.solutionRepositoryCommitHash) &&
        Objects.equals(this.entries, programmingExerciseGitDiffReport.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programmingExercise, templateRepositoryCommitHash, solutionRepositoryCommitHash, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseGitDiffReport {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programmingExercise: ").append(toIndentedString(programmingExercise)).append("\n");
    sb.append("    templateRepositoryCommitHash: ").append(toIndentedString(templateRepositoryCommitHash)).append("\n");
    sb.append("    solutionRepositoryCommitHash: ").append(toIndentedString(solutionRepositoryCommitHash)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("programmingExercise");
    openapiFields.add("templateRepositoryCommitHash");
    openapiFields.add("solutionRepositoryCommitHash");
    openapiFields.add("entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProgrammingExerciseGitDiffReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProgrammingExerciseGitDiffReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProgrammingExerciseGitDiffReport is not found in the empty JSON string", ProgrammingExerciseGitDiffReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProgrammingExerciseGitDiffReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProgrammingExerciseGitDiffReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `programmingExercise`
      if (jsonObj.get("programmingExercise") != null && !jsonObj.get("programmingExercise").isJsonNull()) {
        ProgrammingExercise.validateJsonObject(jsonObj.getAsJsonObject("programmingExercise"));
      }
      if ((jsonObj.get("templateRepositoryCommitHash") != null && !jsonObj.get("templateRepositoryCommitHash").isJsonNull()) && !jsonObj.get("templateRepositoryCommitHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateRepositoryCommitHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateRepositoryCommitHash").toString()));
      }
      if ((jsonObj.get("solutionRepositoryCommitHash") != null && !jsonObj.get("solutionRepositoryCommitHash").isJsonNull()) && !jsonObj.get("solutionRepositoryCommitHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionRepositoryCommitHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionRepositoryCommitHash").toString()));
      }
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            ProgrammingExerciseGitDiffEntry.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProgrammingExerciseGitDiffReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProgrammingExerciseGitDiffReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProgrammingExerciseGitDiffReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProgrammingExerciseGitDiffReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ProgrammingExerciseGitDiffReport>() {
           @Override
           public void write(JsonWriter out, ProgrammingExerciseGitDiffReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProgrammingExerciseGitDiffReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProgrammingExerciseGitDiffReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProgrammingExerciseGitDiffReport
  * @throws IOException if the JSON string is invalid with respect to ProgrammingExerciseGitDiffReport
  */
  public static ProgrammingExerciseGitDiffReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProgrammingExerciseGitDiffReport.class);
  }

 /**
  * Convert an instance of ProgrammingExerciseGitDiffReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

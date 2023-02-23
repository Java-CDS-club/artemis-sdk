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
import org.openapitools.client.model.ProgrammingExerciseSolutionEntry;

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
 * CodeHintAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class CodeHintAllOf {
  public static final String SERIALIZED_NAME_SOLUTION_ENTRIES = "solutionEntries";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ENTRIES)
  private Set<ProgrammingExerciseSolutionEntry> solutionEntries = new LinkedHashSet<>();

  public CodeHintAllOf() {
  }

  public CodeHintAllOf solutionEntries(Set<ProgrammingExerciseSolutionEntry> solutionEntries) {
    
    this.solutionEntries = solutionEntries;
    return this;
  }

  public CodeHintAllOf addSolutionEntriesItem(ProgrammingExerciseSolutionEntry solutionEntriesItem) {
    if (this.solutionEntries == null) {
      this.solutionEntries = new LinkedHashSet<>();
    }
    this.solutionEntries.add(solutionEntriesItem);
    return this;
  }

   /**
   * Get solutionEntries
   * @return solutionEntries
  **/
  @javax.annotation.Nullable

  public Set<ProgrammingExerciseSolutionEntry> getSolutionEntries() {
    return solutionEntries;
  }


  public void setSolutionEntries(Set<ProgrammingExerciseSolutionEntry> solutionEntries) {
    this.solutionEntries = solutionEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeHintAllOf codeHintAllOf = (CodeHintAllOf) o;
    return Objects.equals(this.solutionEntries, codeHintAllOf.solutionEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeHintAllOf {\n");
    sb.append("    solutionEntries: ").append(toIndentedString(solutionEntries)).append("\n");
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
    openapiFields.add("solutionEntries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CodeHintAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CodeHintAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeHintAllOf is not found in the empty JSON string", CodeHintAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CodeHintAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeHintAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("solutionEntries") != null && !jsonObj.get("solutionEntries").isJsonNull()) {
        JsonArray jsonArraysolutionEntries = jsonObj.getAsJsonArray("solutionEntries");
        if (jsonArraysolutionEntries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("solutionEntries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `solutionEntries` to be an array in the JSON string but got `%s`", jsonObj.get("solutionEntries").toString()));
          }

          // validate the optional field `solutionEntries` (array)
          for (int i = 0; i < jsonArraysolutionEntries.size(); i++) {
            ProgrammingExerciseSolutionEntry.validateJsonObject(jsonArraysolutionEntries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeHintAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeHintAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeHintAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeHintAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeHintAllOf>() {
           @Override
           public void write(JsonWriter out, CodeHintAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeHintAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodeHintAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeHintAllOf
  * @throws IOException if the JSON string is invalid with respect to CodeHintAllOf
  */
  public static CodeHintAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeHintAllOf.class);
  }

 /**
  * Convert an instance of CodeHintAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

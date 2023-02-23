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
import org.openapitools.client.model.Exercise;
import org.openapitools.client.model.ProgrammingExerciseSolutionEntry;
import org.openapitools.client.model.ProgrammingExerciseTask;
import org.openapitools.client.model.TestwiseCoverageReportEntry;

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
 * ProgrammingExerciseTestCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ProgrammingExerciseTestCase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Double weight;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  /**
   * Gets or Sets visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    ALWAYS("ALWAYS"),
    
    AFTER_DUE_DATE("AFTER_DUE_DATE"),
    
    NEVER("NEVER");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_BONUS_MULTIPLIER = "bonusMultiplier";
  @SerializedName(SERIALIZED_NAME_BONUS_MULTIPLIER)
  private Double bonusMultiplier;

  public static final String SERIALIZED_NAME_BONUS_POINTS = "bonusPoints";
  @SerializedName(SERIALIZED_NAME_BONUS_POINTS)
  private Double bonusPoints;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private Set<ProgrammingExerciseTask> tasks = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SOLUTION_ENTRIES = "solutionEntries";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ENTRIES)
  private Set<ProgrammingExerciseSolutionEntry> solutionEntries = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_EXERCISE = "exercise";
  @SerializedName(SERIALIZED_NAME_EXERCISE)
  private Exercise exercise;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRUCTURAL("STRUCTURAL"),
    
    BEHAVIORAL("BEHAVIORAL"),
    
    DEFAULT("DEFAULT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_COVERAGE_ENTRIES = "coverageEntries";
  @SerializedName(SERIALIZED_NAME_COVERAGE_ENTRIES)
  private Set<TestwiseCoverageReportEntry> coverageEntries = new LinkedHashSet<>();

  public ProgrammingExerciseTestCase() {
  }

  public ProgrammingExerciseTestCase id(Long id) {
    
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


  public ProgrammingExerciseTestCase testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * Get testName
   * @return testName
  **/
  @javax.annotation.Nullable

  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ProgrammingExerciseTestCase weight(Double weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable

  public Double getWeight() {
    return weight;
  }


  public void setWeight(Double weight) {
    this.weight = weight;
  }


  public ProgrammingExerciseTestCase active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ProgrammingExerciseTestCase visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public ProgrammingExerciseTestCase bonusMultiplier(Double bonusMultiplier) {
    
    this.bonusMultiplier = bonusMultiplier;
    return this;
  }

   /**
   * Get bonusMultiplier
   * @return bonusMultiplier
  **/
  @javax.annotation.Nonnull

  public Double getBonusMultiplier() {
    return bonusMultiplier;
  }


  public void setBonusMultiplier(Double bonusMultiplier) {
    this.bonusMultiplier = bonusMultiplier;
  }


  public ProgrammingExerciseTestCase bonusPoints(Double bonusPoints) {
    
    this.bonusPoints = bonusPoints;
    return this;
  }

   /**
   * Get bonusPoints
   * @return bonusPoints
  **/
  @javax.annotation.Nonnull

  public Double getBonusPoints() {
    return bonusPoints;
  }


  public void setBonusPoints(Double bonusPoints) {
    this.bonusPoints = bonusPoints;
  }


  public ProgrammingExerciseTestCase tasks(Set<ProgrammingExerciseTask> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public ProgrammingExerciseTestCase addTasksItem(ProgrammingExerciseTask tasksItem) {
    if (this.tasks == null) {
      this.tasks = new LinkedHashSet<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable

  public Set<ProgrammingExerciseTask> getTasks() {
    return tasks;
  }


  public void setTasks(Set<ProgrammingExerciseTask> tasks) {
    this.tasks = tasks;
  }


  public ProgrammingExerciseTestCase solutionEntries(Set<ProgrammingExerciseSolutionEntry> solutionEntries) {
    
    this.solutionEntries = solutionEntries;
    return this;
  }

  public ProgrammingExerciseTestCase addSolutionEntriesItem(ProgrammingExerciseSolutionEntry solutionEntriesItem) {
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


  public ProgrammingExerciseTestCase exercise(Exercise exercise) {
    
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @javax.annotation.Nullable

  public Exercise getExercise() {
    return exercise;
  }


  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }


  public ProgrammingExerciseTestCase type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ProgrammingExerciseTestCase coverageEntries(Set<TestwiseCoverageReportEntry> coverageEntries) {
    
    this.coverageEntries = coverageEntries;
    return this;
  }

  public ProgrammingExerciseTestCase addCoverageEntriesItem(TestwiseCoverageReportEntry coverageEntriesItem) {
    if (this.coverageEntries == null) {
      this.coverageEntries = new LinkedHashSet<>();
    }
    this.coverageEntries.add(coverageEntriesItem);
    return this;
  }

   /**
   * Get coverageEntries
   * @return coverageEntries
  **/
  @javax.annotation.Nullable

  public Set<TestwiseCoverageReportEntry> getCoverageEntries() {
    return coverageEntries;
  }


  public void setCoverageEntries(Set<TestwiseCoverageReportEntry> coverageEntries) {
    this.coverageEntries = coverageEntries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammingExerciseTestCase programmingExerciseTestCase = (ProgrammingExerciseTestCase) o;
    return Objects.equals(this.id, programmingExerciseTestCase.id) &&
        Objects.equals(this.testName, programmingExerciseTestCase.testName) &&
        Objects.equals(this.weight, programmingExerciseTestCase.weight) &&
        Objects.equals(this.active, programmingExerciseTestCase.active) &&
        Objects.equals(this.visibility, programmingExerciseTestCase.visibility) &&
        Objects.equals(this.bonusMultiplier, programmingExerciseTestCase.bonusMultiplier) &&
        Objects.equals(this.bonusPoints, programmingExerciseTestCase.bonusPoints) &&
        Objects.equals(this.tasks, programmingExerciseTestCase.tasks) &&
        Objects.equals(this.solutionEntries, programmingExerciseTestCase.solutionEntries) &&
        Objects.equals(this.exercise, programmingExerciseTestCase.exercise) &&
        Objects.equals(this.type, programmingExerciseTestCase.type) &&
        Objects.equals(this.coverageEntries, programmingExerciseTestCase.coverageEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, testName, weight, active, visibility, bonusMultiplier, bonusPoints, tasks, solutionEntries, exercise, type, coverageEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammingExerciseTestCase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    bonusMultiplier: ").append(toIndentedString(bonusMultiplier)).append("\n");
    sb.append("    bonusPoints: ").append(toIndentedString(bonusPoints)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    solutionEntries: ").append(toIndentedString(solutionEntries)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coverageEntries: ").append(toIndentedString(coverageEntries)).append("\n");
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
    openapiFields.add("testName");
    openapiFields.add("weight");
    openapiFields.add("active");
    openapiFields.add("visibility");
    openapiFields.add("bonusMultiplier");
    openapiFields.add("bonusPoints");
    openapiFields.add("tasks");
    openapiFields.add("solutionEntries");
    openapiFields.add("exercise");
    openapiFields.add("type");
    openapiFields.add("coverageEntries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bonusMultiplier");
    openapiRequiredFields.add("bonusPoints");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProgrammingExerciseTestCase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProgrammingExerciseTestCase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProgrammingExerciseTestCase is not found in the empty JSON string", ProgrammingExerciseTestCase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProgrammingExerciseTestCase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProgrammingExerciseTestCase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProgrammingExerciseTestCase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if (jsonObj.get("tasks") != null && !jsonObj.get("tasks").isJsonNull()) {
        JsonArray jsonArraytasks = jsonObj.getAsJsonArray("tasks");
        if (jsonArraytasks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tasks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tasks` to be an array in the JSON string but got `%s`", jsonObj.get("tasks").toString()));
          }

          // validate the optional field `tasks` (array)
          for (int i = 0; i < jsonArraytasks.size(); i++) {
            ProgrammingExerciseTask.validateJsonObject(jsonArraytasks.get(i).getAsJsonObject());
          };
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
      // validate the optional field `exercise`
      if (jsonObj.get("exercise") != null && !jsonObj.get("exercise").isJsonNull()) {
        Exercise.validateJsonObject(jsonObj.getAsJsonObject("exercise"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("coverageEntries") != null && !jsonObj.get("coverageEntries").isJsonNull()) {
        JsonArray jsonArraycoverageEntries = jsonObj.getAsJsonArray("coverageEntries");
        if (jsonArraycoverageEntries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("coverageEntries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `coverageEntries` to be an array in the JSON string but got `%s`", jsonObj.get("coverageEntries").toString()));
          }

          // validate the optional field `coverageEntries` (array)
          for (int i = 0; i < jsonArraycoverageEntries.size(); i++) {
            TestwiseCoverageReportEntry.validateJsonObject(jsonArraycoverageEntries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProgrammingExerciseTestCase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProgrammingExerciseTestCase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProgrammingExerciseTestCase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProgrammingExerciseTestCase.class));

       return (TypeAdapter<T>) new TypeAdapter<ProgrammingExerciseTestCase>() {
           @Override
           public void write(JsonWriter out, ProgrammingExerciseTestCase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProgrammingExerciseTestCase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProgrammingExerciseTestCase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProgrammingExerciseTestCase
  * @throws IOException if the JSON string is invalid with respect to ProgrammingExerciseTestCase
  */
  public static ProgrammingExerciseTestCase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProgrammingExerciseTestCase.class);
  }

 /**
  * Convert an instance of ProgrammingExerciseTestCase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * CourseLearningGoalProgressDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class CourseLearningGoalProgressDTO {
  public static final String SERIALIZED_NAME_LEARNING_GOAL_ID = "learningGoalId";
  @SerializedName(SERIALIZED_NAME_LEARNING_GOAL_ID)
  private Long learningGoalId;

  public static final String SERIALIZED_NAME_NUMBER_OF_STUDENTS = "numberOfStudents";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_STUDENTS)
  private Long numberOfStudents;

  public static final String SERIALIZED_NAME_NUMBER_OF_MASTERED_STUDENTS = "numberOfMasteredStudents";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MASTERED_STUDENTS)
  private Long numberOfMasteredStudents;

  public static final String SERIALIZED_NAME_AVERAGE_STUDENT_SCORE = "averageStudentScore";
  @SerializedName(SERIALIZED_NAME_AVERAGE_STUDENT_SCORE)
  private Double averageStudentScore;

  public CourseLearningGoalProgressDTO() {
  }

  public CourseLearningGoalProgressDTO learningGoalId(Long learningGoalId) {
    
    this.learningGoalId = learningGoalId;
    return this;
  }

   /**
   * Get learningGoalId
   * @return learningGoalId
  **/
  @javax.annotation.Nullable

  public Long getLearningGoalId() {
    return learningGoalId;
  }


  public void setLearningGoalId(Long learningGoalId) {
    this.learningGoalId = learningGoalId;
  }


  public CourseLearningGoalProgressDTO numberOfStudents(Long numberOfStudents) {
    
    this.numberOfStudents = numberOfStudents;
    return this;
  }

   /**
   * Get numberOfStudents
   * @return numberOfStudents
  **/
  @javax.annotation.Nullable

  public Long getNumberOfStudents() {
    return numberOfStudents;
  }


  public void setNumberOfStudents(Long numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }


  public CourseLearningGoalProgressDTO numberOfMasteredStudents(Long numberOfMasteredStudents) {
    
    this.numberOfMasteredStudents = numberOfMasteredStudents;
    return this;
  }

   /**
   * Get numberOfMasteredStudents
   * @return numberOfMasteredStudents
  **/
  @javax.annotation.Nullable

  public Long getNumberOfMasteredStudents() {
    return numberOfMasteredStudents;
  }


  public void setNumberOfMasteredStudents(Long numberOfMasteredStudents) {
    this.numberOfMasteredStudents = numberOfMasteredStudents;
  }


  public CourseLearningGoalProgressDTO averageStudentScore(Double averageStudentScore) {
    
    this.averageStudentScore = averageStudentScore;
    return this;
  }

   /**
   * Get averageStudentScore
   * @return averageStudentScore
  **/
  @javax.annotation.Nullable

  public Double getAverageStudentScore() {
    return averageStudentScore;
  }


  public void setAverageStudentScore(Double averageStudentScore) {
    this.averageStudentScore = averageStudentScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseLearningGoalProgressDTO courseLearningGoalProgressDTO = (CourseLearningGoalProgressDTO) o;
    return Objects.equals(this.learningGoalId, courseLearningGoalProgressDTO.learningGoalId) &&
        Objects.equals(this.numberOfStudents, courseLearningGoalProgressDTO.numberOfStudents) &&
        Objects.equals(this.numberOfMasteredStudents, courseLearningGoalProgressDTO.numberOfMasteredStudents) &&
        Objects.equals(this.averageStudentScore, courseLearningGoalProgressDTO.averageStudentScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(learningGoalId, numberOfStudents, numberOfMasteredStudents, averageStudentScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseLearningGoalProgressDTO {\n");
    sb.append("    learningGoalId: ").append(toIndentedString(learningGoalId)).append("\n");
    sb.append("    numberOfStudents: ").append(toIndentedString(numberOfStudents)).append("\n");
    sb.append("    numberOfMasteredStudents: ").append(toIndentedString(numberOfMasteredStudents)).append("\n");
    sb.append("    averageStudentScore: ").append(toIndentedString(averageStudentScore)).append("\n");
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
    openapiFields.add("learningGoalId");
    openapiFields.add("numberOfStudents");
    openapiFields.add("numberOfMasteredStudents");
    openapiFields.add("averageStudentScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CourseLearningGoalProgressDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CourseLearningGoalProgressDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CourseLearningGoalProgressDTO is not found in the empty JSON string", CourseLearningGoalProgressDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CourseLearningGoalProgressDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CourseLearningGoalProgressDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CourseLearningGoalProgressDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CourseLearningGoalProgressDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CourseLearningGoalProgressDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CourseLearningGoalProgressDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CourseLearningGoalProgressDTO>() {
           @Override
           public void write(JsonWriter out, CourseLearningGoalProgressDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CourseLearningGoalProgressDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CourseLearningGoalProgressDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CourseLearningGoalProgressDTO
  * @throws IOException if the JSON string is invalid with respect to CourseLearningGoalProgressDTO
  */
  public static CourseLearningGoalProgressDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CourseLearningGoalProgressDTO.class);
  }

 /**
  * Convert an instance of CourseLearningGoalProgressDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
import java.util.ArrayList;
import java.util.List;

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
 * ExerciseManagementStatisticsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ExerciseManagementStatisticsDTO {
  public static final String SERIALIZED_NAME_AVERAGE_SCORE_OF_EXERCISE = "averageScoreOfExercise";
  @SerializedName(SERIALIZED_NAME_AVERAGE_SCORE_OF_EXERCISE)
  private Double averageScoreOfExercise;

  public static final String SERIALIZED_NAME_MAX_POINTS_OF_EXERCISE = "maxPointsOfExercise";
  @SerializedName(SERIALIZED_NAME_MAX_POINTS_OF_EXERCISE)
  private Double maxPointsOfExercise;

  public static final String SERIALIZED_NAME_SCORE_DISTRIBUTION = "scoreDistribution";
  @SerializedName(SERIALIZED_NAME_SCORE_DISTRIBUTION)
  private List<Integer> scoreDistribution = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUMBER_OF_EXERCISE_SCORES = "numberOfExerciseScores";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_EXERCISE_SCORES)
  private Integer numberOfExerciseScores;

  public static final String SERIALIZED_NAME_NUMBER_OF_PARTICIPATIONS = "numberOfParticipations";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PARTICIPATIONS)
  private Long numberOfParticipations;

  public static final String SERIALIZED_NAME_NUMBER_OF_STUDENTS_OR_TEAMS_IN_COURSE = "numberOfStudentsOrTeamsInCourse";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_STUDENTS_OR_TEAMS_IN_COURSE)
  private Long numberOfStudentsOrTeamsInCourse;

  public static final String SERIALIZED_NAME_NUMBER_OF_POSTS = "numberOfPosts";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_POSTS)
  private Long numberOfPosts;

  public static final String SERIALIZED_NAME_NUMBER_OF_RESOLVED_POSTS = "numberOfResolvedPosts";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_RESOLVED_POSTS)
  private Long numberOfResolvedPosts;

  public ExerciseManagementStatisticsDTO() {
  }

  public ExerciseManagementStatisticsDTO averageScoreOfExercise(Double averageScoreOfExercise) {
    
    this.averageScoreOfExercise = averageScoreOfExercise;
    return this;
  }

   /**
   * Get averageScoreOfExercise
   * @return averageScoreOfExercise
  **/
  @javax.annotation.Nullable

  public Double getAverageScoreOfExercise() {
    return averageScoreOfExercise;
  }


  public void setAverageScoreOfExercise(Double averageScoreOfExercise) {
    this.averageScoreOfExercise = averageScoreOfExercise;
  }


  public ExerciseManagementStatisticsDTO maxPointsOfExercise(Double maxPointsOfExercise) {
    
    this.maxPointsOfExercise = maxPointsOfExercise;
    return this;
  }

   /**
   * Get maxPointsOfExercise
   * @return maxPointsOfExercise
  **/
  @javax.annotation.Nullable

  public Double getMaxPointsOfExercise() {
    return maxPointsOfExercise;
  }


  public void setMaxPointsOfExercise(Double maxPointsOfExercise) {
    this.maxPointsOfExercise = maxPointsOfExercise;
  }


  public ExerciseManagementStatisticsDTO scoreDistribution(List<Integer> scoreDistribution) {
    
    this.scoreDistribution = scoreDistribution;
    return this;
  }

  public ExerciseManagementStatisticsDTO addScoreDistributionItem(Integer scoreDistributionItem) {
    if (this.scoreDistribution == null) {
      this.scoreDistribution = new ArrayList<>();
    }
    this.scoreDistribution.add(scoreDistributionItem);
    return this;
  }

   /**
   * Get scoreDistribution
   * @return scoreDistribution
  **/
  @javax.annotation.Nullable

  public List<Integer> getScoreDistribution() {
    return scoreDistribution;
  }


  public void setScoreDistribution(List<Integer> scoreDistribution) {
    this.scoreDistribution = scoreDistribution;
  }


  public ExerciseManagementStatisticsDTO numberOfExerciseScores(Integer numberOfExerciseScores) {
    
    this.numberOfExerciseScores = numberOfExerciseScores;
    return this;
  }

   /**
   * Get numberOfExerciseScores
   * @return numberOfExerciseScores
  **/
  @javax.annotation.Nullable

  public Integer getNumberOfExerciseScores() {
    return numberOfExerciseScores;
  }


  public void setNumberOfExerciseScores(Integer numberOfExerciseScores) {
    this.numberOfExerciseScores = numberOfExerciseScores;
  }


  public ExerciseManagementStatisticsDTO numberOfParticipations(Long numberOfParticipations) {
    
    this.numberOfParticipations = numberOfParticipations;
    return this;
  }

   /**
   * Get numberOfParticipations
   * @return numberOfParticipations
  **/
  @javax.annotation.Nullable

  public Long getNumberOfParticipations() {
    return numberOfParticipations;
  }


  public void setNumberOfParticipations(Long numberOfParticipations) {
    this.numberOfParticipations = numberOfParticipations;
  }


  public ExerciseManagementStatisticsDTO numberOfStudentsOrTeamsInCourse(Long numberOfStudentsOrTeamsInCourse) {
    
    this.numberOfStudentsOrTeamsInCourse = numberOfStudentsOrTeamsInCourse;
    return this;
  }

   /**
   * Get numberOfStudentsOrTeamsInCourse
   * @return numberOfStudentsOrTeamsInCourse
  **/
  @javax.annotation.Nullable

  public Long getNumberOfStudentsOrTeamsInCourse() {
    return numberOfStudentsOrTeamsInCourse;
  }


  public void setNumberOfStudentsOrTeamsInCourse(Long numberOfStudentsOrTeamsInCourse) {
    this.numberOfStudentsOrTeamsInCourse = numberOfStudentsOrTeamsInCourse;
  }


  public ExerciseManagementStatisticsDTO numberOfPosts(Long numberOfPosts) {
    
    this.numberOfPosts = numberOfPosts;
    return this;
  }

   /**
   * Get numberOfPosts
   * @return numberOfPosts
  **/
  @javax.annotation.Nullable

  public Long getNumberOfPosts() {
    return numberOfPosts;
  }


  public void setNumberOfPosts(Long numberOfPosts) {
    this.numberOfPosts = numberOfPosts;
  }


  public ExerciseManagementStatisticsDTO numberOfResolvedPosts(Long numberOfResolvedPosts) {
    
    this.numberOfResolvedPosts = numberOfResolvedPosts;
    return this;
  }

   /**
   * Get numberOfResolvedPosts
   * @return numberOfResolvedPosts
  **/
  @javax.annotation.Nullable

  public Long getNumberOfResolvedPosts() {
    return numberOfResolvedPosts;
  }


  public void setNumberOfResolvedPosts(Long numberOfResolvedPosts) {
    this.numberOfResolvedPosts = numberOfResolvedPosts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExerciseManagementStatisticsDTO exerciseManagementStatisticsDTO = (ExerciseManagementStatisticsDTO) o;
    return Objects.equals(this.averageScoreOfExercise, exerciseManagementStatisticsDTO.averageScoreOfExercise) &&
        Objects.equals(this.maxPointsOfExercise, exerciseManagementStatisticsDTO.maxPointsOfExercise) &&
        Objects.equals(this.scoreDistribution, exerciseManagementStatisticsDTO.scoreDistribution) &&
        Objects.equals(this.numberOfExerciseScores, exerciseManagementStatisticsDTO.numberOfExerciseScores) &&
        Objects.equals(this.numberOfParticipations, exerciseManagementStatisticsDTO.numberOfParticipations) &&
        Objects.equals(this.numberOfStudentsOrTeamsInCourse, exerciseManagementStatisticsDTO.numberOfStudentsOrTeamsInCourse) &&
        Objects.equals(this.numberOfPosts, exerciseManagementStatisticsDTO.numberOfPosts) &&
        Objects.equals(this.numberOfResolvedPosts, exerciseManagementStatisticsDTO.numberOfResolvedPosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageScoreOfExercise, maxPointsOfExercise, scoreDistribution, numberOfExerciseScores, numberOfParticipations, numberOfStudentsOrTeamsInCourse, numberOfPosts, numberOfResolvedPosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseManagementStatisticsDTO {\n");
    sb.append("    averageScoreOfExercise: ").append(toIndentedString(averageScoreOfExercise)).append("\n");
    sb.append("    maxPointsOfExercise: ").append(toIndentedString(maxPointsOfExercise)).append("\n");
    sb.append("    scoreDistribution: ").append(toIndentedString(scoreDistribution)).append("\n");
    sb.append("    numberOfExerciseScores: ").append(toIndentedString(numberOfExerciseScores)).append("\n");
    sb.append("    numberOfParticipations: ").append(toIndentedString(numberOfParticipations)).append("\n");
    sb.append("    numberOfStudentsOrTeamsInCourse: ").append(toIndentedString(numberOfStudentsOrTeamsInCourse)).append("\n");
    sb.append("    numberOfPosts: ").append(toIndentedString(numberOfPosts)).append("\n");
    sb.append("    numberOfResolvedPosts: ").append(toIndentedString(numberOfResolvedPosts)).append("\n");
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
    openapiFields.add("averageScoreOfExercise");
    openapiFields.add("maxPointsOfExercise");
    openapiFields.add("scoreDistribution");
    openapiFields.add("numberOfExerciseScores");
    openapiFields.add("numberOfParticipations");
    openapiFields.add("numberOfStudentsOrTeamsInCourse");
    openapiFields.add("numberOfPosts");
    openapiFields.add("numberOfResolvedPosts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExerciseManagementStatisticsDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExerciseManagementStatisticsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExerciseManagementStatisticsDTO is not found in the empty JSON string", ExerciseManagementStatisticsDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExerciseManagementStatisticsDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExerciseManagementStatisticsDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scoreDistribution") != null && !jsonObj.get("scoreDistribution").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreDistribution` to be an array in the JSON string but got `%s`", jsonObj.get("scoreDistribution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExerciseManagementStatisticsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExerciseManagementStatisticsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExerciseManagementStatisticsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExerciseManagementStatisticsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ExerciseManagementStatisticsDTO>() {
           @Override
           public void write(JsonWriter out, ExerciseManagementStatisticsDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExerciseManagementStatisticsDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExerciseManagementStatisticsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExerciseManagementStatisticsDTO
  * @throws IOException if the JSON string is invalid with respect to ExerciseManagementStatisticsDTO
  */
  public static ExerciseManagementStatisticsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExerciseManagementStatisticsDTO.class);
  }

 /**
  * Convert an instance of ExerciseManagementStatisticsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

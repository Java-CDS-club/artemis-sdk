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
import java.util.List;
import org.openapitools.client.model.CleanupBuildPlan200Response;
import org.openapitools.client.model.FileUploadSubmission;
import org.openapitools.client.model.ModelingSubmission;
import org.openapitools.client.model.ProgrammingSubmission;
import org.openapitools.client.model.QuizSubmission;
import org.openapitools.client.model.Result;
import org.openapitools.client.model.TextSubmission;

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
 * Submission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class Submission {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SUBMITTED = "submitted";
  @SerializedName(SERIALIZED_NAME_SUBMITTED)
  private Boolean submitted;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MANUAL("MANUAL"),
    
    TIMEOUT("TIMEOUT"),
    
    TEST("TEST"),
    
    OTHER("OTHER"),
    
    INSTRUCTOR("INSTRUCTOR"),
    
    EXTERNAL("EXTERNAL"),
    
    ILLEGAL("ILLEGAL");

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

  public static final String SERIALIZED_NAME_EXAMPLE_SUBMISSION = "exampleSubmission";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_SUBMISSION)
  private Boolean exampleSubmission;

  public static final String SERIALIZED_NAME_PARTICIPATION = "participation";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION)
  private CleanupBuildPlan200Response participation;

  public static final String SERIALIZED_NAME_SUBMISSION_DATE = "submissionDate";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_DATE)
  private OffsetDateTime submissionDate;

  public static final String SERIALIZED_NAME_EMPTY = "empty";
  @SerializedName(SERIALIZED_NAME_EMPTY)
  private Boolean empty;

  public static final String SERIALIZED_NAME_DURATION_IN_MINUTES = "durationInMinutes";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_MINUTES)
  private Long durationInMinutes;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<Result> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBMISSION_EXERCISE_TYPE = "submissionExerciseType";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_EXERCISE_TYPE)
  protected String submissionExerciseType;

  public Submission() {
    this.submissionExerciseType = this.getClass().getSimpleName();
  }

  
  public Submission(
     Long durationInMinutes, 
     List<Result> results
  ) {
    this();
    this.durationInMinutes = durationInMinutes;
    this.results = results;
  }

  public Submission id(Long id) {
    
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


  public Submission submitted(Boolean submitted) {
    
    this.submitted = submitted;
    return this;
  }

   /**
   * Get submitted
   * @return submitted
  **/
  @javax.annotation.Nullable

  public Boolean getSubmitted() {
    return submitted;
  }


  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }


  public Submission type(TypeEnum type) {
    
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


  public Submission exampleSubmission(Boolean exampleSubmission) {
    
    this.exampleSubmission = exampleSubmission;
    return this;
  }

   /**
   * Get exampleSubmission
   * @return exampleSubmission
  **/
  @javax.annotation.Nullable

  public Boolean getExampleSubmission() {
    return exampleSubmission;
  }


  public void setExampleSubmission(Boolean exampleSubmission) {
    this.exampleSubmission = exampleSubmission;
  }


  public Submission participation(CleanupBuildPlan200Response participation) {
    
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  @javax.annotation.Nullable

  public CleanupBuildPlan200Response getParticipation() {
    return participation;
  }


  public void setParticipation(CleanupBuildPlan200Response participation) {
    this.participation = participation;
  }


  public Submission submissionDate(OffsetDateTime submissionDate) {
    
    this.submissionDate = submissionDate;
    return this;
  }

   /**
   * Get submissionDate
   * @return submissionDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getSubmissionDate() {
    return submissionDate;
  }


  public void setSubmissionDate(OffsetDateTime submissionDate) {
    this.submissionDate = submissionDate;
  }


  public Submission empty(Boolean empty) {
    
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @javax.annotation.Nullable

  public Boolean getEmpty() {
    return empty;
  }


  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }


   /**
   * Get durationInMinutes
   * @return durationInMinutes
  **/
  @javax.annotation.Nullable

  public Long getDurationInMinutes() {
    return durationInMinutes;
  }




   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable

  public List<Result> getResults() {
    return results;
  }




  public Submission submissionExerciseType(String submissionExerciseType) {
    
    this.submissionExerciseType = submissionExerciseType;
    return this;
  }

   /**
   * Get submissionExerciseType
   * @return submissionExerciseType
  **/
  @javax.annotation.Nonnull

  public String getSubmissionExerciseType() {
    return submissionExerciseType;
  }


  public void setSubmissionExerciseType(String submissionExerciseType) {
    this.submissionExerciseType = submissionExerciseType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submission submission = (Submission) o;
    return Objects.equals(this.id, submission.id) &&
        Objects.equals(this.submitted, submission.submitted) &&
        Objects.equals(this.type, submission.type) &&
        Objects.equals(this.exampleSubmission, submission.exampleSubmission) &&
        Objects.equals(this.participation, submission.participation) &&
        Objects.equals(this.submissionDate, submission.submissionDate) &&
        Objects.equals(this.empty, submission.empty) &&
        Objects.equals(this.durationInMinutes, submission.durationInMinutes) &&
        Objects.equals(this.results, submission.results) &&
        Objects.equals(this.submissionExerciseType, submission.submissionExerciseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitted, type, exampleSubmission, participation, submissionDate, empty, durationInMinutes, results, submissionExerciseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exampleSubmission: ").append(toIndentedString(exampleSubmission)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    durationInMinutes: ").append(toIndentedString(durationInMinutes)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    submissionExerciseType: ").append(toIndentedString(submissionExerciseType)).append("\n");
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
    openapiFields.add("submitted");
    openapiFields.add("type");
    openapiFields.add("exampleSubmission");
    openapiFields.add("participation");
    openapiFields.add("submissionDate");
    openapiFields.add("empty");
    openapiFields.add("durationInMinutes");
    openapiFields.add("results");
    openapiFields.add("submissionExerciseType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("submissionExerciseType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Submission
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Submission.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Submission is not found in the empty JSON string", Submission.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("submissionExerciseType").getAsString();
      switch (discriminatorValue) {
        case "FileUploadSubmission":
          FileUploadSubmission.validateJsonObject(jsonObj);
          break;
        case "ModelingSubmission":
          ModelingSubmission.validateJsonObject(jsonObj);
          break;
        case "ProgrammingSubmission":
          ProgrammingSubmission.validateJsonObject(jsonObj);
          break;
        case "QuizSubmission":
          QuizSubmission.validateJsonObject(jsonObj);
          break;
        case "TextSubmission":
          TextSubmission.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `submissionExerciseType` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of Submission given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Submission
  * @throws IOException if the JSON string is invalid with respect to Submission
  */
  public static Submission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Submission.class);
  }

 /**
  * Convert an instance of Submission to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

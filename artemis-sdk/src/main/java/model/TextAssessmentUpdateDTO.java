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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.ComplaintResponse;
import org.openapitools.client.model.Feedback;
import org.openapitools.client.model.TextBlock;

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
 * TextAssessmentUpdateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TextAssessmentUpdateDTO {
  public static final String SERIALIZED_NAME_FEEDBACKS = "feedbacks";
  @SerializedName(SERIALIZED_NAME_FEEDBACKS)
  private List<Feedback> feedbacks = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPLAINT_RESPONSE = "complaintResponse";
  @SerializedName(SERIALIZED_NAME_COMPLAINT_RESPONSE)
  private ComplaintResponse complaintResponse;

  public static final String SERIALIZED_NAME_TEXT_BLOCKS = "textBlocks";
  @SerializedName(SERIALIZED_NAME_TEXT_BLOCKS)
  private Set<TextBlock> textBlocks = new LinkedHashSet<>();

  public TextAssessmentUpdateDTO() {
  }

  public TextAssessmentUpdateDTO feedbacks(List<Feedback> feedbacks) {
    
    this.feedbacks = feedbacks;
    return this;
  }

  public TextAssessmentUpdateDTO addFeedbacksItem(Feedback feedbacksItem) {
    if (this.feedbacks == null) {
      this.feedbacks = new ArrayList<>();
    }
    this.feedbacks.add(feedbacksItem);
    return this;
  }

   /**
   * Get feedbacks
   * @return feedbacks
  **/
  @javax.annotation.Nullable

  public List<Feedback> getFeedbacks() {
    return feedbacks;
  }


  public void setFeedbacks(List<Feedback> feedbacks) {
    this.feedbacks = feedbacks;
  }


  public TextAssessmentUpdateDTO complaintResponse(ComplaintResponse complaintResponse) {
    
    this.complaintResponse = complaintResponse;
    return this;
  }

   /**
   * Get complaintResponse
   * @return complaintResponse
  **/
  @javax.annotation.Nullable

  public ComplaintResponse getComplaintResponse() {
    return complaintResponse;
  }


  public void setComplaintResponse(ComplaintResponse complaintResponse) {
    this.complaintResponse = complaintResponse;
  }


  public TextAssessmentUpdateDTO textBlocks(Set<TextBlock> textBlocks) {
    
    this.textBlocks = textBlocks;
    return this;
  }

  public TextAssessmentUpdateDTO addTextBlocksItem(TextBlock textBlocksItem) {
    if (this.textBlocks == null) {
      this.textBlocks = new LinkedHashSet<>();
    }
    this.textBlocks.add(textBlocksItem);
    return this;
  }

   /**
   * Get textBlocks
   * @return textBlocks
  **/
  @javax.annotation.Nullable

  public Set<TextBlock> getTextBlocks() {
    return textBlocks;
  }


  public void setTextBlocks(Set<TextBlock> textBlocks) {
    this.textBlocks = textBlocks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAssessmentUpdateDTO textAssessmentUpdateDTO = (TextAssessmentUpdateDTO) o;
    return Objects.equals(this.feedbacks, textAssessmentUpdateDTO.feedbacks) &&
        Objects.equals(this.complaintResponse, textAssessmentUpdateDTO.complaintResponse) &&
        Objects.equals(this.textBlocks, textAssessmentUpdateDTO.textBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbacks, complaintResponse, textBlocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAssessmentUpdateDTO {\n");
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
    sb.append("    complaintResponse: ").append(toIndentedString(complaintResponse)).append("\n");
    sb.append("    textBlocks: ").append(toIndentedString(textBlocks)).append("\n");
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
    openapiFields.add("feedbacks");
    openapiFields.add("complaintResponse");
    openapiFields.add("textBlocks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TextAssessmentUpdateDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TextAssessmentUpdateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextAssessmentUpdateDTO is not found in the empty JSON string", TextAssessmentUpdateDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TextAssessmentUpdateDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextAssessmentUpdateDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("feedbacks") != null && !jsonObj.get("feedbacks").isJsonNull()) {
        JsonArray jsonArrayfeedbacks = jsonObj.getAsJsonArray("feedbacks");
        if (jsonArrayfeedbacks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("feedbacks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `feedbacks` to be an array in the JSON string but got `%s`", jsonObj.get("feedbacks").toString()));
          }

          // validate the optional field `feedbacks` (array)
          for (int i = 0; i < jsonArrayfeedbacks.size(); i++) {
            Feedback.validateJsonObject(jsonArrayfeedbacks.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `complaintResponse`
      if (jsonObj.get("complaintResponse") != null && !jsonObj.get("complaintResponse").isJsonNull()) {
        ComplaintResponse.validateJsonObject(jsonObj.getAsJsonObject("complaintResponse"));
      }
      if (jsonObj.get("textBlocks") != null && !jsonObj.get("textBlocks").isJsonNull()) {
        JsonArray jsonArraytextBlocks = jsonObj.getAsJsonArray("textBlocks");
        if (jsonArraytextBlocks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("textBlocks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `textBlocks` to be an array in the JSON string but got `%s`", jsonObj.get("textBlocks").toString()));
          }

          // validate the optional field `textBlocks` (array)
          for (int i = 0; i < jsonArraytextBlocks.size(); i++) {
            TextBlock.validateJsonObject(jsonArraytextBlocks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextAssessmentUpdateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextAssessmentUpdateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextAssessmentUpdateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextAssessmentUpdateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TextAssessmentUpdateDTO>() {
           @Override
           public void write(JsonWriter out, TextAssessmentUpdateDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextAssessmentUpdateDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TextAssessmentUpdateDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TextAssessmentUpdateDTO
  * @throws IOException if the JSON string is invalid with respect to TextAssessmentUpdateDTO
  */
  public static TextAssessmentUpdateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextAssessmentUpdateDTO.class);
  }

 /**
  * Convert an instance of TextAssessmentUpdateDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

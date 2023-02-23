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
import org.openapitools.client.model.TutorialGroup;
import org.openapitools.client.model.TutorialGroupSession;

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
 * TutorialGroupSchedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class TutorialGroupSchedule {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TUTORIAL_GROUP = "tutorialGroup";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_GROUP)
  private TutorialGroup tutorialGroup;

  public static final String SERIALIZED_NAME_DAY_OF_WEEK = "dayOfWeek";
  @SerializedName(SERIALIZED_NAME_DAY_OF_WEEK)
  private Integer dayOfWeek;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_REPETITION_FREQUENCY = "repetitionFrequency";
  @SerializedName(SERIALIZED_NAME_REPETITION_FREQUENCY)
  private Integer repetitionFrequency;

  public static final String SERIALIZED_NAME_VALID_FROM_INCLUSIVE = "validFromInclusive";
  @SerializedName(SERIALIZED_NAME_VALID_FROM_INCLUSIVE)
  private String validFromInclusive;

  public static final String SERIALIZED_NAME_VALID_TO_INCLUSIVE = "validToInclusive";
  @SerializedName(SERIALIZED_NAME_VALID_TO_INCLUSIVE)
  private String validToInclusive;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_TUTORIAL_GROUP_SESSIONS = "tutorialGroupSessions";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_GROUP_SESSIONS)
  private List<TutorialGroupSession> tutorialGroupSessions = new ArrayList<>();

  public TutorialGroupSchedule() {
  }

  public TutorialGroupSchedule id(Long id) {
    
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


  public TutorialGroupSchedule tutorialGroup(TutorialGroup tutorialGroup) {
    
    this.tutorialGroup = tutorialGroup;
    return this;
  }

   /**
   * Get tutorialGroup
   * @return tutorialGroup
  **/
  @javax.annotation.Nullable

  public TutorialGroup getTutorialGroup() {
    return tutorialGroup;
  }


  public void setTutorialGroup(TutorialGroup tutorialGroup) {
    this.tutorialGroup = tutorialGroup;
  }


  public TutorialGroupSchedule dayOfWeek(Integer dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @javax.annotation.Nullable

  public Integer getDayOfWeek() {
    return dayOfWeek;
  }


  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public TutorialGroupSchedule startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public TutorialGroupSchedule endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public TutorialGroupSchedule repetitionFrequency(Integer repetitionFrequency) {
    
    this.repetitionFrequency = repetitionFrequency;
    return this;
  }

   /**
   * Get repetitionFrequency
   * @return repetitionFrequency
  **/
  @javax.annotation.Nullable

  public Integer getRepetitionFrequency() {
    return repetitionFrequency;
  }


  public void setRepetitionFrequency(Integer repetitionFrequency) {
    this.repetitionFrequency = repetitionFrequency;
  }


  public TutorialGroupSchedule validFromInclusive(String validFromInclusive) {
    
    this.validFromInclusive = validFromInclusive;
    return this;
  }

   /**
   * Get validFromInclusive
   * @return validFromInclusive
  **/
  @javax.annotation.Nullable

  public String getValidFromInclusive() {
    return validFromInclusive;
  }


  public void setValidFromInclusive(String validFromInclusive) {
    this.validFromInclusive = validFromInclusive;
  }


  public TutorialGroupSchedule validToInclusive(String validToInclusive) {
    
    this.validToInclusive = validToInclusive;
    return this;
  }

   /**
   * Get validToInclusive
   * @return validToInclusive
  **/
  @javax.annotation.Nullable

  public String getValidToInclusive() {
    return validToInclusive;
  }


  public void setValidToInclusive(String validToInclusive) {
    this.validToInclusive = validToInclusive;
  }


  public TutorialGroupSchedule location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public TutorialGroupSchedule tutorialGroupSessions(List<TutorialGroupSession> tutorialGroupSessions) {
    
    this.tutorialGroupSessions = tutorialGroupSessions;
    return this;
  }

  public TutorialGroupSchedule addTutorialGroupSessionsItem(TutorialGroupSession tutorialGroupSessionsItem) {
    if (this.tutorialGroupSessions == null) {
      this.tutorialGroupSessions = new ArrayList<>();
    }
    this.tutorialGroupSessions.add(tutorialGroupSessionsItem);
    return this;
  }

   /**
   * Get tutorialGroupSessions
   * @return tutorialGroupSessions
  **/
  @javax.annotation.Nullable

  public List<TutorialGroupSession> getTutorialGroupSessions() {
    return tutorialGroupSessions;
  }


  public void setTutorialGroupSessions(List<TutorialGroupSession> tutorialGroupSessions) {
    this.tutorialGroupSessions = tutorialGroupSessions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TutorialGroupSchedule tutorialGroupSchedule = (TutorialGroupSchedule) o;
    return Objects.equals(this.id, tutorialGroupSchedule.id) &&
        Objects.equals(this.tutorialGroup, tutorialGroupSchedule.tutorialGroup) &&
        Objects.equals(this.dayOfWeek, tutorialGroupSchedule.dayOfWeek) &&
        Objects.equals(this.startTime, tutorialGroupSchedule.startTime) &&
        Objects.equals(this.endTime, tutorialGroupSchedule.endTime) &&
        Objects.equals(this.repetitionFrequency, tutorialGroupSchedule.repetitionFrequency) &&
        Objects.equals(this.validFromInclusive, tutorialGroupSchedule.validFromInclusive) &&
        Objects.equals(this.validToInclusive, tutorialGroupSchedule.validToInclusive) &&
        Objects.equals(this.location, tutorialGroupSchedule.location) &&
        Objects.equals(this.tutorialGroupSessions, tutorialGroupSchedule.tutorialGroupSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tutorialGroup, dayOfWeek, startTime, endTime, repetitionFrequency, validFromInclusive, validToInclusive, location, tutorialGroupSessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TutorialGroupSchedule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tutorialGroup: ").append(toIndentedString(tutorialGroup)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    repetitionFrequency: ").append(toIndentedString(repetitionFrequency)).append("\n");
    sb.append("    validFromInclusive: ").append(toIndentedString(validFromInclusive)).append("\n");
    sb.append("    validToInclusive: ").append(toIndentedString(validToInclusive)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    tutorialGroupSessions: ").append(toIndentedString(tutorialGroupSessions)).append("\n");
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
    openapiFields.add("tutorialGroup");
    openapiFields.add("dayOfWeek");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("repetitionFrequency");
    openapiFields.add("validFromInclusive");
    openapiFields.add("validToInclusive");
    openapiFields.add("location");
    openapiFields.add("tutorialGroupSessions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TutorialGroupSchedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TutorialGroupSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TutorialGroupSchedule is not found in the empty JSON string", TutorialGroupSchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TutorialGroupSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TutorialGroupSchedule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `tutorialGroup`
      if (jsonObj.get("tutorialGroup") != null && !jsonObj.get("tutorialGroup").isJsonNull()) {
        TutorialGroup.validateJsonObject(jsonObj.getAsJsonObject("tutorialGroup"));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if ((jsonObj.get("validFromInclusive") != null && !jsonObj.get("validFromInclusive").isJsonNull()) && !jsonObj.get("validFromInclusive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validFromInclusive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validFromInclusive").toString()));
      }
      if ((jsonObj.get("validToInclusive") != null && !jsonObj.get("validToInclusive").isJsonNull()) && !jsonObj.get("validToInclusive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validToInclusive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validToInclusive").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("tutorialGroupSessions") != null && !jsonObj.get("tutorialGroupSessions").isJsonNull()) {
        JsonArray jsonArraytutorialGroupSessions = jsonObj.getAsJsonArray("tutorialGroupSessions");
        if (jsonArraytutorialGroupSessions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tutorialGroupSessions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tutorialGroupSessions` to be an array in the JSON string but got `%s`", jsonObj.get("tutorialGroupSessions").toString()));
          }

          // validate the optional field `tutorialGroupSessions` (array)
          for (int i = 0; i < jsonArraytutorialGroupSessions.size(); i++) {
            TutorialGroupSession.validateJsonObject(jsonArraytutorialGroupSessions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TutorialGroupSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TutorialGroupSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TutorialGroupSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TutorialGroupSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<TutorialGroupSchedule>() {
           @Override
           public void write(JsonWriter out, TutorialGroupSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TutorialGroupSchedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TutorialGroupSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TutorialGroupSchedule
  * @throws IOException if the JSON string is invalid with respect to TutorialGroupSchedule
  */
  public static TutorialGroupSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TutorialGroupSchedule.class);
  }

 /**
  * Convert an instance of TutorialGroupSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

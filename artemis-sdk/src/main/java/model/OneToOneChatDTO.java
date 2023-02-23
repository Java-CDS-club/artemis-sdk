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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.ConversationDTO;
import org.openapitools.client.model.ConversationUserDTO;

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
 * OneToOneChatDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class OneToOneChatDTO extends ConversationDTO {
  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private Set<ConversationUserDTO> members = new LinkedHashSet<>();

  public OneToOneChatDTO() {
    this.type = this.getClass().getSimpleName();
  }

  public OneToOneChatDTO members(Set<ConversationUserDTO> members) {
    
    this.members = members;
    return this;
  }

  public OneToOneChatDTO addMembersItem(ConversationUserDTO membersItem) {
    if (this.members == null) {
      this.members = new LinkedHashSet<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable

  public Set<ConversationUserDTO> getMembers() {
    return members;
  }


  public void setMembers(Set<ConversationUserDTO> members) {
    this.members = members;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneToOneChatDTO oneToOneChatDTO = (OneToOneChatDTO) o;
    return Objects.equals(this.members, oneToOneChatDTO.members) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneToOneChatDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("creationDate");
    openapiFields.add("lastMessageDate");
    openapiFields.add("creator");
    openapiFields.add("lastReadDate");
    openapiFields.add("unreadMessagesCount");
    openapiFields.add("isFavorite");
    openapiFields.add("isHidden");
    openapiFields.add("isCreator");
    openapiFields.add("isMember");
    openapiFields.add("numberOfMembers");
    openapiFields.add("members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OneToOneChatDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OneToOneChatDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OneToOneChatDTO is not found in the empty JSON string", OneToOneChatDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OneToOneChatDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OneToOneChatDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OneToOneChatDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OneToOneChatDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OneToOneChatDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OneToOneChatDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<OneToOneChatDTO>() {
           @Override
           public void write(JsonWriter out, OneToOneChatDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OneToOneChatDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OneToOneChatDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OneToOneChatDTO
  * @throws IOException if the JSON string is invalid with respect to OneToOneChatDTO
  */
  public static OneToOneChatDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OneToOneChatDTO.class);
  }

 /**
  * Convert an instance of OneToOneChatDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

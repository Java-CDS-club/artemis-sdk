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
import org.openapitools.client.model.ChannelDTO;
import org.openapitools.client.model.ConversationUserDTO;
import org.openapitools.client.model.GroupChatDTO;
import org.openapitools.client.model.OneToOneChatDTO;

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
 * ConversationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class ConversationDTO {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_LAST_MESSAGE_DATE = "lastMessageDate";
  @SerializedName(SERIALIZED_NAME_LAST_MESSAGE_DATE)
  private OffsetDateTime lastMessageDate;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private ConversationUserDTO creator;

  public static final String SERIALIZED_NAME_LAST_READ_DATE = "lastReadDate";
  @SerializedName(SERIALIZED_NAME_LAST_READ_DATE)
  private OffsetDateTime lastReadDate;

  public static final String SERIALIZED_NAME_UNREAD_MESSAGES_COUNT = "unreadMessagesCount";
  @SerializedName(SERIALIZED_NAME_UNREAD_MESSAGES_COUNT)
  private Long unreadMessagesCount;

  public static final String SERIALIZED_NAME_IS_FAVORITE = "isFavorite";
  @SerializedName(SERIALIZED_NAME_IS_FAVORITE)
  private Boolean isFavorite;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "isHidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_IS_CREATOR = "isCreator";
  @SerializedName(SERIALIZED_NAME_IS_CREATOR)
  private Boolean isCreator;

  public static final String SERIALIZED_NAME_IS_MEMBER = "isMember";
  @SerializedName(SERIALIZED_NAME_IS_MEMBER)
  private Boolean isMember;

  public static final String SERIALIZED_NAME_NUMBER_OF_MEMBERS = "numberOfMembers";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_MEMBERS)
  private Integer numberOfMembers;

  public ConversationDTO() {
    this.type = this.getClass().getSimpleName();
  }

  public ConversationDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ConversationDTO id(Long id) {
    
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


  public ConversationDTO creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ConversationDTO lastMessageDate(OffsetDateTime lastMessageDate) {
    
    this.lastMessageDate = lastMessageDate;
    return this;
  }

   /**
   * Get lastMessageDate
   * @return lastMessageDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastMessageDate() {
    return lastMessageDate;
  }


  public void setLastMessageDate(OffsetDateTime lastMessageDate) {
    this.lastMessageDate = lastMessageDate;
  }


  public ConversationDTO creator(ConversationUserDTO creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable

  public ConversationUserDTO getCreator() {
    return creator;
  }


  public void setCreator(ConversationUserDTO creator) {
    this.creator = creator;
  }


  public ConversationDTO lastReadDate(OffsetDateTime lastReadDate) {
    
    this.lastReadDate = lastReadDate;
    return this;
  }

   /**
   * Get lastReadDate
   * @return lastReadDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastReadDate() {
    return lastReadDate;
  }


  public void setLastReadDate(OffsetDateTime lastReadDate) {
    this.lastReadDate = lastReadDate;
  }


  public ConversationDTO unreadMessagesCount(Long unreadMessagesCount) {
    
    this.unreadMessagesCount = unreadMessagesCount;
    return this;
  }

   /**
   * Get unreadMessagesCount
   * @return unreadMessagesCount
  **/
  @javax.annotation.Nullable

  public Long getUnreadMessagesCount() {
    return unreadMessagesCount;
  }


  public void setUnreadMessagesCount(Long unreadMessagesCount) {
    this.unreadMessagesCount = unreadMessagesCount;
  }


  public ConversationDTO isFavorite(Boolean isFavorite) {
    
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Get isFavorite
   * @return isFavorite
  **/
  @javax.annotation.Nullable

  public Boolean getIsFavorite() {
    return isFavorite;
  }


  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }


  public ConversationDTO isHidden(Boolean isHidden) {
    
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @javax.annotation.Nullable

  public Boolean getIsHidden() {
    return isHidden;
  }


  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public ConversationDTO isCreator(Boolean isCreator) {
    
    this.isCreator = isCreator;
    return this;
  }

   /**
   * Get isCreator
   * @return isCreator
  **/
  @javax.annotation.Nullable

  public Boolean getIsCreator() {
    return isCreator;
  }


  public void setIsCreator(Boolean isCreator) {
    this.isCreator = isCreator;
  }


  public ConversationDTO isMember(Boolean isMember) {
    
    this.isMember = isMember;
    return this;
  }

   /**
   * Get isMember
   * @return isMember
  **/
  @javax.annotation.Nullable

  public Boolean getIsMember() {
    return isMember;
  }


  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public ConversationDTO numberOfMembers(Integer numberOfMembers) {
    
    this.numberOfMembers = numberOfMembers;
    return this;
  }

   /**
   * Get numberOfMembers
   * @return numberOfMembers
  **/
  @javax.annotation.Nullable

  public Integer getNumberOfMembers() {
    return numberOfMembers;
  }


  public void setNumberOfMembers(Integer numberOfMembers) {
    this.numberOfMembers = numberOfMembers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDTO conversationDTO = (ConversationDTO) o;
    return Objects.equals(this.type, conversationDTO.type) &&
        Objects.equals(this.id, conversationDTO.id) &&
        Objects.equals(this.creationDate, conversationDTO.creationDate) &&
        Objects.equals(this.lastMessageDate, conversationDTO.lastMessageDate) &&
        Objects.equals(this.creator, conversationDTO.creator) &&
        Objects.equals(this.lastReadDate, conversationDTO.lastReadDate) &&
        Objects.equals(this.unreadMessagesCount, conversationDTO.unreadMessagesCount) &&
        Objects.equals(this.isFavorite, conversationDTO.isFavorite) &&
        Objects.equals(this.isHidden, conversationDTO.isHidden) &&
        Objects.equals(this.isCreator, conversationDTO.isCreator) &&
        Objects.equals(this.isMember, conversationDTO.isMember) &&
        Objects.equals(this.numberOfMembers, conversationDTO.numberOfMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, creationDate, lastMessageDate, creator, lastReadDate, unreadMessagesCount, isFavorite, isHidden, isCreator, isMember, numberOfMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastMessageDate: ").append(toIndentedString(lastMessageDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    lastReadDate: ").append(toIndentedString(lastReadDate)).append("\n");
    sb.append("    unreadMessagesCount: ").append(toIndentedString(unreadMessagesCount)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isCreator: ").append(toIndentedString(isCreator)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    numberOfMembers: ").append(toIndentedString(numberOfMembers)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConversationDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationDTO is not found in the empty JSON string", ConversationDTO.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "ChannelDTO":
          ChannelDTO.validateJsonObject(jsonObj);
          break;
        case "GroupChatDTO":
          GroupChatDTO.validateJsonObject(jsonObj);
          break;
        case "OneToOneChatDTO":
          OneToOneChatDTO.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of ConversationDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationDTO
  * @throws IOException if the JSON string is invalid with respect to ConversationDTO
  */
  public static ConversationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationDTO.class);
  }

 /**
  * Convert an instance of ConversationDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

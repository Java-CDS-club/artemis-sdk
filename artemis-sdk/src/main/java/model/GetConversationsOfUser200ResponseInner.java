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
import org.openapitools.client.model.ChannelDTO;
import org.openapitools.client.model.ConversationDTO;
import org.openapitools.client.model.ConversationUserDTO;
import org.openapitools.client.model.GroupChatDTO;
import org.openapitools.client.model.OneToOneChatDTO;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class GetConversationsOfUser200ResponseInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetConversationsOfUser200ResponseInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetConversationsOfUser200ResponseInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetConversationsOfUser200ResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ChannelDTO> adapterChannelDTO = gson.getDelegateAdapter(this, TypeToken.get(ChannelDTO.class));
            final TypeAdapter<ConversationDTO> adapterConversationDTO = gson.getDelegateAdapter(this, TypeToken.get(ConversationDTO.class));
            final TypeAdapter<GroupChatDTO> adapterGroupChatDTO = gson.getDelegateAdapter(this, TypeToken.get(GroupChatDTO.class));
            final TypeAdapter<OneToOneChatDTO> adapterOneToOneChatDTO = gson.getDelegateAdapter(this, TypeToken.get(OneToOneChatDTO.class));

            return (TypeAdapter<T>) new TypeAdapter<GetConversationsOfUser200ResponseInner>() {
                @Override
                public void write(JsonWriter out, GetConversationsOfUser200ResponseInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ChannelDTO`
                    if (value.getActualInstance() instanceof ChannelDTO) {
                        JsonObject obj = adapterChannelDTO.toJsonTree((ChannelDTO)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ConversationDTO`
                    if (value.getActualInstance() instanceof ConversationDTO) {
                        JsonObject obj = adapterConversationDTO.toJsonTree((ConversationDTO)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GroupChatDTO`
                    if (value.getActualInstance() instanceof GroupChatDTO) {
                        JsonObject obj = adapterGroupChatDTO.toJsonTree((GroupChatDTO)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `OneToOneChatDTO`
                    if (value.getActualInstance() instanceof OneToOneChatDTO) {
                        JsonObject obj = adapterOneToOneChatDTO.toJsonTree((OneToOneChatDTO)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ChannelDTO, ConversationDTO, GroupChatDTO, OneToOneChatDTO");
                }

                @Override
                public GetConversationsOfUser200ResponseInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ChannelDTO
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ChannelDTO.validateJsonObject(jsonObject);
                        actualAdapter = adapterChannelDTO;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ChannelDTO'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ChannelDTO failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ChannelDTO'", e);
                    }

                    // deserialize ConversationDTO
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ConversationDTO.validateJsonObject(jsonObject);
                        actualAdapter = adapterConversationDTO;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ConversationDTO'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ConversationDTO failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ConversationDTO'", e);
                    }

                    // deserialize GroupChatDTO
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GroupChatDTO.validateJsonObject(jsonObject);
                        actualAdapter = adapterGroupChatDTO;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GroupChatDTO'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GroupChatDTO failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GroupChatDTO'", e);
                    }

                    // deserialize OneToOneChatDTO
                    try {
                        // validate the JSON object to see if any exception is thrown
                        OneToOneChatDTO.validateJsonObject(jsonObject);
                        actualAdapter = adapterOneToOneChatDTO;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'OneToOneChatDTO'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for OneToOneChatDTO failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'OneToOneChatDTO'", e);
                    }

                    if (match == 1) {
                        GetConversationsOfUser200ResponseInner ret = new GetConversationsOfUser200ResponseInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetConversationsOfUser200ResponseInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetConversationsOfUser200ResponseInner() {
        super("oneOf", Boolean.FALSE);
    }

    public GetConversationsOfUser200ResponseInner(ChannelDTO o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetConversationsOfUser200ResponseInner(ConversationDTO o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetConversationsOfUser200ResponseInner(GroupChatDTO o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetConversationsOfUser200ResponseInner(OneToOneChatDTO o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ChannelDTO", new GenericType<ChannelDTO>() {
        });
        schemas.put("ConversationDTO", new GenericType<ConversationDTO>() {
        });
        schemas.put("GroupChatDTO", new GenericType<GroupChatDTO>() {
        });
        schemas.put("OneToOneChatDTO", new GenericType<OneToOneChatDTO>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetConversationsOfUser200ResponseInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ChannelDTO, ConversationDTO, GroupChatDTO, OneToOneChatDTO
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ChannelDTO) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ConversationDTO) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GroupChatDTO) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OneToOneChatDTO) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ChannelDTO, ConversationDTO, GroupChatDTO, OneToOneChatDTO");
    }

    /**
     * Get the actual instance, which can be the following:
     * ChannelDTO, ConversationDTO, GroupChatDTO, OneToOneChatDTO
     *
     * @return The actual instance (ChannelDTO, ConversationDTO, GroupChatDTO, OneToOneChatDTO)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ChannelDTO`. If the actual instance is not `ChannelDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ChannelDTO`
     * @throws ClassCastException if the instance is not `ChannelDTO`
     */
    public ChannelDTO getChannelDTO() throws ClassCastException {
        return (ChannelDTO)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConversationDTO`. If the actual instance is not `ConversationDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConversationDTO`
     * @throws ClassCastException if the instance is not `ConversationDTO`
     */
    public ConversationDTO getConversationDTO() throws ClassCastException {
        return (ConversationDTO)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GroupChatDTO`. If the actual instance is not `GroupChatDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GroupChatDTO`
     * @throws ClassCastException if the instance is not `GroupChatDTO`
     */
    public GroupChatDTO getGroupChatDTO() throws ClassCastException {
        return (GroupChatDTO)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OneToOneChatDTO`. If the actual instance is not `OneToOneChatDTO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OneToOneChatDTO`
     * @throws ClassCastException if the instance is not `OneToOneChatDTO`
     */
    public OneToOneChatDTO getOneToOneChatDTO() throws ClassCastException {
        return (OneToOneChatDTO)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetConversationsOfUser200ResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ChannelDTO
    try {
      ChannelDTO.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ChannelDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ConversationDTO
    try {
      ConversationDTO.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ConversationDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GroupChatDTO
    try {
      GroupChatDTO.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GroupChatDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OneToOneChatDTO
    try {
      OneToOneChatDTO.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for OneToOneChatDTO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetConversationsOfUser200ResponseInner with oneOf schemas: ChannelDTO, ConversationDTO, GroupChatDTO, OneToOneChatDTO. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetConversationsOfUser200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetConversationsOfUser200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to GetConversationsOfUser200ResponseInner
  */
  public static GetConversationsOfUser200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetConversationsOfUser200ResponseInner.class);
  }

 /**
  * Convert an instance of GetConversationsOfUser200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

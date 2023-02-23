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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.Attachment;
import org.openapitools.client.model.Course;
import org.openapitools.client.model.LectureUnit;
import org.openapitools.client.model.Post;

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
 * Lecture
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class Lecture {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private Set<Attachment> attachments = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_LECTURE_UNITS = "lectureUnits";
  @SerializedName(SERIALIZED_NAME_LECTURE_UNITS)
  private List<LectureUnit> lectureUnits = new ArrayList<>();

  public static final String SERIALIZED_NAME_POSTS = "posts";
  @SerializedName(SERIALIZED_NAME_POSTS)
  private Set<Post> posts = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private Course course;

  public Lecture() {
  }

  public Lecture id(Long id) {
    
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


  public Lecture title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Lecture description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Lecture startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Lecture endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Lecture attachments(Set<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public Lecture addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new LinkedHashSet<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable

  public Set<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(Set<Attachment> attachments) {
    this.attachments = attachments;
  }


  public Lecture lectureUnits(List<LectureUnit> lectureUnits) {
    
    this.lectureUnits = lectureUnits;
    return this;
  }

  public Lecture addLectureUnitsItem(LectureUnit lectureUnitsItem) {
    if (this.lectureUnits == null) {
      this.lectureUnits = new ArrayList<>();
    }
    this.lectureUnits.add(lectureUnitsItem);
    return this;
  }

   /**
   * Get lectureUnits
   * @return lectureUnits
  **/
  @javax.annotation.Nullable

  public List<LectureUnit> getLectureUnits() {
    return lectureUnits;
  }


  public void setLectureUnits(List<LectureUnit> lectureUnits) {
    this.lectureUnits = lectureUnits;
  }


  public Lecture posts(Set<Post> posts) {
    
    this.posts = posts;
    return this;
  }

  public Lecture addPostsItem(Post postsItem) {
    if (this.posts == null) {
      this.posts = new LinkedHashSet<>();
    }
    this.posts.add(postsItem);
    return this;
  }

   /**
   * Get posts
   * @return posts
  **/
  @javax.annotation.Nullable

  public Set<Post> getPosts() {
    return posts;
  }


  public void setPosts(Set<Post> posts) {
    this.posts = posts;
  }


  public Lecture course(Course course) {
    
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @javax.annotation.Nullable

  public Course getCourse() {
    return course;
  }


  public void setCourse(Course course) {
    this.course = course;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lecture lecture = (Lecture) o;
    return Objects.equals(this.id, lecture.id) &&
        Objects.equals(this.title, lecture.title) &&
        Objects.equals(this.description, lecture.description) &&
        Objects.equals(this.startDate, lecture.startDate) &&
        Objects.equals(this.endDate, lecture.endDate) &&
        Objects.equals(this.attachments, lecture.attachments) &&
        Objects.equals(this.lectureUnits, lecture.lectureUnits) &&
        Objects.equals(this.posts, lecture.posts) &&
        Objects.equals(this.course, lecture.course);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, startDate, endDate, attachments, lectureUnits, posts, course);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lecture {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    lectureUnits: ").append(toIndentedString(lectureUnits)).append("\n");
    sb.append("    posts: ").append(toIndentedString(posts)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("attachments");
    openapiFields.add("lectureUnits");
    openapiFields.add("posts");
    openapiFields.add("course");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Lecture
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Lecture.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Lecture is not found in the empty JSON string", Lecture.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Lecture.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Lecture` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            Attachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("lectureUnits") != null && !jsonObj.get("lectureUnits").isJsonNull()) {
        JsonArray jsonArraylectureUnits = jsonObj.getAsJsonArray("lectureUnits");
        if (jsonArraylectureUnits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lectureUnits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lectureUnits` to be an array in the JSON string but got `%s`", jsonObj.get("lectureUnits").toString()));
          }

          // validate the optional field `lectureUnits` (array)
          for (int i = 0; i < jsonArraylectureUnits.size(); i++) {
            LectureUnit.validateJsonObject(jsonArraylectureUnits.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("posts") != null && !jsonObj.get("posts").isJsonNull()) {
        JsonArray jsonArrayposts = jsonObj.getAsJsonArray("posts");
        if (jsonArrayposts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("posts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `posts` to be an array in the JSON string but got `%s`", jsonObj.get("posts").toString()));
          }

          // validate the optional field `posts` (array)
          for (int i = 0; i < jsonArrayposts.size(); i++) {
            Post.validateJsonObject(jsonArrayposts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `course`
      if (jsonObj.get("course") != null && !jsonObj.get("course").isJsonNull()) {
        Course.validateJsonObject(jsonObj.getAsJsonObject("course"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Lecture.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Lecture' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Lecture> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Lecture.class));

       return (TypeAdapter<T>) new TypeAdapter<Lecture>() {
           @Override
           public void write(JsonWriter out, Lecture value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Lecture read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Lecture given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Lecture
  * @throws IOException if the JSON string is invalid with respect to Lecture
  */
  public static Lecture fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Lecture.class);
  }

 /**
  * Convert an instance of Lecture to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

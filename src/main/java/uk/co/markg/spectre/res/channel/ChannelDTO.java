package uk.co.markg.spectre.res.channel;

import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.markg.spectre.res.user.UserDTO;

public class ChannelDTO {

  @JsonProperty
  private long id;
  @JsonProperty
  private int type;
  @JsonProperty("guild_id")
  private long guildId;
  @JsonProperty
  private int position;
  @JsonProperty("permission_overwrites")
  private OverwriteDTO[] permissionOverwrites;
  @JsonProperty
  private String name;
  @JsonProperty
  private String topic;
  @JsonProperty
  private boolean nsfw;
  @JsonProperty("last_message_id")
  private long lastMessageId;
  @JsonProperty
  private int bitrate;
  @JsonProperty("user_limit")
  private int userLimit;
  @JsonProperty("rate_limit_per_user")
  private int rateLimitPerUser;
  @JsonProperty
  private UserDTO[] recipients;
  @JsonProperty
  private String icon;
  @JsonProperty("owner_id")
  private long ownerId;
  @JsonProperty("application_id")
  private long applicationId;
  @JsonProperty("parent_id")
  private long parentId;
  @JsonProperty("last_pin_timestamp")
  private String lastPinTimestamp;

  /**
   * @return the id
   */
  public long getId() {
      return id;
  }
  
  /**
   * @return the type
   */
  public int getType() {
      return type;
  }
  
  /**
   * @return the guildId
   */
  public long getGuildId() {
      return guildId;
  }
  
  /**
   * @return the position
   */
  public int getPosition() {
      return position;
  }
  
  /**
   * @return the permissionOverwrites
   */
  public OverwriteDTO[] getPermissionOverwrites() {
      return permissionOverwrites;
  }
  
  /**
   * @return the name
   */
  public String getName() {
      return name;
  }
  
  /**
   * @return the topic
   */
  public String getTopic() {
      return topic;
  }
  
  /**
   * @return the nsfw
   */
  public boolean isNsfw() {
      return nsfw;
  }
  
  /**
   * @return the lastMessageId
   */
  public long getLastMessageId() {
      return lastMessageId;
  }
  
  /**
   * @return the bitrate
   */
  public int getBitrate() {
      return bitrate;
  }
  
  /**
   * @return the userLimit
   */
  public int getUserLimit() {
      return userLimit;
  }
  
  /**
   * @return the rateLimitPerUser
   */
  public int getRateLimitPerUser() {
      return rateLimitPerUser;
  }
  
  /**
   * @return the recipients
   */
  public UserDTO[] getRecipients() {
      return recipients;
  }
  
  /**
   * @return the icon
   */
  public String getIcon() {
      return icon;
  }
  
  /**
   * @return the ownerId
   */
  public long getOwnerId() {
      return ownerId;
  }
  
  /**
   * @return the applicationId
   */
  public long getApplicationId() {
      return applicationId;
  }
  
  /**
   * @return the parentId
   */
  public long getParentId() {
      return parentId;
  }
  
  /**
   * @return the lastPinTimestamp
   */
  public String getLastPinTimestamp() {
      return lastPinTimestamp;
  }
  
}

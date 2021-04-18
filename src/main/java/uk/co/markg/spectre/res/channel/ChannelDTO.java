package uk.co.markg.spectre.res.channel;

import com.fasterxml.jackson.annotation.JsonCreator;
import uk.co.markg.spectre.res.user.UserDTO;

public class ChannelDTO {

  private final long id;
  private final int type;
  private final long guildId;
  private final int position;
  private final OverwriteDTO[] permissionOverwrites;
  private final String name;
  private final String topic;
  private final boolean nsfw;
  private final long lastMessageId;
  private final int bitrate;
  private final int userLimit;
  private final int rateLimitPerUser;
  private final UserDTO[] recipients;
  private final String icon;
  private final long ownerId;
  private final long applicationId;
  private final long parentId;
  private final String lastPinTimestamp;

  @JsonCreator
  public ChannelDTO(long id, int type, long guildId, int position,
      OverwriteDTO[] permissionOverwrites, String name, String topic, boolean nsfw,
      long lastMessageId, int bitrate, int userLimit, int rateLimitPerUser, UserDTO[] recipients,
      String icon, long ownerId, long applicationId, long parentId, String lastPinTimestamp) {
    this.id = id;
    this.type = type;
    this.guildId = guildId;
    this.position = position;
    this.permissionOverwrites = permissionOverwrites;
    this.name = name;
    this.topic = topic;
    this.nsfw = nsfw;
    this.lastMessageId = lastMessageId;
    this.bitrate = bitrate;
    this.userLimit = userLimit;
    this.rateLimitPerUser = rateLimitPerUser;
    this.recipients = recipients;
    this.icon = icon;
    this.ownerId = ownerId;
    this.applicationId = applicationId;
    this.parentId = parentId;
    this.lastPinTimestamp = lastPinTimestamp;
  }

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

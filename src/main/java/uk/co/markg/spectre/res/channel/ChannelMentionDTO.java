package uk.co.markg.spectre.res.channel;

public class ChannelMentionDTO {

  private final long id;
  private final long guildId;
  private final int type;
  private final String name;

  public ChannelMentionDTO(long id, long guildId, int type, String name) {
    this.id = id;
    this.guildId = guildId;
    this.type = type;
    this.name = name;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the guildId
   */
  public long getGuildId() {
    return guildId;
  }

  /**
   * @return the type
   */
  public int getType() {
    return type;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
}

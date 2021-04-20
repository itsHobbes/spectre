package uk.co.markg.spectre.topic.oauth2;

import uk.co.markg.spectre.res.user.UserDTO;
import uk.co.markg.spectre.topic.teams.TeamDTO;

public class ApplicationDTO {

  private final long id;
  private final String name;
  private final String icon;
  private final String description;
  private final String[] rpcOrigins;
  private final boolean botPublic;
  private final boolean botRequireCodeGrant;
  private final String termsOfServiceUrl;
  private final String privacyPolicyUrl;
  private final UserDTO owner;
  private final String summary;
  private final String verifyKey;
  private final TeamDTO team;
  private final long guildId;
  private final long primarySkuId;
  private final String slug;
  private final String coverImage;
  private final int flags;

  public ApplicationDTO(long id, String name, String icon, String description, String[] rpcOrigins,
      boolean botPublic, boolean botRequireCodeGrant, String termsOfServiceUrl,
      String privacyPolicyUrl, UserDTO owner, String summary, String verifyKey, TeamDTO team,
      long guildId, long primarySkuId, String slug, String coverImage, int flags) {
    this.id = id;
    this.name = name;
    this.icon = icon;
    this.description = description;
    this.rpcOrigins = rpcOrigins;
    this.botPublic = botPublic;
    this.botRequireCodeGrant = botRequireCodeGrant;
    this.termsOfServiceUrl = termsOfServiceUrl;
    this.privacyPolicyUrl = privacyPolicyUrl;
    this.owner = owner;
    this.summary = summary;
    this.verifyKey = verifyKey;
    this.team = team;
    this.guildId = guildId;
    this.primarySkuId = primarySkuId;
    this.slug = slug;
    this.coverImage = coverImage;
    this.flags = flags;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the icon
   */
  public String getIcon() {
    return icon;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @return the rpcOrigins
   */
  public String[] getRpcOrigins() {
    return rpcOrigins;
  }

  /**
   * @return the botPublic
   */
  public boolean isBotPublic() {
    return botPublic;
  }

  /**
   * @return the botRequireCodeGrant
   */
  public boolean isBotRequireCodeGrant() {
    return botRequireCodeGrant;
  }

  /**
   * @return the termsOfServiceUrl
   */
  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }

  /**
   * @return the privacyPolicyUrl
   */
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  /**
   * @return the owner
   */
  public UserDTO getOwner() {
    return owner;
  }

  /**
   * @return the summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * @return the verifyKey
   */
  public String getVerifyKey() {
    return verifyKey;
  }

  /**
   * @return the team
   */
  public TeamDTO getTeam() {
    return team;
  }

  /**
   * @return the guildId
   */
  public long getGuildId() {
    return guildId;
  }

  /**
   * @return the primarySkuId
   */
  public long getPrimarySkuId() {
    return primarySkuId;
  }

  /**
   * @return the slug
   */
  public String getSlug() {
    return slug;
  }

  /**
   * @return the coverImage
   */
  public String getCoverImage() {
    return coverImage;
  }

  /**
   * @return the flags
   */
  public int getFlags() {
    return flags;
  }



}

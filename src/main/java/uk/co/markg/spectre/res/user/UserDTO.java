package uk.co.markg.spectre.res.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

  @JsonProperty
  private long id;
  @JsonProperty
  private String username;
  @JsonProperty
  private String discriminator;
  @JsonProperty
  private String avatar; // n
  @JsonProperty
  private boolean bot; // o
  @JsonProperty
  private boolean system; // o
  @JsonProperty("mfa_enabled")
  private boolean mfa; // o
  @JsonProperty
  private String locale; // o
  @JsonProperty
  private boolean verified; // o
  @JsonProperty
  private String email; // o&n
  @JsonProperty
  private int flags; // o
  @JsonProperty("premium_type")
  private int premiumType; // o
  @JsonProperty("public_flags")
  private int publicFlags; // o

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @return the discriminator
   */
  public String getDiscriminator() {
    return discriminator;
  }

  /**
   * @return the avatar
   */
  public String getAvatar() {
    return avatar;
  }

  /**
   * @return the bot
   */
  public boolean isBot() {
    return bot;
  }

  /**
   * @return the system
   */
  public boolean isSystem() {
    return system;
  }

  /**
   * @return the mfa
   */
  public boolean isMfa() {
    return mfa;
  }

  /**
   * @return the locale
   */
  public String getLocale() {
    return locale;
  }

  /**
   * @return the verified
   */
  public boolean isVerified() {
    return verified;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @return the flags
   */
  public int getFlags() {
    return flags;
  }

  /**
   * @return the premiumType
   */
  public int getPremiumType() {
    return premiumType;
  }

  /**
   * @return the publicFlags
   */
  public int getPublicFlags() {
    return publicFlags;
  }

}

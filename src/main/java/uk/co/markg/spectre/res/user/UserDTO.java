package uk.co.markg.spectre.res.user;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserDTO {

  private final long id;
  private final String username;
  private final String discriminator;
  private final String avatar; // n
  private final boolean bot; // o
  private final boolean system; // o
  private final boolean mfaEnabled; // o
  private final String locale; // o
  private final boolean verified; // o
  private final String email; // o&n
  private final int flags; // o
  private final int premiumType; // o
  private final int publicFlags; // o

  @JsonCreator
  public UserDTO(long id, String username, String discriminator, String avatar, boolean bot,
      boolean system, boolean mfaEnabled, String locale, boolean verified, String email, int flags,
      int premiumType, int publicFlags) {
    this.id = id;
    this.username = username;
    this.discriminator = discriminator;
    this.avatar = avatar;
    this.bot = bot;
    this.system = system;
    this.mfaEnabled = mfaEnabled;
    this.locale = locale;
    this.verified = verified;
    this.email = email;
    this.flags = flags;
    this.premiumType = premiumType;
    this.publicFlags = publicFlags;

  }

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
    return mfaEnabled;
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

package uk.co.markg.spectre.res.user;

import java.util.EnumSet;
import java.util.Optional;

public class User {

  private long id;
  private String username;
  private int discriminator;
  private String avatar; // n
  private boolean bot; // o
  private boolean system; // o
  private boolean mfa; // o
  private String locale; // o
  private boolean verified; // o
  private String email; // o&n
  private EnumSet<UserFlag> flags; // o
  private PremiumType premiumType; // o
  private EnumSet<UserFlag> publicFlags; // o

  public static User from(UserDTO dto) {
    return new User(dto);
  }

  private User(UserDTO dto) {
    this.id = dto.getId();
    this.username = dto.getUsername();
    this.discriminator = Integer.parseInt(dto.getDiscriminator());
    this.avatar = dto.getAvatar();
    this.bot = dto.isBot();
    this.system = dto.isSystem();
    this.mfa = dto.isMfa();
    this.locale = dto.getLocale();
    this.verified = dto.isVerified();
    this.email = dto.getEmail();
    this.flags = UserFlag.getFlags(dto.getFlags());
    this.premiumType = PremiumType.valueOf(dto.getPremiumType());
    this.publicFlags = UserFlag.getFlags(dto.getPublicFlags());
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
    return String.format("%04d", discriminator);
  }

  /**
   * @return the avatar
   */
  public Optional<String> getAvatar() {
    return Optional.ofNullable(avatar);
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
  public Optional<String> getLocale() {
    return Optional.ofNullable(locale);
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
  public Optional<String> getEmail() {
    return Optional.ofNullable(email);
  }

  /**
   * @return the flags
   */
  public EnumSet<UserFlag> getFlags() {
    return flags;
  }

  /**
   * @return the premiumType
   */
  public PremiumType getPremiumType() {
    return premiumType;
  }

  /**
   * @return the publicFlags
   */
  public EnumSet<UserFlag> getPublicFlags() {
    return publicFlags;
  }

  /**
   * @return the complete user tag
   */
  public String getTag() {
    return username + '#' + getDiscriminator();
  }

  /**
   * @return the user as a discord mention
   */
  public String getMention() {
    return "<@" + id + '>';
  }

  /**
   * @return the default avatar of the user
   */
  public String getDefaultAvatar() {
    return String.valueOf(discriminator % 5);
  }

}

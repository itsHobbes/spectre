package uk.co.markg.spectre.res.user;

import java.util.EnumSet;

public class User {

  private long id;
  private String username;
  private String discriminator;
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
    this.discriminator = dto.getDiscriminator();
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

}

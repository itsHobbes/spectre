package uk.co.markg.spectre.res.user;

import java.util.EnumSet;

public enum UserFlag {
  
  NONE(0),
  DISCORD_EMPLOYEE(1<<0),
  PARTNERED_SERVER_OWNER(1<<1),
  HYPESQUAD_EVENTS(1<<2),
  BUG_HUNTER_LEVEL_1(1<<3),
  HOUSE_BRAVERY(1<<6),
  HOUSE_BRILLIANCE(1<<7),
  HOUSE_BALANCE(1<<8),
  EARLY_SUPPORTER(1<<9),
  TEAM_USER(1<<10),
  SYSTEM(1<<12),
  BUG_HUNTER_LEVEL_2(1<<14),
  VERIFIED_BOT(1<<16),
  EARLY_VERIFIED_BOT_DEVELOPER(1<<17);
  
  private int value;
  
  private UserFlag(int value) {
    this.value = value;
  }
  
  public static EnumSet<UserFlag> getFlags(int flags) {
    if (flags < 0) {
      throw new IllegalArgumentException("Flags must be positive");
    }
    if (flags == 0) {
      return EnumSet.of(UserFlag.NONE);
    }
    EnumSet<UserFlag> result = EnumSet.noneOf(UserFlag.class);
    for (UserFlag flag : values()) {
      if (flag == UserFlag.NONE) {
        continue;
      }
      if ((flag.value & flags) == flag.value) {
        result.add(flag);
      }
    }
    return result;
  }
  
}

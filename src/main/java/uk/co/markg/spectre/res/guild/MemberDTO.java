package uk.co.markg.spectre.res.guild;

import com.fasterxml.jackson.annotation.JsonCreator;
import uk.co.markg.spectre.res.user.UserDTO;

public class MemberDTO {

  private final UserDTO user;
  private final String nick;
  private final long[] roles;
  private final String joinedAt;
  private final String premiumSince;
  private final boolean deaf;
  private final boolean mute;
  private final boolean pending;
  private final String permissions;

  @JsonCreator
  public MemberDTO(UserDTO user, String nick, long[] roles, String joinedAt, String premiumSince,
      boolean deaf, boolean mute, boolean pending, String permissions) {
    this.user = user;
    this.nick = nick;
    this.roles = roles;
    this.joinedAt = joinedAt;
    this.premiumSince = premiumSince;
    this.deaf = deaf;
    this.mute = mute;
    this.pending = pending;
    this.permissions = permissions;
  }

  /**
   * @return the user
   */
  public UserDTO getUser() {
    return user;
  }

  /**
   * @return the nick
   */
  public String getNick() {
    return nick;
  }

  /**
   * @return the roles
   */
  public long[] getRoles() {
    return roles;
  }

  /**
   * @return the joinedAt
   */
  public String getJoinedAt() {
    return joinedAt;
  }

  /**
   * @return the premiumSince
   */
  public String getPremiumSince() {
    return premiumSince;
  }

  /**
   * @return the deaf
   */
  public boolean isDeaf() {
    return deaf;
  }

  /**
   * @return the mute
   */
  public boolean isMute() {
    return mute;
  }

  /**
   * @return the pending
   */
  public boolean isPending() {
    return pending;
  }

  /**
   * @return the permissions
   */
  public String getPermissions() {
    return permissions;
  }

}

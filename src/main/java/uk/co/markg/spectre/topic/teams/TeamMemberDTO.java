package uk.co.markg.spectre.topic.teams;

import uk.co.markg.spectre.res.user.UserDTO;

public class TeamMemberDTO {

  private final int membershipState;
  private final String[] permissions;
  private final long teamId;
  private final UserDTO user;

  public TeamMemberDTO(int membershipState, String[] permissions, long teamId, UserDTO user) {
    this.membershipState = membershipState;
    this.permissions = permissions;
    this.teamId = teamId;
    this.user = user;
  }

  /**
   * @return the membershipState
   */
  public int getMembershipState() {
    return membershipState;
  }

  /**
   * @return the permissions
   */
  public String[] getPermissions() {
    return permissions;
  }

  /**
   * @return the teamId
   */
  public long getTeamId() {
    return teamId;
  }

  /**
   * @return the user
   */
  public UserDTO getUser() {
    return user;
  }



}

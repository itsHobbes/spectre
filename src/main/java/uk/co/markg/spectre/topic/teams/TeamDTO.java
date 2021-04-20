package uk.co.markg.spectre.topic.teams;

public class TeamDTO {

  private final String icon;
  private final long id;
  private final TeamMemberDTO[] members;
  private final long ownerUserId;

  public TeamDTO(String icon, long id, TeamMemberDTO[] members, long ownerUserId) {
    this.icon = icon;
    this.id = id;
    this.members = members;
    this.ownerUserId = ownerUserId;
  }

  /**
   * @return the icon
   */
  public String getIcon() {
    return icon;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the members
   */
  public TeamMemberDTO[] getMembers() {
    return members;
  }

  /**
   * @return the ownerUserId
   */
  public long getOwnerUserId() {
    return ownerUserId;
  }

}

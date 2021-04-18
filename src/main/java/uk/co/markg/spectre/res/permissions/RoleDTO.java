package uk.co.markg.spectre.res.permissions;

import com.fasterxml.jackson.annotation.JsonCreator;

public class RoleDTO {

  private final long id;
  private final String name;
  private final int color;
  private final boolean hoist;
  private final int position;
  private final String permissions;
  private final boolean managed;
  private final boolean mentionable;
  private final RoleTagDTO tags;

  @JsonCreator
  public RoleDTO(long id, String name, int color, boolean hoist, int position, String permissions,
      boolean managed, boolean mentionable, RoleTagDTO tags) {
    this.id = id;
    this.name = name;
    this.color = color;
    this.hoist = hoist;
    this.position = position;
    this.permissions = permissions;
    this.managed = managed;
    this.mentionable = mentionable;
    this.tags = tags;
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
   * @return the color
   */
  public int getColor() {
    return color;
  }

  /**
   * @return the hoist
   */
  public boolean isHoist() {
    return hoist;
  }

  /**
   * @return the position
   */
  public int getPosition() {
    return position;
  }

  /**
   * @return the permissions
   */
  public String getPermissions() {
    return permissions;
  }

  /**
   * @return the managed
   */
  public boolean isManaged() {
    return managed;
  }

  /**
   * @return the mentionable
   */
  public boolean isMentionable() {
    return mentionable;
  }

  /**
   * @return the tags
   */
  public RoleTagDTO getTags() {
    return tags;
  }



}

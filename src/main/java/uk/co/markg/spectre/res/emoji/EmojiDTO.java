package uk.co.markg.spectre.res.emoji;

import uk.co.markg.spectre.res.user.UserDTO;

public class EmojiDTO {

  private final long id;
  private final String name;
  private final long[] roles;
  private final UserDTO user;
  private final boolean requireColons;
  private final boolean managed;
  private final boolean animated;
  private final boolean available;

  public EmojiDTO(long id, String name, long[] roles, UserDTO user, boolean requireColons,
      boolean managed, boolean animated, boolean available) {
    this.id = id;
    this.name = name;
    this.roles = roles;
    this.user = user;
    this.requireColons = requireColons;
    this.managed = managed;
    this.animated = animated;
    this.available = available;
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
   * @return the roles
   */
  public long[] getRoles() {
    return roles;
  }

  /**
   * @return the user
   */
  public UserDTO getUser() {
    return user;
  }

  /**
   * @return the requireColons
   */
  public boolean isRequireColons() {
    return requireColons;
  }

  /**
   * @return the managed
   */
  public boolean isManaged() {
    return managed;
  }

  /**
   * @return the animated
   */
  public boolean isAnimated() {
    return animated;
  }

  /**
   * @return the available
   */
  public boolean isAvailable() {
    return available;
  }

}

package uk.co.markg.spectre.res.channel;

import com.fasterxml.jackson.annotation.JsonCreator;

public class OverwriteDTO {

  private final long id;
  private final int type;
  private final String allow;
  private final String deny;

  @JsonCreator
  public OverwriteDTO(long id, int type, String allow, String deny) {
    this.id = id;
    this.type = type;
    this.allow = allow;
    this.deny = deny;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the type
   */
  public int getType() {
    return type;
  }

  /**
   * @return the allow
   */
  public String getAllow() {
    return allow;
  }

  /**
   * @return the deny
   */
  public String getDeny() {
    return deny;
  }

}

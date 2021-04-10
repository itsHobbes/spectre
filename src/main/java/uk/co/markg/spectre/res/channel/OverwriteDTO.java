package uk.co.markg.spectre.res.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OverwriteDTO {

  @JsonProperty
  private long id;
  @JsonProperty
  private int type;
  @JsonProperty
  private String allow;
  @JsonProperty
  private String deny;
  
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

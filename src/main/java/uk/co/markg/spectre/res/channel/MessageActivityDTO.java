package uk.co.markg.spectre.res.channel;

public class MessageActivityDTO {

  private final int type;
  private final String partyId;

  public MessageActivityDTO(int type, String partyId) {
    this.type = type;
    this.partyId = partyId;
  }

  /**
   * @return the type
   */
  public int getType() {
    return type;
  }

  /**
   * @return the partyId
   */
  public String getPartyId() {
    return partyId;
  }

}

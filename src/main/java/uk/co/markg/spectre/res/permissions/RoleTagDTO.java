package uk.co.markg.spectre.res.permissions;

import com.fasterxml.jackson.annotation.JsonCreator;

public class RoleTagDTO {

  private final long botId;
  private final long integrationId;
  private final String premiumSubscriber; // null type

  @JsonCreator
  public RoleTagDTO(long botId, long integrationId, String premiumSubscriber) {
    this.botId = botId;
    this.integrationId = integrationId;
    this.premiumSubscriber = premiumSubscriber;
  }

  /**
   * @return the botId
   */
  public long getBotId() {
    return botId;
  }

  /**
   * @return the integrationId
   */
  public long getIntegrationId() {
    return integrationId;
  }

  /**
   * @return the premiumSubscriber
   */
  public String getPremiumSubscriber() {
    return premiumSubscriber;
  }
}

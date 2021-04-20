package uk.co.markg.spectre.res.channel.embed;

import com.fasterxml.jackson.annotation.JsonCreator;

public class EmbedFooterDTO {

  private final String text;
  private final String iconUrl;
  private final String proxyIconUrl;

  @JsonCreator
  public EmbedFooterDTO(String text, String iconUrl, String proxyIconUrl) {
    this.text = text;
    this.iconUrl = iconUrl;
    this.proxyIconUrl = proxyIconUrl;
  }

  /**
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * @return the iconUrl
   */
  public String getIconUrl() {
    return iconUrl;
  }

  /**
   * @return the proxyIconUrl
   */
  public String getProxyIconUrl() {
    return proxyIconUrl;
  }



}

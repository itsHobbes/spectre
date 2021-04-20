package uk.co.markg.spectre.res.channel.embed;

import com.fasterxml.jackson.annotation.JsonCreator;

public class EmbedContentDTO {

  private final String url;
  private final String proxyUrl;
  private final int height;
  private final int width;

  @JsonCreator
  public EmbedContentDTO(String url, String proxyUrl, int height, int width) {
    this.url = url;
    this.proxyUrl = proxyUrl;
    this.height = height;
    this.width = width;
  }

  /**
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @return the proxyUrl
   */
  public String getProxyUrl() {
    return proxyUrl;
  }

  /**
   * @return the height
   */
  public int getHeight() {
    return height;
  }

  /**
   * @return the width
   */
  public int getWidth() {
    return width;
  }



}

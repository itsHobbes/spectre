package uk.co.markg.spectre.res.channel.embed;

public class EmbedAuthorDTO {

  private final String name;
  private final String url;
  private final String iconUrl;
  private final String proxyIconUrl;

  public EmbedAuthorDTO(String name, String url, String iconUrl, String proxyIconUrl) {
    this.name = name;
    this.url = url;
    this.iconUrl = iconUrl;
    this.proxyIconUrl = proxyIconUrl;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the url
   */
  public String getUrl() {
    return url;
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

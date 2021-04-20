package uk.co.markg.spectre.res.channel.embed;

public class EmbedProviderDTO {

  private final String name;
  private final String url;

  public EmbedProviderDTO(String name, String url) {
    this.name = name;
    this.url = url;
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

}


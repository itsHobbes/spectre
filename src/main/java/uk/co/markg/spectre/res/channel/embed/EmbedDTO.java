package uk.co.markg.spectre.res.channel.embed;

public class EmbedDTO {

  private final String title;
  private final String type;
  private final String description;
  private final String url;
  private final String timestamp;
  private final int color;
  private final EmbedFooterDTO footer;
  private final EmbedContentDTO image;
  private final EmbedContentDTO thumbnail;
  private final EmbedContentDTO video;
  private final EmbedProviderDTO provider;
  private final EmbedAuthorDTO author;
  private final EmbedFieldDTO[] fields;

  public EmbedDTO(String title, String type, String description, String url, String timestamp,
      int color, EmbedFooterDTO footer, EmbedContentDTO image, EmbedContentDTO thumbnail,
      EmbedContentDTO video, EmbedProviderDTO provider, EmbedAuthorDTO author,
      EmbedFieldDTO[] fields) {
    this.title = title;
    this.type = type;
    this.description = description;
    this.url = url;
    this.timestamp = timestamp;
    this.color = color;
    this.footer = footer;
    this.image = image;
    this.thumbnail = thumbnail;
    this.video = video;
    this.provider = provider;
    this.author = author;
    this.fields = fields;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * @return the color
   */
  public int getColor() {
    return color;
  }

  /**
   * @return the footer
   */
  public EmbedFooterDTO getFooter() {
    return footer;
  }

  /**
   * @return the image
   */
  public EmbedContentDTO getImage() {
    return image;
  }

  /**
   * @return the thumbnail
   */
  public EmbedContentDTO getThumbnail() {
    return thumbnail;
  }

  /**
   * @return the video
   */
  public EmbedContentDTO getVideo() {
    return video;
  }

  /**
   * @return the provider
   */
  public EmbedProviderDTO getProvider() {
    return provider;
  }

  /**
   * @return the author
   */
  public EmbedAuthorDTO getAuthor() {
    return author;
  }

  /**
   * @return the fields
   */
  public EmbedFieldDTO[] getFields() {
    return fields;
  }
}

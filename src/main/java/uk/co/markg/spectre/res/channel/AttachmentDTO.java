package uk.co.markg.spectre.res.channel;

import com.fasterxml.jackson.annotation.JsonCreator;

public class AttachmentDTO {

  private final long id;
  private final String filename;
  private final String contentType;
  private final int size;
  private final String url;
  private final String proxyUrl;
  private final int height;
  private final int width;

  @JsonCreator
  public AttachmentDTO(long id, String filename, String contentType, int size, String url,
      String proxyUrl, int height, int width) {
    this.id = id;
    this.filename = filename;
    this.contentType = contentType;
    this.size = size;
    this.url = url;
    this.proxyUrl = proxyUrl;
    this.height = height;
    this.width = width;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * @return the contentType
   */
  public String getContentType() {
    return contentType;
  }

  /**
   * @return the size
   */
  public int getSize() {
    return size;
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

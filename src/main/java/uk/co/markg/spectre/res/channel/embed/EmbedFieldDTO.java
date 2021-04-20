package uk.co.markg.spectre.res.channel.embed;

public class EmbedFieldDTO {

  private final String name;
  private final String value;
  private final boolean inline;

  public EmbedFieldDTO(String name, String value, boolean inline) {
    this.name = name;
    this.value = value;
    this.inline = inline;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * @return the inline
   */
  public boolean isInline() {
    return inline;
  }

}

package uk.co.markg.spectre.res.channel;

import uk.co.markg.spectre.res.emoji.EmojiDTO;

public class ReactionDTO {

  private final int count;
  private final boolean me;
  private final EmojiDTO emoji;

  public ReactionDTO(int count, boolean me, EmojiDTO emoji) {
    this.count = count;
    this.me = me;
    this.emoji = emoji;
  }

  /**
   * @return the count
   */
  public int getCount() {
    return count;
  }

  /**
   * @return the me
   */
  public boolean isMe() {
    return me;
  }

  /**
   * @return the emoji
   */
  public EmojiDTO getEmoji() {
    return emoji;
  }

}

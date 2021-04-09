package uk.co.markg.spectre;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotBuilder {
  private static final Logger logger = LoggerFactory.getLogger(BotBuilder.class);

  public static Bot build(String token) {
    return new DiscordBot(token);
  }

}

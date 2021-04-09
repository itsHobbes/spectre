package uk.co.markg.spectre;

import uk.co.markg.spectre.http.DiscordClient;

public class DiscordBot implements Bot {

  private final String token;
  private final DiscordClient client;

  public DiscordBot(String token) {
    this.token = token;
    this.client = new DiscordClient(token);
  }

  @Override
  public void connect() {
    // TODO Auto-generated method stub
  }

}

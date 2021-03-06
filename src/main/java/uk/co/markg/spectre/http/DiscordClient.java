package uk.co.markg.spectre.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Optional;
import com.fasterxml.jackson.databind.ObjectMapper;
import uk.co.markg.spectre.res.user.User;
import uk.co.markg.spectre.res.user.UserDTO;

public class DiscordClient {

  private static final String BASE_URL = "https://discord.com/api/v8/";
  private static final String USER_AGENT = "DiscordBot (https://github.com/itsHobbes/spectre, 0.1)";
  private final String token;
  private final HttpClient httpClient;

  public DiscordClient(String token) {
    this.token = token;
    this.httpClient = HttpClient.newBuilder().version(Version.HTTP_2)
        .followRedirects(Redirect.NORMAL).connectTimeout(Duration.ofSeconds(20)).build();
  }

  public Optional<User> getUser() {
    var req = getHttpGetRequest("users/@me");
    try {
      String body = httpClient.send(req, BodyHandlers.ofString()).body();
      ObjectMapper mapper = new ObjectMapper();
      var userdto = mapper.readValue(body, UserDTO.class);
      var opt =  Optional.of(User.from(userdto));
      return opt;
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
    return Optional.empty();
  }
  
  private HttpRequest getHttpGetRequest(String path) {
    return HttpRequest.newBuilder(URI.create(BASE_URL + path)).timeout(Duration.ofSeconds(30))
        .header("Authorization", "Bot " + token).header("Content-Type", "application/json")
        .header("User-Agent", USER_AGENT).GET().build();
  }

}

package uk.co.markg.spectre.res.user;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserFlagTest {

  @Test
  public void testEmptyFlags() {
    final var result = UserFlag.getFlags(0);
    assertTrue(result.contains(UserFlag.NONE));
    assertTrue(result.size() == 1);
  }

  @Test
  public void testAllFlags() {
    final var result = UserFlag.getFlags(219087);
    assertTrue(result.size() == UserFlag.values().length - 1);
  }

  @Test
  public void testDiscordEmployee() {
    final var result = UserFlag.getFlags(1);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.DISCORD_EMPLOYEE));
  }

  @Test
  public void testPartneredServerOwner() {
    final var result = UserFlag.getFlags(2);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.PARTNERED_SERVER_OWNER));
  }

  @Test
  public void testHypeSquadEvents() {
    final var result = UserFlag.getFlags(4);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.HYPESQUAD_EVENTS));
  }

  @Test
  public void testBugHunterLevel1() {
    final var result = UserFlag.getFlags(8);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.BUG_HUNTER_LEVEL_1));
  }

  @Test
  public void testHouseBravery() {
    final var result = UserFlag.getFlags(64);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.HOUSE_BRAVERY));
  }

  @Test
  public void testHouseBrilliance() {
    final var result = UserFlag.getFlags(128);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.HOUSE_BRILLIANCE));
  }

  @Test
  public void testHouseBalance() {
    final var result = UserFlag.getFlags(256);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.HOUSE_BALANCE));
  }

  @Test
  public void testEarlySupporter() {
    final var result = UserFlag.getFlags(512);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.EARLY_SUPPORTER));
  }

  @Test
  public void testTeamUser() {
    final var result = UserFlag.getFlags(1_024);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.TEAM_USER));
  }

  @Test
  public void testSystem() {
    final var result = UserFlag.getFlags(4_096);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.SYSTEM));
  }

  @Test
  public void testBugHunterLevel2() {
    final var result = UserFlag.getFlags(16_384);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.BUG_HUNTER_LEVEL_2));
  }

  @Test
  public void testVerifiedBot() {
    final var result = UserFlag.getFlags(65_536);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.VERIFIED_BOT));
  }

  @Test
  public void testEarlyVerifiedBotDeveloper() {
    final var result = UserFlag.getFlags(131_072);
    assertTrue(result.size() == 1);
    assertTrue(result.contains(UserFlag.EARLY_VERIFIED_BOT_DEVELOPER));
  }

  @ParameterizedTest
  @ValueSource(ints = {-1, -8, -256})
  public void testNegative(int value) {
    assertThrows(IllegalArgumentException.class, () -> UserFlag.getFlags(value));
  }

}

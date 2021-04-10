package uk.co.markg.spectre.res.user;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PremiumTypeTest {

  @Test
  public void testNonePremium() {
    var res = PremiumType.valueOf(0);
    assertTrue(res == PremiumType.NONE);
  }

  @Test
  public void testNitroClassic() {
    var res = PremiumType.valueOf(1);
    assertTrue(res == PremiumType.NITRO_CLASSIC);
  }

  @Test
  public void testNitro() {
    var res = PremiumType.valueOf(2);
    assertTrue(res == PremiumType.NITRO);
  }

  @Test
  public void testNegative() {
    assertThrows(IllegalArgumentException.class, () -> PremiumType.valueOf(-1));
  }

  @Test
  public void testNoTypeFound() {
    assertThrows(IllegalArgumentException.class, () -> PremiumType.valueOf(100_000));
  }

}

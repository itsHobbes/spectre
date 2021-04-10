package uk.co.markg.spectre.res.user;

import java.util.Arrays;

public enum PremiumType {

  NONE(0), NITRO_CLASSIC(1), NITRO(2);

  private int value;

  private PremiumType(int value) {
    this.value = value;
  }

  public static PremiumType valueOf(int flag) {
    if (flag < 0) {
      throw new IllegalArgumentException("Flags must be positive");
    }
    return Arrays.stream(values()).filter(f -> f.value == flag).findFirst()
        .orElseThrow(() -> new IllegalArgumentException("No PremiumType found"));
  }

}

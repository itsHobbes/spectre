package uk.co.markg.spectre;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {

  private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

  @Test
  public void shouldAnswerWithTrue() {
    logger.info("test");
    assertTrue(true);
  }
}

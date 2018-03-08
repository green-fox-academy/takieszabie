import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  Apple greenApple = new Apple();

  @Test
  public void getApplettest() {

    assertEquals("apple", greenApple.getApple());
  }
}
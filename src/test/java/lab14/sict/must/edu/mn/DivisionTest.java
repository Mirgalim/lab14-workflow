package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Division-ийн тестүүд — branch coverage 100% хангана.
 */
class DivisionTest {

  @Test
  void testDivideNormal() {
    Division calc = new Division();
    assertEquals(2.0, calc.divide(4.0, 2.0), 1e-9);
  }

  @Test
  void testDivideByZero() {
    Division calc = new Division();
    assertThrows(IllegalArgumentException.class, () -> calc.divide(4.0, 0.0));
  }
}

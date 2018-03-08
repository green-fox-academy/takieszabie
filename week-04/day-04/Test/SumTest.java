import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  List<Integer> inputIntegers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
    Sum bigSum = new Sum();

  @Test
  public void getSummer() {
      assertEquals(45, bigSum.summer(inputIntegers));
    }
  }
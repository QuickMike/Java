
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MRandomTest {
    @Test
    public void testRandomCoinFlip() throws Exception {
        int x1 = 0, x2 = 0;
        for (int i = 0; i < 10; i++) {
            if (MRandom.coinFlip()){
                x1++;
            }else {
                x2++;
            }
        }
        boolean result = false;
        if (x1*x2 > 0){
            result = true;
        }
        boolean expected = true;
        assertThat(result, is (expected));
    }

    @Test
    public void getRandomX() throws Exception {
        int x1 = 1, x2 = 3;
        int x3 = MRandom.getRandomX(x1, x2);
        boolean result = false;
        if (x3 >= x1 && x3 <= x2){
            result = true;
        }
        boolean expected = true;
        assertThat(result, is (expected));
    }
}
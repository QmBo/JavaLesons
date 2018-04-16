import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCheckerTest {

    @Test
    public void minOfArrIsFive() {
        int result = new ArrayChecker(new int[] {5,3,56,43,9,1,9}).minOfArr();
        assertThat(result, is(5));
    }

    @Test
    public void minOfArrIsFiveNegativ() {
        int result = new ArrayChecker(new int[] {5,3,56,43,9,-9,9}).minOfArr();
        assertThat(result, is(5));
    }

    @Test
    public void arithmeticDouble() {
        double result = new ArrayChecker(new int[] {1,2,3,4}).arithmetic();
        assertThat(result, is(2.5));
    }
}
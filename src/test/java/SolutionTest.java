import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void candyTest1() {
        int[] ratings = {1, 0, 2};
        int expected = 5;
        int actual = new Solution().candy(ratings);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void candyTest2() {
        int[] ratings = {1, 2, 2};
        int expected = 4;
        int actual = new Solution().candy(ratings);

        Assert.assertEquals(expected, actual);
    }
}

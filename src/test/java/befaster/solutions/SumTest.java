package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    @Test
    public void compute_sum() {
        assertThat(Sum.sum(1, 1), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumbersParam1LesserThanZero() {
        Sum.sum(-1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumbersParam2LesserThanZero() {
        Sum.sum(10, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumbersParam1GreaterThanOneHundred() {
        Sum.sum(101, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumbersParam2GreaterThanOneHundred() {
        Sum.sum(10, 101);
    }
}
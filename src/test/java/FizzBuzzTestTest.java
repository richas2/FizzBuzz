import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTestTest {


    FizzBuzz test;

    @Before
    public void setUp() {
        test = new FizzBuzz();
    }

    @Test
    public void should_return_fizz_when_no_is_divisible_by_three() {
        String output = test.fizzbuzz(3);
        assertEquals("fizz", output);
    }


    @Test
    public void should_return_buzz_when_no_is_divisible_by_five() {
        String output = test.fizzbuzz(5);
        assertEquals("buzz", output);
    }

    @Test
    public void should_return_fizzbuzz_when_no_is_divisible_by_fifteen() {
        String output = test.fizzbuzz(15);
        assertEquals("fizzbuzz", output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_IllegalArgumentException_when_no_is_negative() {

        test.fizzbuzz(-1);
    }

    @Test
    public void should_return_the_same_number_when_no_is_zero() {
        String output = test.fizzbuzz(0);
        assertEquals("0", output);
    }

    @Test
    public void should_return_the_same_number_when_no_other_requirement_is_fulfilled() {
        String output = test.fizzbuzz(892);
        assertEquals("892", output);
    }
}
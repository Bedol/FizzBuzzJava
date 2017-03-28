import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bweber on 28.03.2017.
 */
public class FizzBuzzTest {

    @Test
    public void returnOneForGivenOne() {
        assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    public void returnTwoForGivenTwo() {
        assertEquals("2", FizzBuzz.getResult(2));
    }

    @Test
    public void returnFizzForGivenThree() {
        assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void returnFourForGivenFour() {
        assertEquals("4", FizzBuzz.getResult(4));
    }

    @Test
    public void returnBuzzForGivenFive() {
        assertEquals("buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void returnFizzForGivenSix() {
        assertEquals("fizz", FizzBuzz.getResult(6));
    }

    @Test
    public void returnSevenForGivenSeven() {
        assertEquals("7", FizzBuzz.getResult(7));
    }

    @Test
    public void returnEightForGivenEight() {
        assertEquals("8", FizzBuzz.getResult(8));
    }

    @Test
    public void returnFizzForGivenNine() {
        assertEquals("fizz", FizzBuzz.getResult(9));
    }

    @Test
    public void returnBuzzForGivenTen() {
        assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void returnFizzBuzzForGivenFifteen() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(15));
    }

    @Test
    public void returnFizzBuzzForGivenThirty() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }

}
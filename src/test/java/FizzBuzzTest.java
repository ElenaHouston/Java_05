import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

//  1.  Positive Happy Path
//   if (start <= end)
//    return array;

    @Test
    public void testStartLessThenEnd_HappyPath() {
//        AAA
//        arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };
//        act

//        mozno tak
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String[] actualResult = fizzBuzz.fizzBuzz(start,end);

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testStartEqualsEnd_HappyPath() {
//        AAA
//        arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1" };
//        act

//        mozno tak
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String[] actualResult = fizzBuzz.fizzBuzz(start,end);

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);


    }
    @Ignore
        @Test
        public void testStartLessThenEnd_HappyPath_StartAndEndAreNegative() {
//        AAA
//        arrange
            int start = -20;
            int end = 1;
            String[] expectedResult = {"Buzz"};
//        act

//        mozno tak
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String[] actualResult = fizzBuzz.fizzBuzz(start,end);

            String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//        Assert

            Assert.assertEquals(actualResult, expectedResult);

        }

    //  2.  Negative testing
//   if (start > end)
//     return new String[0];

    @Test
    public void testStarGreaterThanEnd_Negative() {
//        AAA
//        arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
//        act

//        mozno tak
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String[] actualResult = fizzBuzz.fizzBuzz(start,end);

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//        Assert

        Assert.assertEquals(actualResult, expectedResult);

    }

    }











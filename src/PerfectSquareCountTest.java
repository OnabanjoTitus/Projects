import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquareCountTest {
    PerfectSquareCount perfectSquareCount;

    @BeforeEach
    void setUp() {
        perfectSquareCount = new PerfectSquareCount();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testForNumberOfTestCases(){
        perfectSquareCount.setNumberOfTestCases(2);
        assertEquals(2, perfectSquareCount.getNumberOfTestCases());
    }
    @Test
    void testForLengthAndWidth(){
        perfectSquareCount.setLength(2);
        perfectSquareCount.setWidth(5);
        assertEquals(2, perfectSquareCount.getLength());
        assertEquals(5, perfectSquareCount.getWidth());

    }
    @Test
    void testForLengthOFOutput(){
        perfectSquareCount.setNumberOfTestCases(2);
        assertEquals(2, perfectSquareCount.getTotalNumberOfPerfectSquares().length);
    }
    @Test
    void testForWidthIsGreaterThanLength() throws TotalNumberOfSquareException {
        perfectSquareCount.setNumberOfTestCases(1);
        perfectSquareCount.setLength(4);
        perfectSquareCount.setWidth(5);
        String answer= perfectSquareCount.calculateTheTotalNumberOfSquares();
        System.out.println(answer);
    }
    @Test
    void testForWidthIsEqualToLength() throws TotalNumberOfSquareException {
        perfectSquareCount.setNumberOfTestCases(1);
        perfectSquareCount.setLength(2);
        perfectSquareCount.setWidth(3);
        String answer= perfectSquareCount.calculateTheTotalNumberOfSquares();
        System.out.println(answer);
    }
    @Test
    void testForWidthILessThanLength() throws TotalNumberOfSquareException {
        perfectSquareCount.setNumberOfTestCases(1);
        perfectSquareCount.setLength(3);
        perfectSquareCount.setWidth(2);
        String answer= perfectSquareCount.calculateTheTotalNumberOfSquares();
        System.out.println(answer);
    }
    @Test
    void testForOnes() throws TotalNumberOfSquareException {
        perfectSquareCount.setNumberOfTestCases(1);
        perfectSquareCount.setLength(1);
        perfectSquareCount.setWidth(1);
        String answer= perfectSquareCount.calculateTheTotalNumberOfSquares();
        System.out.println(answer);
    }
    @Test
    void testForLengthEqualsWidth() throws TotalNumberOfSquareException {
        perfectSquareCount.setNumberOfTestCases(1);
        perfectSquareCount.setLength(3);
        perfectSquareCount.setWidth(3);
        String answer= perfectSquareCount.calculateTheTotalNumberOfSquares();
        System.out.println(answer);
    }
    @Test
    void testForLengthEqualsWidthForOthers() throws TotalNumberOfSquareException {
        perfectSquareCount.setNumberOfTestCases(3);
        perfectSquareCount.setLength(3);
        perfectSquareCount.setWidth(3);
        perfectSquareCount.calculateTheTotalNumberOfSquares();
        perfectSquareCount.setLength(1);
        perfectSquareCount.setWidth(1);
        perfectSquareCount.calculateTheTotalNumberOfSquares();
        perfectSquareCount.setLength(4);
        perfectSquareCount.setWidth(5);
        String answer= perfectSquareCount.calculateTheTotalNumberOfSquares();
        System.out.println(answer);
    }

}
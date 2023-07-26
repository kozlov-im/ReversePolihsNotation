import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReversePolishNotationCalculatorTest {
    static ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
    @Test
    public void shouldCalculateAddition() {
        assertEquals(3, calculator.calculatePolishNotation("1 2 +"));
    }
    @Test
    public void shouldCalculateAdditionWithBlanks() {
        assertEquals(3, calculator.calculatePolishNotation("1   2   + "));
    }
    @Test
    public void shouldCalculateAdditionWithNegatives() {
        assertEquals(-1, calculator.calculatePolishNotation("1   -2   + "));
    }
    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(1, calculator.calculatePolishNotation("2 1 -"));
    }
    @Test
    public void shouldCalculateSubtractionWithNegatives() {
        assertEquals(3, calculator.calculatePolishNotation("2 -1 -"));
    }
    @Test
    public void shouldCalculateAdditionAndSubtraction() {
        assertEquals(3, calculator.calculatePolishNotation("2 3 2 - +"));
    }
    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(4, calculator.calculatePolishNotation("2 2 *"));
    }
    @Test
    public void shouldCalculateMultiplicationWIthNegatives() {
        assertEquals(- 4, calculator.calculatePolishNotation("2 -2 *"));
    }
    @Test
    public void shouldCalculateAdditionAndMultiplication() {
        assertEquals(2, calculator.calculatePolishNotation("2 3 2 - *"));
    }
}
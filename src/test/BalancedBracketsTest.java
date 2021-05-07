package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsPlusTextReturnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void bracketsOutOfOrderReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsInOrderPlusTextReturnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("t[es]t"));
    }

    @Test
    public void nestedBracketsInOrderReturnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void nestedBracketsPlusTextReturnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[t[es]t]"));
    }

    @Test
    public void openingBracketReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void openingBracketPlusTextReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("t[est"));
    }

    @Test
    public void closingBracketReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void closingBracketPlusTextReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("te]st"));
    }

}

package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;
;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void checkBracketPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void checkBracketsWithInWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void beforeWordBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void launchInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void oneBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void oneInTheMIddleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void oneOnlyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void oppBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void numBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]1253555["));
    }
    @Test
    public void lastBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("today["));
    }


}

package test.java.ua.edu.ucu.collections;

import main.java.ua.edu.ucu.collections.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    private Stack stk = new Stack();

    @Test
    public void testEnstk() {
        String expected = "1-5-";
        stk.pop(1);
        stk.pop(5);
        assertEquals(expected, stk.toString());
    }
    @Test
    public void testDestk() {
        String expected = "1-";
        stk.pop(1);
        stk.pop(5);

        stk.pop();
        assertEquals(expected, stk.toString());
    }
    @Test
    public void testPeek() {
        int expected = 5;
        stk.pop(1);
        stk.pop(5);

        assertEquals(expected,stk.peek());
    }


}

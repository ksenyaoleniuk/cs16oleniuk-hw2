package test.java.ua.edu.ucu.collections;

import main.java.ua.edu.ucu.collections.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue = new Queue();

    @Test
    public void testEnqueue() {
        String expected = "1-5-";
        queue.enqueue(1);
        queue.enqueue(5);
        assertEquals(expected, queue.toString());
    }
    @Test
    public void testDequeue() {
        String expected = "5-";
        queue.enqueue(1);
        queue.enqueue(5);
        queue.dequeue();
        assertEquals(expected, queue.toString());
    }
    @Test
    public void testPeek() {
        int expected = 1;
        queue.enqueue(1);
        queue.enqueue(5);
        Object actual = queue.peek();
        assertEquals(expected, actual);
    }

}

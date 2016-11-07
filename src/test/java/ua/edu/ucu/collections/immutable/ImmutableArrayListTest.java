package test.java.ua.edu.ucu.collections.immutable;
import main.java.ua.edu.ucu.collections.immutable.ImmutableArrayList;
import main.java.ua.edu.ucu.collections.immutable.ImmutableArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private ImmutableArrayList testIA= new ImmutableArrayList(null);

    @Test
    public void addTest() {
        String expected = "1,2,";
        testIA = testIA.add(1);
        testIA = testIA.add(2);
        assertEquals(expected, testIA.toString());
    }
    @Test
    public void addWithIndexTest() {
        String expected = "1,3,2,";
        testIA = testIA.add(1);
        testIA = testIA.add(2);
        testIA = testIA.add(1,3);
        assertEquals(expected, testIA.toString());
    }
    @Test
    public void addAllTest() {
        Object[] obj = {3,4};
        String expected = "1,2,3,4,";
        testIA = testIA.add(1);
        testIA = testIA.add(2);
        testIA = testIA.addAll(obj);
        assertEquals(expected, testIA.toString());}
    @Test
    public void addAllWithIndexTest() {
        Object[] obj = {3,4};
        String expected = "3,4,1,2,";
        testIA = testIA.add(1);
        testIA = testIA.add(2);
        testIA = testIA.addAll(0,obj);
        assertEquals(expected, testIA.toString());}


}

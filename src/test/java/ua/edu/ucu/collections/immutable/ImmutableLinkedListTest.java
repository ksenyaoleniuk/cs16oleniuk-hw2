package test.java.ua.edu.ucu.collections.immutable;
import main.java.ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private ImmutableLinkedList testIL = new ImmutableLinkedList(null);
    @Test
    public void addTest() {
        String expected = "1-4-";
        testIL = testIL.add(1);
        testIL = testIL.add(4);
        assertEquals(expected, testIL.toString());

    }
    @Test
    public void addIndexTest(){
        String expected = "1-3-4-";
        testIL = testIL.add(1);
        testIL = testIL.add(4);
        testIL = testIL.add(1,3);
        assertEquals(expected, testIL.toString());
    }
    @Test
    public void sizeTest(){
        int expected = 4;
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        assertEquals(expected, testIL.size());

    }
    @Test
    public void addAllTest(){
        String expected = "1-3-4-2-";
        testIL = testIL.add(1);
        testIL = testIL.add(2);
        Object[] obj = {3,4};
        testIL = testIL.addAll(1,obj);
        assertEquals(expected, testIL.toString());

    }
    @Test
    public void removeTest(){
        String expected = "1-1-";
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        testIL = testIL.remove(2);
        assertEquals(expected, testIL.toString());
    }

    @Test
    public void getTest(){
        int expected = 2;
        testIL = testIL.add(1);
        testIL = testIL.add(2);
        testIL = testIL.add(2);

        assertEquals(expected, testIL.get(1));

    }
    @Test
    public void firstRemoveTest() {
        String expected = "1-2-2-2-";
        testIL = testIL.add(1);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.remove(1);
        assertEquals(expected, testIL.toString());}
    @Test
    public void addFirstTest() {
        String expected = "2-1-2-2-2-2-";
        testIL = testIL.add(1);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.addFirst(2);
        assertEquals(expected, testIL.toString());}

    @Test
    public void addLastTest() {
        String expected = "1-2-2-2-2-2-";
        testIL = testIL.add(1);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.add(2);
        testIL = testIL.addLast(2);
        assertEquals(expected, testIL.toString());}

    @Test
    public void getFirstTest(){
        int expected = 2;
        testIL = testIL.add(2);
        testIL = testIL.add(1);
        testIL = testIL.add(3);
        testIL = testIL.add(4);
        assertEquals(expected, testIL.getFirst());
    }
    @Test
    public void getLastTest(){
        int expected = 4;
        testIL = testIL.add(2);
        testIL = testIL.add(1);
        testIL = testIL.add(3);
        testIL = testIL.add(4);
        assertEquals(expected, testIL.getLast());
    }
    @Test
    public void indexOfTest(){
        int expected = 1;
        testIL = testIL.add(2);
        testIL = testIL.add(1);
        testIL = testIL.add(3);
        testIL = testIL.add(4);
        assertEquals(expected, testIL.indexOf(1));}
    @Test
    public void toStringTest(){
        String expected = "1-1-1-1-";
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        testIL = testIL.add(1);
        assertEquals(expected, testIL.toString());
    }
    @Test
    public void clearTest(){
        testIL = testIL.add(1);
        testIL = testIL.clear();
        assertEquals("", testIL.toString());
    }

    @Test
    public void isEmptyTest(){
        Boolean expected = false;
        testIL = testIL.add(1);
        assertEquals(expected, testIL.isEmpty());
    }
    @Test
    public void isEmptyTest2(){
        Boolean expected = true;
        testIL = testIL.add(1);
        testIL = testIL.remove(0);
        assertEquals(expected, testIL.isEmpty());
    }
}

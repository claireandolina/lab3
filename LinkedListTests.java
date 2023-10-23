import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
   
    public LinkedList[] initiateTestLinkedLists()
    {
        LinkedList emptyList = new LinkedList();
        LinkedList oneElementList = new LinkedList();
        LinkedList twoElementList = new LinkedList();
        LinkedList fiveElementList = new LinkedList();
        oneElementList.append(1);
        twoElementList.append(92);
        twoElementList.append(6);
        fiveElementList.append(45);
        fiveElementList.append(-5);
        fiveElementList.append(0);
        fiveElementList.append(8);
        fiveElementList.append(700);
        LinkedList[] testLists = {emptyList, oneElementList, twoElementList, fiveElementList};
        return testLists;

    }

    @Test 
	public void testPrepend()
    {
        LinkedList[] testLists = initiateTestLinkedLists();

        testLists[0].prepend(2);
        assertEquals("2", testLists[0].toString());

        testLists[1].prepend(2);
        assertEquals("2 1", testLists[1].toString());

        testLists[2].prepend(2);
        assertEquals("2 92 6", testLists[2].toString());

        testLists[3].prepend(2);
        assertEquals("2 45 -5 0 8 700", testLists[3].toString());
    }


    @Test
    public void testAppend()
    {
        LinkedList[] testLists = initiateTestLinkedLists();

        testLists[0].append(2);
        assertEquals("2", testLists[0].toString());

        testLists[1].append(2);
        assertEquals("1 2", testLists[1].toString());

        testLists[2].append(2);
        assertEquals("92 6 2", testLists[2].toString());

        testLists[3].append(2);
        assertEquals("45 -5 0 8 700 2", testLists[3].toString());
    }

    @Test
    public void testFirst()
    {
        LinkedList[] testLists = initiateTestLinkedLists();
        
        assertEquals(null, testLists[0].first());

        assertEquals(1, testLists[1].first());

        assertEquals(92, testLists[2].first());

        assertEquals(45, testLists[3].first());
    }

    @Test
    public void testLast()
    {
        LinkedList[] testLists = initiateTestLinkedLists();
        
        assertEquals(null, testLists[0].last());

        assertEquals(1, testLists[1].last());

        assertEquals(6, testLists[2].last());

        assertEquals(700, testLists[3].last());
    }
/* 
    @Test
    public void testToString()
    {

    }
*/
    @Test
    public void testLength()
    {
        LinkedList[] testLists = initiateTestLinkedLists();
        
        assertEquals(0, testLists[0].length());

        assertEquals(1, testLists[1].length());

        assertEquals(2, testLists[2].length());

        assertEquals(5, testLists[3].length());
    }
}

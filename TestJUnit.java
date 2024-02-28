import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
    @Test
    public void testAdd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }

    @Test
    public void testRemove1() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals("A", list.get(0));
        assertEquals("C", list.get(1));
    }

    @Test
    public void testGet() {
        DoublyLinkedList<Double> list = new DoublyLinkedList<>();
        list.add(1.5);
        list.add(2.3);
        list.add(3.7);

        assertEquals(Double.valueOf(2.3), list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBounds() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.get(1);
    }

    @Test
    public void testSize() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertEquals(0, list.size());

        list.add(1);
        list.add(2);
        assertEquals(2, list.size());

        list.remove(0);
        assertEquals(1, list.size());
    }
    @Test
    public void testAddAndGet() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, (int) list.get(0));
        assertEquals(2, (int) list.get(1));
        assertEquals(3, (int) list.get(2));
    }

    @Test
    public void testRemove2() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals("A", list.get(0));
        assertEquals("C", list.get(1));
    }

}
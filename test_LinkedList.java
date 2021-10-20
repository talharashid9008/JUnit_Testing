import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class test_LinkedList {
	@Test
	public void TestLinkedList() {
		LinkedList obj;
		obj = new LinkedList();
		assertEquals(null, obj.head);
		assertEquals(0, obj.size);
	}
	@Test
	public void Test_pushFront() {
		LinkedList obj;
		obj = new LinkedList();
		obj.pushFront(15);
		obj.pushFront(65);
		obj.pushFront(32);
		assertEquals(obj.size, 3);
		assertEquals(obj.head.key, 32);
		assertEquals(obj.head.next.key, 65);
	}
	@Test
	public void Test_pushBack() {
		LinkedList obj;
		obj = new LinkedList();
		obj.pushBack(13);
		obj.pushBack(23);
		assertEquals(obj.size, 2);
		assertEquals(obj.head.key, 13);
		assertEquals(obj.head.next.key, 23);
	}
	@Test
	public void Test_popBack() {
		LinkedList obj;
		obj = new LinkedList();
		obj.pushBack(2);
		obj.pushFront(11);
		obj.popBack();
		assertEquals(1, obj.size);
		obj.pushFront(12);
		obj.popBack(); 
		obj.popBack();
		assertEquals(null, obj.head);
		assertEquals(0, obj.size);
	}
	@Test
	public void popTest() {
		LinkedList obj;
		obj = new LinkedList();
		obj.pop(0);
		assertEquals(0, obj.size);//Pop element at 1st position
		obj.pushFront(1);
		obj.pushFront(2);
		obj.pushFront(3);
		obj.pop(1);
		obj.display();
		assertEquals(3, obj.head.key);
		assertEquals(1, obj.head.next.key);
		obj.pop(0);
		assertEquals(1, obj.size);
		assertEquals(1, obj.head.key);
	}
	@Test 
	public void Test_popFront() {
		LinkedList obj;
		obj = new LinkedList();
		assertEquals(0, obj.size);
		obj.pushFront(12);
		obj.pushFront(13);
		obj.popFront();
		assertEquals(1, obj.size);
	}
}

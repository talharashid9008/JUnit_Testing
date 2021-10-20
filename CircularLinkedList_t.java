import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CircularLinkedList_t {
	@Test
	public void Test_constructor() {
		CircularLinkedList obj;
		obj = new CircularLinkedList();
		assertEquals(null, obj.head);
	}
	@Test
	public void Test_pushFront() {
		CircularLinkedList obj;
		obj = new CircularLinkedList();
		obj.pushFront(1);
		assertEquals(1, obj.head.key);
		assertEquals(obj.head.key, obj.head.next.key);
		obj.pushFront(2);
		assertEquals(2, obj.head.key);
		assertEquals(1, obj.head.next.key);
		assertEquals(2, obj.head.next.next.key);
		obj.pushFront(3);
	}
	@Test
	public void Test_popFront() {
		CircularLinkedList obj;
		obj = new CircularLinkedList();
		obj.popFront();
		assertEquals(null, obj.head);
		obj.pushBack(1);
		obj.popFront();
		assertEquals(null,obj.head);
		obj.pushBack(1);
		obj.pushBack(2);
		obj.popFront();
		assertEquals(2, obj.head.key);
		assertEquals(2, obj.head.next.key);
	}
	@Test
	public void Test_pushBack() {
		CircularLinkedList obj;
		obj = new CircularLinkedList();
		obj.pushBack(1);
		assertEquals(1, obj.head.key);
		assertEquals(obj.head.key, obj.head.next.key);
		obj.pushBack(2);
		assertEquals(1, obj.head.key);
		assertEquals(2, obj.head.next.key);
		assertEquals(1, obj.head.next.next.key);
		obj.pushBack(3); 
	}
	@Test
	public void Test_popBack() {
		CircularLinkedList obj;
		obj = new CircularLinkedList();
		obj.popBack();
		assertEquals(null, obj.head);
		obj.pushBack(1);
		obj.popBack();
		assertEquals(null,obj.head);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.popBack();
		assertEquals(2, obj.head.key);
		assertEquals(2, obj.head.next.key);
		obj.display();

	}

}

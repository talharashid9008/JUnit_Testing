import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListSwapNodes_t {
	@Test
	public void Test_constructor() {
		LinkedListSwapNodes obj;
		obj = new LinkedListSwapNodes();
		assertEquals(null, obj.head);
	}
	@Test
	public void Test_pushFront() {
		LinkedListSwapNodes obj;
		obj = new LinkedListSwapNodes();
		obj.pushFront(1);
		assertEquals(1, obj.head.key);
		obj.pushFront(2);
		obj.pushFront(3);
		assertEquals(1, obj.head.next.next.key);
	}
	@Test
	public void Test_pushBack() { 
		LinkedListSwapNodes obj;
		obj = new LinkedListSwapNodes();
		obj.pushBack(1);
		obj.pushBack(2);
		assertEquals(1,obj.head.key);
		assertEquals(2,obj.head.next.key);
	} 
	@Test
	public void Test_swap() {
		LinkedListSwapNodes obj;
		obj = new LinkedListSwapNodes();
		assertEquals(null, obj.head);
		obj.pushBack(1);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.swap();
		assertEquals(3, obj.head.key);
		assertEquals(1, obj.head.next.next.key);
		obj.display();

	}

}
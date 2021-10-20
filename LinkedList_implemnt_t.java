import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedList_implemnt_t {
	@Test
	public void Test_Constructor() {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		assertEquals(null, obj.nextPointer);
	}
	@Test
	public void Testsize() {
		LinkedList_implemnt obj = null ;
		obj = new LinkedList_implemnt(); 
		obj.pushBack(1);
		obj.pushBack(2);
		assertEquals(5, obj.size());

	}
	@Test
	public void Test_Add() {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		obj.numofElements = 0;
		obj.add(1);
		assertEquals(1, obj.headPointer.data);
		assertEquals(1, obj.tailPointer.data);
		obj.add(2);
		assertEquals(2, obj.tailPointer.data);
		obj.add(3);
		assertEquals(obj.tailPointer, obj.tailPointer);

	}
	@Test 
	public void Test_pushFront() {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		obj.headPointer = null;
		obj.pushFront(1);
		assertEquals(1, obj.headPointer.data);
		assertEquals(1, obj.tailPointer.data);
	} 
	@Test
	public void Test_popFront() throws Exception {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		obj.pushFront(1);
		obj.popFront();
		obj.headPointer = null;
		assertEquals(null, obj.headPointer);
	}
	@Test
	public void Test_pushBack() {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		obj.pushBack(1);
		assertEquals(1, obj.tailPointer.data); 
		obj.tailPointer = obj.tailPointer = null;
		obj.pushBack(3); 
		assertEquals(3, obj.tailPointer.data);
		obj.display();
	}
	@Test
	public void Test_topFront() throws Exception {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		obj.pushFront(1);
		assertEquals(1, obj.topFront());
	}
	@Test
	public void TesttopBack() throws Exception {
		LinkedList_implemnt obj;
		obj = new LinkedList_implemnt();
		obj.pushBack(1);
		assertEquals(1, obj.topBack());
	}

}

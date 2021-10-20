import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Array_t {
	
	@Test
	public void Test_Insert() {
		Array obj;
		obj=new Array();
		assertEquals(0,obj.size);
		for(int i=0;i<50;i++)
		{
				obj.insert(i+5, i);
		}
		assertEquals(50,obj.size);
	}
	@Test
	public void Test_Deletion() { 
		Array obj;
		obj=new Array();
		obj.insert(0, 0);
		obj.insert(1, 1);
		obj.display();
		assertEquals(2,obj.size);
		obj.delete(0);
		obj.delete(1);
		assertEquals(0,obj.size);
		obj.display();
	}
	@Test
	public void linearSearch() {
		Array obj;
		obj=new Array();
		obj.insert(1, 0);
		obj.insert(3, 1);
		obj.insert(12, 2);
		obj.insert(34, 3);
		assertEquals(true,obj.linearSearch(12));
		assertEquals(false,obj.linearSearch(100));
	}
	@Test
	public void Test_BubbleSort() {
		Array obj;
		obj=new Array();
		obj.insert(5, 0);
		obj.insert(3, 1);
		obj.insert(1, 2);
		obj.insert(2, 3);
		obj.insert(4, 4);
		obj.display();
		obj.bubbleSort();
		obj.display();
	}
	@Test
	public void Test_BinarySearch() {
		Array obj;
		obj=new Array();
		obj.insert(16, 0);
		obj.insert(11, 1);
		obj.insert(19, 2);
		obj.insert(29, 3);
		obj.insert(31, 4);
		assertEquals(true,obj.binarySearch(16, 0, obj.size));
		assertEquals(true,obj.binarySearch(29, 0, obj.size));
		assertEquals(false,obj.binarySearch(100, 0, obj.size));
	}
	@Test
	public void GetValues() {
		Array obj;
		obj=new Array(); 
		obj.getValues();
	}
}
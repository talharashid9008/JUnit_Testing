import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class Queue_T {
	@Test
	void test_Queue() {
		Queue_arr exp = new Queue_arr(0);
	}
	@Test
	void test_Queue_display() {
		Queue_arr exp = new Queue_arr(0);
		exp.display();
	}
	@Test
	void test_Queue_enqueue() {
		Queue_arr exp = new Queue_arr(5);
		for(int i=0 ; i<5 ; i++)
		{
			exp.enqueue(i);
		}
		exp.display();
	}
	@Test
	void test_Queue_dequeue() {
		Queue_arr exp = new Queue_arr(5);
		exp.display();
		exp.dequeue();
		for(int i=0 ; i<5 ; i++)
		{
			exp.enqueue(i);
		}
		exp.display();
		for(int i=0 ;  i<5 ; i++)
		{
			assertEquals(i,exp.dequeue());
		}
	}

}

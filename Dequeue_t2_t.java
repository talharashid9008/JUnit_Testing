import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dequeue_t2_t {

	@Test
	void test_queue() {
		Dequeue_t2 queue = new Dequeue_t2(5); //create a queue
	}
	
	@Test
	void test_empty() {
		Dequeue_t2 queue = new Dequeue_t2(5); //create a queue
		assertEquals(true,queue.empty()) ;
	}
	void test_size() {
		Dequeue_t2 queue = new Dequeue_t2(3); //create a queue
		try {
			queue.enqueue(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1,queue.size()) ;
	}
	@Test
	void test_enqueue() {
		Dequeue_t2 queue = new Dequeue_t2(5); //create a queue
		for(int i=0 ; i<6 ; i++)
		{
			try {
				queue.enqueue(i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			queue.enqueue(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(false,queue.empty()) ;
		
	}
	
	@Test
	void test_display() {
		Dequeue_t2 queue = new Dequeue_t2(5); //create a queue
		for(int i=0 ; i<6 ; i++)
		{
			try {
				queue.enqueue(i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		queue.display();
	}
	
	@Test
	void test_dequeue() {
		Dequeue_t2 queue = new Dequeue_t2(5); //create a queue
		for(int i=0 ; i<7 ; i++)
		{
			try {
				queue.enqueue(i+1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0 ; i<6 ; i++)
		{
				try {
					assertEquals(queue.dequeue(),i+1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		queue.display();
	}

}

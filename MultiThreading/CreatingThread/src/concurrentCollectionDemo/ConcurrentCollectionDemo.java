package concurrentCollectionDemo;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		try {
			for(Integer i:list) {
				list.add(5);
				System.out.println(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package designPattern.iterator;

import java.util.Iterator;


	public class DemoIterator {

			public static <T> void Iterate(T[] type, Iterable<T>  iterableInstance) {
			
			Iterator<T> it=iterableInstance.iterator();
			
			while (it.hasNext()) {
				T element =it.next();
		 		
			}
			//meme r�sultat que la boucle while
			for (T element: iterableInstance) {
				
			}
		
			}
}

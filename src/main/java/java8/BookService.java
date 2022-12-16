package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getBooksSorted(){
		List<Book> books = new BookDAO().getBooks();
		//Below is the traditional approach. Commenting it to implement java8 way.
		//Collections.sort(books, new MyComparator());
		
		//Java8 way but will comment entire block as we have to use lambda expression
		/*Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});*/
		
		//Java8 - using lambda expression
		
		Collections.sort(books, (o2, o1)->o1.getName().compareTo(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		BookService service = new BookService();
		System.out.println(service.getBooksSorted().toString());
		
		//To to test if I still remember enhanced for loop
		List<Book> tempBooks = service.getBooksSorted();
		for(Book book : tempBooks) {
			System.out.println("==============>>"+book);
		}
	}

}

package java8;

import java.util.Arrays;
/*Sorting books by book name in ascending order*/
public class BookBubbleSort {
	
	public static void main(String[] args) {
		Book[] books1 = new Book[] { new Book(103, "Spring", 200), new Book(104, "Webservice", 300), new Book(101, "Core Java", 400), new Book(102, "Hibernate", 180)};
		Book tempBook;
		for(int i = 0; i < books1.length; i++) {
			for(int j = i+1; j < books1.length; j++) {
				if(books1[i].getName().charAt(0)>books1[j].getName().charAt(0)) {
					tempBook = books1[i];
					books1[i] = books1[j];
					books1[j] = tempBook;
				}
			}
		}
		
		Arrays.stream(books1).forEach(x->System.out.println(x));
	}
	
}

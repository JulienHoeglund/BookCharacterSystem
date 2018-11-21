package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private LinkedList<Book> Books;
	private LinkedList<Character> Characters;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Books=new LinkedList<Book>();
			Characters=new LinkedList<Character>();
			int c; 
			Scanner scan=new Scanner(System.in);
			do {
				System.out.println("Books & characters");
				System.out.println("1) 	Add a book");
				System.out.println("2)	Add a character");
				System.out.println("3)	Search");
				System.out.println("4)	Display all");
				System.out.println("5)	Quit");
				System.out.println("Choice: ");
				c=scan.nextInt();
				switch(c) {
					case 1: addBook(scan);
							break;
					case 2: addCharacter(scan);
							break;
					case 3: search(scan);
							break;
					case 4: displayAll(scan);
							break;
				}
			}while(c!=5);
			scan.close();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void addBook(Scanner scan) {
		Book book = new Book();
		System.out.println("Enter book title: ");
		book.setTitle(scan.next());
		System.out.println("Enter author: ");
		book.setAuthor(scan.next());
		System.out.println("Enter publisher name: ");
		book.setPublisher(scan.next());
		System.out.println("Enter year of release: ");
		book.setYear(scan.nextInt());
		System.out.println("Enter genre: ");
		book.setGenre(scan.next());
		System.out.println("Enter coverURL: ");
		book.setCoverURL(scan.next());
		System.out.println("Enter plot: ");
		book.setPlot(scan.next());
		
		Books.add(book);
	}
	public void addCharacter(Scanner scan) {
	}
	public void search(Scanner scan) {
	}
	public void displayAll(Scanner scan) {
		/*for(ListElement<Book> elem : Books) {
			System.out.println(elem.getID()+") ");
			Book b = elem.getObject();
			System.out.print(
					b.getTitle()+" "+
					b.getAuthor()+" "+
					b.getYear()+" "+
					b.getPublisher()+" "+
					b.getGenre()+" "+
					b.getCoverURL()+" "
			);
		}
		*/
	}
	public static void main(String[] args) {
		launch(args);
	}
}

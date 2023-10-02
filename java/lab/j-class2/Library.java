/*
2 - Modeling a Library
Design a class Book with attributes like title, author, and ISBN. Create a class Library that can
store multiple books. Implement methods to add books, remove books, and display all books in
the library.
 */
import java.util.Scanner;
public class Library {

  private static final Scanner input = new Scanner(System.in);
  public Book books[] = new Book[5];
  public int number_of_books = 0;

  void add_book(String title, String author, String isbn) {
    this.books[this.number_of_books] = new Book(title, author, isbn);
    this.number_of_books++;
  }

  void delete_book(String title) {
    boolean found = false;
    int i;
    for (i = 0; i < this.number_of_books; i++) {
      if (this.books[i].title.equals(title)) {
        for (int j = i + 1; j < books.length; j++) {
          this.books[j - 1] = this.books[j];
        }
        this.number_of_books--;
        found = true;
        break;
      }
    }
    if (found == true) {
      System.out.print("the book has been deleted sucessfully");
    } else {
      System.out.print("the book is not present in the library.");
    }
  }

  void display_all_books() {
    System.out.println("the books iin the library are");
    for (int i = 0; i < this.number_of_books; i++) {
      System.out.println(books[i].title);
    }
  }

  public static void main(String[] args) {
    Library lib1 = new Library();
    while (true) {
        boolean stop=false;
      int choice;
      System.out.print(
        "\nenter 1 to add book,2 to delete a book,3 to display all books,4 to exit:"
      );
      choice = input.nextInt();
      switch (choice) {
        case 1:
          String title, author, isbn;
          System.out.print("enter the title:");
          title = input.next();
          System.out.print("enter the author:");
          author = input.next();
          System.out.print("enter the isbn:");
          isbn = input.next();
          lib1.add_book(title, author, isbn);
          System.out.print("The book has been added sucessfully");
          break;
        case 2:
          System.out.print(
            "enter the title of the book that is to be deleted:"
          );
          title = input.next();
          lib1.delete_book(title);
          break;
        case 3:
          lib1.display_all_books();
          break;
        case 4:
         stop=true;
          break;
      }
      if (stop)
      {
        break;
      }
    }
  }
}

class Book {

  public String title;
  public String author;
  public String isbn;

  public Book(String title, String author, String isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }
}

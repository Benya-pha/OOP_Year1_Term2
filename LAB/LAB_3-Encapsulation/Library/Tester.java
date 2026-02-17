package Library;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[5];
        books[0] = new Book("100", "Programming", "John");
        books[1] = new Book("200", "Object-Oriented Programming", "May");
        books[2] = new Book("300", "Graphic", "Marry");
        books[3] = new Book("400", "Statistics", "Martin");
        books[4] = new Book("500", "Database", "John");

        Library myLibrary = new Library(books);

        myLibrary.showAllBook();
        System.out.println();

        String select = "";

        do {
            System.out.println("<=== Enter the number what do you want to do ===>");
            System.out.println("1. Borrow a book.");
            System.out.println("2. Return a book.");
            System.out.println("3. Search a book.");
            System.out.println("q. Quit the system.");
            System.out.print("Select = ");
            select = sc.nextLine().toLowerCase();

            String wantB;
            int index;

            if (select.equals("1")) {
                System.out.print("Enter [id/title] of book : ");
                wantB = sc.nextLine();
                myLibrary.borrowBook(wantB);

            } else if (select.equals("2")) {
                System.out.print("Enter [id/title] of book : ");
                wantB = sc.nextLine();
                myLibrary.returnBook(wantB);

            } else if (select.equals("3")) {
                System.out.print("Enter [id/title] of book : ");
                wantB = sc.nextLine();
                index = myLibrary.searchBook(wantB);

                if (index != -1) {
                    System.out.println(myLibrary.getBook(index));
                } else {
                    System.out.println("Sorry, this book cannot be found in our library.");
                }

            } else if (select.equals("q")) {
                System.out.println("Thank you");

            } else {
                System.out.println("Input invalid, try again");
            }

            System.out.println();

        } while (!select.equals("q"));


        sc.close();
    }
}

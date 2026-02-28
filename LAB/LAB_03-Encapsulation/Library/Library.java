package Library;

public class Library {

    private Book []  book;

    public Library(Book[] book){
        this.book = book;
    }

    public Book getBook(int index) {
        return book[index];
    }

    public int searchBook(String wantB){
        for (int i = 0; i < book.length; i++) {
            if (book[i].getBookID().equals(wantB) || book[i].getTitle().equals(wantB)){
                return i;
            }
        }
        return -1;
    }

    public void borrowBook(String wantB){
        int index = searchBook(wantB);

        if (index == -1) {
            System.out.println("Sorry, this book cannot be found in our library.");
            return;
        }

        Book thisBook = book[index];

        if (thisBook.getStatus() == 'A'){
            System.out.println("can borrow.");
            thisBook.updateStatus();
        } else {
            System.out.println("is borrowing. Sorry!");
        }
    }


    public void  returnBook (String wantB){
        Book thisBook = book[searchBook(wantB)];
        if (thisBook.getStatus() == 'A'){
            System.out.println("This book is not borrowed. Re-input again!.");
        }else {
            System.out.println("Thank you, the return successful.");
            thisBook.updateStatus();
        }
    }

    public void showAllBook(){
        System.out.println("This are all books in our library");
        for (int i = 0; i < book.length; i++) {
            Book a = book[i];
            System.out.println(a);
        }
    }
}

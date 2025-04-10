public class Book implements LibraryResource {
    public void borrow(String title) {
        System.out.println("Borrowing book: " + title);
    }
}
public class Journal implements LibraryResource {
    public void borrow(String title) {
        System.out.println("Borrowing journal: " + title);
    }
}
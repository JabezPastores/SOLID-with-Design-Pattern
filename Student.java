public class Student {
    private LibraryResource resource;

    public Student(LibraryResource resource) {
        this.resource = resource;
    }

    public void borrowResource(String title) {
        resource.borrow(title);
    }

    // setResource can be added for runtime switching
    public void setResource(LibraryResource resource) {
        this.resource = resource;
    }
}
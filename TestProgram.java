public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student(new Book());
        student.borrowResource("Design Patterns");

        student.setResource(new Journal());
        student.borrowResource("Nature Journal");
    }
}
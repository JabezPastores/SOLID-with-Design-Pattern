public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student(new Book());
        student.borrowResource("Java DESIGN PATTERN!");

        student.setResource(new Journal());
        student.borrowResource("Journal Packet");
    }
}
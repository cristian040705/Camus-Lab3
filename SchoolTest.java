class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Camus", 1234, "College");
        Teacher teacher = new Teacher("Sir Archie", 2345, "OOP");
        Staff staff = new Staff("Sir Joel", 3456, "Hardware");
 
        System.out.println("  Students Information  ");
        student.displayInfo();
 
        System.out.println("\n  Teachers Information  ");
        teacher.displayInfo();
 
        System.out.println("\n  Staffs Information  ");
        staff.displayInfo();
    }
}
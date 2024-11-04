public class StudentManager {
    public static void main(String[] args) {
        // option in menu
        String[] options = {"Add new student", "Search a student", "Update name and mark", "Remove a studen", "List all", "Quit"};
        int choice = 0;// user choice
        StudentList list = new StudentList(); // Init empty list
        do {
            System.out.println("\nStudent managing Program");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    list.addStudent();
                    break;// Add new student
                case 2:
                    list.searchStudent();
                    break; // Search student
                case 3:
                    list.updateStudent();
                    break; // Update student
                case 4:
                    list.removeStudent();
                    break; // Remove student
                case 5:
                    list.printAll();
                    break; // Print all students
                default:
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 6);
    }
}

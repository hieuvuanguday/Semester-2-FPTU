import java.text.SimpleDateFormat;
import java.util.*;

public class StudentManagerTest {
    public static void main(String[] args) {
        int choice;
        String ID, FullName, Address, Phone;
        Date DoB = null;
        Scanner sc = new Scanner(System.in);
        StudentManager stdManager = new StudentManager();
        do{
            System.out.println("Select a function !");
            System.out.println("1. Add new a student");
            System.out.println("2. View student list");
            System.out.println("3. Find a student by ID");
            System.out.println("4. Update a student");
            System.out.println("5. Exit");
            System.out.println("Select: ");
            choice = sc.nextInt();
        
            switch(choice){
                case 1:
                    System.out.println("Enter ID: ");
                    ID = sc.next();
                    System.out.println("Enter FullName: ");
                    FullName = sc.next();
                    System.out.println("DoB(dd/MM/yyyy): ");
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        DoB = f.parse(sc.next());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Enter Address: ");
                    Address = sc.next();
                    System.out.println("Enter Phone Number: ");
                    Phone = sc.next();
                    Student newStudent = new Student(ID, FullName, DoB, Phone, Address);
                    stdManager.addStudent(newStudent);
                    break;
                case 2:
                    stdManager.printStudentList();
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Try Again!!!");
            }
        }while(true);
    }
}

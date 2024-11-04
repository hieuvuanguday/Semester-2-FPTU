package oop;

public class Program {
    public static void main(String[] args) {
        try {
            Student noName = new Student();
            noName.print();
            noName.setId("SE002");
            noName.setFullName("Tran Van B");
            noName.print();
            
            Student anNV = new Student("SE0001", "Nguyen Van An");
            anNV.setFullName("Dang Van An");
            anNV.print();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("");
    }
}

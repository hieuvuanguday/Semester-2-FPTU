package DTO;
public class University extends Organization{
    protected String name;

    public University() {
        name = "";
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }
    
    /**
     *
     */
    @Override
    public void communicateByTool() {
        System.out.println("In the University, people communicate by voice.");
    }
    
    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has recieved all enrollment documents and enrollment fees.");
    }
    
    public void educate() {
        System.out.println("Provide education at University standard.");
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge.";
    }
}

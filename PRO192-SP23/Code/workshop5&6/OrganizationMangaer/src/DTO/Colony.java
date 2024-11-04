package DTO;
public class Colony extends Organization{
    protected String place;

    public Colony() {
        place = "";
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }
    
    public void communicateByTool() {
        System.out.println("The Colony communicate by sound.");
    }
    
    public void grow() {
        System.out.println("An anual cycle of growth that begins in spring.");
    }
    
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process.");
    }

    @Override
    public String toString() {
        return "The Colony size is: " + size + ", the Colony's place is: " + place;
    }
}

package DTO;
public class FPTUniversity extends University implements Role{
    protected String address;

    public FPTUniversity() {
        address = "";
    }

    public FPTUniversity(int size, String name, String address) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size
     */
    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon.";
    }
    
    /**
     *
     */
    @Override
    public void createWorker() {
        System.out.println("Providing human resources.");
    }
}

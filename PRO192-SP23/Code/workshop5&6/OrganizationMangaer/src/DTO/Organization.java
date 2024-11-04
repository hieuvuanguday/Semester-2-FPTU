package DTO;
public abstract class Organization {
    protected int size;
    
    public Organization() {
        size = 0;
    }
    
    public Organization(int size) {
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communicateByTool();

    @Override
    public String toString() {
        return "The Organization's size is: " + size;
    }
}

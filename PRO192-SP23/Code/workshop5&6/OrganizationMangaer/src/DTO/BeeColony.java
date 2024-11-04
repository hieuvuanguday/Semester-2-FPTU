package DTO;
public class BeeColony extends Colony implements Role{
    protected String type;

    public BeeColony() {
        type = "";
    }

    public BeeColony(int size, String type, String place) {
        super(place, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "The Conoly's type is: " + type + ", size is about: " + size + ", and the place is: " + place;
    }
    
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}

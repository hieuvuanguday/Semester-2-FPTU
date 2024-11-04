import java.util.ArrayList;
import java.util.Iterator;
public class Pet implements ITax{
    String name;
    String birthday;
    ArrayList<Service> usedServices;
    double total;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
    
    public void addService(String nameService, int price){
        Service sv = new Service(nameService, price);
        this.usedServices.add(sv);
    }

    @Override
    public double getTotalMoney() {
        for (Iterator<Service> iterator = usedServices.iterator(); iterator.hasNext();) {
            Service next = iterator.next();
            total += (double)next.price;
        };
        if(this.getBirthday().substring(0, 1) == "9/" || this.getBirthday().substring(0, 1) == "10" || this.getBirthday().substring(0, 1) == "11" || this.getBirthday().substring(0, 1) == "12"){
            total = (total*95)/100;
        }
        return total;
    }
    
    @Override
    public double getTax() {
        return VAT*this.getTotalMoney();
    }

    @Override
    public String toString() {
        return name+"-"+getTotalMoney()+"-"+this.getTax();
    }

    
}

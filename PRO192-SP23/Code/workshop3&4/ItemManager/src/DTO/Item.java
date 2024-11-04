package DTO;

import java.util.Scanner;

public class Item {
    private int value;
    private String creator;
    
    public Item() {
        value = 0;
        creator = "";
    }
    public Item(int value, String creator) {
         this.value=value;
         this.creator=creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output  () {
        System.out.println("value:"+value);
        System.out.println("creator:"+creator);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.print("Enter value:");
        do {
            try {
                value=sc.nextInt();
                if (value<=0)
                    throw new Exception();
                check=false;
            } catch (Exception e) {
                System.out.println("Please enter again: ");
                check=true;
            }
        } while (check);
        System.out.print("Enter creator:");
        do {            
            try {
                creator=sc.next();
                if (creator.isEmpty()) {
                    throw new Exception();
                }
                check=false;
            } catch (Exception e) {
                System.out.println("Please enter again: ");
                check=true;
            }
        } while (check);
    }
}

package DTO;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;
    
    public Vase() {
        height = 0;
        material = "";
    }
    
    public Vase(int height, String material) {
        this.height=height;
        this.material=material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height:");
        height=sc.nextInt();
        System.out.println("Input a material:");
        sc = new Scanner(System.in);
        material=sc.nextLine();
    }
    
    public void outputVase() {
        output();
        System.out.println("Height:"+height);
        System.out.println("Material:"+material);
    }
}

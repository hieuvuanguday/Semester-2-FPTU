package DTO;

import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting() {
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }    
    
    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height=height;
        this.width=width;
        this.isWatercolour=isWatercolour;
        this.isFramed=isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height:");
        height=sc.nextInt();
        System.out.println("Input a width:");
        sc = new Scanner(System.in);
        width=sc.nextInt();
        System.out.println("Input a isWatercolour:");
        sc = new Scanner(System.in);
        isWatercolour=sc.nextBoolean();
        System.out.println("Input a isFramed:");
        sc = new Scanner(System.in);
        isFramed=sc.nextBoolean();
    }
    
    public void outputPainting() {
        output();
        System.out.println("Height:"+height);
        System.out.println("Width:" +width);
        System.out.println("isWatercolour:"+isWatercolour);
        System.out.println("isFramed:"+isFramed);
    }
}

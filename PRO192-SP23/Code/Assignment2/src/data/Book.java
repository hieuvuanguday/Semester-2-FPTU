package data;

import java.util.Scanner;

public class Book {
    private String Code;
    private String Title;
    private float UnitPrice;
    private int Quantity;
    //constructor rỗng và bình thường
    public Book() {
    }

    public Book(String Code, String Title, float UnitPrice, int Quantity) {
        this.Code = Code;
        this.Title = Title;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
    }
    //getter|setter
    public String getCode(){    
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {    
        this.Quantity = Quantity;
    }
    
    //method input: nhập full thông tin cuốn sách
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập code sách: ");
        this.Code = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        this.Title = sc.nextLine();
        System.out.println("Nhập giá sách: ");
        this.UnitPrice = sc.nextFloat();
        System.out.println("Nhập số lượng sách: ");
        this.Quantity = sc.nextInt();
    }
    //method showInfor
    public void showInfor(){
        String str = String.format("%-5s|%-30s|%6.2f|%4d", Code, Title, UnitPrice, Quantity);
        System.out.println(str);
    }
    
}
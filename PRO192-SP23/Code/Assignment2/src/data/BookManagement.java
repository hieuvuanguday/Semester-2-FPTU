package data;

import java.util.Scanner;

public class BookManagement {
    private static Book bookList[] = new Book[100];
    private static int sizeBook = 0;
    
    //constructor
    public BookManagement() {
    }
    //sort theo Quantity
    public static void sortBookByQuantity(){
        if(sizeBook == 0){
            return;
        }
        for(int i = 0; i <= sizeBook - 2; i++){
            for(int j = i + 1; j <= sizeBook - 1; j++){
                if(bookList[i].getQuantity() < (bookList[j].getQuantity())){
                    //swap
                    Book bookTmp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = bookTmp;
                }
            }
        }
    }
    
    //method: printBookList in ra danh sách các cuốn sách
    public static void printBookList(){
        if(sizeBook == 0){
            System.out.println("Danh sách trống!!!");
            return;
        }
        for(int i = 0; i <= sizeBook - 1; i++){
            bookList[i].showInfor();
        }
    }
  
    //method: addNewBook để thêm sách vào bookList
    public static void addNewBook(){
        Scanner sc = new Scanner(System.in);  
        Book newBook = new Book();
        newBook.inputInfor();
        boolean isFind = false;
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getCode().equals(newBook.getCode())){
                isFind = true;
                break;
            }
        }
        if(!isFind){
        //add sách vào bookList
            bookList[sizeBook] = newBook;
            sizeBook++;
            System.out.println("Thông tin sách mới thêm: ");
            newBook.showInfor();
        }
    }

    //đưa code nhận về vị trí trong mảng
    public static int searchPosByCode(String code){
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getCode().equalsIgnoreCase(code)){
                return i;
            }
        }
        return -1;
    } 
    //đưa code nhận về object
    public static Book searchBookByCode(String code){
        int pos = searchPosByCode(code);
        if(pos == -1) return null;
        return bookList[pos];
    }
    //method: tìm sách dựa trên code
    public static void searchBookByCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập code muốn tìm sách: ");
        String inputCode = sc.nextLine();
        Book codeWantFind = searchBookByCode(inputCode);
        if(codeWantFind == null){
            System.out.println("Not Found!");
        }else{
            System.out.println("Found, Thông tin sách cần tìm: ");
            codeWantFind.showInfor();
        }
    }
}

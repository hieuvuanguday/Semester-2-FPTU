package runtime;

import data.BookManagement;
import ui.Menu;

public class Program {
    public static void main(String[] args) {
        Menu menu = new Menu("Chương trình quản lý thư viện");
        menu.addNewOption("1. In ra danh sách các cuốn sách <Z->A>");
        menu.addNewOption("2. Thêm mới sách");
        menu.addNewOption("3. Tìm sách theo code");
        menu.addNewOption("4. Két thúc");
        BookManagement bm = new BookManagement();
        int choice;
        while(true){
            menu.printMenu();
            choice = menu.getChoice();
            switch(choice){
                case 1:{
                    bm.sortBookByQuantity();
                    bm.printBookList();
                    break;
                }
                case 2:{
                    bm.addNewBook();
                    break;
                }
                case 3:{
                    bm.searchBookByCode();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }
    }
}

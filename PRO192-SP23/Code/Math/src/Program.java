public class Program {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(9, 6);
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.showSAndC();
        
        HinhTron ht = new HinhTron(5);   
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.showSAndC();
    }
}

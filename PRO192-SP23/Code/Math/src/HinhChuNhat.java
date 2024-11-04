public class HinhChuNhat extends HinhHoc{
    private static int chieuDai;
    private static int chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double tinhChuVi(){
        chuVi = (chieuDai + chieuRong)*2;
        return chuVi;
    }   
    public double tinhDienTich(){
        dienTich = (chieuDai*chieuRong);
        return dienTich;
    }  
    public void showSAndC(){
        System.out.println("Dien tich hinh chu nhat la: "+this.dienTich);
        System.out.println("Chu vi hinh chu nhat la:" +this.chuVi);
    }
    
}

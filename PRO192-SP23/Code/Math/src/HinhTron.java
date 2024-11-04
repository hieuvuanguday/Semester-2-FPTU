public class HinhTron extends HinhHoc{
    private static int banKinh;
    private static double Pi = 3.14;
    public HinhTron(int banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhChuVi(){
        chuVi = banKinh*2*Pi;
        return chuVi;
    }   
    public double tinhDienTich(){
        dienTich = Pi*(banKinh)*(banKinh);
        return dienTich;
    } 
    public void showSAndC(){
        System.out.println("Dien tich hinh tron la: "+this.dienTich);
        System.out.println("Chu vi hinh tron la: "+this.chuVi);
    }
}

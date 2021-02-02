package Bai3;

public class BienLai {
    private KhachHang khachHang;
    private int soCu;
    private int soMoi;
    private int Tien;
    public BienLai(){

    }

    public BienLai(KhachHang khachHang, int soCu, int soMoi, int tien) {
        this.khachHang = khachHang;
        this.soCu = soCu;
        this.soMoi = soMoi;
        Tien = tien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getSoCu() {
        return soCu;
    }

    public void setSoCu(int soCu) {
        this.soCu = soCu;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(int soMoi) {
        this.soMoi = soMoi;
    }

    public int getTien() {
        return Tien;
    }

    public void setTien(int tien) {
        Tien = tien;
    }
    @Override
    public String toString(){
        return khachHang.toString() +
                " chỉ số cũ " + getSoCu()+
                " chỉ số mới " + getSoMoi()+
                " số tiền phải thanh toán " + getTien() + " đồng.";
    }
}

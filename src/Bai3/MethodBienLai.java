package Bai3;

import java.util.ArrayList;

public class MethodBienLai {
    ArrayList<BienLai> bienLais = new ArrayList<>();
    public void add(BienLai bienLai){
        bienLais.add(bienLai);
    }
    public void show(){
        for (BienLai i: bienLais) {
            System.out.println(i.toString());
        }
    }
    public void showTien(int idKH){
        for (BienLai j: bienLais) {
            if (j.getKhachHang().getId() == idKH){
                System.out.println(j.getTien());
                j.setTien(0);
                j.setSoCu(0);
                j.setSoMoi(0);
                break;
            }else {
                System.out.println("Làm gì có khách này mà thanh toán ");
                break;
            }
        }
    }
    public int tinhTien(BienLai bienLai){
        return (bienLai.getSoMoi() - bienLai.getSoCu()) * 750;
    }
}

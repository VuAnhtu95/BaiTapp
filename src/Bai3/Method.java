package Bai3;

import java.util.ArrayList;

public class Method {
    ArrayList<KhachHang> khachHangs = new ArrayList<>();
    public void add (KhachHang khachHang){
        khachHangs.add(khachHang);
    }
    public void show(){
        for (KhachHang i : khachHangs) {
            System.out.println(i.toString());
        }
    }
    public KhachHang remove (int id) {
        for (KhachHang i :khachHangs) {
            if (i.getId() == id) {
                khachHangs.remove(i);
                return i;
            }
        }
        return null;
    }
    public KhachHang getKHbyId(int id){
        KhachHang kh = null;
        for (KhachHang i: khachHangs) {
            if (i.getId() == id){
                kh = i;
            }
        }
        return kh;
    }
}

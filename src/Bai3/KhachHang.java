package Bai3;

public class KhachHang {
    private String nameKhach;
    private String diachi;
    private int id;

    public KhachHang(String nameKhach, String diachi, int id) {
        this.nameKhach = nameKhach;
        this.diachi = diachi;
        this.id = id;
    }
    public KhachHang(){}

    public String getNameKhach() {
        return nameKhach;
    }

    public void setNameKhach(String nameKhach) {
        this.nameKhach = nameKhach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Khách hàng có tên là "+ getNameKhach()
                + " địa chỉ " + getDiachi()
                + " số công tơ " + getId();
    }
}

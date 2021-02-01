import java.util.ArrayList;

public class KhachSan {
    private int dateTro = 0;
    private int loaiPhong;
    private double giaTro = 0.0;
    ArrayList<Nguoi> nguoiThue = new ArrayList<>();
    public KhachSan(int loaiPhong , double giaTro ){
        this.giaTro = giaTro;
        this.loaiPhong = loaiPhong;
        this.dateTro = dateTro;
    }
    public KhachSan() {
    }
    public int getDateTro() {
        return dateTro;
    }
    public void setDateTro(int dateTro) {
        this.dateTro = dateTro;
    }
    public int getLoaiPhong() {
        return loaiPhong;
    }
    public double getGiaTro() {
        return this.giaTro;
    }
    public void setGiaTro(double giaTro) {
        this.giaTro = giaTro;
    }
}

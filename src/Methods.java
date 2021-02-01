import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    Scanner scanner = new Scanner(System.in);
    static KhachSan[] phong = new KhachSan[3];
    int count = 0;
    double result = 0;
    static {
        phong[0] = new KhachSan(1,70000);
        phong[1] = new KhachSan(2,90000);
        phong[2] = new KhachSan(3,110000);
    }

    public void add(){
        System.out.println("Nhập vào tên khách hàng : ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh khách hàng : ");
        long namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chứng minh thư khách hàng :");
        long cmnd = Integer.parseInt(scanner.nextLine());
        Nguoi nguoi = new Nguoi(name,namSinh,cmnd);
        KhachSan phong = chonPhong();
        phong.nguoiThue.add(nguoi);
    }
    public KhachSan chonPhong(){
        System.out.println("Muốn chọn phòng nào ");
        System.out.println("1: Phòng bình thường 70k 1 tiếng ");
        System.out.println("2: Phòng VIP1 90k 1 tiếng ");
        System.out.println("3: Phòng VIP2 110k 1 tiếng ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1 ->{
                return phong[0];
            }
            case 2 ->{
                return phong[1];
            }
            case 3 ->{
                return phong[2];
            }
            default -> {
                return null;
            }
        }
    }
    public void show(){
        System.out.println("Thông tin các phòng ");
        for (KhachSan p:phong) {
            for (Nguoi nguoi:p.nguoiThue) {
                System.err.println("Phòng " + p.getLoaiPhong() + " có " + count + " người thuê ");
                System.err.println("----------------");
                System.err.println("Tên người thuê là " + nguoi.getName());
                System.err.println("----------------");
                System.err.println("Năm sinh người thuê là " + nguoi.getNamSinh());
                System.err.println("----------------");
                System.err.println("Chứng minh nhân dân người thuê là " + nguoi.getCmnd());
                System.err.println("----------------");
            }
        }
    }
    public void tinhTien(){
        System.out.println("Nhập vào số ngày trọ :");
        int date = Integer.parseInt(scanner.nextLine());
        System.out.println("Bạn dùng phòng nào nhỉ ? ");
        System.out.println("1: Phòng bình thường 70k 1 tiếng ");
        System.out.println("2: Phòng VIP1 90k 1 tiếng ");
        System.out.println("3: Phòng VIP2 110k 1 tiếng ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1 ->{
                phong[0].setDateTro(date);
                result = phong[0].getDateTro() * phong[0].getGiaTro();
                break;
            }
            case 2 ->{
                phong[1].setDateTro(date);
                result = phong[1].getDateTro() * phong[1].getGiaTro();
                break;
            }
            case 3 ->{
                phong[2].setDateTro(date);
                result = phong[2].getDateTro() * phong[2].getGiaTro();
                break;
            }
        }
        System.err.println("Bạn phải thanh toán " + result + " đồng ");
    }
}

package Bai3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Method method = new Method();
        MethodBienLai methodBienLai = new MethodBienLai();
        do {
            System.out.println("-------Menu-------");
            System.out.println("1: Khách Hàng");
            System.out.println("2: Biên Lai");
            System.out.println("3: Tính tiền");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1->{
                    System.out.println("1.Thêm Khách Hàng : ");
                    System.out.println("2.Hiển Thị Tất Cả Thông Tin Khách Hàng : ");
                    System.out.println("3.Xóa Khách Hàng : ");
                    int choise1 = Integer.parseInt(scanner.nextLine());
                    switch (choise1){
                        case 1->{
                            System.out.println("Bạn muốn thêm bao nhiêu khách hàng : ");
                            int count = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < count; i++) {
                                KhachHang khachHang = new KhachHang();
                                System.out.println("Nhập tên khách hàng : ");
                                khachHang.setNameKhach(scanner.nextLine());
                                System.out.println("Nhập địa chỉ khách hàng :");
                                khachHang.setDiachi(scanner.nextLine());
                                System.out.println("Nhập mã số công tơ khách hàng : ");
                                khachHang.setId(Integer.parseInt(scanner.nextLine()));
                                method.add(khachHang);
                            }
                            break;
                        }
                        case 2->{
                            method.show();
                            break;
                        }
                        case 3->{
                            System.out.println("Nhập vào số công tơ khách hàng bạn muốn xóa : ");
                            int id = Integer.parseInt(scanner.nextLine());
                            method.remove(id);
                            break;
                        }
                    }
                    break;
                }
                case 2->{
                    System.out.println("1: Thêm Biên Lai ");
                    System.out.println("2: Hiển Thị Biên Lai ");
                    int choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3){
                        case 1->{
                            BienLai bienLai = new BienLai();
                            System.out.println("Nhập số công tơ khách hàng muốn thêm : ");
                            int id = Integer.parseInt(scanner.nextLine());
                            KhachHang khachHang = method.getKHbyId(id);
                            if(khachHang == null){
                                System.out.println("Không có khách hàng này");
                                break;
                            }
                            bienLai.setKhachHang(khachHang);
                            System.out.println("Nhập chỉ số công tơ cũ ");
                            bienLai.setSoCu(Integer.parseInt(scanner.nextLine()));
                            System.out.println("Nhập chỉ số công tơ mới ");
                            bienLai.setSoMoi(Integer.parseInt(scanner.nextLine()));
                            bienLai.setTien(methodBienLai.tinhTien(bienLai));
                            methodBienLai.add(bienLai);
                            break;
                        }
                        case 2->{
                            methodBienLai.show();
                            break;
                        }
                    }
                }
                case 3->{
                    System.out.println("Nhập vào số công tơ khách hàng muốn thanh toán tiền ");
                    int id = Integer.parseInt(scanner.nextLine());
                    methodBienLai.showTien(id);
                }
            }
        }while (true);
    }
}

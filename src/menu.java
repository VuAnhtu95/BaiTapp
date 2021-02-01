import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: Nhập khách trọ: ");
            System.out.println("2: Hiện thông tin khách trọ ");
            System.out.println("3: Tính tiền : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1->{
                    methods.add();
                }
                case 2->{
                    methods.show();
                }
                case 3->{
                    methods.tinhTien();
                }
            }
        }while (true);
    }
}

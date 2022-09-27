import java.util.Scanner;

public class thuchanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("nhap so vao");
        num = scanner.nextInt();
        if (num<2){
            System.out.println("day khong phai la so nguyen to");
        } else if (num==2){
            System.out.println("day la so nguyen to");
        } else {
            boolean check = true;
            for (int i = 2; i < num; i++) {
                if (num%i==0){
                    check=false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check){
                System.out.println("day la so nguyen to");
            }else {
                System.out.println("day khong phai la so nguyen to");
            }
        }
    }
}

package SS1TH5;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời nhập vào tháng : ");
        int month = scn.nextInt();
        switch (month) {
            case 1 :
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng : " +month +" Có : 31 ngày !");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng : " +month +" Có : 30 ngày !");
                break;
            case 2:
                System.out.println("Tháng 2 có : 28 hoặc 29 ngày");
                break;
            default:
                    System.out.println("Bạn nhập sai !");
                    break;

        }
    }
}

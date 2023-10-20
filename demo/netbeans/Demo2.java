        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.netbeans;

import java.util.Scanner;

/**
 *
 * @author user
 */
//import java.util.*;
// alt shift f: can chinh dong code
public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luong;
        double thue, luongNhan;

        double a = 0.1, b = 0.15, c = 0.2;
        System.out.print("Moi nhap luong ban dau: ");
        luong = sc.nextInt();

        if (luong <= 9000000) {
            System.out.println("Ko phai dong thue");
        } else if (luong > 9000000 && luong <= 15000000) {
            thue = (luong - 9000000) * a;
            luongNhan = luong - thue;
            System.out.printf("Luong nhan sau khi dong thue la: %.1f\n", luongNhan);
        } else if (luong > 15000000 && luong <= 30000000) {
            thue = 600000 + (luong - 15000000) * b;
            luongNhan = luong - thue;
            System.out.printf("Luong nhan sau khi dong thue la: %.1f\n", luongNhan);
        } else if (luong > 30000000) {
            thue = 600000 + 2250000 + (luong - 30000000) * c;
            luongNhan = luong - thue;
            System.out.printf("Luong nhan sau khi dong thue la: %.1f\n", luongNhan);

        }
    }
}

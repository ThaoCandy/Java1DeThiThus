/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_DongVat;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDV {

    static QuanLyDongVat ql = new QuanLyDongVat();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int chon;
        try {

            do {
                System.out.println("\n-------------------");
                System.out.println("1. Nhập danh sách động vật");
                System.out.println("2. Hiển thị danh sách động vật");
                System.out.println("3. Danh sách ĐV chứa tên nhập vào");
                System.out.println("4. Tìm Đv theo khoảng cân nặng");
                System.out.println("5. Kế thừa");
                System.out.println("0. Thoát");
                System.out.print("Mời chọn: ");

                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        ql.nhap();
                        break;
                    case 2:
                        ql.xuat(ql.getList());
                        break;
                    case 3:
                        ql.timTheoTen();
                        break;

                    case 4:
                        ql.khoangCN();
                        break;
                    case 5:
                        ql.KeThua();
                        break;
                    case 0:
                        System.out.println("Chào tạm biệt!");
                        break;
                    default:
                        System.out.println("Chọn CN không hợp lệ, mời nhập lại!");
                }

            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("Chương trình bị dán đoạn "
                    + "do bạn nhập không đúng kiểu hợp lệ");

            menu();
        }
    }
}

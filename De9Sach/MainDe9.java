/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De9Sach;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDe9 {

    static Scanner sc = new Scanner(System.in);
    static ListSach ql = new ListSach();
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        try {
            int chon;
            do {
                System.out.println("\n\n---------------");
                System.out.println("1. Nhập danh sách Sách");
                System.out.println("2. Hiển thị danh sách theo khoảng năm sản xuất");
                System.out.println("3. Cách sách có tên đầu lag [Lập Trình]");
                System.out.println("4. Cập nhật danh sách theo mã");
                System.out.println("5. Danh sách theo tên");
                System.out.println("6. Xóa theo mã");
                System.out.println("7. Sách trước năm nhập vào");
                System.out.println("0. Thoát");
                System.out.print("Mời chọn: ");

                chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1:
                        ql.nhapDS();
                        break;
                    case 2:
                        ql.hienThiKhoangNamSX();
                        break;
                    case 3:
                        ql.tenDauLT();
                        break;
                    case 4:
                        ql.capNhat();
                        break;
                    case 5:
                        ql.DStheoTen();
                        break;
                    case 6:
                        ql.xoa();
                        break;
                    case 7:
                        ql.DStruocNam();
                        break;
                    case 8:
                        ql.xuatDS(ql.getList());
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;

                    default:
                        System.out.println("Chọn không hợp lệ, hãy chọn lại");
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("CT bị dán đoạn");
            menu();
        }

    }
}

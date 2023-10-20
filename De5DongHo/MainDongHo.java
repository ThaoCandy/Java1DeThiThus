/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De5DongHo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDongHo {

    static Scanner sc = new Scanner(System.in);
    static QuanLyDH ql = new QuanLyDH();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try {
            int chon;
            do {
                System.out.println("\n -------------------");
                System.out.println("1. Nhập danh sách");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Tìm theo khoảng giá");
                System.out.println("4. Xóa theo mã");
                System.out.println("5. Sắp xếp giảm theo kích thước");
                System.out.println("0. thoát");
                System.out.print("Mời chọn: ");

                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        ql.nhapDS();
                        break;
                    case 2:
                        ql.xuatDS(ql.getList());
                        break;
                    case 3:
                        ql.timKhoangGia();
                        break;
                    case 4:
                        ql.xoa();
                        break;
                    case 5:
                        ql.sapXepGiamKT();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    default:
                        System.out.println("Chọn không hợp lệ, chọn lại!");
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("Chương trình bị dán đoạn "
                    + "do bạn nhhajap không đúng kiểu dữ liệu.");
            menu();
        }
    }
}

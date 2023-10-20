/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7CN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDe7 {

    static Scanner sc = new Scanner(System.in);
    static QLCN ql = new QLCN();

    public static void main(String[] args) {
        // 5 đối tượng tạo sẵn:
        ql.addOb(new ChuyenNganh("01", "cntt", "nothing", "dungNa", 2000, true));
        ql.addOb(new ChuyenNganh("02", "kinhTe", "nothing", "minh", 2002, true));
        ql.addOb(new ChuyenNganh("03", "thamMy", "nothing", "ha", 1998, false));
        ql.addOb(new ChuyenNganh("04", "coKhi", "nothing", "ha", 2001, false));
        ql.addOb(new ChuyenNganh("03", "khachSan", "nothing", "hieu", 2010, true));

        menu();
    }

    static void menu() {

        try {
            int chon;

            do {
                System.out.println("\n\n---------------");
                System.out.println("1. Nhập danh sách");
                System.out.println("2. Hiển thị danh sách");
                System.out.println("3. Các đối tượng ở vị trí chẵn");
                System.out.println("4. Danh sách theo tên");
                System.out.println("5. Tìm theo mã");
                System.out.println("6. Xóa theo mã");
                System.out.println("7. Tìm theo tên CN");
                System.out.println("8. Danh sách CN đang hoạt động");
                System.out.println("9. Danh sách đang ngừng hoạt động");
                System.out.print("Mời chọn: ");

                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {

                    case 1:
                        System.out.println("Nhập danh sách chuyên ngành");
                        ql.nhap();
                        break;
                    case 2:
                        System.out.println("Hiển thị danh sách");
                        ql.xuat(ql.getList());
                        break;
                    case 3:
                        System.out.println("Danh sách các vị trí chẵn");
                        ql.listVitriChan();
                        break;
                    case 4:
                        System.out.println("Danh sách tăng dần theo tên CN");
                        ql.listTangTheoTen();
                        break;
                    case 5:
                        System.out.println("Tìm chyên ngành theo mã");
                        ql.timTheoMa(1, 1); // tìm và xuất theo mã
                        break;
                    case 6:
                        System.out.println("Xóa CN theo mã");
                        ql.timTheoMa(2, 1); // xóa theo mã
                        break;
                    case 7:
                        System.out.println("Tìm theo tên chủ nhiệm");
                        ql.timTheoMa(1, 2); // tìm và xuất theo tên chủ N
                        break;
                    case 8:
                        System.out.println("Danh sách CN đang hoạt động là:");
                        ql.xuat(ql.findA("", 3));
                        // x=3 để tạo danh sách CN đang HĐ
                        break;
                    case 9:
                        System.out.println("Danh sách CN ngừng hoạt động là:");
                        ArrayList<ChuyenNganh> listCL = (ArrayList<ChuyenNganh>) ql.getList().clone();
                        listCL.removeAll(ql.findA("", 3));
                        ql.xuat(listCL);
                        break;
                    case 0:
                        System.out.println("TẠM BIỆT!");
                        break;
                    default:
                        System.out.println("Chọn không hợp lệ , hãy chọn lại!");
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("CT bi dán đoạn,"
                    + " do bạn nhập sai kiểu dữ liệu");
            menu();
        }
    }
}

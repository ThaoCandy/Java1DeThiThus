/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De6SinhVien;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDe6 {

    static Scanner sc = new Scanner(System.in);
    static SinhVienService ql = new SinhVienService();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try {
            int chon;
            do {
                System.out.println("\n\n---------------------------");
                System.out.println("1. Nhập danh sách sinh viên");
                System.out.println("2. Xuất danh sách sinh viên");
                System.out.println("3. Các sinh viên có tên bắt đầu bằng chữ [a]");
                System.out.println("4. Sinh viên có điểm trung bình lớn nhất");
                System.out.println("5. Tìm sinh viên theo ký tự nhập từ bàn phím");
                System.out.println("6. Xóa sinh viên heo mã");
                System.out.println("7. Tìm sinh viên có tuổi trong khoảng min max");
                System.out.println("8. Kế thừa - Nhân viên");
                System.out.print("Mời chọn: ");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        System.out.println("Mời nhập danh sách sinh viên");
                        ql.nhap();
                        break;
                    case 2:
                        ql.xuat(ql.getListSv());
                        break;
                    case 3:
                        ql.timTenChuaA();
                        break;
                    case 4:
                        ql.timMaxTB(ql.maxTB());
                        break;
                    case 5:
                        ql.timTenChuaKyTu();
                        break;
                    case 6:
                        ql.xoaTheoMa();
                        break;
                    case 7:
                        ql.timTheoKhoangTuoi();
                        break;
                    case 8:
                        ql.KeThua();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    default:
                        System.out.println("Bạn chọn không hợp lệ");
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("Chương trình bị dán đoạn"
                    + " do bạn nhập sai dữ liệu");
            menu();
        }
    }
}

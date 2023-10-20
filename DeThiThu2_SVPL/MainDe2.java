/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu2_SVPL;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDe2 {

    static SinhVienService QLSV = new SinhVienService();

    public static void main(String[] args) {
//        5 sinh viên tạo sẵn
//        QLSV.addOb(new SinhVien("thao", "CNTT", "ma1"));
//        QLSV.addOb(new SinhVien("thanh", "TM", "ma2"));
//        QLSV.addOb(new SinhVien("An", "DK-TDH", "ma3"));
//        QLSV.addOb(new SinhVien("Dao", "HDDL", "ma4"));
//        QLSV.addOb(new SinhVien("Bao", "QTKD", "ma5"));

        menu();
    }

    static void menu() {
        try {
            Scanner sc = new Scanner(System.in);
            int chon;
            do {
                System.out.println("\n\n---------------------");
                System.out.println("1. Nhập danh sách sinh viên");
                System.out.println("2. Xuất danh sách sinh viên");
                System.out.println("3. Tìm Sinh viên theo mã");
                System.out.println("4. Sắp xếp theo chuyên ngành");
                System.out.println("5. Kế thừa");
                System.out.println("0. Thoát");
                System.out.print("==> Mời chọn: ");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        System.out.println("Nhập danh sách:");
                        QLSV.nhapDS();
                        break;
                    case 2:
                        QLSV.xuatDS(QLSV.getList());
                        break;
                    case 3:
                        QLSV.timTheoMa();
                        break;
                    case 4:
                        System.out.println("Danh sách sinh viên tăng dần theo tên chuyên ngành: ");
                        QLSV.sapXepTheoCN();
                        break;
                    case 5:
                        System.out.println("Sinh viên PoLy:");
                        QLSV.sinhVienPL();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    default:
                        System.out.println("chọn không hợp lệ, chọn lại: ");
                        break;
                }

            } while (chon != 0);
            
        } catch (Exception e) {
            System.out.println("Chương trình bị dán đoạn, bạn phải nhập đúng kiểu dữ liệu");
            menu();
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu1_Vaccine;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainVC {

    static QuanLyVC QLVC = new QuanLyVC();

    public static void main(String[] args) {
        // 4 Vaccin tạo sẵn
        QLVC.addOb(new VacCine("ma1", "VC1", 16, "3/5/2024"));
        QLVC.addOb(new VacCine("maVN2", "VC2", 3, "1/10/2024"));
        QLVC.addOb(new VacCine("ma3", "VC3", 9, "6/2/2024"));
        QLVC.addOb(new VacCine("mavN4", "VC4", 5, "23/9/2024"));

        try {
            menu();
        } catch (Exception e) {
            System.out.println("Chương trình bị dán đoạn!\n Chú ý: bạn phải nhập đúng kiểu dữ liệu");
            menu();
        }
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n\n --------------------------");
            System.out.println("1. Nhập danh sách vaccine");
            System.out.println("2. Xuất danh sách vaccine");
            System.out.println("3. Vaccine thời gian tác dụng trên 6 tháng");
            System.out.println("4. Sắp xếp giảm dần theo thời gian tác dụng");
            System.out.println("5. Kế thừa");
            System.out.println("6. Các vc có mã chứa VN");
            System.out.println("7. Vc có thời gian TD bé nhất");
            System.out.println("0. Thoát");
            System.out.println("---------------------------");
            System.out.print("Mời chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    QLVC.nhapDS();
                    break;
                case 2:
                    QLVC.xuatDS(QLVC.getList());
                    break;
                case 3:
                    QLVC.TGTDtren6th();
                    break;
                case 4:
                    QLVC.sapXepGiamTGTD();
                    break;
                case 5:
                    QLVC.vaccineVN();
                    break;
                case 6:
                    QLVC.maVN();
                    break;
                case 7:
                    QLVC.minVC();
                    break;
                case 0:
                    System.out.println("Cảm ơn");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ! Chọn lại.");
                    break;
            }

        } while (chon != 0);

    }
}

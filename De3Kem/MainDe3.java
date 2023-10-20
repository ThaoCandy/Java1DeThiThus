/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3Kem;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDe3 {

    static Scanner sc = new Scanner(System.in);
    static KemService KSV = new KemService();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        try {
            int chon;
            do {
                System.out.println("\n\n-----------------");
                System.out.println("1. Nhập danh sách");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Tìm theo mã");
                System.out.println("4. Sắp xếp giảm dần theo số lượng");
                System.out.println("5. Số Kem có giá tên 15000");
                System.out.println("6. Kem có giá trị lớn nhất");
                System.out.println("7. kế thừa");
                System.out.println("0. Thoát");
                System.out.print("Mời chọn: ");
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        KSV.nhap();
                        break;
                    case 2:
                        KSV.xuat(KSV.getList());
                        break;
                    case 3:
                        KSV.timTheoMa();
                        break;
                    case 4:
                        KSV.sapXepGiamSL();
                        break;
                    case 5:
                        KSV.soKemGiaTren15();
                        break;
                    case 6:
                        KSV.kemMax();
                        break;
                    case 7:
                        KSV.kemOcQue();
                        break;
                    case 0:
                        System.out.println("Tạm Biệt");
                        break;
                    default:
                        System.out.println("Chọn không đúng, chọn lại!");
                        break;
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("CT bị dán đoạn, bạn phải nhập đúng kiểu dữ liệu");
            menu();
        }
    }
}

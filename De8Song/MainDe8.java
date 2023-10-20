/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8Song;

import java.awt.Image;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainDe8 {

    static Scanner sc = new Scanner(System.in);
    static ListSong ql = new ListSong();
    
    public static void main(String[] args) {
    menu();
    }

    public static void menu() {
        try {
            int chon;
            do {
                System.out.println("\n\n---------------");
                System.out.println("1. Nhập danh sách các bài nhạc");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Các bài nhạc do nhạc sĩ có tên chứa [a] sáng tác");
                System.out.println("4. Xóa bài theo mã");
                System.out.println("5. Danh sách bài nhạc tăng dần theo lượng thời gian");
                System.out.println("6. Bài nhạc dài nhất");
                System.out.println("7. Nhạc K-Pop");
                System.out.println("0. Thoát");
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
                        ql.timOrXoa(1);
                        break;
                    case 4:
                        ql.timOrXoa(0);
                        break;
                    case 5:
                        ql.DStangTheoTL();
                        break;
                    case 6:
                        ql.inMax();
                        break;
                    case 7:
                        ql.Kpop();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    
                    default:
                        System.out.println("Chọn không hợp lệ, hãy chọn lại!");
                }
            } while (chon != 0);
        } catch (Exception e) {
            System.out.println("Chương trình bị dán đoạn do lỗi dữ liệu nào đó");
            menu();
        }
    }
}

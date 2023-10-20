/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3Kem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author user
 */
public class KemService {

    private static ArrayList<Kem> list = new ArrayList<>();
    ///
    static String arrEmty = "Danh sách còn trống";
    static Scanner sc = new Scanner(System.in);

    public KemService() {
    }

    public static ArrayList<Kem> getList() {
        return list;
    }

    public void nhap() {

        int i = 0;
        while (true) {
            System.out.printf("Kem %d: \n", ++i);
            Kem kem = new Kem();
            kem.input();
            list.add(kem);

            System.out.print("Nhập nữa không? Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                System.out.printf("Có %d kem được nhập vào", i);
                break;
            }
        }

    }

    public void xuat(ArrayList<Kem> A) {
        if (A.isEmpty()) {
            System.out.println(arrEmty);
            return;
        }
        System.out.println("----- " + A.size() + " -----");
        int i = 0;
        for (Kem kem : A) {
            System.out.printf("%d. ", ++i);
            kem.inThongTin();
            System.out.print("\n");
        }
    }

    public Kem find(String ma) {
        Kem kem_find = null;
        for (Kem kem : list) {
            if (kem.getMa().equalsIgnoreCase(ma)) {
                kem_find = kem;
                break;
            }
        }
        return kem_find;
    }

    public void timTheoMa() {
        if (list.isEmpty()) {
            System.out.println(arrEmty);
            return;
        }
        System.out.print("Mời nhập mã Kem cần tìm: ");
        String ma = sc.nextLine();
        if (find(ma) == null) {
            System.out.println("Không có Kem nào có mã trên.");
        } else {
            find(ma).inThongTin();
        }
    }

    public void sapXepGiamSL() {
        if (list.isEmpty()) {
            System.out.println(arrEmty);
            return;
        }
        ArrayList<Kem> listCL = (ArrayList<Kem>) list.clone();
//        Comparator<Kem> comp = new Comparator<Kem>() {
//            @Override
//            public int compare(Kem o1, Kem o2) {
////                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//                return Double.compare(o2.getSoLuong(), o1.getSoLuong());
//
//            }
//
//        };

        Collections.sort(listCL, 
                (o1,o2) -> {
                    return Double.compare(o2.getSoLuong(), o1.getSoLuong());
                }
        );
        listCL.forEach( (kem) -> {
            kem.inThongTin();
            System.out.print("\n");
        } );

    }

    public void soKemGiaTren15() {
        if (list.isEmpty()) {
            System.out.println(arrEmty);
            return;
        }
        int count = 0;
        for (Kem kem : list) {
            if (kem.getGia() > 15000) {
                count++;
            }
        }
        System.out.println("Có " + count + " kem có giá trên 15000");
    }

    public void kemMax() {
        if (list.isEmpty()) {
            System.out.println(arrEmty);
            return;
        }
        double max = -1;
        for (Kem kem : list) {
            if(kem.getGia()>max){
                max = kem.getGia();
            }
        }
        for (Kem kem : list) {
            if (kem.getGia() == max) {
                kem.inThongTin();
                System.out.print("\n");
            }
        }
    }

    public void kemOcQue() {
        System.out.println("Kem Ốc Quế: ");
        Kem KOQ = new KemOcQue();
        KOQ.input();
        System.out.println("-------");
        KOQ.inThongTin();
    }
}

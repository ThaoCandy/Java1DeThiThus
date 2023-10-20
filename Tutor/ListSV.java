/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ListSV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        do {
            SinhVien sv = new SinhVien();
            sv.nhap(sc);
            list.add(sv);
            System.out.print("Ban co muon nhap tiep khong y/n: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        } while (true);

        System.out.println("HIEN THI DANH SACH");
        int i = 1;
        for (SinhVien sv : list) {
            System.out.print("Sinh vien " + i + ": ");
            sv.xuat();
            i++;
        }
//        System.out.print("Moi nhap ma sinh vien de sua thong tin: ");
//        String find_ma = sc.nextLine();
////        sc.nextLine();
//        for(SinhVien sv: list){
//            if(sv.getMSV().equalsIgnoreCase(find_ma)){
//                sv.xuat();
//                System.out.println("Moi cap nhat thong tin sinh vien tren: ");
//                sv.nhap(sc);
//                System.out.println("Thong tin sau khi cap nhat:");
//                sv.xuat();
//                
//                break;
//            }
//        }

        System.out.println("Sap xep sinh vien theo ma sinh vien");
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };

        Collections.sort(list, comp);
        System.out.println("Danh sach sap xep tang dan theo ten la: ");
        i = 1;
        for (SinhVien sv : list) {
            System.out.print("Sinh vien " + i + ": ");
            sv.xuat();
            i++;
        }

        
//        System.out.println("Danh sach sap xep giam theo ten la: ");
        
        

        Comparator<SinhVien> compdiem = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDiemTB(), o2.getDiemTB());
            }
        };

        // chuỗi thì dùng compareTo, số thì phải viết hàm if
//        Collections.sort(list, compdiem);
list.sort(compdiem);

        for (SinhVien sinhVien : list) {
            sinhVien.xuat();
        }

       
    }
}

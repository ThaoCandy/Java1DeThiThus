/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class QuanLyXe {
     static private ArrayList<PhuongTienGT> list = new ArrayList<>();
      static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Mời nhập xe thường: ");
        PhuongTienGT xe = new PhuongTienGT();
        xe.nhap(sc);
        list.add(xe);
        
        System.out.println("Mời nhập xe đạp: ");
        XeDap xedap1 = new XeDap();
        xedap1.nhap(sc);
        list.add(xedap1);
        
        list.add(new PhuongTienGT("xanh", 7676575));
        list.add(new XeDap("đỏ", 946346, "RedBull"));
        xedap1 = new XeDap("Lam", 365546654, "Aeonmall");
        list.add(xedap1);
        System.out.println("tất cả thông tin");
        for (PhuongTienGT XE: list) {
            XE.xuat();
            System.out.print("\n");
        }
    }
}

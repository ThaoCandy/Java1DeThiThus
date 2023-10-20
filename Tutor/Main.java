/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien("ph456", "nguyenThao", 8.6);
        
        sv1.nhap(sc);
        sv1.xuat();
        System.out.println("----Sv2----\n ho ten: " + sv2.getHoTen());
    }
}

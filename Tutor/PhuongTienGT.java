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
public class PhuongTienGT {
    Scanner sc = new Scanner(System.in);
    private String mau;
    private double gia;

    public PhuongTienGT() {
    }

    public PhuongTienGT(String mau, double gia) {
        this.mau = mau;
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void nhap(Scanner sc){
        System.out.print("Giá: "); gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Màu: "); mau = sc.nextLine();
    }
    
     public void xuat(){
         System.out.printf("Giá: %.0f | Màu: %s ", gia, mau);
     }
}

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
public class DoVat {
    private String maDoVat;
    private String tenDoVat;
    private int loai;
    private double gia;
    
    static Scanner sc = new Scanner(System.in);

    public DoVat() {
    }

    public DoVat(String maDoVat, String tenDoVat, int loai, double gia) {
        this.maDoVat = maDoVat;
        this.tenDoVat = tenDoVat;
        this.loai = loai;
        this.gia = gia;
    }

    public String getMaDoVat() {
        return maDoVat;
    }

    public void setMaDoVat(String maDoVat) {
        this.maDoVat = maDoVat;
    }

    public String getTenDoVat() {
        return tenDoVat;
    }

    public void setTenDoVat(String tenDoVat) {
        this.tenDoVat = tenDoVat;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void nhap(Scanner sc){
        System.out.print("\t mã: ");
        maDoVat = sc.nextLine();
        System.out.print("\t tên: ");
        tenDoVat = sc.nextLine();
        System.out.print("\t loại (1-Nội thất; 2-SS): ");
        while(true){
            loai = Integer.valueOf(sc.nextLine());
            if(loai==1 || loai==2){
                break;
            }
        }
        System.out.print("\t giá: ");
        gia = sc.nextDouble();
        sc.nextLine();
    }
    public void xuat(){
        System.out.printf(" mã: %s \t tên: %s \t loại: %d \t giá: %.0f ",
                maDoVat, tenDoVat, loai, gia);
    }
}

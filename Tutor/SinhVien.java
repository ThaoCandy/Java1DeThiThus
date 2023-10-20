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
public class SinhVien {
    // truong = thuoc tinh
    // private: chi duoc su dung trong class
    // public: duoc du dung cong khai
       private String MSV;
       private String hoTen;
       private double diemTB;
       
    // method = hanh dong
       public void nhap(Scanner sc){
           System.out.print("Moi nhap ma sinh vien: ");
           MSV = sc.nextLine();
            System.out.print("Moi nhap ho ten: ");
           hoTen = sc.nextLine();
            System.out.print("Moi nhap diem TB: ");
           diemTB = sc.nextDouble();
           sc.nextLine();
       }

    public SinhVien(String MSV, String hoTen, double diemTB) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }
    
       public void xuat(){
           System.out.println(MSV + " - " + hoTen + " - " + diemTB);
       }
    
       
    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
       
       
}

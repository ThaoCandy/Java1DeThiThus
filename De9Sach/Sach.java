/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De9Sach;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sach {
    private String ma;
    private String ten;
    private int namXB;

    static Scanner sc = new Scanner(System.in);
    public Sach() {
    }

    public Sach(String ma, String ten, int namXB) {
        this.ma = ma;
        this.ten = ten;
        this.namXB = namXB;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
     public void input(){
         do {             
             System.out.print("\t mã: ");
             ma = sc.nextLine();
         } while (ma.isBlank());
         do {             
             System.out.print("\t tên: ");
             ten = sc.nextLine();
         } while (ten.isBlank());
         String nhap;
         do {             
             System.out.print("\t năm xuất bản: ");
             nhap = sc.nextLine();
         } while (!nhap.matches("\\d+") || Integer.parseInt(nhap)>2023);
         namXB = Integer.parseInt(nhap);
         
     }
     
     public void output(){
         System.out.printf(" %s \t %s \t năm xs: %d",
                 ten, ma, namXB);
     }
}

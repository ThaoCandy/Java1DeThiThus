/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_DongVat;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DongVat {

    private String ma;
    private String ten;
    private int gioiTinh;
    private int canNang;

    public DongVat() {
    }

    public DongVat(String ma, String ten, int gioiTinh, int canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
    static String fm_gt = "^[1-2]$";
    static String fm_cn = "[0-9]+";

    public void input(Scanner sc) {
        System.out.print("\t mã: ");
        ma = sc.nextLine();
        System.out.print("\t tên: ");
        ten = sc.nextLine();
        
        
        String nhap;
        do {
            System.out.print("\t giới tính (1/2): ");
            nhap = sc.nextLine();
        } while (!nhap.matches(fm_gt));
        gioiTinh = Integer.parseInt(nhap);
        
        do {            
                    System.out.print("\t cân nặng: ");
                    nhap = sc.nextLine();
        } while (!nhap.matches(fm_cn));
        canNang = Integer.parseInt(nhap);

    }
    
    
    static String GT(int x){
        String gt = null;
        if(x==1){
            gt = "Đực";
        }else if(x==2){
            gt = "Cái";
        }
        return gt;
    }
    
    
    public void inThongTin(){
        System.out.printf(" mã: %s \t tên: %s \t giới tính: %s \t cân nặng: %d",
                ma, ten, GT(gioiTinh), canNang);
    }

}

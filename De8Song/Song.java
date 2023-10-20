/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8Song;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Song {
    static Scanner sc = new Scanner(System.in);
    
    private String ma;
    private String ten;
    private String nhacSi;
    private double thoiLuong;
    private String datePH;

    public Song() {
    }

    public Song(String ma, String ten, String nhacSi, double thoiLuong, String datePH) {
        this.ma = ma;
        this.ten = ten;
        this.nhacSi = nhacSi;
        this.thoiLuong = thoiLuong;
        this.datePH = datePH;
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

    public String getNhacSi() {
        return nhacSi;
    }

    public void setNhacSi(String nhacSi) {
        this.nhacSi = nhacSi;
    }

    public double getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(double thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getDatePH() {
        return datePH;
    }

    public void setDatePH(String datePH) {
        this.datePH = datePH;
    }

    public void input() {
        do {
            System.out.print("\t mã: ");
            ma = sc.nextLine();
        } while (ma.isBlank());
        
        do {
            System.out.print("\t tên: ");
            ten = sc.nextLine();
        } while (ten.isBlank());
        
        do {
            System.out.print("\t nhạc sĩ: ");
            nhacSi = sc.nextLine();
        } while (nhacSi.isBlank());
        
        do {
            System.out.print("\t ngày phát hành: ");
            datePH = sc.nextLine();
        } while (datePH.isBlank());
        String nhap;
        do {
            System.out.print("\t thời lượng: ");
             nhap = sc.nextLine();
        } while (!nhap.matches("\\d+([.]\\d+)?"));
        thoiLuong = Double.parseDouble(nhap);
    }
    
    public void inThongTin(){
        System.out.printf(" %s: %s \t %.1f phút \t nhạc sĩ: %s \t ngày PH: %s ",
                ten, ma, thoiLuong, nhacSi, datePH);
    }

}

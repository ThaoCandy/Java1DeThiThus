/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3Kem;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kem {

    private String ma;
    private String ten;
    private double gia;
    private int soLuong;

    static Scanner sc = new Scanner(System.in);

    public Kem() {
    }

    public Kem(String ma, String ten, double gia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void input() {
        while (true) {
            System.out.print("\t mã:");
            ma = sc.nextLine();
            if (ma.isEmpty() == false) {
                break;
            }
        }

        while (true) {
            System.out.print("\t tên: ");
            ten = sc.nextLine();
            if (ten.isEmpty() == false) {
                break;
            }
        }

        String fm_sl = "\\d+";
        String fm_gia = "\\d+(\\.\\d+)?";  
        //nếu thực sự nhập vào giá là số thực
        String nhap;
        while (true) {
            System.out.print("\t giá: ");
            nhap= sc.nextLine();
            if (nhap.matches(fm_gia)) {
                gia = Double.parseDouble(nhap);
                break;
            }
        }
        while (true) {
            System.out.print("\t số lượng: ");
            nhap = sc.nextLine();
            if (nhap.matches(fm_sl)) {
                soLuong = Integer.parseInt(nhap);
                break;
            }
        }

    }

    public void inThongTin() {
        System.out.printf(" mã: %s \t tên: %s \t giá: %.1f \t số lượng: %d ",
                ma, ten, gia, soLuong);
    }
}

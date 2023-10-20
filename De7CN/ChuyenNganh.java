/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7CN;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ChuyenNganh {

    static Scanner sc = new Scanner(System.in);

    private String ma;
    private String ten;
    private String moTa;
    private String tenCN;
    private int namThanhLap;
    private boolean trangThai;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String ma, String ten, String moTa, String tenCN, int namThanhLap, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.tenCN = tenCN;
        this.namThanhLap = namThanhLap;
        this.trangThai = trangThai;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public int getNamThanhLap() {
        return namThanhLap;
    }

    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void input() {
        //1.
        do {
            System.out.print("\t mã: ");
            ma = sc.nextLine();
        } while (ma.isBlank());

        //2.
        do {
            System.out.print("\t tên: ");
            ten = sc.nextLine();
        } while (ten.isBlank());

        //3.
        System.out.print("\t mô tả: ");
        moTa = sc.nextLine();

        //4.
        do {
            System.out.print("\t chủ nhiệm: ");
            tenCN = sc.nextLine();
        } while (tenCN.isBlank());

        //5.
        String nhap;
        do {
            System.out.print("\t năm TL: ");
            nhap = sc.nextLine();
        } while (!nhap.matches("\\d+"));
        namThanhLap = Integer.parseInt(nhap);

        //6.
        do {
            System.out.print("\t trạng thái (1-Hoạt động/ 2-Ngừng): ");
            nhap = sc.nextLine();
        } while (!nhap.matches("[1-2]{1}"));
        if (nhap.equalsIgnoreCase("1")) {
            trangThai = true;
        } else {
            trangThai = false;
        }
    }

    static String trangT(boolean x) {
        String y = "HĐ";
        if (x == false) {
            y = "ngừng HĐ";
        }
        return y;
    }

    public void inThongTin() {
        System.out.printf(" %s: %s \t %s \t %d \t status: %s \t mô tả: %s",
                ten, ma, tenCN, namThanhLap, trangT(trangThai), moTa);
    }
}

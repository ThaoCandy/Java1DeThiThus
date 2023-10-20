/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu2_SVPL;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SinhVien {

    static Scanner sc = new Scanner(System.in);

    private String hoTen;
    private String chuyenNganh;
    private String maSV;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String chuyenNganh, String maSV) {
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void input() {
        while (true) {
            System.out.print("\t tên: ");
            hoTen = sc.nextLine();
            if (hoTen.isEmpty() == false) {
                break;
            }
        }
        while (true) {
            System.out.print("\t mã: ");
            maSV = sc.nextLine();
            if (maSV.isEmpty() == false) {
                break;
            }
        }
        while (true) {
            System.out.print("\t ngành: ");
            chuyenNganh = sc.nextLine();
            if (chuyenNganh.isEmpty() == false) {
                break;
            }
        }

    }

    public void inThongTin() {
        System.out.printf(" tên: %s \t mã: %s \t chuyên ngành: %s",
                hoTen, maSV, chuyenNganh);
    }

}

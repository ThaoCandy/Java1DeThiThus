/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De5DongHo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DH {

    private int ma;
    private String theLoai;
    private String mauSac;
    private int kichThuoc;
    private String chatLieu;
    private int gia;

    public DH() {
    }

    public DH(int ma, String theLoai, String mauSac, int kichThuoc, String chatLieu, int gia) {
        this.ma = ma;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void input(Scanner sc) {
        String nhap;
        do {            
        System.out.print("\t mã: ");
        nhap = sc.nextLine();
        } while (!nhap.matches("\\d+"));
        ma = Integer.parseInt(nhap);
        
        
        System.out.print("\t thể loại: ");
        theLoai = sc.nextLine();
        System.out.print("\t màu sắc: ");
        mauSac = sc.nextLine();

        do {
            System.out.print("\t kích thước: ");
            nhap = sc.nextLine();
        } while (!nhap.matches("\\d+"));
        kichThuoc = Integer.parseInt(nhap);
        
        System.out.print("\t chất liệu: ");
        chatLieu = sc.nextLine();

        do {
            System.out.print("\t giá: ");
            nhap = sc.nextLine();
        } while (!nhap.matches("\\d+"));
        gia = Integer.parseInt(nhap);

    }

    public void inThongTin() {
        System.out.printf(" mã: %d \t thể loại: %s \t màu sắc: %s \n "
                + " kích thước: %d \t chất liệu: %s \t giá: %d \n",
                ma, theLoai, mauSac, kichThuoc, chatLieu, gia);
    }
}

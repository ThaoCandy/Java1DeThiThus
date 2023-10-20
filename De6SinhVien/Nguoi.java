/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De6SinhVien;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Nguoi {

    private String ma;
    private String ten;
    private String queQuan;
    private int tuoi;
    private boolean gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String ma, String ten, String queQuan, int tuoi, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.queQuan = queQuan;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh() {
        this.gioiTinh = gioiTinh;
    }
    static String fm_tuoi = "\\d{1,3}";
    static String fm_gt = "[1-2]+";

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t mã: ");
        ma = sc.nextLine();
        System.out.print("\t tên: ");
        ten = sc.nextLine();
        System.out.print("\t quê quán: ");
        queQuan = sc.nextLine();
        String nhap;
        do {
            System.out.print("\t giới tính (1-Nam/2-Nữ): ");
            nhap = sc.nextLine();
        } while (!nhap.matches(fm_gt));
        if(nhap.equals("1")){
            gioiTinh = true;
        }else{
            gioiTinh = false;
        }

        do {
            System.out.print("\t tuổi: ");
            nhap = sc.nextLine();
        } while (!nhap.matches(fm_tuoi));
        tuoi = Integer.parseInt(nhap);

    }
    static String checkGT(boolean gt){
        String GT = "nữ";
        if(gt == true){
            GT = "nam";
        }
        
        return GT;
    }
    public void inThongTin(){
        System.out.printf(" %s: %s - %s \t tuổi: %d \t quê: %s",
                ten, ma, checkGT(gioiTinh), tuoi, queQuan);
    }

}

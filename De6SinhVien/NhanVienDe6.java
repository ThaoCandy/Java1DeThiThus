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
public class NhanVienDe6 extends Nguoi {

    private double luongTheoNgay;

    public NhanVienDe6() {
    }

    public NhanVienDe6(double luongTheoNgay, String ma, String ten, String queQuan, int tuoi, boolean gioiTinh) {
        super(ma, ten, queQuan, tuoi, gioiTinh);
        this.luongTheoNgay = luongTheoNgay;
    }

    public double getLuongTheoNgay() {
        return luongTheoNgay;
    }

    public void setLuongTheoNgay(double luongTheoNgay) {
        this.luongTheoNgay = luongTheoNgay;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        String fm_st = "^[0-9]+([.][0-9]+)?$";
        String nhap;
        do {
            System.out.print("\t lương theo ngày: ");
            nhap = sc.nextLine();
        } while (!nhap.matches(fm_st));

        luongTheoNgay = Double.parseDouble(nhap);

    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("\t lương theo ngày: %.0f", luongTheoNgay);

    }

}

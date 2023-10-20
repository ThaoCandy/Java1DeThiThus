/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu1_Vaccine;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class VacCine {
    static Scanner sc = new Scanner(System.in);
    private String MaVC;
    private String TenVC;
    private float ThoiGianTD;
    private String NgayHetHan;

    public VacCine() {
    }

    public VacCine(String MaVC, String TenVC, float ThoiGianTD, String NgayHetHan) {
        this.MaVC = MaVC;
        this.TenVC = TenVC;
        this.ThoiGianTD = ThoiGianTD;
        this.NgayHetHan = NgayHetHan;
    }

    public String getMaVC() {
        return MaVC;
    }

    public void setMaVC(String MaVC) {
        this.MaVC = MaVC;
    }

    public String getTenVC() {
        return TenVC;
    }

    public void setTenVC(String TenVC) {
        this.TenVC = TenVC;
    }

    public float getThoiGianTD() {
        return ThoiGianTD;
    }

    public void setThoiGianTD(float ThoiGianTD) {
        this.ThoiGianTD = ThoiGianTD;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
    
    public void input(){
        System.out.print("\t mã: ");
        MaVC = sc.nextLine();
        System.out.print("\t tên: ");
        TenVC = sc.nextLine();
        System.out.print("\t thời gian tác dụng: ");
        ThoiGianTD = sc.nextFloat();
        sc.nextLine();
        System.out.print("\t ngày hết hạn: ");
        NgayHetHan = sc.nextLine();
    }
    
    public void inThongTin(){
        System.out.printf(" mã: %s \t tên: %s \t TGTD: %.0f \t ngày HH: %s \t",
                MaVC, TenVC, ThoiGianTD, NgayHetHan);
    
    }
}

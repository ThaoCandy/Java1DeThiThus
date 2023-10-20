/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu1_Vaccine;

/**
 *
 * @author user
 */
public class VacCineVN extends VacCine {
    private String QuocGia;

    public VacCineVN() {
    }

    public VacCineVN(String QuocGia, String MaVC, String TenVC, float ThoiGianTD, String NgayHetHan) {
        super(MaVC, TenVC, ThoiGianTD, NgayHetHan);
        this.QuocGia = QuocGia;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    @Override
    public void input() {
        super.input(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(" Quốc gia: Việt Nam");
    }
    
    
    
}

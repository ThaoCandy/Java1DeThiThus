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
public class SinhVieDe6 extends Nguoi{
    private double toan;
    private double ly;
    private double hoa;

    public SinhVieDe6() {
    }

    public SinhVieDe6(double toan, double ly, double hoa, String ma, String ten, String queQuan, int tuoi, boolean gioiTinh) {
        super(ma, ten, queQuan, tuoi, gioiTinh);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("\t điểm toán: ");
        toan = Double.parseDouble(sc.nextLine());
        System.out.print("\t điểm lý: ");
        ly = Double.parseDouble(sc.nextLine());
        System.out.print("\t điểm hóa: ");
        hoa = Double.parseDouble(sc.nextLine());
        
    
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
           System.out.printf(" \n\t toán: %.1f \t lý: %.1f \t hóa: %.1f \t ĐTB: %.1f",
                   toan, ly, hoa, diemTB());
    
    }
    
    public double diemTB(){
        return (toan + ly + hoa)/3;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemF
ileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.netbeans;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SinhVien {
    // để chạy đc phải có hàm main() có mũi tên xanh
    // Đặc tả truy xuất = Access Modifier: Định nghĩa khả năng truy cập (công khai  hay )
    //Định nghĩa các tường
    
    String HoTen;
    double Diem;

    public SinhVien() {
    }

    public SinhVien(String HoTen, double Diem) {
        this.HoTen = HoTen;
        this.Diem = Diem;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
   
    
    // Khai báo phương thức
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho tên: "); HoTen = sc.nextLine();
        System.out.print("Điểm TB: "); Diem = sc.nextDouble();
        
    }
    
    public void xuat(){
      
        System.out.printf("%s %.0f %s\n", HoTen, Diem,  xepLoai());
    }
    
    public String xepLoai(){
        if (Diem < 5) {
            return "TB";
            
        } else if(Diem >= 5 && Diem < 7) {
            return "KHA";
            
        }else{
            return "GIOI";
        }
        
    }
}

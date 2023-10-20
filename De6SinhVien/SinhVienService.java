/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De6SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SinhVienService {

    private ArrayList<SinhVieDe6> listSv = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public SinhVienService() {
    }

    public ArrayList<SinhVieDe6> getListSv() {
        return listSv;
    }

    public void nhap() {
        int i = 0;
        while (true) {
            System.out.printf("sinh viên thứ %d: \n", ++i);
            SinhVieDe6 sv = new SinhVieDe6();
            sv.input();
            listSv.add(sv);

            System.out.print("Nhập nữa không? Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
    public void xuat(ArrayList<SinhVieDe6> A){
        int i= 0;
        for (SinhVieDe6 sv : A) {
            System.out.printf("%d.", ++i);
            sv.inThongTin();
            System.out.print("\n");
        }
        
    }
    
    public void timTenChuaA(){
        for (SinhVieDe6 sv : listSv) {
            String check = sv.getTen();
            if(check.contains("a") || check.contains("à") || check.contains("á")
                    || check.contains("ả") || check.contains("ã")){
                sv.inThongTin();
                System.out.print("\n");
            }
        }
    }
    public double maxTB(){
        double max = -1;
        for (SinhVieDe6 sv : listSv) {
            if(sv.diemTB()>max){
                max = sv.diemTB();
            }
        }
        return max;
    }
    public void timMaxTB(double m){
        for (SinhVieDe6 sv: listSv) {
            if(sv.diemTB()==m){
                sv.inThongTin();
                System.out.print("\n");
            }
        }
    }
    
    public void timTenChuaKyTu(){
        System.out.print("Mời nhập kí tự: ");
        String nhap = sc.nextLine();
        for (SinhVieDe6 sinhVieDe6 : listSv) {
            if(sinhVieDe6.getTen().contains(nhap)){
                sinhVieDe6.inThongTin();
                System.out.print("\n");
            }
        }
    }
    public void xoaTheoMa(){
        System.out.print("Mời nhập mã sinh viên muốn xóa: ");
        
        String ma = sc.nextLine();
        int x =0;
        for (int i = listSv.size()-1; i >=0; i--) {
            if(listSv.get(i).getMa().equalsIgnoreCase(ma)){
                listSv.remove(i);
                x++;
            }
        }
        if(x==0){
            System.out.println("Không có sinh viên nào có mã trên");
        }
    }
    
    public void timTheoKhoangTuoi(){
        System.out.print("Mời nhập giá trị tuổi nhỏ nhất: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập giá trị lớn nhất: ");
        int max = Integer.parseInt(sc.nextLine());
        
        for (SinhVieDe6 sv: listSv) {
            if(sv.getTuoi()>= min && sv.getTuoi()<=max){
                sv.inThongTin();
                System.out.print("\n");
            }
        }
    }
    public void KeThua(){
        NhanVienDe6 nv = new NhanVienDe6();
        nv.input();
        System.out.println("-----------");
        nv.inThongTin();
    }
}

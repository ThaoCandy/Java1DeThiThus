/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_DongVat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class QuanLyDongVat {

    private static ArrayList<DongVat> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public QuanLyDongVat() {
    }

    public ArrayList<DongVat> getList() {
        return list;
    }

    public void nhap() {
        System.out.println("Nhập danh sách động vật: ");
        int i = 0;

        while (true) {
            System.out.printf("Con thứ %d: \n", ++i);
            DongVat dv = new DongVat();
            dv.input(sc);
            list.add(dv);
            
            System.out.print("Nhập nữa không? Y/N: ");
            if(sc.nextLine().equalsIgnoreCase("n")){
                break;
            }
            
        }
    }
    
    public void xuat(ArrayList<DongVat> A){
        int i=0;
        for (DongVat dv : A) {
            System.out.printf("%d. ", ++i);
            dv.inThongTin();
            System.out.print("\n");
        }
    }
    
    public void timTheoTen(){
        System.out.print("Mời nhập tên muốn tìm: ");
        String ten = sc.nextLine();
        
        for (DongVat dv : list) {
            if(dv.getTen().contains(ten)){
                dv.inThongTin();
                System.out.print("\n");
            }
        }
    
    
    }
    
    public void khoangCN(){
        System.out.print("Mời nhập giá trị nhỏ nhất: ");
        int min = sc.nextInt();
        System.out.print("Mời nhập giá trị lớn nhất: ");
        int max = sc.nextInt();
        
        for (DongVat dv : list) {
            if(dv.getCanNang()>min && dv.getCanNang()<max){
                dv.inThongTin();
                System.out.print("\n");
            }
        }
    }
    
    public void KeThua(){
        DongVat meo = new Meo("MeoMeo", "meo0", "Mèo dihia", 2, 3);
    
        meo.inThongTin();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.netbeans;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MainSV {
    static ArrayList<SinhVien> listSv = new ArrayList<SinhVien>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        
    }
    public static void menu(){
        int chon;
        do{
            System.out.println("\n\n------------------------");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách");
        System.out.println("3. Xuất danh sách theo khoảng điểm");
        System.out.println("4. Tìm sinh viên theo họ tên");
        System.out.println("5. danh sách ngẫu nhiên");
        System.out.println("6. Tìm và xóa theo họ tên");
        System.out.println("0. Kết thúc");
        System.out.print("---------------------\n Mời chọn: ");
        chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            case 1:
                CN1();
                break;
            case 2:
                System.out.println("----- Hiển Thị Danh Sách -------");
                CN2();
                break;
            case 3:
                CN3();
                break;
            case 4:
                CN4();
                break;
            case 5:
                CN5();
                break;
            case 6:
                CN6();
                break;
            case 0:
                System.out.println("Thanks you!");
                break;
            default:
                System.out.println("Chọn không hợp lệ, hãy chọn lại!");
                break;
        
        
        }
        
        }while(chon!=0);
        
        
    }
    
    static void CN1(){
        
        int i=1;
        while(true){
            System.out.print("Nhập sinh viên thứ " + i + ":\n");
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSv.add(sv);
            i++;
            System.out.print("Bạn muốn nhập tieeso không y/n : ");
            // equals sẽ phân biệt cả chữ hoa-thuòng
            // equalsIgnoreCase KHÔNG phân biệt chữ hoa-thường, so sánh kiểu gốc
            if(sc.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
    
        
    }
    static void CN2(){
        for (SinhVien sv : listSv) {
            sv.xuat();
        }
    }
    static void CN3(){}
    static void CN4(){}
    static void CN5(){}
    static void CN6(){}
    
}

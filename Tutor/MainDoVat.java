/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author user
 */
public class MainDoVat {
    static Scanner sc = new Scanner(System.in);
    static DoVatSevice listDV = new DoVatSevice();
    public static void main(String[] args) {
        System.out.println("Nguyễn Thu Thảo   PH46896");
        menu();
    }
    
    static void menu(){
        listDV.themDoVat(new DoVat("534hfg", "ghế", 1, 4645647));
        listDV.themDoVat(new DoHoaPhat("pg3434", "bàn", 2, 345754, "da"));
        listDV.themDoVat(new DoVat("t643f", "đèn", 1, 85645));
        listDV.themDoVat(new DoVat("rt454", "điện thoại", 1, 2324645));
        
        
        
        int chon;
        do{
            System.out.println("\n\n-------------------");
            System.out.println("1. Nhập danh sách đồ vật");
            System.out.println("2. Xuât danh sách");
            System.out.println("3. Tìm theo mã");
            System.out.println("4. Sắp xếp danh sách theo mã tăng dần");
            System.out.println("5. Xóa theo mã");
//            System.out.println("6. ");
            System.out.println("0. Thoát.");
            System.out.println("---------------------");
            System.out.print("Mời chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            
            switch(chon){
                case 1:
                        System.out.println("Chức năng 1: nhập danh sách đồ vật:");
                        int i=0;
                        while(true){
                            System.out.println("Đồ thứ " + (i+1));
                            DoVat dv = new DoVat();
                            dv.nhap(sc);
                            listDV.themDoVat(dv);
                            i++;
                            System.out.print("Bạn muốn nhập nữa không Y/N: ");
                            if(sc.nextLine().equalsIgnoreCase("n")){
                                break;
                            }
                        }
                        System.out.printf("Có tất cả %d đồ vật được nhập thành công", i);
                    break;
                case 2:
                    System.out.println("Chức năng 2: Danh sách đồ vật:");
                    listDV.xuatDS(listDV.getList());
                    break;
                case 3:
                    System.out.println("Chức năng 3: Tìm theo mã");
                    System.out.print("Mời nhập mã đồ vật cần tìm: ");
                    String ma = sc.nextLine();
                    if(listDV.find(ma)!= null){
                        System.out.print("--> ");
                        listDV.find(ma).xuat();
                    }else{
                        System.out.println("không có đồ vật nào có mã " + ma);
                    }
                    break;
                case 5:
                    System.out.println("Chức năng 4: Xóa theo mã");
                    System.out.print("Mời nhập mã đồ vật cần xóa: ");
                    ma = sc.nextLine();
                    
                    listDV.xoaTheoMa(ma);
                    break;
                case 4:
                    System.out.println("Chức năng 4: Sắp xếp theo mã tăn dần");
                    listDV.sapXepTheoMa(listDV.getList());
                    break;
                case 6:
                    
                    break;
                case 0:
                    System.out.println("Kết thúc! Cảm ơn.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ, hãy nhập lại");                   
                    break;     
            }
            
        }while(chon != 0);
        
    }
}

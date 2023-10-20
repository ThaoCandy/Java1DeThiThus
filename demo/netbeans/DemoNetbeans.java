/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo.netbeans;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class DemoNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // in ra man hinh Hello World
        Scanner sc = new Scanner(System.in);

        String[][] NhanVien;
        System.out.print("Nhap so nv: ");
        int n, i, j;
        String e;
        n = sc.nextInt();
        sc.nextLine();
        NhanVien = new String[n][7];
// 0.hoTen, 1.maNV, 2.luong, 3.phongBan, 4.doanhthu, 5.tilehh 
        String[] thTin = {"ho ten", "ma NV", "luong", "phong ban", "doanh so", "ti le hoa hong", "luong trach nhiem"}; 
        
        for (i = 0; i < n; i++) {
                System.out.println("+ nhan vien " + (i + 1) + " :");

            for (j = 0; j < 4; j++) {
                if(j==3){
                    System.out.printf("\t %s: [1]Hanh chinh- [2]Tiep thi- [3]Truong phong => chon: ", thTin[j]);
                }else{
                    System.out.printf("\t %s: ", thTin[j]);
                }
                
                e = sc.nextLine();
//                sc.nextLine();
                if("2".equals(e)){
                    System.out.print("Nhap doanh so ban hang: ");
                    NhanVien[i][4]= sc.nextLine();
                    System.out.print("Nhap ti le hoa hong: ");
                    NhanVien[i][5]= sc.nextLine();
                    
                }
                if("3".equals(e)){
                    System.out.print("Nhap luong trach nhiem: ");
                    NhanVien[i][6] = sc.nextLine();
                }
                NhanVien[i][j] = e;
                
            }

        }
        String y;
        for(i=0; i<n; i++){
            System.out.println("+ nhan vien thu " + (i+1) + " :");
            for(j=0; j<6; j++){
                System.out.printf("\t%s: %s\n", thTin[j], NhanVien[i][j]);
                
                if(j==3){
                    if("3".equals(NhanVien[i][j])){
                        System.out.printf("\t%s: %s\n", thTin[6], NhanVien[i][6]);
                    }
                    if(!"2".equals(NhanVien[i][j])){
                        break;
                    }
                }
                
            }
        }
    }

}

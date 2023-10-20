/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu1_Vaccine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class QuanLyVC {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<VacCine> list = new ArrayList<>();

    public QuanLyVC() {
    }

    public ArrayList<VacCine> getList() {
        return list;
    }

   public void addOb(VacCine x){// phục vụ cho việc tạo danh sách sẵn
       this.list.add(x);
   }
    
    
    public void nhapDS() {
        int i = 0;
        while (true) {
            System.out.printf("Vaccine thứ %d: \n", (++i));

            VacCine vc = new VacCine();
            vc.input();
            list.add(vc);

            System.out.print("Bạn muốn nhập nữa không Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }

        }
        System.out.printf("Có tất cả %d Vaccine được nhập thành công", i);
    }

    public void xuatDS(ArrayList<VacCine> A) {
        System.out.printf("------- %d vaccine ------\n", A.size());
        int i = 0;
        for (VacCine vc : A) {
            System.out.printf("%d. ", ++i);
            vc.inThongTin();
            System.out.print("\n");
        }

    }

    public void sapXepGiamTGTD() {
        Comparator<VacCine> comp = new Comparator<VacCine>() {
            @Override
            public int compare(VacCine o1, VacCine o2) {
                return Double.compare(o1.getThoiGianTD(), o2.getThoiGianTD());
            }
        };

        ArrayList<VacCine> listCl = (ArrayList<VacCine>) list.clone();
        Collections.sort(listCl, comp);
        Collections.reverse(listCl);
        xuatDS(listCl);
    }

    public static boolean check() {
        boolean check = false;
        for (VacCine vc : list) {
            if (vc.getThoiGianTD() >= 6) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void TGTDtren6th() {
        if (check() == true) {
            System.out.println("Danh sách các vaccine có thời gian tác dụng trên 6 tháng:");
            int i = 0;
            for (VacCine vc : list) {
                if (vc.getThoiGianTD() >= 6) {
                    System.out.printf("%d. ", ++i);
                    vc.inThongTin();
                    System.out.print("\n");
                }
            }
        } else {
            System.out.println("Không có Vaccine nào thỏa mãn.");
        }
    }

    public void vaccineVN() {
        System.out.println("Vaccine Việt Nam");
        VacCineVN Vn = new VacCineVN();
        Vn.input();
        Vn.inThongTin();
    }
    public void minVC(){
        double min = list.get(0).getThoiGianTD();
        for (VacCine vc : list) {
            if(vc.getThoiGianTD()<min){
                min = vc.getThoiGianTD();
            }
        }
        
        System.out.printf("Danh sách VC có TGTD nhỏ nhất (%.0f) là: \n", min);
        for (VacCine vc : list) {
            if(vc.getThoiGianTD() == min){
                vc.inThongTin();
                System.out.print("\n");
            }
        }
        
    }
    
    public void maVN(){
        System.out.println("Danh sách vc có chứa mã VN là: ");
        for (VacCine vc : list) {
            if(vc.getMaVC().contains("VN")){
                vc.inThongTin();
                System.out.print("\n");
            }
        }
    }
}

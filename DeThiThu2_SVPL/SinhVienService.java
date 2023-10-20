/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu2_SVPL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SinhVienService {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienService() {
    }

    public void addOb(SinhVien x) { 
    // phục vụ cho danh sách tạo sẵn, để test các chức năng 1 cách nhanh chóng
        this.list.add(x);
  }

    public static ArrayList<SinhVien> getList() {
        return list;
    }

    public static void setList(ArrayList<SinhVien> list) {
        SinhVienService.list = list;
    }

    public void nhapDS() {
        int i = 0;
        while (true) {
            System.out.printf(" sinh viên %d: \n", ++i);
            SinhVien sv = new SinhVien();
            sv.input();
            list.add(sv);

            System.out.print("nhập tiếp không? Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                System.out.printf("Có %d sinh viên nhập thêm thành công.", i);
                break;
            }

        }
    }

    public void xuatDS(ArrayList<SinhVien> A) {
        if(A.isEmpty()){
            System.out.println("Danh sách còn rỗng");
            return;
        }
        System.out.printf("------ %d sinh viên ------\n", A.size());
        int i = 0;
        for (SinhVien sv : A) {
            System.out.printf("%d. ", ++i);
            sv.inThongTin();
            System.out.print("\n");
        }
    }

    public SinhVien find(String ma) {
        SinhVien SinhVien = null;
        for (SinhVien sv : list) {
            if (sv.getMaSV().equalsIgnoreCase(ma)) {
                SinhVien = sv;
                break;
            }
        }

        return SinhVien;
    }

    public void timTheoMa() {
        if(list.isEmpty()){
            System.out.println("Danh sách còn rỗng");
            return;
        }
        System.out.print("Mời nhập mã sinh viên cần tìm: ");
        String ma = sc.nextLine();
        if (find(ma) == null) {
            System.out.println("Không có sinh viên nào có mã trên");
        } else {
            System.out.print("==> ");
            find(ma).inThongTin();
        }
    }

    public void sapXepTheoCN() {
        if(list.isEmpty()){
            System.out.println("Danh sách còn rỗng");
            return;
        }
        Comparator<SinhVien> compCN = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getChuyenNganh().compareTo(o2.getChuyenNganh());

            }
        };

        ArrayList<SinhVien> listCl = (ArrayList<SinhVien>) list.clone();
        Collections.sort(listCl, compCN);
        xuatDS(listCl);
    }

    public void sinhVienPL() {
        SinhVien svPl = new SinhVIenPoly("kiên", "CNTT", "ma00", "UDPM");
        
        svPl.inThongTin();
    }

}

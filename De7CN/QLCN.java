/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7CN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class QLCN {

    static Scanner sc = new Scanner(System.in);
    static int i;
    private static ArrayList<ChuyenNganh> list = new ArrayList<>();
    
        public void addOb(ChuyenNganh x){ /// phục vụ để tạo sẵn danh sách
            this.list.add(x);
        }


    public QLCN() {
    }

    public ArrayList<ChuyenNganh> getList() {
        return list;
    }

    public void nhap() {
        i = 0;
        while (true) {
            System.out.printf("chuyên ngành %d: \n", ++i);
            ChuyenNganh cn = new ChuyenNganh();
            cn.input();
            list.add(cn);

            System.out.print("Nhập nữa không? Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public void xuat(ArrayList<ChuyenNganh> A) {
        if (A.isEmpty()) {
            System.out.println("Danh sách còn rỗng");
            return;
        }
        i = 0;
        for (ChuyenNganh cn : A) {
            System.out.printf("%d. ", ++i);
            cn.inThongTin();
            System.out.print("\n");
        }
    }

    public void listTangTheoTen() {
        ArrayList<ChuyenNganh> listCl = (ArrayList<ChuyenNganh>) list.clone();
        listCl.sort(
                (o1, o2) -> {
                    return o1.getTen().compareTo(o2.getTen());
                }
        );

        xuat(listCl);
    }

    public void listVitriChan() {
        for (int j = 0; j < list.size(); j++) {
            if (j % 2 == 1) {
                list.get(j).inThongTin();
                System.out.print("\n");
            }
        }
    }

    public ArrayList findA(String st, int x) {
        ArrayList<ChuyenNganh> findList = new ArrayList<>();
        for (ChuyenNganh cn : list) {
            if (x == 1) {
                if (cn.getMa().equalsIgnoreCase(st)) {
                    findList.add(cn);
                }
            } else if (x == 2) {
                if (cn.getTenCN().equalsIgnoreCase(st)) {
                    findList.add(cn);
                }
            } else if (x == 3) {
                if (cn.isTrangThai() == true) {
                    findList.add(cn);
                }
            }

        }
        return findList;
    }

    public void timTheoMa(int x, int y) {
        String st = "";
        if (y != 3) {
            System.out.print("Mời nhập mã hoặc tên chủ nhiệm muốn tìm (xóa): ");
            st = sc.nextLine();
        }

        if (findA(st, y).isEmpty()) {
            System.out.println("Không có nhân viên nào thỏa mãn");

        } else {
            if (x == 1) {// thực hiện chức năng xuất
                xuat(findA(st, y));
            } else if (x == 2) { // chỉ thực hiện cn xóa mã
                list.removeAll(findA(st, y));
                System.out.println("---> Xóa thành công");
            }
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De9Sach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ListSach {

    private static ArrayList<Sach> list = new ArrayList<>();
    static int i;
    static Scanner sc = new Scanner(System.in);

    public ListSach() {
    }

    public ArrayList<Sach> getList() {
        return list;
    }

    public void nhap1Lan(int ind, int x) {
        Sach bk = new Sach();
        bk.input();
        if (x == 1) {
            list.add(bk);
        } else if (x == 2) {
            list.set(ind, bk);
        }
    }

    public void nhapDS() {
        i = 0;
        while (true) {
            System.out.printf("Sách thứ %d: \n", ++i);
            nhap1Lan(-1, 1);

            System.out.print("Nhập nữa không Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatDS(ArrayList<Sach> A) {
        i = 0;
        for (Sach sach : A) {
            System.out.printf("%d.", ++i);
            sach.output();
            System.out.print("\n");
        }
    }

    public void hienThiKhoangNamSX() {
        System.out.print("Năm nhỏ nhất: ");
        int min = sc.nextInt();
        System.out.print("Năm lớn nhất: ");
        int max = sc.nextInt();
        for (Sach sach : list) {
            if (sach.getNamXB() >= min && sach.getNamXB() <= max) {
                sach.output();
                System.out.print("\n");
            }
        }

    }

    public void capNhat() {
        if (list.isEmpty()) {
            System.out.println("Danh sách còn rỗng");
            return;
        }

        System.out.print("Mời nhập mã sách muốn cập nhật: ");
        String ma = sc.nextLine();
        i = 0;
        int count = 0;
        for (Sach sach : list) {

            if (sach.getMa().equalsIgnoreCase(ma)) {
                sach.output();
                System.out.println("\nMời cập nhật lại hết tất cả thông tin:");
                nhap1Lan(i, 2);
                count++;
                System.out.println("Cập nhật thành công");
            }
            ++i;
        }
        if (count == 0) {
            System.out.println("Không có sách nào thỏa mãn");
        }

    }

    public void DStheoTen() {
        ArrayList<Sach> listCl = (ArrayList<Sach>) list.clone();
        listCl.sort(
                (o1, o2) -> {
                    return o1.getTen().compareTo(o2.getTen());
                }
        );
        xuatDS(listCl);
    }

    public void DStruocNam() {
        System.out.print("Mời nhập năm: ");
        int nam = Integer.parseInt(sc.nextLine());

        for (Sach sach : list) {
            if (sach.getNamXB() < nam) {
                sach.output();
                System.out.print("\n");
            }
        }

    }

    public void xoa() {
        System.out.print("Mời nhập mã muốn xóa: ");
        String ma = sc.nextLine();
        for (int j = list.size() - 1; j >= 0; j--) {
            if (list.get(j).getMa().equalsIgnoreCase(ma)) {
                list.get(j).output();
                list.remove(j);
                System.out.println("Xóa thành công");
            }
        }
    }
    
    public void tenDauLT(){
        for (Sach sach : list) {
            if(sach.getTen().startsWith("Lập Trình")){
                sach.output();
                System.out.print("\n");
            }
        }
}
}

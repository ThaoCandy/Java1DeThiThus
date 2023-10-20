/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De5DongHo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class QuanLyDH {

    private static ArrayList<DH> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public QuanLyDH() {
    }

    public ArrayList<DH> getList() {
        return list;
    }

    public void nhapDS() {
        int i = 0;
        while (true) {
            System.out.printf("Đồng hồ thứ %d: \n", ++i);
            DH dh = new DH();
            dh.input(sc);
            list.add(dh);
            System.out.print("nhập nữa không? Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public void xuatDS(ArrayList<DH> A) {
        int i = 0;
        for (DH dh : A) {
            System.out.printf("%d. ", ++i);
            dh.inThongTin();
        }
    }

    public void timKhoangGia() {
        System.out.print("Mời nhập giá trị nhở nhất: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập giá trị lớn nhất: ");
        int max = Integer.parseInt(sc.nextLine());

        for (DH dh : list) {
            if (dh.getGia() >= min && dh.getGia() <= max) {
                dh.inThongTin();
            }
        }

    }

    public static DH find(int ma) {
        DH dh = null;
        for (DH dh1 : list) {
            if (dh1.getMa() == ma) {
                dh = dh1;
            }
        }
        return dh;

    }
    
    public void xoa(){
        if(list.isEmpty()){
            System.out.println("Danh sách còn trống");
            return;
        }
        System.out.print("Mời nhập mã cần xóa: ");
        int ma = Integer.parseInt(sc.nextLine());
        
        if(find(ma)== null){
            System.out.println("Không có đồng hồ nào có mã trên");
        }else{
            for (int i = list.size()-1; i >=0; i--) {
                if(list.get(i).getMa() == ma){
                    list.remove(i);
                }
            }
            
            System.out.println("Xóa thành công!");
        }
    }
    
    public void sapXepGiamKT(){
        ArrayList<DH> listCl = (ArrayList<DH>)list.clone();
        listCl.sort(
                (o1,o2) -> {
                    return Double.compare(o2.getKichThuoc(), o1.getKichThuoc());
                }
        );
        
        xuatDS(listCl);
    }

}

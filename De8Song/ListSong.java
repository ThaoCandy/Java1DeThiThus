/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8Song;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ListSong {

    static Scanner sc = new Scanner(System.in);
    static int i;
    private static ArrayList<Song> list = new ArrayList<>();

    public ListSong() {
    }

    public ArrayList<Song> getList() {
        return list;
    }

    public void nhapDS() {
        i = 0;
        while (true) {
            System.out.printf("bài thứ %d: \n", ++i);
            Song sg = new Song();
            sg.input();
            list.add(sg);

            System.out.print("Nhập nữa không? Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatDS(ArrayList<Song> A) {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        i = 0;
        for (Song song : A) {
            System.out.printf("%d. ", ++i);
            song.inThongTin();
            System.out.print("\n");
        }

    }

    public ArrayList<Song> findA(String a, int x) {

        ArrayList<Song> findL = new ArrayList<>();
        for (Song song : list) {
            if (x == 0) {
                if (song.getMa().equalsIgnoreCase(a)) {
                    findL.add(song);
                }
            } else if (x == 1) {
                if (song.getNhacSi().contains("a")) {
                    findL.add(song);
                }
            }
        }
        return findL;
    }

    public void timOrXoa(int x) {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        if (x == 0) {
            System.out.print("Mời nhập mã bài muốn xóa: ");
            String a = sc.nextLine();
            if (findA(a, x).isEmpty()) {
                System.out.println("Không có bài nhạc nào thỏa mãn.");

            } else {
                xuatDS(findA(a, x));
                list.removeAll(findA(a, x));
                
                System.out.println("--> Xóa thành công");
            }

        } else if (x == 1) {
            if (findA("", x).isEmpty()) {
                System.out.println("Không có tên nhạc sĩ nào chứa chữ [a] trong tên");
            } else {
                xuatDS(findA("", x));
            }
        }
    }

    public void DStangTheoTL() {
        ArrayList<Song> listCl = (ArrayList<Song>) list.clone();

        listCl.sort(
                (o1, o2) -> {
                    return Double.compare(o1.getThoiLuong(), o2.getThoiLuong());
                }
        );

        xuatDS(listCl);
    }

    public void Kpop() {
        Song kp = new K_Pop();
        kp.input();
        list.add(kp);
        System.out.println("----------");
        System.out.println("Nhạc K-Pop:");
        kp.inThongTin();
    }

    public double max() {
        double Mx = -1;
        for (Song song : list) {
            if (song.getThoiLuong() > Mx) {
                Mx = song.getThoiLuong();
            }
        }
        return Mx;
    }

    public void inMax() {
        for (Song song : list) {
            if (song.getThoiLuong() == max()) {
                song.inThongTin();
                System.out.print("\n");
            }
        }
    }
}

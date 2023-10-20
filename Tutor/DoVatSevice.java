/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author user
 */
public class DoVatSevice {
    private ArrayList<DoVat> list = new ArrayList<>();

    public DoVatSevice() {
    }

    public ArrayList<DoVat> getList() {
        return list;
    }

    public void setList(ArrayList<DoVat> list) {
        this.list = list;
    }
    
    public void themDoVat(DoVat dv){
        list.add(dv);
    }
    public void xuatDS(ArrayList<DoVat> A){
        System.out.printf("------ %d đồ vật-------\n", A.size());
        int i=1;
        for(DoVat x: A){
            System.out.printf(" %d.", i);
            x.xuat();
            i++;
            System.out.print("\n");
        }
    }
    public DoVat find(String ma){
        int i = 0;
        DoVat y = null;
        for (DoVat x : list) {
            if(x.getMaDoVat().equalsIgnoreCase(ma)){
                i++;
                y = x;
                break;
            }
            
        }
        return y;
       
    }
    
    public void sapXepTheoMa(ArrayList<DoVat> A){
        Comparator<DoVat> compMa = new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return o1.getMaDoVat().compareTo(o2.getMaDoVat());
            }
        };
        ArrayList<DoVat> listClone = (ArrayList<DoVat>)A.clone();
        Collections.sort(listClone, compMa);
        xuatDS(listClone);
        
    }
    
    public void xoaTheoMa(String ma){
        if(find(ma)!= null){
            find(ma).xuat();
            list.remove(find(ma));
            System.out.println("--> Xóa thành công");
        }else{
            System.out.println("không có đồ vật nào có mã " + ma);
        }
    }
}

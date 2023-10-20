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
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        list.add(5.6);
        list.add(3.6);
        list.add(1.6);
        list.add(7.6);
        list.add(34.6);
        list.add(13.6);
        list.add(78.6);
        
        double Tong = 0;
        System.out.print("Danh sách số thực: \n");
        for (Double x : list) {
            System.out.print(x + ", ");
            Tong+=x;
        }
        System.out.println("\nTổng: " + Tong);
    }
}

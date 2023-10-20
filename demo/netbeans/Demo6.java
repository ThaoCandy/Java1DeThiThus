/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.netbeans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Demo6 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int n=5;
        Scanner sc = new Scanner(System.in);
        String Q = "";
        for (int i = 0; i < n; i++) {
            System.out.print("Mời bạn nhập câu hỏi thứ " + (i+1) +": ");
            Q = sc.nextLine();
            list.add(Q);
        }
        
        Collections.shuffle(list);
        
    }
}

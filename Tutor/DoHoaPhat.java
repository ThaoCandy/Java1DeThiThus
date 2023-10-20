/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DoHoaPhat extends DoVat{
    private String chatLieu;

    public DoHoaPhat() {
    }

    public DoHoaPhat(String maDoVat, String tenDoVat, int loai, double gia, String chatLieu) {
        super(maDoVat, tenDoVat, loai, gia);
        this.chatLieu = chatLieu;
    }

    @Override
    public void nhap(Scanner sc) {
        
        super.nhap(sc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        System.out.print("\t chất liệu: ");
        chatLieu = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("\t chất liệu: %s", chatLieu);
    }
     
    
}

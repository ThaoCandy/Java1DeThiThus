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
public class XeDap extends PhuongTienGT{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public XeDap() {
    }

    public XeDap(String mau, double gia, String brand) {
        super(mau, gia);
        this.brand = brand;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Brand: ");
        brand = sc.nextLine();
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void xuat() {
        super.xuat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("| xe đạp thuộc: %s", brand);
        
    
    
    }
    
    
}

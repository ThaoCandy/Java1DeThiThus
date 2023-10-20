/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_DongVat;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Meo extends DongVat{
    private String tiengKeu;

    public Meo() {
    }

    public Meo(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public Meo(String tiengKeu, String ma, String ten, int gioiTinh, int canNang) {
        super(ma, ten, gioiTinh, canNang);
        this.tiengKeu = tiengKeu;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("\t tiếng kêu: ");
        
        tiengKeu = sc.nextLine();
    
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("\t tiếng kêu: %s \n", tiengKeu);
    
    }
    
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8Song;

/**
 *
 * @author user
 */
public class K_Pop extends Song{
    private String caSi;

    public K_Pop() {
    }

    public K_Pop(String caSi, String ma, String ten, String nhacSi, double thoiLuong, String datePH) {
        super(ma, ten, nhacSi, thoiLuong, datePH);
        this.caSi = caSi;
    }

    @Override
    public void input() {
        super.input(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        do {            
            System.out.print("\t ca sĩ/nhóm thể hiện: ");
            caSi = sc.nextLine();
        } while (caSi.isBlank());
    
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("\n  ca sĩ/nhóm thể hiện: %s", caSi);
    
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3Kem;

/**
 *
 * @author user
 */
public class KemOcQue extends Kem {

    private int vi;

    public KemOcQue() {
    }

    public KemOcQue(int vi, String ma, String ten, double gia, int soLuong) {
        super(ma, ten, gia, soLuong);
        this.vi = vi;
    }

    public int getVi() {
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }

    @Override
    public void input() {

        super.input(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("\t là vị 1-Soocola hay 2-Vani?");
        String fm_vi = "[1-2]{1}";
        String VI;
        while (true) {
            System.out.print("\t vị: ");
            VI = super.sc.nextLine();
            
            if (VI.matches(fm_vi)) {
                vi = Integer.parseInt(VI);
                break;
            }
        }

    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(vi==1){
            System.out.println("\t vị: Socola");
        }else if(vi==2){
            System.out.println("\t vị: Vani");
        }
    
    
    }
    
    

}

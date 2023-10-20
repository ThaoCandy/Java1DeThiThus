/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeThiThu2_SVPL;


/**
 *
 * @author user
 */
public class SinhVIenPoly extends SinhVien{
    private String chuyenNganhHep;

    public SinhVIenPoly() {
    }

    

    public SinhVIenPoly(String hoTen, String chuyenNganh, String maSV, String chuyenNganhHep) {
        super(hoTen, chuyenNganh, maSV);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public String getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    @Override
    public void input() {
        super.input(); 
        while(true){
            System.out.print("\t ngành hẹp: ");
            chuyenNganhHep = super.sc.nextLine();
            if(chuyenNganhHep.isEmpty()== false){
                break;
            }
        }
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.printf("\t ngành hẹp: %s", chuyenNganhHep);
    }
    
    
}

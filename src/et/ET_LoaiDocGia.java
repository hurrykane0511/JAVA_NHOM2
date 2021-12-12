/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et;

/**
 *
 * @author yushu
 */
public class ET_LoaiDocGia {
    private int maLoai; // mã loại
    private String tenLoai; // tên loại
    private int sLSachMuon; // số lượng sách mượn
    private int phi; // phí

    public ET_LoaiDocGia(int maLoai, String tenLoai, int sLSachMuon, int phi) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.sLSachMuon = sLSachMuon;
        this.phi = phi;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public int getsLSachMuon() {
        return sLSachMuon;
    }

    public void setsLSachMuon(int sLSachMuon) {
        this.sLSachMuon = sLSachMuon;
    }

    public int getPhi() {
        return phi;
    }

    public void setPhi(int phi) {
        this.phi = phi;
    }

    @Override
    public String toString() {
        return tenLoai;
    }
    
}

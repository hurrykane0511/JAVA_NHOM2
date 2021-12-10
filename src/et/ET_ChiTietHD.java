/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et;

/**
 *
 * @author PC
 */
public class ET_ChiTietHD {

    public ET_ChiTietHD(String maChiTietHD, int soLuong, String maHD, String maSach) {
        this.maChiTietHD = maChiTietHD;
        this.soLuong = soLuong;
        this.maHD = maHD;
        this.maSach = maSach;
    }

    public String getMaChiTietHD() {
        return maChiTietHD;
    }

    public void setMaChiTietHD(String maChiTietHD) {
        this.maChiTietHD = maChiTietHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    private String maChiTietHD;
    private int soLuong;
    private String maHD;
    private String maSach;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et;

import java.util.Date;

/**
 *
 * @author PC
 */
public class ET_HoaDon {

    public ET_HoaDon(String maHD, String maNV, Date ngayNhap, String maNCC) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.ngayNhap = ngayNhap;
        this.maNCC = maNCC;
    }
    public ET_HoaDon(String maHD, String maNV, String maNCC) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maNCC = maNCC;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }
    private String  maHD;
    private String maNV;
    private Date ngayNhap;
    private String maNCC;
}

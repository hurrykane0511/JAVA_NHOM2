/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ET_Sach {
    private String maSach;
    private String tenSach;
    private int soLuong;
    private int gia;
    private int namXB;
    private int soTrang;
    private String maTD;
    private String maNXB;
    private String theLoai;
    private String ngonNgu;
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
  
    public String getMaTD() {
        return maTD;
    }

    public void setMaTD(String maTD) {
        this.maTD = maTD;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public ET_Sach(String maSach, String tenSach, int soLuong, int gia, int namXB, int soTrang, String maTD, String maNXB, String theLoai, String ngonNgu) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.gia = gia;
        this.namXB = namXB;
        this.soTrang = soTrang;
        this.maTD = maTD;
        this.maNXB = maNXB;
        this.theLoai = theLoai;
        this.ngonNgu = ngonNgu;
    }
     public ET_Sach(String maSach, String tenSach,String theLoai, String ngonNgu , String maTD, String maNXB,int namXB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.namXB = namXB;
        this.maTD = maTD;
        this.maNXB = maNXB;
        this.theLoai = theLoai;
        this.ngonNgu = ngonNgu;
    }
}

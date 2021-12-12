/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et;

import java.util.Date;

/**
 *
 * @author yushu
 */
public class ET_NhanVien {

    private String maNhanVien; // mã nhân viên
    private String ten;// tên nhân viên
    private String ho; // họ nhân viên
    private String diaChi; // địa chỉ
    private String soDT; // số điện thoại
    private Date ngaySinh; // ngày sinh
    private String CCCD;// căn cước công dân

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public ET_NhanVien(String maNhanVien, String ten, String ho, String diaChi, String soDT, Date ngaySinh, String CCCD) {
        this.maNhanVien = maNhanVien;
        this.ho = ho;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.CCCD = CCCD;
    }

    @Override
    public String toString() {
        return getHo() + " " + getTen();
    }

    public ET_NhanVien(String maNhanVien, String ten) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
    }

}

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
public class ET_DocGia {

    private String maDocGia; // mã độc giả
    private String ho; // họ độc giả
    private String ten; // tên độc giả
    private Date ngaySinh; // ngày sinh
    private String gioiTinh; // giới tính
    private String cccd;// căn cước công dân
    private String diaChi; // địa chỉ
    private int loaiDG; // loại độc giả

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getloaiDG() {
        return loaiDG;
    }

    public void setTrangThai(int trangThai) {
        this.loaiDG = trangThai;
    }

    public ET_DocGia(String maDocGia, String ho, String ten, Date ngaySinh, String gioiTinh, String cccd, String diaChi, int loaiDG) {
        this.maDocGia = maDocGia;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.loaiDG = loaiDG;
    }

}

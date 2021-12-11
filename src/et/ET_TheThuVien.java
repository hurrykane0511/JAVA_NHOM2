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
public class ET_TheThuVien {
    private String maThe;
    private String maDocGia; 
    private int gioiHanSl;
    private String maNhanVien;
    private String tinhTrang;
    private Date ngayTao;

  
    public ET_TheThuVien(String maThe, String maDocGia, int gioiHanSl, String maNhanVien, String tinhTrang, Date ngayTao) {
        this.maThe = maThe;
        this.maDocGia = maDocGia;
        this.gioiHanSl = gioiHanSl;
        this.maNhanVien = maNhanVien;
        this.tinhTrang = tinhTrang;
        this.ngayTao = ngayTao;
    }
    public ET_TheThuVien(String maThe, String maDocGia, int gioiHanSl, String maNhanVien, String tinhTrang) {
        this.maThe = maThe;
        this.maDocGia = maDocGia;
        this.gioiHanSl = gioiHanSl;
        this.maNhanVien = maNhanVien;
        this.tinhTrang = tinhTrang;
    }
    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public int getGioiHanSl() {
        return gioiHanSl;
    }

    public void setGioiHanSl(int gioiHanSl) {
        this.gioiHanSl = gioiHanSl;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    
    
    
}

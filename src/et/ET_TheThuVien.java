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
    private String maNhanVien;
    private Date ngayTao;
    private Date ngayHetHan;

    public ET_TheThuVien(String maThe, String maDocGia, String maNhanVien, Date ngayTao, Date ngayHetHan) {
        this.maThe = maThe;
        this.maDocGia = maDocGia;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
        this.ngayHetHan = ngayHetHan;
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

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
  
}

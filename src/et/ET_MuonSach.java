/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author son2lk
 */
public class ET_MuonSach {

    String masach; // mã sách
    String mathe; // mã thẻ
    String manv; // mã nhân viên
    java.sql.Date ngaymuon; // ngày mượn
    java.sql.Date ngaytra; // ngày trả
    String tinhTrang; // tình trạng

    public String getMasach() {
        return masach;
    }

    public String getMathe() {
        return mathe;
    }

    public String getManv() {
        return manv;
    }

    public java.sql.Date getNgaymuon() {
        return ngaymuon;
    }

    public java.sql.Date getNgaytra() {
        return ngaytra;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public ET_MuonSach(String masach, String mathe, String manv, Date ngaymuon, int soNgayMuon, String tinhTrang) {

        this.masach = masach;
        this.mathe = mathe;
        this.manv = manv;
        this.ngaymuon = new java.sql.Date(ngaymuon.getTime());
        Calendar c = Calendar.getInstance();
        c.setTime(ngaymuon);
        c.add(Calendar.DATE, soNgayMuon);
        java.util.Date utilDate = c.getTime();
        this.ngaytra = new java.sql.Date(utilDate.getTime());
        this.tinhTrang = tinhTrang;

    }
}

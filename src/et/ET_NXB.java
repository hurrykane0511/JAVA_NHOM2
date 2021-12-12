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
public class ET_NXB {
    private String maNXB; // mã nhà xuất bản
    private String tenNXb; // tên nhà xuât bản

    public ET_NXB(String maNXB, String tenNXb) {
        this.maNXB = maNXB;
        this.tenNXb = tenNXb;
    }
    private String diaChi;

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getTenNXb() {
        return tenNXb;
    }

    public void setTenNXb(String tenNXb) {
        this.tenNXb = tenNXb;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ET_NXB(String maNXB, String tenNXb, String diaChi) {
        this.maNXB = maNXB;
        this.tenNXb = tenNXb;
        this.diaChi = diaChi;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package et;

/**
 *
 * @author LENOVO
 */
public class ET_NhaCungCap {
    private String maNCC;
    private String tenNCC;
    private String diaChiNCC;
    private String sdtNCC;

    public ET_NhaCungCap() {
        this.maNCC = "";
        this.tenNCC = "";
        this.diaChiNCC = "";
        this.sdtNCC = "";
    }

    public ET_NhaCungCap(String maNCC, String tenNCC, String diaChiNCC, String sdtNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChiNCC = diaChiNCC;
        this.sdtNCC = sdtNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    public String getSdtNCC() {
        return sdtNCC;
    }

    public void setSdtNCC(String sdtNCC) {
        this.sdtNCC = sdtNCC;
    }
    
}

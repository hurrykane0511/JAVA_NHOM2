/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et;

/**
 *
 * @author dthan
 */
public class ET_NgonNgu {
    private String maNgonNgu; // mã ngôn ngữ
    private String tenNgonNgu; // tên ngôn ngữ

    public ET_NgonNgu(String maNgonNgu, String tenNgonNgu) {
        this.maNgonNgu = maNgonNgu;
        this.tenNgonNgu = tenNgonNgu;
    }

    public String getMaNgonNgu() {
        return maNgonNgu;
    }

    public void setMaNgonNgu(String maNgonNgu) {
        this.maNgonNgu = maNgonNgu;
    }

    public String getTenNgonNgu() {
        return tenNgonNgu;
    }

    public void setTenNgonNgu(String tenNgonNgu) {
        this.tenNgonNgu = tenNgonNgu;
    }
}

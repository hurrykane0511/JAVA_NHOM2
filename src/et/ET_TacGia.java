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
public class ET_TacGia {
     private String maTG;
    private String tenTG;

    public ET_TacGia() {
    }

    public String getMaTG() {
        return maTG;
    }

    public void setMaTG(String maTG) {
        this.maTG = maTG;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public ET_TacGia(String maTG, String tenTG) {
        this.maTG = maTG;
        this.tenTG = tenTG;
    }
}

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
public class ET_NgonNgu {
     private String maNN;
    private String tenNN;

    public String getMaNN() {
        return maNN;
    }

    public void setMaNN(String maNN) {
        this.maNN = maNN;
    }

    public String getTenNN() {
        return tenNN;
    }

    public void setTenNN(String tenNN) {
        this.tenNN = tenNN;
    }

    public ET_NgonNgu() {
    }

    public ET_NgonNgu(String maNN, String tenNN) {
        this.maNN = maNN;
        this.tenNN = tenNN;
    }
    
}

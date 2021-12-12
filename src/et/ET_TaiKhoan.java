/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et;

/**
 *
 * @author yushu
 */
public class ET_TaiKhoan {

//    private int maTK;
    private String maTK; // mã tài khoản
    private String tenDN;  // tên đăng nhập
    private String matKhau; // mật khẩu
    private String loaiTK; // loại tài khoản
    private String maNV; // mã nhân viên

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public ET_TaiKhoan(String maTK, String tenDN, String matKhau, String loaiTK, String maNV) {
        this.maTK = maTK;
        this.tenDN = tenDN;
        this.matKhau = matKhau;
        this.loaiTK = loaiTK;
        this.maNV = maNV;
    }
}

   

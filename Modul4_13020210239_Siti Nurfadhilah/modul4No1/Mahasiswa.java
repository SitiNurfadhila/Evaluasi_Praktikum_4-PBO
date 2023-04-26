/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4_no1;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    private String nama;
    private String stb;
    private String universitas;
 
    public Mahasiswa(String nama, String stb, String universitas) {
        this.nama = nama;
        this.stb = stb;
        this.universitas = universitas;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStb() {
        return stb;
    }
    public void setStb(String stb) {
        this.stb = stb;
    }
    public String getUniversitas() {
        return universitas;
    }
    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }
}


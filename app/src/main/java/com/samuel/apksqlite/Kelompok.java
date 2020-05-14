package com.samuel.apksqlite;

public class Kelompok {
    private String Nama;
    private String Stambuk;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getStambuk() {
        return Stambuk;
    }

    public void setStambuk(String stambuk) {
        Stambuk = stambuk;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    private String Email;
    private int foto;

}

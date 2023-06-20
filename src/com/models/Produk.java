package com.models;

public class Produk {
    private int id;
    private String nama;
    private long harga;
    private int jumlah;

    public Produk(int id, String nama, long harga, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public String toString() {
        return "Produk{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", harga=" + harga +
                ", jumlah=" + jumlah +
                '}';
    }
}

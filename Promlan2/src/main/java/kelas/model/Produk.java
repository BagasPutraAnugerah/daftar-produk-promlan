package kelas.model;

public class Produk {

    private final String kode;
    private final String nama;
    private final String kategori;
    private final long harga;

    public Produk(String kode, String nama, String kategori, long harga) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("isi kode produk.");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("isi nama produk.");
        }
        if (!"Makanan".equals(kategori) && !"Minuman".equals(kategori)) {
            throw new IllegalArgumentException("Kategori harus Makanan atau Minuman.");
        }
        if (harga <= 0) {
            throw new IllegalArgumentException("harga tidak valid");
        }
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public long getHarga() {
        return harga;
    }
}

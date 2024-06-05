public class Rakyat {
    private String alamat;
    private double kekayaan;

    public Rakyat(String alamat, double kekayaan) {
        this.alamat = alamat;
        this.kekayaan = kekayaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getKekayaan() {
        return kekayaan;
    }

    public void terimaBantuan(double jumlah) {
        this.kekayaan += jumlah;
    }

    public void bayarPajak(APBN apbn) {
        double pajak = kekayaan * 0.05; // Asumsi pajak 5% dari kekayaan
        apbn.addAnggaran(pajak);
    }
}

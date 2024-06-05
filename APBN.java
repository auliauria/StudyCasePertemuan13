public class APBN {
    private double anggaran;

    public APBN(double anggaranAwal) {
        this.anggaran = anggaranAwal;
    }

    public void addAnggaran(double jumlah) {
        this.anggaran += jumlah;
    }

    public void kurangiAnggaran(double jumlah) {
        this.anggaran -= jumlah;
    }

    public double getAnggaran() {
        return anggaran;
    }
}

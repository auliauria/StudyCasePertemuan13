public class DPRD extends Pegawai{
    int jmlKunjungan;

    public DPRD(String NIP, double gajiPokok, String daerahKekuasaan, int jmlKunjungan) {
        super(NIP, gajiPokok, daerahKekuasaan);
        this.jmlKunjungan = jmlKunjungan;
    }

    public void kunjunganKerja(){
        jmlKunjungan++;
    }
    @Override
    public double getTunjangan() {
        return gajiPokok + (jmlKunjungan * 100000);
    }

    @Override
    public void bayarPajak(APBN apbn) {
        double pajak = gajiPokok * 0.1; // Asumsi pajak 10% dari kekayaan
        apbn.addAnggaran(pajak);
    }
}

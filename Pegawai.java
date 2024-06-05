public abstract class Pegawai {
    String NIP;
    double gajiPokok;
    String daerahKekuasaan;

    public Pegawai(String NIP, double gajiPokok, String daerahKekuasaan) {
        this.NIP = NIP;
        this.gajiPokok = gajiPokok;
        this.daerahKekuasaan = daerahKekuasaan;
    }

    public abstract double getTunjangan();

    public abstract void bayarPajak(APBN apbn);
}
import java.util.ArrayList;
import java.util.List;
public class PNS extends Pegawai {
    int golongan;
    List<Rakyat> daftarRakyat;

    public PNS(String NIP, double gajiPokok, String daerahKekuasaan, int golongan) {
        super(NIP, gajiPokok, daerahKekuasaan);
        this.golongan = golongan;
        this.daftarRakyat = new ArrayList<>();
    }

    public void addRakyat(Rakyat rakyat){
        if (!rakyat.getAlamat().equals(this.daerahKekuasaan)) {
            System.out.println("Error: Alamat tidak sesuai dengan daerah kekuasaan PNS.");
        } else {
            this.daftarRakyat.add(rakyat);
        }
    }

    public void salurkanBantuan(APBN apbn) {
        for (Rakyat rakyat : daftarRakyat) {
            if (rakyat.getKekayaan() < 100000000) {
                apbn.kurangiAnggaran(1000000);
                rakyat.terimaBantuan(1000000);
            }
        }
    }

    @Override
    public double getTunjangan() {
        return gajiPokok + (golongan * 100000);
    }

    @Override
    public void bayarPajak(APBN apbn) {
        double pajak = gajiPokok * 0.1; // Asumsi pajak 10% dari kekayaan
        apbn.addAnggaran(pajak);

    }
}

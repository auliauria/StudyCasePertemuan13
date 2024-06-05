import java.util.ArrayList;
import java.util.List;
public class Gubernur extends Pegawai{
    List<PNS> daftarPNS;

    public Gubernur(String NIP, double gajiPokok, String daerahKekuasaan) {
        super(NIP, gajiPokok, daerahKekuasaan);
        this.daftarPNS = new ArrayList<>();
    }

    public void addPNS(PNS pns){
        if (!pns.daerahKekuasaan.equals(this.daerahKekuasaan)) {
            System.out.println("Error: Pegawai tidak berkuasa di wilayah ini");
        } else {
            this.daftarPNS.add(pns);
        }
    }

    public void addDanaKeAPBN(APBN apbn, double jumlah) {
        apbn.addAnggaran(jumlah);
    }
    @Override
    public double getTunjangan() {
        return gajiPokok + (daftarPNS.size() * 100000);
    }

    @Override
    public void bayarPajak(APBN apbn) {
        double pajak = gajiPokok * 0.1; // Asumsi pajak 10% dari kekayaan
        apbn.addAnggaran(pajak);
    }
}

public class Main {
    public static void main(String[] args) {
        APBN apbn = new APBN(1000000000);

        PNS pns1 = new PNS("123", 5000000, "Solo", 3);
        Rakyat rakyat1 = new Rakyat("Ngawi", 50000000);
        Rakyat rakyat2 = new Rakyat("Solo", 150000000);
        Rakyat rakyat3 = new Rakyat("Solo", 12000000);

        pns1.addRakyat(rakyat1);
        pns1.addRakyat(rakyat2);
        pns1.addRakyat(rakyat3);
        System.out.println();
        pns1.salurkanBantuan(apbn);
        System.out.println("Sisa anggaran APBN setelah penyaluran bantuan: " + String.format("%.1f", apbn.getAnggaran()));
        System.out.println();

        Gubernur gubernur1 = new Gubernur("456", 10000000, "Konoha");
        gubernur1.addPNS(pns1);
        gubernur1.addDanaKeAPBN(apbn, 200000000);
        System.out.println("Jumlah anggaran APBN setelah ditambah oleh Gubernur: " + String.format("%.1f", apbn.getAnggaran()));
        System.out.println();

        DPRD dprd = new DPRD("789", 7000000, "Konoha", 5);
        dprd.kunjunganKerja();
        dprd.kunjunganKerja();
        System.out.println("Tunjangan DPRD: " + dprd.getTunjangan());
        System.out.println();

        pns1.bayarPajak(apbn);
        gubernur1.bayarPajak(apbn);
        dprd.bayarPajak(apbn);
        rakyat1.bayarPajak(apbn);
        rakyat2.bayarPajak(apbn);
        System.out.println("Jumlah anggaran APBN setelah pembayaran pajak: " + String.format("%.1f", apbn.getAnggaran()));
    }
}
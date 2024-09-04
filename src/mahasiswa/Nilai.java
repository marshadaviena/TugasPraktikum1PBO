/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author LENOVO
 */
public class Nilai {
    String NPM;
    String Nama;
    float nilaiAbsen;
    float nilaiTugas;
    float nilaiUTS;
    float nilaiUAS;
    double nilaiAkhir;
    
    public void Nilai (){
        NPM = "2310631170030";
        Nama = "Marsha Daviena Zalyadieza A";   
        nilaiAbsen = 80;
        nilaiTugas = 100;
        nilaiUTS = 90;
        nilaiUAS = 100;
        nilaiAkhir = 0;
        
        NPM = NPM;
        Nama = Nama;
        nilaiAbsen = nilaiAbsen;
        nilaiTugas = nilaiTugas;
        nilaiUTS = nilaiUTS;
        nilaiUAS = nilaiUAS;
        nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }  
    
    public void Cetaknilai(){
        System.out.println("NPM         : " + NPM);
        System.out.println("Nama        : " + Nama);
        System.out.println("Nilai Absen : " + nilaiAbsen);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }

    Nilai() {
        System.out.println("nilai akkhir anda adalah");
    }
}

import Koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;

public class Main{
 public static void main(String [] args){
  System.out.println("Tes 123");
  Database.hubungkan();
  Dosen.tampilanInfo();
  Mahasiswa.tampilanInfo();
  MataKuliah.tampilanInfo();
 }
}
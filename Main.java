
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
public static void main(String[] args) throws IOException {
 BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
 
Pecahan nilai = new Pecahan();
 Hitung hasil = new Hitung();
 
System.out.println("Pecahan pertama : ");
 System.out.println("Masukkan nilai pembilang1 : ");
 String a = baca.readLine();
 nilai.setPb1(a);
 int pembilangPertama = Integer.parseInt(nilai.getPb1());
 
System.out.println("Masukkan nilai penyebut1 : ");
 String b = baca.readLine();
 nilai.setPy1(b);
 int penyebutPertama = Integer.parseInt(nilai.getPy1());
 
System.out.println("Pecahan kedua : ");
 System.out.println("Masukkan nilai pembagi2 : ");
 String c = baca.readLine();
 nilai.setPb2(c);
 int pembilangKedua = Integer.parseInt(nilai.getPb2());
 
System.out.println("Masukkan nilai penyebut2 : ");
 String d = baca.readLine();
 nilai.setPy2(d);
 int penyebutKedua = Integer.parseInt(nilai.getPy2());
 
if(penyebutPertama == 0 || penyebutKedua==0){
 System.out.println("\nPenyebut Error!!!!!");
 }else{
 
hasil.setKpk(penyebutPertama, penyebutKedua);
 int kpk = hasil.getKpk();
 System.out.println("KPK = "+kpk);
 
int pbSatu = ((kpk/penyebutPertama)*pembilangPertama);
 int pbDua = ((kpk/penyebutKedua)*pembilangKedua);
 int hasilTambah = pbSatu + pbDua;
 int hasilKurang = pbSatu - pbDua;
 int hasilPerkalianPembilang = (pembilangPertama*pembilangKedua);
 int hasilPerkalianPenyebut = (penyebutPertama*penyebutKedua);
 int atas = pembilangPertama * penyebutKedua;
 int bawah = pembilangKedua * penyebutPertama;
 
 System.out.println(pbSatu+"/"+kpk+" + "+pbDua+"/"+kpk+" = "+hasilTambah+"/"+kpk);
 System.out.println("\n"+pbSatu+"/"+kpk+" - "+pbDua+"/"+kpk+" = "+hasilKurang+"/"+kpk);
 System.out.println("\n"+pembilangPertama+"/"+penyebutPertama+" * "+pembilangKedua+"/"+penyebutKedua+" = "+hasilPerkalianPembilang+"/"+hasilPerkalianPenyebut);
 System.out.println("\n"+pembilangPertama+"/"+penyebutPertama+" : "+pembilangKedua+"/"+penyebutKedua+" = "+atas+"/"+bawah);
    
 
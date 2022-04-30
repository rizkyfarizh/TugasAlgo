package Model;

 import Interface.ContohInterface;

 public class Perhitungan implements ContohInterface {
     private int a;
     private int b;
     private int hasil;

     public Perhitungan(int _a, int _b, int _hasil) {
         this.a = _a;
         this.b = _b;
         this.hasil = 0;
         this.hasil = _hasil;
         PrintJudulClass("Print Judul dalam method Perhitungan");
     }

     private void PrintJudulClass(String jdl) {
         System.out.println(jdl);
     }

     @Override
     public void PrintJudul() {
         // TODO Auto-generated method stub
         System.out.println("Judul menggunakan interface");

     }

     @Override
     public void HitungTambah() {
         // TODO Auto-generated method stub
         this.hasil = this.a + this.b;
     }

     @Override
     public void HitungKali() {
         // TODO Auto-generated method stub
         this.hasil = this.a * this.b;

     }

     public int hitungtmbh (int angka1, int angka2){
         this.a = angka1;
         this.b = angka2;
         HitungTambah();
         return this.hasil;
     }

     public int hitungkalian (int angka3, int angka4){
         this.a = angka3;
         this.b = angka4;
         HitungKali();
         return this.hasil;
     }
 } 
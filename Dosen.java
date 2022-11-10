public class Dosen extends Elemen{ //Menggunakan extend untuk pewarisan Polymorphisme, jadi kelas Elemen merupakan superclass dari kelas Dosen
    private int jumlahHariKerja;
    public Dosen(String nama, int jumlahHariKerja){
      super(nama);
      setJumlahHariKerja(jumlahHariKerja);
    }
  
    public int getJamSibuk(){
      return jumlahHariKerja*8;
    }
  
    public void cekJamSibuk(){
      System.out.println(super.toString() +" adalah seorang Dosen dengan jam sibuk "+getJamSibuk());
    }
  
    public void setJumlahHariKerja(int newJumlahHariKerja){
      if(newJumlahHariKerja >= 0){
        jumlahHariKerja = newJumlahHariKerja;
      }
    }
  }
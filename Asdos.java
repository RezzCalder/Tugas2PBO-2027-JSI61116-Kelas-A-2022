public class Asdos extends Mahasiswa{ //Menggunakan extend untuk pewarisan Polymorphisme, jadi kelas Mahasiswa merupakan superclass dari kelas Asdos
    private int jamNgasdos;
  
    public Asdos(String nama, int sks, int jamNgasdos){
      super(nama, sks);
      setJamNgasdos(jamNgasdos);
    }
  
    public int getJamSibuk(){
      return jamNgasdos + super.getJamSibuk();
    }
  
    public void cekJamSibuk(){
      System.out.println(super.toString()+" adalah seorang Asdos dengan jam sibuk "+getJamSibuk());
    }
  
    public void setJamNgasdos(int newJamNgasdos){
      if(newJamNgasdos >= 0){
        jamNgasdos = newJamNgasdos;
      }
    }   
  }
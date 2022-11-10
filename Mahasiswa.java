class Mahasiswa extends Elemen{ //Menggunakan extend untuk pewarisan Polymorphisme, jadi kelas Elemen merupakan superclass dari kelas Mahasiswa
    private int sks;
    int jamSibuk=sks*3;
    public Mahasiswa(String nama, int sks){
      super(nama);
      setSks(sks);
    }
    public int getJamSibuk(){
      return sks*3;
    }
    public void cekJamSibuk(){
      System.out.println(super.toString()+" adalah seorang Mahasiswa dengan jam sibuk "+getJamSibuk());
    }
    public void setSks(int newSks){
      if(newSks >= 0){
        sks = newSks;
      }
    } 
  }
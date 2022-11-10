public class Elemen {
    private String nama;
    //constuctor
    public  Elemen(String nama){
      this.nama=nama;
    }
  
    public String toString(){
      return nama;
    }
    public int getJamSibuk(){ //Polymorphism overriding karena method ini memiliki nama yang sama dengan subclass
      return 0;
    }
    public void cekJamSibuk(){ //Polymorphism overriding karena method ini memiliki nama yang sama dengan subclass
  
    }
  }

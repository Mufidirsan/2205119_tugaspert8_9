package tugas.pertemuan.pkg8.pkg9;

public class Geometri {
  private String warna = "putih";
  private boolean filled; 
  
  public Geometri(){
      
  }

  public Geometri(String warna, boolean filled) {
    this.warna = warna;
    this.filled = filled;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public boolean filled() {
    return filled;
  }

  public void setfilled(boolean diisi) {
    this.filled = diisi;
  }

  @Override
  public String toString() {
    return "Warna: " + warna + " dan Diisi: " + filled;
  }
}


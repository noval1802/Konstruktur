
// open main
package Setget;
// Class
public class SettGett {

  // Atribut
  public int luas;
  public int jariJari;
  // End Atribut

  // Construktur
  public SettGett(int luas, int newjariJari) {
    System.out.println("menghitung luas lingkaran");
    this.luas = luas;
    this.jariJari = newjariJari;
  }
  // End Construktur

  // Method sett
  public void setJariJari(int jariJari) {
    this.jariJari = jariJari;
  }

  public void setLuas(int luas) {
    this.luas = luas;
  }
  // End Method sett

  // Method gett
  public int getJariJari() {
    return jariJari;
  }

  public int getLuas() {
    return luas;
  }
  // End Method gett

  // main.java
  public static void main(String[] args) {
    int luas = 12, jariJari = 3, alas;
    {
      System.out.println("Mencari luas lingkaran");
      System.out.println("Luas lingkaran =>" + luas);
      System.out.println("Jari-jari =>" + jariJari);

      alas = (luas / 5) * jariJari;

      System.out.println("Jumlah : (" + luas + "/7)x" + jariJari + "=" + alas);
      System.out.println("<==Abdul Aziz Anaoval=>>");
      System.out.println("<==312010049==>");
    }
  }
  // End main.java
}
// End Class
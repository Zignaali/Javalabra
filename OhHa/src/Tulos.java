
public class Tulos implements Comparable<Tulos> {
    private String nimi;
    private int pisteet;
    
    public Tulos(String nimi, int pisteet) {
        nimi = this.nimi;
        pisteet = this.pisteet;
    }
    public int compareTo(Tulos toinen) {
        if (this.pisteet != toinen.pisteet) {
            return toinen.pisteet - this.pisteet;
        }
        return this.nimi.compareTo(toinen.nimi);
    }
    
}

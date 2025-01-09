import java.time.LocalDate;

public class Modello {
    private static int codicePrecedente = 0;

    private String nome;
    private int codice;
    private int anno;
    private int min_eta;
    private int max_eta;
    private int n_pezzi;
    private int n_articoli;
    private float prezzo;

    public Modello(String nome, int anno, int min_eta, int max_eta, int n_pezzi, int n_articoli, float prezzo) {
        codicePrecedente++;
        codice = codicePrecedente;

        this.nome = nome;
        this.anno = anno;
        this.min_eta = min_eta;
        this.max_eta = max_eta;
        this.n_pezzi = n_pezzi;
        this.n_articoli = n_articoli;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getMin_eta() {
        return min_eta;
    }

    public void setMin_eta(int min_eta) {
        this.min_eta = min_eta;
    }

    public int getMax_eta() {
        return max_eta;
    }

    public void setMax_eta(int max_eta) {
        this.max_eta = max_eta;
    }

    public int getN_pezzi() {
        return n_pezzi;
    }

    public void setN_pezzi(int n_pezzi) {
        this.n_pezzi = n_pezzi;
    }

    public int getN_articoli() {
        return n_articoli;
    }

    public void setN_articoli(int n_articoli) {
        this.n_articoli = n_articoli;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public boolean RangeEta(int eta) {
        return eta >= this.getMin_eta() && eta <= this.getMax_eta();
    }

    public int RangeEtaCons(){
        return this.max_eta - this.min_eta;
    }

    public int anni(){
        return LocalDate.now().getYear() - anno;
    }

    public String toString() {
        return "Modello{" +
                "nome='" + nome + '\'' +
                ", codice=" + codice +
                ", anno=" + anno +
                ", min_eta=" + min_eta +
                ", max_eta=" + max_eta +
                ", n_pezzi=" + n_pezzi +
                ", n_articoli=" + n_articoli +
                ", prezzo=" + prezzo +
                '}';
    }

    public float prezzoPezzo(){
        return prezzo/n_pezzi;
    }
}

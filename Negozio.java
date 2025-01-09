import java.util.ArrayList;

public class Negozio {
    private String nome;
    private ArrayList<Modello> modelli;

    public Negozio(String nome){
        this.nome = nome;
        modelli = new ArrayList<Modello>();
    }

    public Negozio(String nome, ArrayList<Modello> modelli) {
        this.nome = nome;
        this.modelli = modelli;
    }

    public ArrayList<Modello> getModelli() {
        return modelli;
    }

    public String getNome() {
        return nome;
    }

    /*1) inserimento di un nuovo modello */
    public void inserisciModello(Modello m){
        modelli.add(m);
    }

    /*2) stampa del nome e codice del modello più recente con il relativo intervallo di età consigliato */
    public String modelloRecente(){
        if(!modelli.isEmpty()){
            Modello recente = modelli.get(0);
            for(Modello modello : modelli){
                if(modello.anni()<recente.anni()){
                    recente = modello;
                }
            }
            return recente.toString();
        }
        return "";
    }
 
    /*3) Stampa del minimo, media e massimo dei prezzi del modello e di ciascun singolo pezzo */
    public Modello maxPrezzoPezzo(){
        if(!modelli.isEmpty()){
            Modello modelloMax = modelli.get(0);
            for(Modello modello : modelli){
                if(modello.prezzoPezzo() > modelloMax.prezzoPezzo()){
                    modelloMax = modello;
                }
            }
            return modelloMax;
        }
        return null;
    }

    public Modello minPrezzoPezzo(){
        if(!modelli.isEmpty()){
            Modello modelloMin = modelli.get(0);
            for(Modello modello : modelli){
                if(modello.prezzoPezzo() < modelloMin.prezzoPezzo()){
                    modelloMin = modello;
                }
            }
            return modelloMin;
        }
        return null;
    }

    public double mediaPrezzoPezzo(){
        double med = 0.0;
        if(!modelli.isEmpty()){
            for(Modello modello : modelli){
                med += modello.prezzoPezzo();
            }
        }
        return med;
    }

    /*4) data una età in input stampare tutte le scatole adatte a chi ha quell’età */
    public ArrayList<Modello> scatoleEta(int eta){
        ArrayList<Modello> scatole = new ArrayList<>();
        for(Modello modello : modelli){
            if(modello.RangeEta(eta)){
                scatole.add(modello);
            }
        }
        return scatole;
    }

    /*5) FACOLTATIVO → Dato un badget di spesa inserito in input dall’utente proporre l’acquisto delle
    scatole (modelli tutti diversi) in modo da massimizzare il numero di pezzi (mattoncini) acquistati*/
    public ArrayList<Modello> acquistoMaxPezzi(double budget) {
        ArrayList<Modello> scatole = new ArrayList<>();
        modelli.sort((m1, m2) -> Float.compare(m1.prezzoPezzo(), m2.prezzoPezzo()));
        for (Modello modello : modelli) {
            if (modello.getPrezzo() <= budget) {
                scatole.add(modello);
                budget -= modello.getPrezzo();
            }
        }
        return scatole;
    }
}
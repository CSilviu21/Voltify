package itts.volta.quintocinf.roscini5ainf;

import java.util.Date;

public class Brano {
    private String titolo;
    private String genere;
    private int durata;
    private String autore;


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }



    public Brano(String Titolo, String Genere){
        this.titolo=titolo;

    }
    @Override
public String toString()  {
        StringBuilder listab = new StringBuilder();
        listab.append("\n titolo:" + this.titolo);
        listab.append("\n genere:" + this.genere);
        listab.append("\n durata:" + this.durata);
        listab.append("\n autore:" + this.autore);


        return listab.toString();
}
}

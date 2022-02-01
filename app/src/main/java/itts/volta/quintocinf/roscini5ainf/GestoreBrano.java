package itts.volta.quintocinf.roscini5ainf;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;

    public GestoreBrano() {

        listaBrani = new ArrayList<Brano>(); //arraylist è dinamico (scelgo la dimensione) a differenza di array normale che è statico( dimensione predefinita)
    }

    public void addBrano(String titolo, String genere)
    {
        Brano br = new Brano(titolo, genere);
        listaBrani.add(br); //aggiungo l'elemento ad una lista

    }

    public String listaSong() { //nuovo metodo public che restituisce una stringa
        StringBuilder sbSong = new StringBuilder(); //definisco lo String Builder

        for (Brano brC : listaBrani)
        {
        sbSong.append(brC.getTitolo().toString()+"-");
        sbSong.append(brC.getAutore().toString()+"\n");


    }
        return sbSong.toString();
    }
}

package itts.volta.quintocinf.roscini5ainf;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;

    public GestoreBrano(){

        listaBrani = new ArrayList<Brano>(); //arraylist è dinamico (scelgo la dimensione) a differenza di array normale che è statico( dimensione predefinita)
    }

    public void addBrano(String titolo, String genere){
        Brano br= new Brano(titolo,genere);
        listaBrani.add(br); //aggiungo l'elemento ad una lista

    }
public String listaSong(){ //nuovo metodo public che restituisce una stringa
        StringBuilder sbSong = new StringBuilder(); //definisco lo String Builder
        for (Brano brc : listaBrani ){ //per ogni lista brano  aggiungo un elemento che chiamero all'oggetto brc di tipo Brano e vado ciclare la lista brani
            sbSong.append(brc.getTitolo().toString()+"-");
            sbSong.append(brc.getGenere().toString());
            sbSong.append("\n"); //vado a capo

        }
        return sbSong.toString(); //ritorno la stringa del mio elemento sbSong
}
}

package itts.volta.quintocinf.roscini5ainf;

import java.util.ArrayList;

public class GestoreBrano {
    ArrayList<Brano> listaBrani;

    public GestoreBrano(){

        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String Titolo){
        Brano br= new Brano(Titolo);
        listaBrani.add(br);

    }

}

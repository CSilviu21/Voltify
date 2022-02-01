package itts.volta.quintocinf.roscini5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button visualizzaBtn, inserisciBtn;   //Definisco gli elementi che ho inserito all'interno della mia activity.
    EditText editTitolo,editAutore,editDurata;
    TextView titolo,autore,genere,durata;
    GestoreBrano gb;
    Spinner spnGenere;
    String[] elencoGeneri= {"Rock","Liscio", "Pop", "Dance"}; //Definisco un array di elementi, in questo caso i generi musicali

    @Override
    protected void onCreate(Bundle savedInstanceState) { //pacchetto che contiene dati che servono per gestire l'activity
        super.onCreate(savedInstanceState);//crea l'interfaccia grafica
        setContentView(R.layout.activity_main);//specifichiamo il layout


       titolo=(TextView)findViewById(R.id.TitoloCanzone); //Grazie al metodo findViewById riesco a recuperare il riferimento ad un oggetto collocato nell'interfaccia utente e lo descrivo per ogni elemento.
       autore=(TextView)findViewById(R.id.Autore);
       genere=(TextView)findViewById(R.id.Genere);
       durata=(TextView)findViewById(R.id.Durata);
       visualizzaBtn=(Button)findViewById(R.id.visualizzaBtn);
       inserisciBtn=(Button)findViewById(R.id.inserisciBtn);
       editTitolo=(EditText)findViewById(R.id.editTitolo);
       editAutore=(EditText)findViewById(R.id.editAutore);
       editDurata=(EditText)findViewById(R.id.editDurata);

       gb= new GestoreBrano(); //Creo un oggetto gb di tipo GestoreBrano
       spnGenere = (Spinner)findViewById(R.id.spnGeneri); //R file generato con tutti i puntatori di memoria che contengono tutti gli oggetti della nostra applicazione
        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,elencoGeneri);
        // Viene utilizzato per visualizzare un'array di elementi dove ad ogni elemento della lista è associata una TextView
        // ArrayAdapter richiede tre argomenti: context(istanza di attività), layout dell'elemento XML e la matrice di dati.
        spnGenere.setAdapter(spGen);

       inserisciBtn.setOnClickListener(new View.OnClickListener() {
           /*OnClickListener è un’interfaccia e, utilizzando il new OnClickListener() come parametro per inserisciBtn.setOnClickListener ,
            sta effettivamente creando una class interna anonima che implementa OnClickListener .
            E il metodo onClick deve essere dichiarato poiché è un metodo astratto all’interno di quella class di interfaccia.
            Qualsiasi codice scritto all’interno di onClick verrà eseguito quando si preme il pulsante.
            */

           String testo = spnGenere.getSelectedItem().toString(); //Attribuisco l'elemento selezionato  alla variabile testo di tipo String( selezionato sullo spinner)
           public void onClick(View v) {
               gb.addBrano(editTitolo.getText().toString(),testo); //All'oggetto gb assegno il metodo addBrano e gli passo il titolo
               Toast.makeText((getApplicationContext()), testo, Toast.LENGTH_LONG).show();
               /*Toast è un semplice messaggio di notifica visualizzato in un popup.
              -Context andiamo a specificare lo spazio di memoria della nostra activity
               -makeText() lo utilizzo per costruire il messaggio da notificare;
               -show() lo utilizzo per rendere visibile il messaggio.
               In questo caso mostro il titolo del brano scelto.
                */

               //un metodo statico è un metodo che si può invocare senza aver instanziato la classe

           }
       });
    }

}
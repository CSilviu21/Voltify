package itts.volta.quintocinf.roscini5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button visualizzaBtn, inserisciBtn;
    EditText editTitolo,editAutore,editDurata;
    TextView titolo,autore,genere,durata;
    GestoreBrano gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       titolo=(TextView)findViewById(R.id.TitoloCanzone);
       autore=(TextView)findViewById(R.id.Autore);
       genere=(TextView)findViewById(R.id.Genere);
       durata=(TextView)findViewById(R.id.Durata);
       visualizzaBtn=(Button)findViewById(R.id.visualizzaBtn);
       inserisciBtn=(Button)findViewById(R.id.inserisciBtn);
       editTitolo=(EditText)findViewById(R.id.editTitolo);
       editAutore=(EditText)findViewById(R.id.editAutore);
       editDurata=(EditText)findViewById(R.id.editDurata);
       gb= new GestoreBrano();

       inserisciBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               gb.addBrano(editTitolo.getText().toString());
           }
       });
    }

}
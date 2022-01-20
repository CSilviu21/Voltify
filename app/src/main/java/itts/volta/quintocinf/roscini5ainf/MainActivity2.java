package itts.volta.quintocinf.roscini5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editTitolo2,editAutore2,editDurata2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTitolo2=(EditText)findViewById(R.id.editTitolo2);
        editAutore2=(EditText)findViewById(R.id.editAutore2);
        editDurata2=(EditText)findViewById(R.id.editDurata2);
    }
}
package br.com.ronaldofelipe.whatisyourname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
    }

    public void sayTheName(View view){
        String name = editText.getText().toString();
        if (name ==null || name.trim().equals("")){
            Toast.makeText(getApplicationContext(),"Tell me your name! plz?", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"Your name is "+name, Toast.LENGTH_LONG).show();
        }
    }
}

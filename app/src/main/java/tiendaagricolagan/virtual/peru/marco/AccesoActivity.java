package tiendaagricolagan.virtual.peru.marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class AccesoActivity extends AppCompatActivity {

    TextView registro_acceso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
        registro_acceso = findViewById(R.id.registro_acceso);
        registro_acceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AccesoActivity.this,RegisterUser.class);
                startActivity(intent);
                finish();
            }
        });
    }








}

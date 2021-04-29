package tiendaagricolagan.virtual.peru.marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class AccesoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
    }


    public void sendMessage(View view)
    {
        Intent intent= new Intent(this, RegisterUser.class);

        startActivity(intent);
        finish();



    }



}

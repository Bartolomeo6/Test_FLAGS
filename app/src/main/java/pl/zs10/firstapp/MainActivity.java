package pl.zs10.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void odpowiedzOK(View view) {
        Toast.makeText(this, "WHATCHU DOIN MADAFAKA???", Toast.LENGTH_SHORT).show();
    }

    public void odpowiedzNO(View view) {
        Toast toast = Toast.makeText(this, "GUT JOB MY NEIGHBOUR!!!", Toast.LENGTH_SHORT);
        toast.show();
        //TODO: znikanie

        int idButon = view.getId();
        Button baton = findViewById(idButon);
        baton.setVisibility(View.INVISIBLE);
    }
}
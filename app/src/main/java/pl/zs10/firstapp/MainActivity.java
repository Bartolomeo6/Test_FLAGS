package pl.zs10.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer punkty = 10;
    private int liczbaKlik;         // = 0
    private TextView textViewPolecenie;
    private TextView textViewPoints;
    private Button button,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPolecenie = findViewById(R.id.polecenie_txt);
        textViewPoints = findViewById(R.id.TextViewpunkty);
    }

    public void odpowiedzOK(View view) {
        if(punkty > 0)
            punkty -= 5;
        Toast.makeText(this, R.string.what, Toast.LENGTH_SHORT).show();
    }

    public void odpowiedzNO(View view) {
        liczbaKlik++;
        Toast toast = Toast.makeText(this, R.string.gj, Toast.LENGTH_SHORT);
        toast.show();

        //TODO: znikanie

        int idButon = view.getId();
        Button baton = findViewById(idButon);
        baton.setVisibility(View.INVISIBLE);

        if (liczbaKlik == 4){
//            Toast.makeText(this, "GAME OVER MY NNNN: "+punkty, Toast.LENGTH_SHORT).show();
            String tekst = punkty.toString();
            textViewPolecenie.setText(R.string.komunikat);
            textViewPoints.setText(tekst);
        }
    }
}
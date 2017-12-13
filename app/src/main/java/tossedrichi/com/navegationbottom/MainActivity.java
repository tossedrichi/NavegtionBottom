package tossedrichi.com.navegationbottom;

import android.drm.DrmStore;
import android.graphics.drawable.RippleDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        bottomNavigationView = findViewById(R.id.bottomNavegationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.inicioItem) {
                    textView.setText("Inicio");
                } else if (item.getItemId() == R.id.buscarItem) {
                    textView.setText("Buscar");
                } else if (item.getItemId() == R.id.preguntaItem) {
                    textView.setText("Preguntas");
                } else if (item.getItemId() == R.id.navegarItem) {
                    textView.setText("Navegar");
                } else if (item.getItemId() == R.id.salirItem){
                    finish();
                }

                    return true;
            }
        });
    }
}

package livs.walmart.com.daggercomponentssubcomponents.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;
import javax.inject.Named;

import androidx.appcompat.app.AppCompatActivity;
import livs.walmart.com.daggercomponentssubcomponents.Coche;
import livs.walmart.com.daggercomponentssubcomponents.R;
import livs.walmart.com.daggercomponentssubcomponents.di.BaseApplication;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private Button btSub;

    @Inject
    Coche cocheDiesel;

    @Named("coche_electrico")
    @Inject
    Coche cocheElectrico;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BaseApplication)getApplication()).getCocheComponent().inject(this);
        setUpView();
        Log.d("TAG1: ", cocheDiesel.getCoche());
        Log.d("TAG1: ",cocheElectrico.getCoche());
    }

    private void setUpView(){
        bt= findViewById(R.id.bt2);
        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });

        btSub = findViewById(R.id.bt3);
        btSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });
    }
}

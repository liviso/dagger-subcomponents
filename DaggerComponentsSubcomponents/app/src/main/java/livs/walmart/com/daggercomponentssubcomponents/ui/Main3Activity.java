package livs.walmart.com.daggercomponentssubcomponents.ui;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import androidx.appcompat.app.AppCompatActivity;
import livs.walmart.com.daggercomponentssubcomponents.Coche;
import livs.walmart.com.daggercomponentssubcomponents.Motor;
import livs.walmart.com.daggercomponentssubcomponents.R;
import livs.walmart.com.daggercomponentssubcomponents.di.BaseApplication;

public class Main3Activity extends AppCompatActivity {


    @Inject
    Motor motor;

    @Named("coche_gasolina")
    @Inject
    Coche cocheGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ((BaseApplication)getApplication()).plusCocheSubComponent().inject(this);
        Log.d("TAG1 MAIN3: ",cocheGasolina.getCoche());
    }
}

package livs.walmart.com.daggercomponentssubcomponents.ui;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import livs.walmart.com.daggercomponentssubcomponents.Motor;
import livs.walmart.com.daggercomponentssubcomponents.R;
import livs.walmart.com.daggercomponentssubcomponents.di.BaseApplication;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ((BaseApplication)getApplication()).getMotorComponent().inject(this);
        Log.d("TAG12",motor.getTipoMotor());
    }
}

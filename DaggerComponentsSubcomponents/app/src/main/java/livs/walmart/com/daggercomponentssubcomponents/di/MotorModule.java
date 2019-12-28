package livs.walmart.com.daggercomponentssubcomponents.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import livs.walmart.com.daggercomponentssubcomponents.Motor;

@Module
public class MotorModule {

    @Provides
    public Motor provideMotorDiesel(){
        return new Motor("Diesel");
    }
    @Named("electrico")
    @Provides
    public Motor provideMotorElectrico(){
        return new Motor("Electrico");
    }

    @Named("gasolina")
    @Provides
    public Motor provideMotorGasolina(){
        return new Motor("gasolina");
    }
}

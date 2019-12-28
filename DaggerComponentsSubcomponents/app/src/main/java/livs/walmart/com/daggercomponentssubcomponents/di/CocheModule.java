package livs.walmart.com.daggercomponentssubcomponents.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import livs.walmart.com.daggercomponentssubcomponents.Coche;
import livs.walmart.com.daggercomponentssubcomponents.Motor;

@Module
public class CocheModule {

    @Provides
    public Coche providesCocheMotorDiesel(Motor motor){
        return new Coche(motor);
    }

    @Named("coche_electrico")
    @Provides
    public Coche providesCocheMotorElectrico(@Named("electrico") Motor motor){
        return new Coche(motor);
    }

    @Named("coche_gasolina")
    @Provides
    public Coche providesCocheMotorGasolina(@Named("gasolina") Motor motor){
        return new Coche(motor);
    }
}

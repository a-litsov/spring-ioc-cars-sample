package com.netcracker.adlitsov.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    // That return type if scope could be "prototype" can lead to problems, because container knows real type(EngineV8)
    // only when that bean instantiates.. and some singleton non-lazy instantiated beans that have dependency to EngineV8
    // class won't work
    @Bean
    public Engine engineV8() {
        return new EngineV8();
    }

    @Primary
    @Bean
    public EngineV16 engineV16() {
        return new EngineV16();
    }

    @Bean
    public TurboEngine turboEngine() {
        return new TurboEngine();
    }

    @Bean
    public EngineAirCooledVTwin engineAirCooledVTwin() {
        return new EngineAirCooledVTwin();
    }

    @Bean
    @Scope("prototype")
    public Car kalina(Engine engine) {
        return new Car(engine);
    }

    @Bean
    @Scope("prototype")
    public Car priora(EngineV8 engine) {
        return new Car(engine);
    }

    @Bean
    @Scope("prototype")
    public Car bmwX5(TurboEngine engine) {
        return new Car(engine);
    }

    @Bean
    @Scope("prototype")
    public Car mercedesBenz(TurboEngine engine) {
        return new Car(engine);
    }

    @Bean
    @Scope("prototype")
    public Motorcycle yamahaBolt(EngineAirCooledVTwin engine) {
        return new Motorcycle(engine);
    }

    @Bean
    @Scope("prototype")
    public Motorcycle spectra2018(EngineAirCooledVTwin engine) {
        return new Motorcycle(engine);
    }

    @Bean
    public Car mercedesBenzExclusive(TurboEngine engine) {
        return new Car(engine);
    }
}

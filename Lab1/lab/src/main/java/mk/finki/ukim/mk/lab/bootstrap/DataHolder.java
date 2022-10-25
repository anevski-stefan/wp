package mk.finki.ukim.mk.lab.bootstrap;

import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Stefan Anevski
 */

@Component
public class DataHolder {
    public static List<Balloon> baloons = new ArrayList<>();

    @PostConstruct
    public void init(){
        for(int i = 1; i<=10; i++){
            baloons.add(new Balloon(String.format("Balloon %d", i), String.format("Balloon Description %d", i)));
        }
    }

}

package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Stefan Anevski
 */

@Repository
public class BalloonRepository {

    public List<Balloon> findAllBalloons(){
        return DataHolder.baloons;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        return DataHolder.baloons.stream().filter(b -> b.getName().contains(text) || b.getDescription().contains(text)).collect(Collectors.toList());
    }



}

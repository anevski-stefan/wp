package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Balloon;

import java.util.List;

/**
 * Author: Stefan Anevski
 */
public interface BalloonService {
    List<Balloon> listAll();
    List<Balloon> searchByNameOrDescription(String text);
}

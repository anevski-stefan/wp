package mk.finki.ukim.mk.lab.service.Impl;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.repository.BalloonRepository;
import mk.finki.ukim.mk.lab.service.BalloonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Stefan Anevski
 */
@Service
public class BalloonServiceImpl implements BalloonService {

    private final BalloonRepository balloonRepository;

    private BalloonServiceImpl(BalloonRepository balloonRepository) {
        this.balloonRepository = balloonRepository;
    }

    @Override
    public List<Balloon> listAll() {
        return balloonRepository.findAllBalloons();
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return balloonRepository.findAllByNameOrDescription(text);
    }
}

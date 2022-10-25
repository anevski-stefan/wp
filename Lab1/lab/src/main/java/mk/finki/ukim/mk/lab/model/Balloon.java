package mk.finki.ukim.mk.lab.model;

import lombok.Data;

/**
 * Author: Stefan Anevski
 */

@Data
public class Balloon {
    String name;
    String description;

    public Balloon(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

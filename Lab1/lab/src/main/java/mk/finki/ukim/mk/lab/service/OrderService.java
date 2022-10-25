package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Order;

/**
 * Author: Stefan Anevski
 */
public interface OrderService {
    Order placeOrder(String balloonColor, String clientName, String address);
}

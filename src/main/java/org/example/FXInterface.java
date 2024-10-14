package org.example;

import java.util.List;

public interface FXInterface {
    void addTrader(Trading trade);
    void rewardTrader();
    void deleteTrader(int id);
    List<Trading> getAllTraders();
}

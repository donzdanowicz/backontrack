package com.backontrack.patterns.strategy.investing;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stocks of XYZ";
    }
}

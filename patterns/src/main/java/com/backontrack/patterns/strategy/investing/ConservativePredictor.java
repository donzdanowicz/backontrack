package com.backontrack.patterns.strategy.investing;

public class ConservativePredictor implements BuyPredictor{

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }

}

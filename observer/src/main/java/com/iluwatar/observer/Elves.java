package com.iluwatar.observer;

import java.util.logging.Logger;

/**
 * Hobbits.
 */
public class Elves implements WeatherObserver {

    private static final Logger LOGGER = Logger.getLogger(Elves.class.getName());

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                LOGGER.info("The elves are warming by magic.");
                break;
            case RAINY:
                LOGGER.info("The elves make a magic shield round them.");
                break;
            case SUNNY:
                LOGGER.info("The elves gather every sun beam to strengthen their magic.");
                break;
            case WINDY:
                LOGGER.info("The elves consume power of wind.");
                break;
            case STORMY:
                LOGGER.info("The elves use storm energy to teleport.");
                break;
            default:
                break;
        }
    }
}


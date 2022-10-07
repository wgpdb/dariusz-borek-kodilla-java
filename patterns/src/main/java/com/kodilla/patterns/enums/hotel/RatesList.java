package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;
import java.util.Map;

public class RatesList {

    private static Map<Season, BigDecimal> singleRoomRate = Map.of(
            Season.LOW, new BigDecimal(250),
            Season.HIGH, new BigDecimal(320),
            Season.HOLIDAY, new BigDecimal(400)
    );

    private static Map<Season, BigDecimal> doubleRoomRate = Map.of(
            Season.LOW, new BigDecimal(350),
            Season.HIGH, new BigDecimal(400),
            Season.HOLIDAY, new BigDecimal(500)
    );

    public static BigDecimal getSingleRoomRate(Season season) {
        return singleRoomRate.get(season);
    }

    public static BigDecimal getDoubleRoomRate(Season season) {
        return doubleRoomRate.get(season);
    }
}
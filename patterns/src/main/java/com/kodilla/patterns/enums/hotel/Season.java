package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {
    LOW(new BigDecimal(250), new BigDecimal(350)),
    HIGH(new BigDecimal(320), new BigDecimal(400)),
    HOLIDAY(new BigDecimal(400), new BigDecimal(500));

    private BigDecimal singleRoomRate;
    private BigDecimal doubleRoomRate;

    Season(BigDecimal singleRoomRate, BigDecimal doubleRoomRate) {
        this.singleRoomRate = singleRoomRate;
        this.doubleRoomRate = doubleRoomRate;
    }

    public BigDecimal getSingleRoomRate() {
        return singleRoomRate;
    }

    public BigDecimal getDoubleRoomRate() {
        return doubleRoomRate;
    }
}
package com.lagou.phase01.module02.homework.exercise03;

/**
 *  手机卡类型枚举类
 */
public enum SimCardType {

    SIM_CARD("Sim card"), Micro_SIM_CARD("Micro sim card"), NANO_SIM_CARD("Nano sim card");

    private final String type;

    private SimCardType(String type) {
        this.type = type;
    }

    public String getType () {
        return type;
    }
}

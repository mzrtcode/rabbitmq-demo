package com.mzrt.rabbitmq_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Model {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Shape{
        private String name;
        private Integer numberOfSizes;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Color{
        private String name;
        private String hexCode;
    }
}

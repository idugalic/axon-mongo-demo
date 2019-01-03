package com.demo.query;


import org.springframework.data.annotation.Id;

class GiftCardEntity {

    @Id
    private String id;
    private Integer initialValue;
    private Integer remainingValue;

    public GiftCardEntity(String id, Integer initialValue, Integer remainingValue) {
        this.id = id;
        this.initialValue = initialValue;
        this.remainingValue = remainingValue;
    }

    public GiftCardEntity() {
    }

    public String getId() {
        return id;
    }

    public Integer getInitialValue() {
        return initialValue;
    }

    public Integer getRemainingValue() {
        return remainingValue;
    }
}

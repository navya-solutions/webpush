package com.navya.webpush.dto;

import lombok.Data;

@Data
public class Subscription {
    private String endpoint;

    private  Long expirationTime;

    public  SubscriptionKeys keys;
}

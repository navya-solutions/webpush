package com.navya.webpush.dto;

import lombok.Data;

@Data
public class SubscriptionKeys {
    private String p256dh;

    private String auth;
}

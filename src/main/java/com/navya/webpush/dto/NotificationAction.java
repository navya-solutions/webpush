package com.navya.webpush.dto;

import lombok.Data;

@Data
public class NotificationAction {
    private String action;

    private String title;

    private String icon;
}

package com.navya.webpush.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PushMessage {
    private String title;

    private String body;
}

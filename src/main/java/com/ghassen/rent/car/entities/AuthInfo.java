package com.ghassen.rent.car.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthInfo {

    private String accessToken;
    private String refreshToken;
}

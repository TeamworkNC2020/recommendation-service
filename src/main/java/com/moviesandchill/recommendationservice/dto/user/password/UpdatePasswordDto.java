package com.moviesandchill.recommendationservice.dto.user.password;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdatePasswordDto {
    private String oldPassword;
    private String newPassword;
}

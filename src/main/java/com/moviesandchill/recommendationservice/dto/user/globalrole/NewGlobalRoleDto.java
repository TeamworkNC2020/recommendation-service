package com.moviesandchill.recommendationservice.dto.user.globalrole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewGlobalRoleDto {
    private String name;
}

package com.moviesandchill.recommendationservice.dto.user.friendrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewFriendRequestDto {
    private long userId;

    private long recipientId;
}

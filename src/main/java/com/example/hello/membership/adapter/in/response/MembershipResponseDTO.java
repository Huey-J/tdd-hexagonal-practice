package com.example.hello.membership.adapter.in.response;

import com.example.hello.membership.domain.code.MembershipType;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class MembershipResponseDTO {

  private final Long id;
  private final MembershipType membershipType;
  private final Integer point;

}
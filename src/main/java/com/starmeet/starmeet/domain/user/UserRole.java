package com.starmeet.starmeet.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 사용자 역할을 정의
 */
@Getter
@RequiredArgsConstructor
public enum UserRole {

  USER("ROLE_USER", "일반 사용자"),
  ARTIST("ROLE_ARTIST", "아티스트");

  private final String authority;   // Spring Security에서 사용할 권한명
  private final String description; // 역할 설명
}

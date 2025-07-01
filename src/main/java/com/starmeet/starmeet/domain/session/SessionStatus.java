package com.starmeet.starmeet.domain.session;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 영상통화 세션 상태를 정의
 */
@Getter
@RequiredArgsConstructor
public enum SessionStatus {

  SCHEDULED("예약됨", "세션이 예약되어 대기 중인 상태"),
  IN_PROGRESS("진행 중", "세션이 현재 진행 중인 상태"),
  COMPLETED("완료", "세션이 정상적으로 완료된 상태"),
  CANCELLED("취소", "세션이 취소된 상태");

  private final String displayName; // 화면에 표시될 한글명
  private final String description; // 상태 설명
}

package com.starmeet.starmeet.domain.reservation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 예약 상태를 정의
 */
@Getter
@RequiredArgsConstructor
public enum ReservationStatus {

  PENDING("대기중", "예약 신청 후 처리 대기 상태"),
  CONFIRMED("확정", "예약이 확정된 상태"),
  CANCELLED("취소", "예약이 취소된 상태"),
  COMPLETED("완료", "영상통화가 완료된 상태"),
  NO_SHOW("미참석", "예약 시간에 참석하지 않은 상태");

  private final String displayName; // 화면에 표시될 한글명
  private final String description; // 상태 설명
}

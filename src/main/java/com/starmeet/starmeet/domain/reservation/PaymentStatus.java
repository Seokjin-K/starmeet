package com.starmeet.starmeet.domain.reservation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 결제 상태를 정의
 */
@Getter
@RequiredArgsConstructor
public enum PaymentStatus {

  PENDING("결제 대기", "결제가 대기 중인 상태"),
  COMPLETED("결제 완료", "결제가 정상적으로 완료된 상태"),
  FAILED("결제 실패", "결제가 실패한 상태"),
  REFUNDED("환불 완료", "결제가 환불된 상태");

  private final String displayName; // 화면에 표시될 한글명
  private final String description; // 상태 설명
}

package com.starmeet.starmeet.domain.session;

import com.starmeet.starmeet.domain.artist.Artist;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 영상통화 세션 엔티티 - 아티스트가 생성하는 팬미팅 세션 정보
 */
@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class VideoSession {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY) // 아티스트와 N:1 관계
  @JoinColumn(nullable = false)
  private Artist artist;

  @Column(nullable = false)
  private LocalDate sessionDate;

  @Column(nullable = false)
  private LocalTime startTime;

  @Column(nullable = false)
  private LocalTime endTime;

  @Column(nullable = false)
  private Integer durationMinutes; // 1인당 통화 시간(분)

  @Column(nullable = false)
  private Integer maxParticipants; // 최대 예약 가능 인원

  @Column(nullable = false)
  private Integer currentParticipants; // 현재 예약 인원

  @Column(nullable = false, precision = 10, scale = 2)
  private BigDecimal price; // 예약 가격

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private SessionStatus status;

  @Column(nullable = false)
  private String description;
}

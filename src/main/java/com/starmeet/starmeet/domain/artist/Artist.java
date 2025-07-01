package com.starmeet.starmeet.domain.artist;

import com.starmeet.starmeet.domain.user.User;
import com.starmeet.starmeet.global.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 아티스트 엔티티 - 아티스트 전용 정보 관리
 * User 엔티티와 1:1 관계
 */
@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Artist extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(nullable = false, unique = true)
  private User user;

  @Column(nullable = false, length = 50)
  private String stageName;

  @Column(length = 50)
  private String agency;

  private String profileImageUrl;

  private LocalDate debutDate;

  @Column(length = 1000)
  private String description;

  @Column(nullable = false)
  private Boolean isVerified;
}

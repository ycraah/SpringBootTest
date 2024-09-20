package org.zerock.b01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) //엔티티가 변경될 때 자동으로 시간 값 지정
@Getter
abstract class BaseEntity {
  @CreatedDate
  @Column(name="regdate", updatable = false)
  private LocalDateTime regDate;

  @LastModifiedDate
  @Column(name="moddate")
  private LocalDateTime modDate;
}

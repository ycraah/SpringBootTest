package org.zerock.b01.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //identity는 auto_increment
  private Long bno;

  @Column(length = 500, nullable = false) //컬럼 길이와 null 허용 여부
  private String title;

  @Column(length = 2000, nullable = false)
  private String content;

  @Column(length = 50, nullable = false)
  private String writer;
}

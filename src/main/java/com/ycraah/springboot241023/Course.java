package com.ycraah.springboot241023;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Table(name="COURSES")
public class Course {
  @Id
  @Column(name="ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name= "NAME")
  private String name;

  @Column(name = "Category")
  private String category;

  @Column(name = "RATING")
  private int rating;

  @Column(name = "DESCRIPTION")
  private String description;

  public Course(String name, String category, int rating, String description) {
    this.name = name;
    this.category = category;
    this.rating = rating;
    this.description = description;
  }
}

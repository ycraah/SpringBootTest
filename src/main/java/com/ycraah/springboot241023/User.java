package com.ycraah.springboot241023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {
  private String userName;

  @Password
  private String password;
}

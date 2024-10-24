package com.ycraah.springboot241023;

import org.hibernate.dialect.Database;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringBoot241023ApplicationTests {
  @Autowired
  private DataSource dataSource;

  @Test
  public void givenDataSourceAvailableWhenAccessDetailsThenExpectDetails() throws SQLException {
    assertThat(dataSource.getClass().getName()).isEqualTo("com.zaxxer.hikari.HikariDataSource");
    assertThat(dataSource.getConnection().getMetaData().getDatabaseProductName()).isEqualTo("H2");
  }
}

package com.bnpparibas.bp2s.combo.ipeformstojson.main;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@EnableJpaRepositories("com.bnpparibas.bp2s.combo.ipeformstojson.dao")
@ComponentScan(basePackages = {"com.bnpparibas.bp2s.combo.ipeformstojson"})
@EntityScan("com.bnpparibas.bp2s.combo.ipeformstojson.entity")
@Configuration
public class PersistenceConfig {

  @Bean
  public JdbcTemplate getJdbcTemplate() {
    return new JdbcTemplate(dataSource());
  }

  @Bean
  public DataSource dataSource() {
    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    return builder.setType(EmbeddedDatabaseType.H2).build();
  }

}

package com.bnpparibas.bp2s.combo.ipeformstojson.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Attribute implements Serializable {

  public Attribute() {
    System.out.println("entered on Attribute");
  }

  public Attribute(String id, String ipeName, String type, Integer maxSize) {
    super();
    this.id = id;
    this.ipeName = ipeName;
    this.type = type;
    this.maxSize = maxSize;
  }

  @Id
  @Getter
  @Setter
  private String id;

  @Column()
  @Getter
  @Setter
  private String ipeName;

  @Column(nullable = false)
  @Getter
  @Setter
  private String type;

  @Column(nullable = false)
  @Getter
  @Setter
  private Integer maxSize;
}

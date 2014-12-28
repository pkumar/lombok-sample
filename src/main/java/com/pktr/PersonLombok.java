package com.pktr;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.ToString;

@ToString(exclude="id")
@EqualsAndHashCode
public class PersonLombok {

  @Getter @Setter
  private int id;

  @Getter @Setter
  private String name;

  @Getter @Setter
  private String address;

  @Setter(AccessLevel.PROTECTED)
  private String city;
  
}

package com.raisetech.springbootstudy.controller;

import com.raisetech.springbootstudy.entity.Name;


public class NameResponse {
  private String name;

  public NameResponse(Name name) {
    this.name = name.getName();
  }
  public String getName() {
    return name;
  }
}

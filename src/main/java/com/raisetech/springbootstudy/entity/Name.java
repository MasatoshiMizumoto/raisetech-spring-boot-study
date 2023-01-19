package com.raisetech.springbootstudy.entity;


public class Name {
  private int id;
  private String name;
  // constructorやgetterを作成する。必要に応じてsetterを作成する

  public Name(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}

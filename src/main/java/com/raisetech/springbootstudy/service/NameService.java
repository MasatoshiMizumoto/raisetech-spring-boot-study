package com.raisetech.springbootstudy.service;

import com.raisetech.springbootstudy.entity.Name;
import java.util.List;

public interface NameService {
  List<Name> findAll();
  Name findById(int id) throws Exception;
//  void create(String name);
//  void update(int id, String name) throws Exception;

}

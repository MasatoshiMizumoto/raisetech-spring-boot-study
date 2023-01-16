package com.raisetech.springbootstudy.service;


import com.raisetech.springbootstudy.entity.Name;
import com.raisetech.springbootstudy.mapper.NameMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {

  private NameMapper nameMapper;

  public NameServiceImpl(NameMapper nameMapper) {
    this.nameMapper = nameMapper;
  }

  @Override
  public List<Name> findAll() {
    return nameMapper.findAll();
  }

//  宿題：独自の例外を作成して、例外が発生した場合には、その例外を投げるようにする
  @Override
  public Name findById(int id) throws Exception {
    return nameMapper.findById(id).orElseThrow(() -> new Exception("Not found"));
  }

//  @Override
//  public void create(String name) {
//    nameMapper.create(name);
//  }
//
//  @Override
//  public void update(int id, String name) throws Exception {
//    if (nameMapper.findById(id).isPresent()) {
//      nameMapper.update(id, name);
//    } else {
//      throw new Exception("Not found");
//    }
//  }
}

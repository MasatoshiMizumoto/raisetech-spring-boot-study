package com.raisetech.springbootstudy.mapper;

import com.raisetech.springbootstudy.entity.Name;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper // MyBatisのMapperである⽬印として@Mapperアノテーションを付与する
public interface NameMapper { // classではなくinterfaceで定義する
  @Select("SELECT * FROM names")
  List<Name> findAll();
  @Select("SELECT * FROM names WHERE id = #{id}")
  Optional<Name> findById(int id); //nullも返すのでOptionalでラップする

}

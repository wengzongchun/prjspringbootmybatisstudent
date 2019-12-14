package com.demo4.mapper;

import com.demo4.po.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzMapper {
    public List<Clazz> findAll();
}

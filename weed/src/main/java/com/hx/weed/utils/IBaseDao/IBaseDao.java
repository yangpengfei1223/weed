package com.hx.weed.utils.IBaseDao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;


public interface IBaseDao<T> extends Mapper<T>, MySqlMapper<T> {

}

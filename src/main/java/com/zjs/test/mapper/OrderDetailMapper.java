package com.zjs.test.mapper;

import com.zjs.test.common.CommonMapper;
import com.zjs.test.entity.OrderDetailEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderDetailMapper extends CommonMapper<OrderDetailEntity> {
}
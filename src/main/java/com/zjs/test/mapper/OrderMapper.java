package com.zjs.test.mapper;

import com.zjs.test.common.CommonMapper;
import com.zjs.test.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderMapper extends CommonMapper<OrderEntity> {
}
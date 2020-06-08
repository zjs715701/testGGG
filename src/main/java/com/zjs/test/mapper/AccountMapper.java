package com.zjs.test.mapper;

import com.zjs.test.common.CommonMapper;
import com.zjs.test.entity.AccountEntity;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

@Repository
@Mapper
public interface AccountMapper extends CommonMapper<AccountEntity> {
}
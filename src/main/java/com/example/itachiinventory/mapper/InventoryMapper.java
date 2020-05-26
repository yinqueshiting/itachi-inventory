package com.example.itachiinventory.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface InventoryMapper {
    @Insert("insert into inventory(user_id,count) values (#{user_id},#{count})")
    void deductTheInventory(@Param("user_id") String userId, @Param("count") int count);
}

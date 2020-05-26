package com.example.itachiinventory.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.itachiinventory.mapper.InventoryMapper;
import com.example.itachiinventory.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class InventoryServiceImpl implements InventoryService {

    @Resource
    private InventoryMapper inventoryMapper;

    @Override
    @LcnTransaction
    @Transactional(propagation = Propagation.REQUIRED)
    public Map deductTheInventory(String userId) {
        log.info("开始扣减库存");
        inventoryMapper.deductTheInventory(userId,-1);
        Map resMap = new HashMap();
        resMap.put("success","库存-1");
        return resMap;
    }
}

package com.example.itachiinventory.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class InventoryController {

    @PostMapping("deductTheInventory")
    public Map deductTheInventory(){
        log.info("进入到InventoryController");
        Map map = new HashMap();
        map.put("key","进行-1操作");
        return map;
    }
}

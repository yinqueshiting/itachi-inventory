package com.example.itachiinventory.controller;

import com.example.itachiinventory.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class InventoryController {

    @Resource
    private InventoryService inventoryService;

    @GetMapping("deductTheInventory/{userId}")
    public Map deductTheInventory(@PathVariable String userId){
        log.info("进入inventory:{}",userId);
        log.info("进入到InventoryController");
        return inventoryService.deductTheInventory(userId);
    }



}

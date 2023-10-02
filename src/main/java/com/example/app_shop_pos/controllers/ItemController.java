package com.example.app_shop_pos.controllers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final Logger logger = LogManager.getLogger(ItemController.class);
    @GetMapping(path = "/{documentName}", produces = "application/json")
    public String findDocument(@PathVariable(required=false,name="itemId") String itemId){
        logger.info("METHOD:GET endpoint => /item/"+itemId);
        return "Here your item id : "+itemId;
    }
}


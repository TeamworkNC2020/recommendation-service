package com.moviesandchill.recommendationservice.controller;

import com.moviesandchill.recommendationservice.dto.MessageDto;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(
        path = "api/messages/",
        produces = "application/json"
)
public class MessageController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final MessageCategorizerService messageCategorizerService;

    public MessageController(MessageCategorizerService messageCategorizerService) {
        this.messageCategorizerService = messageCategorizerService;
    }

    @PostMapping("recognize-categories")
    private Map<String, Double> recognizeCategories(@RequestBody MessageDto messageDto) {
        String text = messageDto.getText();
        long userId = messageDto.getUserId();

        Map<String, Double> categories = messageCategorizerService.getCategories(text, userId);
        logger.info(String.valueOf(categories));
        return messageCategorizerService.getCategories(text, userId);
    }
}

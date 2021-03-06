package com.example.springboottest.controller;

import com.example.springboottest.dto.QuestionDTO;
import com.example.springboottest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String Question(@PathVariable(name = "id") Integer id,
    Model model
    ){

        QuestionDTO questionDTO = questionService.getByid(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}

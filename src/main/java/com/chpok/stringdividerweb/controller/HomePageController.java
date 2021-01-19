package com.chpok.stringdividerweb.controller;

import com.chpok.stringdividerweb.util.StringDivider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomePageController {
    @GetMapping("/")
    public String getHomePage() {
        return "homePage";
    }

    @PostMapping("/")
    public String getResult(@ModelAttribute("dividingString") String dividingString,
                            @ModelAttribute("numOfLetters") int numOfLetters, Model model) {
        String resultStr = StringDivider.divideByNumOfLetters(dividingString, numOfLetters);
        model.addAttribute("resultString", resultStr);

        return "homePage";
    }
}

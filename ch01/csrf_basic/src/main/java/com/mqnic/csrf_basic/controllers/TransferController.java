package com.mqnic.csrf_basic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransferController {

    @GetMapping("/transfer")
    public String showTransferWeakForm() {
        return "transfer";
    }

    @PostMapping("/transfer")
    public ModelAndView processTransfer(@RequestParam("amount") String amount) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("transfer");
        mav.addObject("message", "Successfully transferred " + amount + " units.");

        System.out.println("Successfully transferred " + amount);
        return mav;
    }




}

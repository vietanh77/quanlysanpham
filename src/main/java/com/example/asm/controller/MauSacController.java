package com.example.asm.controller;


import com.example.asm.model.MauSac;
import com.example.asm.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {

    @Autowired
    MauSacService mauSacService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model)
    {
        model.addAttribute("listMauSac",mauSacService.getAll());
        return "mau-sac/mausac";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model)
    {
        model.addAttribute("mauSac",new MauSac());
        return "mau-sac/add";
    }
    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id)
    {
        model.addAttribute("mauSac",mauSacService.detail(UUID.fromString(id)));
        return "mau-sac/update";
    }
    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id)
    {
        mauSacService.delete(UUID.fromString(id));
        return "redirect:/mau-sac/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            Model model,
            @ModelAttribute("mauSac") MauSac mauSac)
    {
        mauSacService.add(mauSac);
        return "redirect:/mau-sac/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("mauSac") MauSac mauSac)
    {
        mauSacService.update(UUID.fromString(id), mauSac);
        return "redirect:/mau-sac/hien-thi";
    }

}

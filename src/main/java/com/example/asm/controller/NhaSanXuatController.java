package com.example.asm.controller;

import com.example.asm.model.Nsx;
import com.example.asm.service.NsxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/nsx")
public class NhaSanXuatController {
    @Autowired
    NsxService nsxService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listNSX", nsxService.getAll());
        return "nha-san-xuat/nsx";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model) {
        model.addAttribute("NSX", new Nsx());
        return "nha-san-xuat/add";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id) {
        model.addAttribute("NSX", nsxService.detail(UUID.fromString(id)));
        return "nha-san-xuat/update";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id) {
        nsxService.delete(UUID.fromString(id));
        return "redirect:/nsx/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            Model model,
            @ModelAttribute("NSX") Nsx nsx) {
        nsxService.add(nsx);
        return "redirect:/nsx/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("mauSac") Nsx nsx) {
        nsxService.update(UUID.fromString(id), nsx);
        return "redirect:/nsx/hien-thi";
    }
}

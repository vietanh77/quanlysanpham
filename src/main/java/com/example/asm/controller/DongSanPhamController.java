package com.example.asm.controller;


import com.example.asm.model.DongSanPham;
import com.example.asm.service.DongSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/dong-sp")
public class DongSanPhamController {

    @Autowired
    DongSanPhamService dongSanPhamService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model)
    {
        model.addAttribute("listDSP",dongSanPhamService.getAll());
        return "dong-sp/dsp";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model)
    {
        model.addAttribute("dongsp",new DongSanPham());
        return "dong-sp/add";
    }
    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id)
    {
        model.addAttribute("dongsp",dongSanPhamService.detail(UUID.fromString(id)));
        return "dong-sp/update";
    }
    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id)
    {
        dongSanPhamService.delete(UUID.fromString(id));
        return "redirect:/dong-sp/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            Model model,
            @ModelAttribute("dongsp") DongSanPham dongSanPham)
    {
        dongSanPhamService.add(dongSanPham);
        return "redirect:/dong-sp/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("dongsp") DongSanPham dongSanPham)
    {
        dongSanPhamService.update(UUID.fromString(id),dongSanPham);
        return "redirect:/dong-sp/hien-thi";
    }

}

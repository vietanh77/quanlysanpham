package com.example.asm.controller;

import com.example.asm.model.SanPham;
import com.example.asm.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/san-pham")
public class SanPhamConTroller {
    @Autowired
    SanPhamService sanPhamService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSP", sanPhamService.getAll());
        return "san-pham/sanpham";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model) {
        model.addAttribute("sanPham", new SanPham());
        return "san-pham/add";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id) {
        model.addAttribute("sanPham", sanPhamService.detail(UUID.fromString(id)));
        return "san-pham/update";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id) {
        sanPhamService.delete(UUID.fromString(id));
        return "redirect:/san-pham/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            Model model,
            @ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamService.add(sanPham);
        return "redirect:/san-pham/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamService.update(UUID.fromString(id), sanPham);
        return "redirect:/san-pham/hien-thi";
    }
}

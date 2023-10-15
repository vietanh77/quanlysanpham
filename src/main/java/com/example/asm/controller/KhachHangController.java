package com.example.asm.controller;

import com.example.asm.model.KhachHang;
import com.example.asm.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;
    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listKH", khachHangService.getAll());
        return "khach-hang/khachHang";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model) {
        model.addAttribute("khachHang", new KhachHangController());
        return "khach-hang/add";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id) {
        model.addAttribute("khachHang", khachHangService.detail(UUID.fromString(id)));
        return "khach-hang/update";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id) {
        khachHangService.delete(UUID.fromString(id));
        return "redirect:/khach-hang/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            Model model,
            @ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.add(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.update(UUID.fromString(id), khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
}

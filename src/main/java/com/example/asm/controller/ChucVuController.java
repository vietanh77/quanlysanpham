package com.example.asm.controller;


import com.example.asm.model.ChucVu;
import com.example.asm.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/chuc-vu")
public class ChucVuController {

    @Autowired
    ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String hienThi(
            Model model
    ){
        List<ChucVu> list = chucVuService.getAll();
        model.addAttribute("listChucVu",list);
        model.addAttribute("chucVu",new ChucVu());
        return "chuc-vu/chucvu";
    }

    @GetMapping("/view-add")
    public String viewAdd(
            Model model
    ){
        model.addAttribute("chucVu",new ChucVu());
        return "chuc-vu/chuc-vu-add";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id
    ){
        ChucVu chucVu = chucVuService.detail(UUID.fromString(id));
        model.addAttribute("chucVu",chucVu);
        return "chuc-vu/chuc-vu-update";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable String id
    ){
        chucVuService.delete(UUID.fromString(id));
        return "redirect:/chuc-vu/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            Model model,
            @ModelAttribute("chucVu") ChucVu chucVu
    ){
        chucVuService.add(chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("chucVu") ChucVu chucVu
    ){
        chucVuService.update(UUID.fromString(id),chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }
}

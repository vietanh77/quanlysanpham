package com.example.asm.controller;


import com.example.asm.model.CuaHang;
import com.example.asm.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {

    @Autowired
    CuaHangService cuaHangService;

    @GetMapping("/hien-thi")
    public String getAllCuaHang(
            Model model
    ) {
        List<CuaHang> list = cuaHangService.getAll();
        model.addAttribute("list",list);
        model.addAttribute("cuaHang",new CuaHang());
//        list.forEach(x -> System.out.println(x.toString()));
        return "cua-hang/cuahang";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model){
        model.addAttribute("cuaHang",new CuaHang());
        return "cua-hang/cua-hang-add";
    }

    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id
    ) {
        cuaHangService.delete(UUID.fromString(id));
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(
            Model model,
            @PathVariable String id
    ) {
        CuaHang ch = cuaHangService.detail(UUID.fromString(id));
        model.addAttribute("cuaHang",ch);
        return "cua-hang/cua-hang-detail";
    }

    @PostMapping ("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("cuaHang") CuaHang cuaHang
    ) {
        cuaHangService.update(UUID.fromString(id),cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }

    @PostMapping ("/add")
    public String add(
            Model model,
             @ModelAttribute("cuaHang") CuaHang cuaHang

    ) {
        cuaHangService.add(cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }

}
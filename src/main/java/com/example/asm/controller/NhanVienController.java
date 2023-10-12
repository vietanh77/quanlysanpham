package com.example.asm.controller;


import com.example.asm.model.ChucVu;
import com.example.asm.model.CuaHang;
import com.example.asm.model.NhanVien;
import com.example.asm.service.ChucVuService;
import com.example.asm.service.CuaHangService;
import com.example.asm.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {

    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    ChucVuService chucVuService;
    @Autowired
    CuaHangService cuaHangService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        List<NhanVien> list = nhanVienService.getAll();
        model.addAttribute("list",list);
        return "nhan-vien/nhanvien";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model){
        List<CuaHang> listch = cuaHangService.getAll();
        List<ChucVu> listcv = chucVuService.getAll();
        model.addAttribute("listCV",listcv);
        model.addAttribute("listCH",listch);
        model.addAttribute("nhanVien",new NhanVien());
        return "nhan-vien/nhan-vien-add";
    }
    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id
    ) {
        nhanVienService.delete(UUID.fromString(id));
        return "redirect:/nhan-vien/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(
            Model model,
            @PathVariable String id
    ) {
        NhanVien nhanVien = nhanVienService.detail(UUID.fromString(id));
        model.addAttribute("nhanVien",nhanVien);
        List<CuaHang> listch = cuaHangService.getAll();
        List<ChucVu> listcv = chucVuService.getAll();
        model.addAttribute("listCV",listcv);
        model.addAttribute("listCH",listch);
        return "nhan-vien/nhan-vien-detail";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("nhanVien") NhanVien nhanVien
    ) {
        nhanVienService.update(UUID.fromString(id),nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }

    @PostMapping ("/add")
    public String add(
            Model model,
            @ModelAttribute("nhanVien") NhanVien nhanVien
    ) {
        nhanVienService.add(nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }
}

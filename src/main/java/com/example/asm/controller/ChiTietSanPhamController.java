package com.example.asm.controller;

import com.example.asm.model.*;
import com.example.asm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ctsp")
public class ChiTietSanPhamController {
    @Autowired
    ChiTietSanPhamService chiTietSanPhamService;
    @Autowired
    NsxService nsxService;
    @Autowired
    MauSacService mauSacService;
    @Autowired
    DongSanPhamService dongSanPhamService;
    @Autowired
    SanPhamService sanPhamService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        List<ChiTietSanPham> list = chiTietSanPhamService.getAll();
        model.addAttribute("listCTSP",list);
        return "chi-tiet-sp/ctsp";
    }

    @GetMapping("/view-add")
    public String viewAdd(Model model){
        List<DongSanPham> listDongSP = dongSanPhamService.getAll();
        List<Nsx> listNSX = nsxService.getAll();
        List<MauSac> listMauSac = mauSacService.getAll();
        List<SanPham> listSanPham = sanPhamService.getAll();
        model.addAttribute("listDongSP",listDongSP);
        model.addAttribute("listNSX",listNSX);
        model.addAttribute("listMauSac",listMauSac);
        model.addAttribute("listSanPham",listSanPham);
        model.addAttribute("ctsp",new ChiTietSanPham());
        return "chi-tiet-sp/add";
    }
    @GetMapping("/delete/{id}")
    public String delete(
            Model model,
            @PathVariable String id
    ) {
        chiTietSanPhamService.delete(UUID.fromString(id));
        return "redirect:/ctsp/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(
            Model model,
            @PathVariable String id
    ) {
        ChiTietSanPham ctsp = chiTietSanPhamService.detail(UUID.fromString(id));
        List<DongSanPham> listDongSP = dongSanPhamService.getAll();
        List<Nsx> listNSX = nsxService.getAll();
        List<MauSac> listMauSac = mauSacService.getAll();
        List<SanPham> listSanPham = sanPhamService.getAll();
        model.addAttribute("listDongSP",listDongSP);
        model.addAttribute("listNSX",listNSX);
        model.addAttribute("listMauSac",listMauSac);
        model.addAttribute("listSanPham",listSanPham);
        model.addAttribute("ctsp",ctsp);
        return "chi-tiet-sp/update";
    }

    @PostMapping("/update/{id}")
    public String update(
            Model model,
            @PathVariable String id,
            @ModelAttribute("ctsp") ChiTietSanPham ctsp
    ) {
        chiTietSanPhamService.update(UUID.fromString(id),ctsp);
        return "redirect:/ctsp/hien-thi";
    }

    @PostMapping ("/add")
    public String add(
            Model model,
            @ModelAttribute("ctsp") ChiTietSanPham ctsp
    ) {
        chiTietSanPhamService.add(ctsp);
        return "redirect:/ctsp/hien-thi";
    }
}

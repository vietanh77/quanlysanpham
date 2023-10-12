package com.example.asm.service;



import com.example.asm.model.ChiTietSanPham;

import java.util.List;
import java.util.UUID;

public interface ChiTietSanPhamService {
    List<ChiTietSanPham> getAll();

    void delete(UUID id);

    ChiTietSanPham detail(UUID id);

    ChiTietSanPham update(UUID id, ChiTietSanPham chiTietSanPham);

    ChiTietSanPham add(ChiTietSanPham chiTietSanPham);
}

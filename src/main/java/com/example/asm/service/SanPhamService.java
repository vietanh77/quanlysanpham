package com.example.asm.service;

import com.example.asm.model.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();

    void delete(UUID id);

    SanPham detail(UUID id);

    SanPham update(UUID id, SanPham sp);

    SanPham add(SanPham sp);
}

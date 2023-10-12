package com.example.asm.service;



import com.example.asm.model.DongSanPham;

import java.util.List;
import java.util.UUID;

public interface DongSanPhamService {
    List<DongSanPham> getAll();

    void delete(UUID id);

    DongSanPham detail(UUID id);

    DongSanPham update(UUID id, DongSanPham dongSanPham);

    DongSanPham add(DongSanPham dongSanPham);
}

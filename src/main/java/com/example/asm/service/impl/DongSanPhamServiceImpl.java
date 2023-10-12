package com.example.asm.service.impl;

import com.example.asm.model.DongSanPham;
import com.example.asm.repository.DongSanPhamRepository;
import com.example.asm.service.DongSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DongSanPhamServiceImpl implements DongSanPhamService {


    @Autowired
    DongSanPhamRepository dongSanPhamRepository;

    @Override
    public List<DongSanPham> getAll() {
        return dongSanPhamRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        dongSanPhamRepository.deleteById(id);
    }

    @Override
    public DongSanPham detail(UUID id) {
        return dongSanPhamRepository.findDongSanPhamById(id);
    }

    @Override
    public DongSanPham update(UUID id, DongSanPham dongSanPham) {
        return dongSanPhamRepository.save(dongSanPham);
    }

    @Override
    public DongSanPham add(DongSanPham dongSanPham) {
        return dongSanPhamRepository.save(dongSanPham);
    }
}

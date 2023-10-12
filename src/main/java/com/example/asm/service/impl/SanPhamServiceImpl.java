package com.example.asm.service.impl;

import com.example.asm.model.SanPham;
import com.example.asm.repository.SanPhamRepository;
import com.example.asm.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        sanPhamRepository.deleteById(id); ;
    }

    @Override
    public SanPham detail(UUID id) {
        return sanPhamRepository.findSanPhamById(id);
    }

    @Override
    public SanPham update(UUID id, SanPham sp) {
         return sanPhamRepository.save(sp);
    }

    @Override
    public SanPham add(SanPham sp) {
        return sanPhamRepository.save(sp);
    }
}

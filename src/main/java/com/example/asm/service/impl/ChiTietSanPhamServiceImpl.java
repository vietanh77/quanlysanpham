package com.example.asm.service.impl;

import com.example.asm.model.ChiTietSanPham;
import com.example.asm.repository.ChiTietSanPhamRepository;
import com.example.asm.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    @Autowired
    ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        chiTietSanPhamRepository.deleteById(id);
    }

    @Override
    public ChiTietSanPham detail(UUID id) {
        return chiTietSanPhamRepository.findChiTietSanPhamById(id);
    }

    @Override
    public ChiTietSanPham update(UUID id, ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public ChiTietSanPham add(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }
}

package com.example.asm.service.impl;

import com.example.asm.model.KhachHang;
import com.example.asm.repository.KhachHangRepository;
import com.example.asm.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang detail(UUID id) {
        return khachHangRepository.findKhachHangById(id);
    }

    @Override
    public KhachHang update(UUID id, KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang add(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }
}

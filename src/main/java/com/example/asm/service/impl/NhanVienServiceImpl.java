package com.example.asm.service.impl;

import com.example.asm.model.NhanVien;
import com.example.asm.repository.NhanVienRepository;
import com.example.asm.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public NhanVien detail(UUID id) {
        return nhanVienRepository.findNhanVienById(id);
    }

    @Override
    public NhanVien update(UUID id, NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public NhanVien add(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }
}

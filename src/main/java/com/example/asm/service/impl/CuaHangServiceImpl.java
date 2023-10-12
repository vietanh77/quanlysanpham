package com.example.asm.service.impl;


import com.example.asm.model.CuaHang;
import com.example.asm.repository.CuaHangRepository;
import com.example.asm.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CuaHangServiceImpl implements CuaHangService {

    @Autowired
    CuaHangRepository cuaHangRepository;

    @Override
    public List<CuaHang> getAll() {

        return cuaHangRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        cuaHangRepository.deleteById(id);
    }

    @Override
    public CuaHang detail(UUID id) {
        return cuaHangRepository.findCuaHangById(id);
    }

    @Override
    public CuaHang update(UUID id, CuaHang cuaHang) {

        return cuaHangRepository.save(cuaHang);

    }

    @Override
    public CuaHang add(CuaHang cuaHang) {
        return cuaHangRepository.save(cuaHang);
    }
}
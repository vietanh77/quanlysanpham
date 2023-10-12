package com.example.asm.service;


import com.example.asm.model.CuaHang;

import java.util.List;
import java.util.UUID;

public interface CuaHangService {

    List<CuaHang> getAll();

    void delete(UUID id);

    CuaHang detail(UUID id);

    CuaHang update(UUID id, CuaHang cuaHang);

    CuaHang add(CuaHang cuaHang);
}
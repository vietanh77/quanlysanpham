package com.example.asm.service;


import com.example.asm.model.KhachHang;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {

    List<KhachHang> getAll();

    void delete(UUID id);

    KhachHang detail(UUID id);

    KhachHang update(UUID id, KhachHang khachHang);

    KhachHang add(KhachHang khachHang);
}
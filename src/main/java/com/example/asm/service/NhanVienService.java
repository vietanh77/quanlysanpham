package com.example.asm.service;


import com.example.asm.model.NhanVien;

import java.util.List;
import java.util.UUID;

public interface NhanVienService {

    List<NhanVien> getAll();

    void delete(UUID id);

    NhanVien detail(UUID id);

    NhanVien update(UUID id, NhanVien nhanVien);

    NhanVien add(NhanVien nhanVien);
}
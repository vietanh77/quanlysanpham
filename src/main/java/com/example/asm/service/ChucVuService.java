package com.example.asm.service;


import com.example.asm.model.ChucVu;

import java.util.List;
import java.util.UUID;

public interface ChucVuService {

    List<ChucVu> getAll();

    void delete(UUID id);

    ChucVu detail(UUID id);

    ChucVu update(UUID id, ChucVu chucVu);

    ChucVu add(ChucVu chucVu);
}
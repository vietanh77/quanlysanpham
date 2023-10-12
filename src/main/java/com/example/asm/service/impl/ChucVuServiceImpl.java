package com.example.asm.service.impl;

import com.example.asm.model.ChucVu;
import com.example.asm.repository.ChucVuRepository;
import com.example.asm.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {

    @Autowired
    ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
            chucVuRepository.deleteById(id);
    }

    @Override
    public ChucVu detail(UUID id) {
        return chucVuRepository.findChucVuById(id);
    }

    @Override
    public ChucVu update(UUID id, ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }

    @Override
    public ChucVu add(ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }
}

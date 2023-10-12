package com.example.asm.service.impl;

import com.example.asm.model.MauSac;
import com.example.asm.repository.MauSacRepository;
import com.example.asm.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MauSacServiceImpl implements MauSacService {

    @Autowired
    MauSacRepository mauSacRepository;

    @Override
    public List<MauSac> getAll() {
        return mauSacRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
         mauSacRepository.deleteById(id);
    }

    @Override
    public MauSac detail(UUID id) {
        return mauSacRepository.findMauSacById(id);
    }

    @Override
    public MauSac update(UUID id, MauSac mauSac) {
        return mauSacRepository.save(mauSac);
    }

    @Override
    public MauSac add(MauSac mauSac) {
        return mauSacRepository.save(mauSac);
    }
}

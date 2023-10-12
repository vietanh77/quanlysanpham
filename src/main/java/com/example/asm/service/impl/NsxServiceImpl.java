package com.example.asm.service.impl;

import com.example.asm.model.Nsx;
import com.example.asm.repository.NsxRepository;
import com.example.asm.service.NsxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NsxServiceImpl implements NsxService {

    @Autowired
    NsxRepository nsxRepository;

    @Override
    public List<Nsx> getAll() {
        return nsxRepository.getAll();
    }

    @Override
    public void delete(UUID id) {
        nsxRepository.deleteById(id);
    }

    @Override
    public Nsx detail(UUID id) {
        return nsxRepository.findNsxById(id);
    }

    @Override
    public Nsx update(UUID id, Nsx nsx) {
        return nsxRepository.save(nsx);
    }

    @Override
    public Nsx add(Nsx nsx) {
        return nsxRepository.save(nsx);
    }
}

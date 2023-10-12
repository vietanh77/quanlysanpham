package com.example.asm.service;


import com.example.asm.model.Nsx;

import java.util.List;
import java.util.UUID;

public interface NsxService {

    List<Nsx> getAll();

    void delete(UUID id);

    Nsx detail(UUID id);

    Nsx update(UUID id, Nsx nsx);

    Nsx add(Nsx nsx);
}
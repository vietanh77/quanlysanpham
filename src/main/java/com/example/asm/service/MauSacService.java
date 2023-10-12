package com.example.asm.service;


import com.example.asm.model.MauSac;

import java.util.List;
import java.util.UUID;

public interface MauSacService {

    List<MauSac> getAll();

    void delete(UUID id);

    MauSac detail(UUID id);

    MauSac update(UUID id, MauSac mauSac);

    MauSac add(MauSac mauSac);
}
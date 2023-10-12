package com.example.asm.repository;


import com.example.asm.model.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MauSacRepository extends JpaRepository<MauSac, UUID> {

    @Query(value = "select * from mau_sac order by ma", nativeQuery = true)
    List<MauSac> getAll();

    void deleteById(UUID id);

    MauSac findMauSacById(UUID id);

}

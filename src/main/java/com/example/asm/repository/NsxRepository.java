package com.example.asm.repository;

import com.example.asm.model.Nsx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface NsxRepository extends JpaRepository<Nsx, UUID> {

    @Query(value = "select * from nxs order by ma", nativeQuery = true)
    List<Nsx> getAll();

    void deleteById(UUID id);

    Nsx findNsxById(UUID id);

}

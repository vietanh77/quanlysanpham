package com.example.asm.repository;


import com.example.asm.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface SanPhamRepository extends JpaRepository<SanPham, UUID> {

    @Query(value = "select * from san_pham order by ma", nativeQuery = true)
    List<SanPham> getAll();

    void deleteById(UUID id);

    SanPham findSanPhamById(UUID id);

}

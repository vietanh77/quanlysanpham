package com.example.asm.repository;


import com.example.asm.model.DongSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface DongSanPhamRepository extends JpaRepository<DongSanPham, UUID> {

    @Query(value = "select * from dong_sp order by ma", nativeQuery = true)
    List<DongSanPham> getAll();

    void deleteById(UUID id);

    DongSanPham findDongSanPhamById(UUID id);

}

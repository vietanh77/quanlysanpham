package com.example.asm.repository;

import com.example.asm.model.ChiTietSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham, UUID> {

    @Query(value = "select * from chi_tiet_sp ctsp order by ctsp.giaNhap", nativeQuery = true)
    List<ChiTietSanPham> getAll();

    void deleteById(UUID id);

    ChiTietSanPham findChiTietSanPhamById(UUID id);

}

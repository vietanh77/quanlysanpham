package com.example.asm.repository;

import com.example.asm.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface NhanVienRepository extends JpaRepository<NhanVien, UUID> {

    @Query(value = "select * from nhan_vien order by ma", nativeQuery = true)
    List<NhanVien> getAll();

    void deleteById(UUID id);

    NhanVien findNhanVienById(UUID id);

}

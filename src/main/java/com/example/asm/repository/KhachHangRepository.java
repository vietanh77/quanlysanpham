package com.example.asm.repository;

import com.example.asm.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface KhachHangRepository extends JpaRepository<KhachHang, UUID> {

    @Query(value = "select * from khach_hang kh order by kh.ma", nativeQuery = true)
    List<KhachHang> getAll();

    void deleteById(UUID id);

    KhachHang findKhachHangById(UUID id);

}

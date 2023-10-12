package com.example.asm.repository;

import com.example.asm.model.ChucVu;
import com.example.asm.model.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository

public interface ChucVuRepository  extends JpaRepository<ChucVu, UUID> {

    @Query(value = "select * from chuc_vu cv order by cv.ma", nativeQuery = true)
    List<ChucVu> getAll();

    void deleteById(UUID id);

    ChucVu findChucVuById(UUID id);

}

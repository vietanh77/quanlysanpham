package com.example.asm.repository;

import com.example.asm.model.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {

    @Query(value = "select * from cua_hang c order by c.ma ", nativeQuery = true)
    List<CuaHang> getAll();

   @Override
    void deleteById(UUID id);

    CuaHang findCuaHangById(UUID id);

}

package com.example.asm.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Table(name = "nhan_vien")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String ma;


    private String ten;


    private String tenDem;


    private String ho;

    private String gioiTinh;

    private Date ngaySinh;


    private String diaChi;


    private String sdt;


    private String matKhau;


    @ManyToOne
    @JoinColumn(name = "id_cv")
    private ChucVu chucVu;

    @ManyToOne
    @JoinColumn(name = "id_ch")
    private CuaHang cuaHang;

    private String trangThai;
}

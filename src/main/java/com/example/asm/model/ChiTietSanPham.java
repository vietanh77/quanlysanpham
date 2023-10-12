package com.example.asm.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "chi_tiet_sp")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChiTietSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "idSP")
    private SanPham sanPham;
    @ManyToOne
    @JoinColumn(name = "idNsx")
    private Nsx nhaSanXuat;
    @ManyToOne
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "idDongSP")
    private DongSanPham dongSanPham;

    @NotNull(message = "Không được để trống")
    private int namBH;

    @NotBlank(message = "Không được để trống")
    private String moTa;

    @NotNull(message = "Không được để trống")
    private int soLuongTon;

    @NotNull(message = "Không được để trống")
    private BigDecimal GiaNhap;

    @NotNull(message = "Không được để trống")
    private BigDecimal giaBan;
}

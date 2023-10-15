package com.example.asm.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "chi_tiet_sp")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class ChiTietSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "id_sp")
    private SanPham sanPham;
    @ManyToOne
    @JoinColumn(name = "id_nsx")
    private Nsx nhaSanXuat;
    @ManyToOne
    @JoinColumn(name = "id_mau_sac")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "id_dong_sp")
    private DongSanPham dongSanPham;

    @Column(name = "nam_bh")
    private Integer namBH;


    private String moTa;


    private Integer soLuongTon;

    private BigDecimal giaNhap;
    private BigDecimal giaBan;

}

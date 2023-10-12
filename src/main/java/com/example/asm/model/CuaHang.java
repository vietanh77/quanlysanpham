package com.example.asm.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "cua_hang")
@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    private String ma;

    private String ten;

    private String diaChi;

    private String thanhPho;

    private String quocGia;
}

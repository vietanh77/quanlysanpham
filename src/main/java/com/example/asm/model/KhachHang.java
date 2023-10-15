package com.example.asm.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.sql.Date;
import java.util.UUID;

@Table(name = "khach_hang")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;

    @NotBlank(message = "Không được để trống")
    private  String tenDem;

    @NotBlank(message = "Không được để trống")
    private String ho;

    private Date ngaySinh;

    @NotBlank(message = "Không được để trống")
    private String sdt;

    @NotBlank(message = "Không được để trống")
    private String diaChi;

    @NotBlank(message = "Không được để trống")
    private String thanhPho;

    @NotBlank(message = "Không được để trống")
    private String quocGia;


    private String  matKhau;
}

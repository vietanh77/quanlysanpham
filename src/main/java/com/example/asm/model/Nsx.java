package com.example.asm.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Table(name = "nsx")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Nsx {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;
}

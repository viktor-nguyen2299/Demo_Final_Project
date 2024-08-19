package com.samsung.demoprjver1.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "KhachHang")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdKhachHang")
    private Long IdKhachHang;

    @Column(name="TenKhachHang")
    private String TenKhachHang;

    @Column(name="DiaChiKhachHang")
    private String DiaChiKhachHang;

    private String user;
    private String password;
    private String email;
}



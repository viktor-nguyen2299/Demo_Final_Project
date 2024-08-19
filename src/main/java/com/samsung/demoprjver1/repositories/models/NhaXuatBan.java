package com.samsung.demoprjver1.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "NhaXuatBan")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NhaXuatBan {
    @Id
    @GeneratedValue
    @Column(name="IDNhaXuatBan",length = 20)
    private String IDNhaXuatBan;

    @Column(name="TenNhaXuatBan")
    private String TenNhaXuatBan;

    @OneToMany
    @JoinColumn(name = "NhaXuatBan_id")
    private List<Sach> Sachs;
}

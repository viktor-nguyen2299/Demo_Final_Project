package com.samsung.demoprjver1.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "DonHang")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DonHang {
    @Id
    @GeneratedValue
    @Column(name="IdDonHang")
    private Long IdDonHang;

    @Column(name="dateDonHang")
    private Date dateDonHang;

    @Column(name="TongTienDonHang")
    private Float TongTienDonHang;
}

package com.samsung.demoprjver1.repositories.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "TacGia")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TacGia {
    @Id
    @GeneratedValue
    @Column(name="IDTacGia")
    private Long IDTacGia;

    @Column(name="TenTacGia")
    private String TenTacGia;

    @ManyToMany(mappedBy = "TacGias")
    private List<Sach> Sachs;
}

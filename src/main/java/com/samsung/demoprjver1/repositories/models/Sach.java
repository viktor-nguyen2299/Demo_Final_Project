package com.samsung.demoprjver1.repositories.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Sachs")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSach")
    private Long IdSach;

    @Column(name="TenSach")
    private String TenSach;

    @Column(name="TheLoai")
    private String TheLoai;

    @Column(name="NamXuatBan")
    private Integer NamXuatBan;

    @Column(name="GiaSach")
    private Float GiaSach;

    @ManyToOne
    private NhaXuatBan NhaXuatBan_id;

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<TacGia> TacGias;
}

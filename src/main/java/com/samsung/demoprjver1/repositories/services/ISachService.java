package com.samsung.demoprjver1.repositories.services;

import com.samsung.demoprjver1.repositories.models.Sach;

import java.util.List;

public interface ISachService {
    //Them sach
    public void addSach(Sach sach);
    //Tim Sach theo ten sach
    List<Sach> getSachbyTenSach(String TenSach);

    //Tim sach theo ten tac gia
    List<Sach> getSachByTacGia(String TenTacGia);

    //Tim sach theo the loai
    List<Sach> getSachByTheLoai(String TheLoai);
}

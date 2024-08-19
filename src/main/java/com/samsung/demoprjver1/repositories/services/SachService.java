package com.samsung.demoprjver1.repositories.services;

import com.samsung.demoprjver1.repositories.SachRepository;
import com.samsung.demoprjver1.repositories.models.Sach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachService implements ISachService {

    //inject doi tuong
    @Autowired
    private SachRepository sachRepository;

    @Override
    public void addSach(Sach sach) {
        sachRepository.save(sach);
    }

    @Override
    public List<Sach> getSachbyTenSach(String TenSach) {
        return List.of();
    }

    @Override
    public List<Sach> getSachByTacGia(String TenTacGia) {
        return List.of();
    }

    @Override
    public List<Sach> getSachByTheLoai(String TheLoai) {
        return List.of();
    }
}

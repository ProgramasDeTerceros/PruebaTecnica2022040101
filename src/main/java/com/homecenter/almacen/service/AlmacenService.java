package com.homecenter.almacen.service;

import com.homecenter.almacen.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {
    @Autowired
    private AlmacenRepository almacenRepository;
}

package com.homecenter.almacen.repository;

import com.homecenter.almacen.entity.Almacen;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlmacenRepository extends PagingAndSortingRepository<Almacen,Long > {
    List<Almacen> findAll();
    List<Almacen> findByName(String name);

}

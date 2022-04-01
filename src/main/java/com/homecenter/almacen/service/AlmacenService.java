package com.homecenter.almacen.service;

import com.homecenter.almacen.entity.Almacen;
import com.homecenter.almacen.repository.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenService {
    @Autowired
    private AlmacenRepository almacenRepository;

    public List<Almacen> getAllAlmacens(){        return  almacenRepository.findAll();    }
    public Almacen save(Almacen almacen){ return  almacenRepository.save(almacen);}
    public void  delete(Long id){
        almacenRepository.delete(new Almacen(id));
    }
    public Almacen update (Almacen newAlmacen,Long id){
        return almacenRepository.findById(id)
                .map(
                        oldAlmacen -> {
                            oldAlmacen.setName(newAlmacen.getName());
                            oldAlmacen.setDateConfig(newAlmacen.getDateConfig());
                            oldAlmacen.setClientCapacity(newAlmacen.getClientCapacity());
                        return  almacenRepository.save(oldAlmacen);
                        }
                ).get();
    }

}

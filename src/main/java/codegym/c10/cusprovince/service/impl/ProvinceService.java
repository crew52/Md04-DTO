package codegym.c10.cusprovince.service.impl;

import codegym.c10.cusprovince.dto.IProvinceDTO;
import codegym.c10.cusprovince.model.Province;
import codegym.c10.cusprovince.repository.IProvinceRepository;
import codegym.c10.cusprovince.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository iProvinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return iProvinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
        iProvinceRepository.save(province);
    }

    @Override
    public Optional<Province> findById(Long id) {
        return iProvinceRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iProvinceRepository.deleteProvinceById(id);
    }

    @Override
    public Iterable<IProvinceDTO> getAllProvinces() {
        return iProvinceRepository.getAllProvinces();
    }
}
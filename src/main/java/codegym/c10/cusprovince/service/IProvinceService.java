package codegym.c10.cusprovince.service;

import codegym.c10.cusprovince.dto.IProvinceDTO;
import codegym.c10.cusprovince.model.Province;

public interface IProvinceService extends IGenerateService<Province> {
    Iterable<IProvinceDTO> getAllProvinces();
}
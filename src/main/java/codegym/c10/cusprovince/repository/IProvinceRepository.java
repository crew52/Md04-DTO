package codegym.c10.cusprovince.repository;

import codegym.c10.cusprovince.dto.IProvinceDTO;
import codegym.c10.cusprovince.model.Province;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
    @Query(nativeQuery = true,
            value = "SELECT  p.id, p.name, COUNT(p.name) AS count\n" +
            "FROM Customer c\n" +
            "RIght JOIN Province p ON c.province_id = p.id\n" +
            "GROUP BY p.name,  p.id;")
    Iterable<IProvinceDTO> getAllProvinces();

    @Query(nativeQuery = true, value = "CALL delete_province(:id)")
    @Transactional
    @Modifying
    void deleteProvinceById(@Param("id") Long id);
}
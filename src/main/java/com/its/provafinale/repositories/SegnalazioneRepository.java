package com.its.provafinale.repositories;

import com.its.provafinale.entities.TbSegnalazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface SegnalazioneRepository extends JpaRepository<TbSegnalazione, Long> {
    @Query("SELECT s FROM TbSegnalazione s WHERE s.date = :dateFilter")
    List<TbSegnalazione> filteredListByDate(@Param("dateFilter") LocalDate dateFilter);
    @Query("SELECT s FROM TbSegnalazione s WHERE s.cliente.surname LIKE %:surname%")
    List<TbSegnalazione> filteredListBySurname(@Param("surname") String surname);

    List<TbSegnalazione> findByDate (LocalDate dateFilter);
    List<TbSegnalazione> findByClienteSurname (String surname);
    List<TbSegnalazione> findByDateAndClienteSurname(LocalDate dateFilter, String surname);
}

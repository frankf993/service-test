package com.its.provafinale.repositories;

import com.its.provafinale.entities.TbCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<TbCliente, Long> {
}

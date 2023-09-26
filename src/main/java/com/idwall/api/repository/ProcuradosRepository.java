package com.idwall.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idwall.api.model.Procurados;

@Repository
public interface ProcuradosRepository extends JpaRepository<Procurados, Long>{

}

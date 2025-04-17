package com.dio.dio_project.repository;

import com.dio.dio_project.Model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}

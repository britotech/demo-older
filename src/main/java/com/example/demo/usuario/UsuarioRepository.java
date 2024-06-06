package com.example.demo.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT nome as nomeCompleto, email FROM usuario", nativeQuery = true)
    List<UsuarioDTO> listDTO();
}

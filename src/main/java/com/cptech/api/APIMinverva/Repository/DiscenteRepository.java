/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cptech.api.APIMinverva.Repository;

import com.cptech.api.APIMinverva.Models.*;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aluno
 */
public interface DiscenteRepository extends JpaRepository<Discente, Long> {
    public Discente getByUsuario(String usuario);
    public List<Discente> getByTurma(String Turma);
    public List<Discente> getByTutor(Tutor tutor);
}
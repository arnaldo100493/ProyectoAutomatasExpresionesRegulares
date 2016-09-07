/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex.control;

import com.regex.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ArnaldoAndres
 */
public class ControlEstudiante implements InterfaceControlEstudiante {

    private final List<Estudiante> listadoEstudiantes;

    public ControlEstudiante() {
        this.listadoEstudiantes = new ArrayList<>();
    }

    @Override
    public boolean registrar(Estudiante estudiante) throws Exception {
        this.listadoEstudiantes.add(estudiante);
        return true;
    }

}

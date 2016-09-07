/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex.managedbean;

import com.regex.control.ControlEstudiante;
import com.regex.modelo.Estudiante;
import com.regex.utilidades.FacesUtil;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author FABAME
 */
@ManagedBean(name = "managedBeanEstudiante")
public class ManagedBeanEstudiante {

    private Estudiante estudiante;

    /**
     * Creates a new instance of ManagedBeanEstudiante
     */
    public ManagedBeanEstudiante() {
        this.estudiante = new Estudiante();
    }

    public void registrar() throws Exception {
        ControlEstudiante controlEstudiante = new ControlEstudiante();

        if (controlEstudiante.registrar(this.estudiante)) {
            FacesUtil.addInfoMessage("Correcto:", "El registro fue realizado correctamente.");
        } else {
            FacesUtil.addErrorMessage("Error:", "Error al registrar el estudiante.");
        }
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}

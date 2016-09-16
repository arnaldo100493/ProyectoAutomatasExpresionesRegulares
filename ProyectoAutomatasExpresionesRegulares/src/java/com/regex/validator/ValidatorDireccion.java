/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regex.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author FABAME
 */
@FacesValidator(value = "validatorDireccion")
public class ValidatorDireccion implements Validator {

    public ValidatorDireccion() {

    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String label = "";
        String regex = "([a-z A-Z 0-9]+[#-.][0-9]{1,3})?([a-z A-Z 0-9])?([a-z A-Z]+[.][a-z A-Z 0-9])?";
        HtmlInputText htmlInputText = (HtmlInputText) component;

        if (htmlInputText.getLabel() == null || htmlInputText.getLabel().trim().equals("")) {
            label = htmlInputText.getId();
        } else {
            label = htmlInputText.getLabel();
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence) value);

        if (!matcher.matches()) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:", label + ": es incorrecto."));
        }
    }
}

package com.tiagohs.util;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.base.ValidatorBase;

import javafx.beans.DefaultProperty;
import javafx.scene.control.TextField;

@DefaultProperty(value = "icon")
public class PasswordAndConfirmPasswordValidator extends ValidatorBase {
	
	private TextField passwordTextField;
	private TextField confirmPasswordTextField;
	
	public PasswordAndConfirmPasswordValidator(JFXTextField passwordTextField, JFXTextField confirmPasswordTextField) {
		this.passwordTextField = passwordTextField;
		this.confirmPasswordTextField = confirmPasswordTextField;
	}
	
	@Override
	protected void eval() {
		if (!passwordTextField.getText().trim().isEmpty() && !confirmPasswordTextField.getText().trim().isEmpty()) {
			evalTextsFields();
		} else {
            hasErrors.set(false);
        }
	}

	private void evalTextsFields() {
		
		if (passwordTextField.getText().equals(confirmPasswordTextField.getText())) {
			hasErrors.set(false);
        } else {
            hasErrors.set(true);
        }
		
	}

}

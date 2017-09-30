package br.com.unitri.posjava.annotations.minhaapi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Campo {

	public String nome();
	
}
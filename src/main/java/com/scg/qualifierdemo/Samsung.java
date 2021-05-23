package com.scg.qualifierdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("samsung")

@Primary
public class Samsung implements MobilePhone{

	@Override
	public String show() {

		return "Samsung phone";
	}

}

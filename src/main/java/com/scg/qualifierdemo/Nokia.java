package com.scg.qualifierdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("nokia")
public class Nokia implements MobilePhone {

	@Override
	public String show() {

		return "Nokia phone";
	}

}

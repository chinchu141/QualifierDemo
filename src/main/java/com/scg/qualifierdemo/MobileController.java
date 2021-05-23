package com.scg.qualifierdemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;



@Component
public class MobileController implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(MobileController.class);

    @Autowired
    @Qualifier("samsung")
    private MobilePhone p1;

    @Autowired
    @Qualifier("nokia")
    private MobilePhone p2;
    
    @Autowired
    private  MobilePhone p3;
	

    @Override
    public void run(final String... args) throws Exception {

        logger.info("{}", p1.show());
        logger.info("{}", p2.show());
        logger.info("{}", p3.show());
    }
}

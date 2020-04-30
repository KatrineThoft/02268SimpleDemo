package com.camunda.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Logger;

public class CheckWeatherDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random random = new Random();
        boolean isWeatherOK = random.nextBoolean();

        delegateExecution.setVariable("weatherOK", isWeatherOK);
        LOGGER.info("Is the weather OK?'" + isWeatherOK);


    }
}


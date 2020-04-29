package com.camunda.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import java.util.Random;

public class CheckWeatherDelegate implements org.camunda.bpm.engine.delegate.JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random random = new Random();

        delegateExecution.setVariable("weatherOK", random.nextBoolean());

    }
}

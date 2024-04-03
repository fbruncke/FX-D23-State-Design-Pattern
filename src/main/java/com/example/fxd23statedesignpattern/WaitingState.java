package com.example.fxd23statedesignpattern;

public class WaitingState implements CoffeeMachineState{
    @Override
    public void change(CoffeeMachine cm) {
        cm.setCms(new ReceivePayment());
    }

    @Override
    public String getStateAsString() {
        return "Wait";
    }
}

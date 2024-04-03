package com.example.fxd23statedesignpattern;

public class PourCoffee implements CoffeeMachineState{
    @Override
    public void change(CoffeeMachine cm) {
        cm.setCms(new WaitingState());
    }

    @Override
    public String getStateAsString() {
        return "Pour";
    }
}

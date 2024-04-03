package com.example.fxd23statedesignpattern;

public interface CoffeeMachineState {
    void change(CoffeeMachine cm);

    String getStateAsString();
}

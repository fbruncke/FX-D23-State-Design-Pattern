package com.example.fxd23statedesignpattern;

public class ReceivePayment implements CoffeeMachineState{

    @Override
    public void change(CoffeeMachine cm) {
        if( cm.getPayment() >= 5 ) {
            cm.setCms(new PourCoffee());
        }
    }

    @Override
    public String getStateAsString() {
        return "Receive";
    }

}

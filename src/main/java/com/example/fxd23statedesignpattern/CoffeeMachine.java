package com.example.fxd23statedesignpattern;

public class CoffeeMachine {
    public CoffeeMachineState getCms() {
        return cms;
    }

    public void setCms(CoffeeMachineState cms) {
        this.cms = cms;
    }

    private CoffeeMachineState cms = null;

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    private int payment = 0;


    public CoffeeMachine() {
        this.setCms(new WaitingState());
    }

    public void useCoffeeMachine()
    {
        cms.change(this);
    }
}

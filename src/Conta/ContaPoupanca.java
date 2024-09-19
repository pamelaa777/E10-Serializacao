package Conta;

import Cliente.*;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String agencia, int numero, Cliente dono, double saldo, double limiteMax, double limiteMin){
        super(agencia, numero, dono, saldo, limiteMin, limiteMax);
    }

    @Override //Conta()
    void setLimite(double limiteMin, double limiteMax) {
        if (limiteMin < 100) throw new IllegalArgumentException("Limite abaixo do permitido. Conta de número: " + numero);
        if (limiteMax > 1000) throw new IllegalArgumentException("Limite acima do permitido. Conta de número: " + numero);
        this.limiteMin = limiteMin;
        this.limiteMax = limiteMax;
    }

    @Override //ITaxas()
    public double calculaTaxas(){
        return 0;
    }

}
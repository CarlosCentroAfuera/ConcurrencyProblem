package com.company;

public class ThreadWithdrawCash extends Thread {


    @Override
    public void run() {
        try {
            System.out.println("Simulamos la lectura del saldo del cliente (conexión on-line)");
            System.out.println("El saldo del cliente es " + FakeDB.getCash());
            long sleepingTime = (long) (Math.random()*1000);
            sleep(sleepingTime);
            System.out.println("Pero nos da igual, nosotros lo que decimos a la FakeDB es que reduzca una cantidad de monedas, dandonos igual ");
            FakeDB.decreaseCash(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El resultado guardado en la base de datos es " + FakeDB.getCash());
    }
}

package javacore.ZZDthreads.test;

import javacore.ZZDthreads.Classes.Conta;

public class ContaTest implements Runnable {
    private  Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread caio = new Thread(contaTest, "Caio");
        Thread papai = new Thread(contaTest, "Papai");
        //start() – Inicia a thread. Ou seja, efetiva a chamada do método
        caio.start();
        papai.start();
    }

    public static void imprime() {
        synchronized (ContaTest.class) {
            System.out.println("aaaaaaaa");

        }
    }

    private  void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar");
                conta.saque(valor);
                /*
            sleep(long tempo) – deixa thread corrente inativa por no mínimo tempo milisegundos
             e promove outra thread. 
             Note que este método é de classe e, consequentemente, 
             uma thread não pode fazer outra thread dormir por um 
             tempo;
                */
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println(" Sem dinheiro para" + Thread.currentThread().getName() + "efetuar o saque, saldo:" + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            saque(10);
            if(conta.getSaldo() < 0){
                System.out.println("Oh meu deus!");
            }
        }
    }
}

package javacore.ZZIDefault.classes;

import javacore.ZZIDefault.interfaces.A;
import javacore.ZZIDefault.interfaces.B;
import javacore.ZZIDefault.interfaces.D;

public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }
    public void oi() {
        B.super.oi();
    }
}

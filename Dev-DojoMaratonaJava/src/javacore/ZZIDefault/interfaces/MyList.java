package javacore.ZZIDefault.interfaces;

public interface MyList {
    static void sort(){
        System.out.println("dentro do sort");
    };
// a partit do java 8 pode ter um implementação default na interface
    void add();
    default void remove() {
        System.out.println("dentro do remove");
    }
}

package javacore.Uexpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "Henry, Zidane, Ribery, Benzema, Griezmann, Pogba, Mbappe";
        String[] tokens = str.split(",");
        for(String arr: tokens) {
            System.out.println(arr.trim());
        }
    }
}

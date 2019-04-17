package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier bt = new PoemBeautifier();
        bt.beautify("abcd", (a) -> System.out.println(a.toUpperCase()));
        bt.beautify("abcd", (a) -> System.out.println("\"" + a + "\""));
        bt.beautify("aaaa", (a) -> System.out.println(a.replace('a', 'b')));
        bt.beautify("abcd", (a) -> System.out.println(a.substring(1,3)));
    }
}


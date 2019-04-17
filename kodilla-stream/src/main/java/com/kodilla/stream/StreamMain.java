package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier bt = new PoemBeautifier();
        System.out.println(bt.beautify("abcd", (a) -> a.toUpperCase()));
        System.out.println(bt.beautify("abcd", (a) -> "\"" + a + "\""));
        System.out.println(bt.beautify("aaaa", (a) -> a.replace('a', 'b')));
        System.out.println(bt.beautify("abcd", (a) -> a.substring(1,3)));
    }
}


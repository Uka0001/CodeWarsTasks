package codewars;

import codewars.kyu7.Printer;
import codewars.kyu8.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
}

//https://javarush.ru/groups/posts/605-junit
package codewars;

import codewars.kyu7.Printer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
}

//https://javarush.ru/groups/posts/605-junit
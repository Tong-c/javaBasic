package com.tong;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TradeTest {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");
    List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 700), new Transaction(alan, 2012, 950));

    @Test
    public void test1() {
        List<Transaction> tr2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(comparing(Transaction::getValue)).collect(Collectors.toList());
    }

    @Test
    public void test2() {
        List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
    }

    @Test
    public void test3() {
        List<Trader> traders = transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Cambridge")).distinct().sorted(comparing(Trader::getName)).collect(Collectors.toList());
    }

    @Test
    public void test4() {

    }


}

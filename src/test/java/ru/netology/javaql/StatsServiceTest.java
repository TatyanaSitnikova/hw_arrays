package ru.netology.javaql;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
public void shouldCalcSumOfSales(){
   int actual = service.sumAllSales(sales);
   int expected = 180;

   Assertions.assertEquals(expected, actual);
    }

    @Test
    public void  shouldCalcAverageSumOfSales(){
        int actual = service.averageSumOfSales(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulsCalcMonthMaxSales(){
    int actual = service.MonthMaxSales(sales);
    int expected = 8;

    Assertions.assertEquals(expected, actual);
}
@Test
    public void  shouldCalcMonthMinSales(){
        int actual = service.MonthMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
}
@Test
    public  void souldCalcMonthBellowAverage(){
        int actual = service.MonthBellowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

}

@Test
    public void shouldCalcmonthAboveAverage(){
        int actual = service.monthAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
}

}

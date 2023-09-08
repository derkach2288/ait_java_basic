package test_perfomance;

import java.util.List;

public class ListPerfomanceTester {

    private final ListOperationsStrategy strategy;

    public ListPerfomanceTester(ListOperationsStrategy strategy){
        this.strategy = strategy;
    }

    public long testAddPerfomance(int nTimes){
        long now = System.currentTimeMillis();
        strategy.append(nTimes);
        return System.currentTimeMillis() - now;
    }

    public long testGetPerfomance(int nTimes, int length){
        List list = strategy.getFilledList(length);

        long now = System.currentTimeMillis();
        strategy.get(nTimes, list);

        return System.currentTimeMillis() - now;
    }
}

package _02_Methods._07_immutableList;

import java.util.ArrayList;
import java.util.List;


public class ImmutableList {
    List<Integer> immutableList;

    public ImmutableList() {
        this.immutableList = new ArrayList<>();
    }

    public ImmutableList getList(){
        for (Integer integer : immutableList) {
            immutableList.add(integer);
        }
        return new ImmutableList();
    }
}

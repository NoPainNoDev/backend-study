package src.main.java.me.ksb.java8to11;

import java.util.function.Function;

public class Plus10 implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return 10 + integer;
    }

}

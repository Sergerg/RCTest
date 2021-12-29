package github.sergerg;

import github.sergerg.utils.ToStr;

public record TestDataObj(int a, int b) implements ToStr {
    @Override
    public String to() {
        return "TestDataObj{a="+a+", b="+b+"}";
    }
}

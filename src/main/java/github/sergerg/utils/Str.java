package github.sergerg.utils;

public record Str(Object obj) {
    public String to() {
        if (obj instanceof ToStr toStr)
            return toStr.to();
        else
            return obj.toString();
    }
}

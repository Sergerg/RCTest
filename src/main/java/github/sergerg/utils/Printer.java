package github.sergerg.utils;


import java.io.PrintStream;

public record Printer(PrintStream stream, Object obj) {
    public void print() {
        stream.print(new Str(obj).to()); // TODO: !!!
    }
}

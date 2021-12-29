package github.sergerg;

import github.sergerg.utils.Printer;

/**
 * Hello world!
 *
 */
public record App(TestDataObj testDataObj)
{
    /**
     * Default
     */
    public App() { this( new TestDataObj(1, 2) ); }

    public static void main( String[] args )
    {
        App app = new App();
        Printer printer = new Printer(System.out, app.testDataObj());
        printer.print();
        printer = new Printer(System.out, new TestDataObj2(1, 3, 4));
        printer.print();
    }
}

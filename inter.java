
interface Innerinter {
    void show();
    default void display()
    {
        System.out.println("Hello");
    }
}

interface Base extends Innerinter{
    public void print();
    public void show();
}

class Derived implements Innerinter, Base{
    public void show()
    {
        System.out.println("Show");
    }

    public void print()
    {
        System.out.println("Print");
    }
}

public class inter {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
    
}

import java.util.*;
import javax.swing.*;
import static java.lang.System.*;
public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    private final Integer xSize = 1600;
    private final Integer ySize = 900;
    public App (){
        super();
        this.setSize(xSize, ySize);
    }
}

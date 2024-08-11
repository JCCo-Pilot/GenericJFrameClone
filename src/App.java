import java.util.*;
import javax.swing.*;
import static java.lang.System.*;
public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        App app = new App();
    }
    private final Integer xSize = 1600;
    private final Integer ySize = 900;
    public App (){
        super();
        this.setSize(xSize, ySize);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

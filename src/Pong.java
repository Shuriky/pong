import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * Steps on how to create a Java executable on IntelliJ
 * Go to File > Project Structure > Artifacts
 * Select the "+" icon > JAR > From modules with dependencies
 * Select the main class (Pong.java)
 * Select "Extract to the target JAR" for the library
 * Click "OK"
 * Click "Apply" and "OK"
 * Go to Build > Build Artifacts > Build
 * The JAR file will be created in the out/artifacts directory
 *
 * @author Hoang Minh Do - 33746842
 */

public class Pong {
    public static void main(String[] args) {


        GameFrame frame = new GameFrame();
    }
}

package examplemouselistener;

import javax.swing.*;
    
/**
 *
 * @author vanrooijen
 */
public class ExampleMouseListener extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new ExampleMouseListener();
        frame.setSize( 500, 300 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Implementing mouse listener" );
        frame.setContentPane( new PanelMain() );
        frame.setVisible( true );
    }
}
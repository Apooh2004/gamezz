import javax.swing.*;



public class App {
    public static void main(String[] args) throws Exception {

       int boardwidth=600;
       int boardheight=600;

       JFrame frame= new JFrame("Snake");
       frame.setVisible(true);
       frame.setSize(boardwidth,boardheight);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
       snakeGame game=new snakeGame(boardwidth,boardheight);
       frame.add(game);
       frame.pack();
       game.requestFocus();
    }
}

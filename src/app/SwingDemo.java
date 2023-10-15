// package app;

// import java.io.IOException;
// import javax.swing.JEditorPane;
// import javax.swing.JFrame;
// import javax.swing.JScrollPane;
// public class SwingDemo {
//    public static void main(String[] args) {
//       JEditorPane editorPane = new JEditorPane();
//       try {
//          editorPane.setPage("https://readallcomics.com/hulk-world-war-hulk-omnibus-tpb-part-01/");
//       } catch (IOException e) {
//          editorPane.setContentType("image/html");
//          editorPane.setText("<html>Connection issues!</html>");
//       }
//       JScrollPane pane = new JScrollPane(editorPane);
//       JFrame frame = new JFrame();
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frame.getContentPane().add(pane);
//       frame.setSize(500, 300);
//       frame.setVisible(true);
//    }
// }
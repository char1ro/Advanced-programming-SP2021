package Calculator;

import javafx.application.Application;
import javafx.event.*;           //Event Handler and Action Event
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.geometry.*;

public class CalculatorNew extends Application {
    public static void main(String[] args) {
        launch(args);
    }  
       
    @Override
    public void start(Stage myStage) {
        Font font = Font.font("Arial", FontWeight.BOLD,20);
        TextField txtbox = new TextField();
        txtbox.setFont(font);
        Button btn0 = new Button("0");
        btn0.setFont(font);
        Button btn1 = new Button("1");
        btn1.setFont(font);
        Button btn2 = new Button("2");
        btn2.setFont(font);
        Button btn3 = new Button("3");
        btn3.setFont(font);
        Button btn4 = new Button("4");
        btn4.setFont(font);
        Button btn5 = new Button("5");
        btn5.setFont(font);
        Button btn6 = new Button("6");
        btn6.setFont(font);
        Button btn7 = new Button("7");
        btn7.setFont(font);
        Button btn8 = new Button("8");
        btn8.setFont(font);
        Button btn9 = new Button("9");
        btn9.setFont(font);
        Button btnplu = new Button("+");
        btnplu.setFont(font);
        Button btndiv = new Button("/");
        btndiv.setFont(font);
        Button btnmul = new Button("*");
        btnmul.setFont(font);
        Button btnmin = new Button("-");
        btnmin.setFont(font);
        Button btneq = new Button("=");
        btneq.setFont(font);
        Button btnclr = new Button("CLR");
        btnclr.setFont(font);
   
   /*     //3. Lambda Function
        //3.1        
        btn.addEventHandler(ActionEvent.ACTION, e -> ButtonHandlerMethod(txtbox,lb));
        btn.setOnAction(e -> ButtonHandlerMethod(txtbox,lb));
     */   //
        BorderPane txtfield = new BorderPane();
        HBox hb = new HBox();
        hb.getChildren().addAll(txtbox);
        BorderPane.setAlignment(hb, Pos.TOP_LEFT);
        GridPane root = new GridPane();
        btn0.setMaxWidth(Double.MAX_VALUE);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxWidth(Double.MAX_VALUE);
        btn9.setMaxWidth(Double.MAX_VALUE);
        btneq.setMaxWidth(Double.MAX_VALUE);
        btnclr.setMaxWidth(Double.MAX_VALUE);
        btnplu.setMaxWidth(Double.MAX_VALUE);
        btnmin.setMaxWidth(Double.MAX_VALUE);
        btnmul.setMaxWidth(Double.MAX_VALUE);
        btndiv.setMaxWidth(Double.MAX_VALUE);
        VBox vbrow1 = new VBox();
        vbrow1.getChildren().addAll(btn1,btn4,btn7,btn0);
        VBox vbrow2 = new VBox();
        vbrow2.getChildren().addAll(btn2,btn5,btn8,btneq);
        VBox vbrow3 = new VBox();
        vbrow3.getChildren().addAll(btn3,btn6,btn9,btnclr);
        VBox vbrow4 = new VBox();
        vbrow4.getChildren().addAll(btnplu,btnmin,btnmul,btndiv);
        root.add(vbrow1, 0, 0, 1, 1);
        root.add(vbrow2, 1, 0, 1, 1);
        root.add(vbrow3, 2, 0, 1, 1);
        root.add(vbrow4, 3, 0, 1, 1);
        root.getChildren().addAll(txtfield);
        Scene scene = new Scene(root,200,200);
        
        myStage.setTitle("Calculator");
        myStage.setScene(scene);
        myStage.show();
    }
 /*   
    //ButtonHandlerMethod
    public void ButtonHandlerMethod(TextField txtbox, Label lb){
       lb.setText("Hello "+txtbox.getText());
    }
    
    //Inner class
    class ButtonHandler implements EventHandler<ActionEvent> {
        TextField tf;
        Label lb;
        ButtonHandler(TextField tf, Label lb){
          this.tf=tf;
          this.lb=lb;
        }
        @Override
        public void handle(ActionEvent e) {
          lb.setText("Hello "+tf.getText());
        }
    }*/
}    
        
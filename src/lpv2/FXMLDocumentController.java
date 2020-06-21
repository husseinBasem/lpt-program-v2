/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package lpv2;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.events.JFXDialogEvent;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



/**
*
* @author hussein
*/
public class FXMLDocumentController implements Initializable {

groups2 groups = new groups2();



@FXML
private StackPane sp,sp1;
@FXML
private AnchorPane ap;
@FXML
private Label lbl;
@FXML
private Label lbl1,intro;
@FXML
private ImageView image;
@FXML
private JFXButton btn,btn1,btn11;
@FXML private Circle circle0,circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20,
    circle21,circle22,circle23,circle24,circle25,circle26,circle27,circle28,circle29,circle30,circle31;
Image image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15,image16,image17;
PathTransition transition1,transition2,transition3,transition4,transition5,transition6,transition7,transition8,transition9,transition10,transition11,transition12,transition13,transition14,transition15,transition16;
FadeTransition fade,fade1,fade2,fade3,fade4,fade5,fade6,fade7,fade8,fade9,fade10,fade11,fade12,fade13,fade14,fade15,fade16,fade17,fade18,fade19,fade20,fade21;
ScaleTransition st,st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14,st15;
@FXML Text tt,me;



private Circle c1;

public int count=0;

private String firstClub;
private String secondClub;
private String home;
public String away;
private final double TimeDuration = 5.0;
private boolean text=true,hide = false;
private final  String str= "Hello, We want to Congratulate all the teams qualified For the round of 16 of IRAQ PRO CUP S8";
private final String soundTyping = "Untitled.wav";
private final String drums = "mixDrums.wav";
private  double time1=0.325,time2=0.6007,time3=0.8764,time4=1.1521,time5=1.4278,time6=1.7035,time7=1.9792,time8=2.2549,
   time9=2.5306,time10=2.8063,time11=3.082,time12=3.3577,time13=3.6334,time14=3.9091,time15=4.1848,time16=4.4605;

private  AudioInputStream audioInputStream,audioInputStream2;
private Clip clip,clip2;




@FXML
public void EXT(ActionEvent event){

System.exit(0);
}



double width , height;
@FXML
void dragged(MouseEvent event) {
Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
stage.setX(event.getScreenX() - width);
stage.setY(event.getScreenY() - height);

}



@FXML
void pressed(MouseEvent event) {
width = event.getSceneX();
height = event.getSceneY();

}
void write(){

intro.setText("please");
}
@FXML
void start() throws InterruptedException{
/* for (int j=0;j<=str.length();j++){
   System.out.println(str.charAt(j) + " = " + j );

}*/

        try {
    audioInputStream = AudioSystem.getAudioInputStream(new File(soundTyping).getAbsoluteFile());

Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();

        }
         catch (UnsupportedAudioFileException ex) {
    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
} catch (LineUnavailableException ex) {
    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
}
fade = new FadeTransition();
fade.setDuration(Duration.millis(1000));
fade.setNode(btn11);
fade.setFromValue(1);
fade.setToValue(0);
fade.play();
fade2 = new FadeTransition();
fade2.setDuration(Duration.millis(1000));
fade2.setNode(image);
fade2.setFromValue(1);
fade2.setToValue(0);
fade2.play();
fade.setOnFinished((event) -> {
    btn11.setVisible(false);
    fade1 = new FadeTransition();
    fade1.setDuration(Duration.millis(1000));
fade1.setNode(btn1);
fade1.setFromValue(0);
fade1.setToValue(1);
fade1.play();

});

tt.setFont(Font.font("DIN Pro",40.0));




         circle16.setFill(new ImagePattern(image1));
     circle17.setFill(new ImagePattern(image2));
     circle18.setFill(new ImagePattern(image3));
     circle19.setFill(new ImagePattern(image4));
     circle20.setFill(new ImagePattern(image5));
     circle21.setFill(new ImagePattern(image6));
     circle22.setFill(new ImagePattern(image7));
     circle23.setFill(new ImagePattern(image8));
     circle24.setFill(new ImagePattern(image9));
     circle25.setFill(new ImagePattern(image10));
     circle26.setFill(new ImagePattern(image11));
     circle27.setFill(new ImagePattern(image12));
     circle28.setFill(new ImagePattern(image13));
     circle29.setFill(new ImagePattern(image14));
     circle30.setFill(new ImagePattern(image15));
     circle31.setFill(new ImagePattern(image16));


final IntegerProperty i = new SimpleIntegerProperty(0);
 Timeline timeline = new Timeline();
KeyFrame keyFrame = new KeyFrame(
        Duration.millis(100),
        event -> {
            if (i.get() > str.length()) {
                timeline.stop();

        fade3 = new FadeTransition();
                 fade3.setDuration(Duration.millis(5000));
                 fade3.setNode(tt);
                 fade3.setFromValue(1);
                 fade3.setToValue(0);
                 fade3.play();
                 fade3.setOnFinished((event1) -> {
                     circle16.setVisible(true);
                      st = new ScaleTransition(Duration.seconds(2), circle16);
                      st.setFromX(2.5);
                      st.setFromY(2.5);
                      st.setToY(1.0);
                      st.setToX(1.0);
                      st.play();
                      st.setOnFinished((event2) -> {
                          circle31.setVisible(true);
                          st1 = new ScaleTransition(Duration.seconds(2), circle31);
                          st1.setFromX(2.5);
                          st1.setFromY(2.5);
                          st1.setToX(1.4);
                          st1.setToY(1.4);
                          st1.play();
                          st1.setOnFinished((event3) -> {
                          circle18.setVisible(true);
                           st2 = new ScaleTransition(Duration.seconds(2), circle18);
                          st2.setFromX(2.5);
                          st2.setFromY(2.5);
                          st2.setToX(1.0);
                          st2.setToY(1.0);
                          st2.play();
                          st2.setOnFinished((event4) -> {
                              circle17.setVisible(true);
                           st3 = new ScaleTransition(Duration.seconds(2), circle17);
                          st3.setFromX(2.5);
                          st3.setFromY(2.5);
                          st3.setToX(1.0);
                          st3.setToY(1.0);
                          st3.play();
                          st3.setOnFinished((event5) -> {
                               circle19.setVisible(true);
                           st4 = new ScaleTransition(Duration.seconds(2), circle19);
                          st4.setFromX(2.5);
                          st4.setFromY(2.5);
                          st4.setToX(1.0);
                          st4.setToY(1.0);
                          st4.play();
                          st4.setOnFinished((event6) -> {
                                circle22.setVisible(true);
                           st5 = new ScaleTransition(Duration.seconds(2), circle22);
                          st5.setFromX(2.5);
                          st5.setFromY(2.5);
                          st5.setToX(1.0);
                          st5.setToY(1.0);
                          st5.play();
                          st5.setOnFinished((event7) -> {
                                circle21.setVisible(true);
                           st6 = new ScaleTransition(Duration.seconds(2), circle21);
                          st6.setFromX(2.5);
                          st6.setFromY(2.5);
                          st6.setToX(1.0);
                          st6.setToY(1.0);
                          st6.play();
                          st6.setOnFinished((event8) -> {
                               circle20.setVisible(true);
                           st7 = new ScaleTransition(Duration.seconds(2), circle20);
                          st7.setFromX(2.5);
                          st7.setFromY(2.5);
                          st7.setToX(1.0);
                          st7.setToY(1.0);
                          st7.play();
                          st7.setOnFinished((event9) -> {

                              circle23.setVisible(true);
                           st8 = new ScaleTransition(Duration.seconds(2), circle23);
                          st8.setFromX(2.5);
                          st8.setFromY(2.5);
                          st8.setToX(1.0);
                          st8.setToY(1.0);
                          st8.play();
                          st8.setOnFinished((event10) -> {

                              circle26.setVisible(true);
                           st9 = new ScaleTransition(Duration.seconds(2), circle26);
                          st9.setFromX(2.5);
                          st9.setFromY(2.5);
                          st9.setToX(1.1);
                          st9.setToY(1.1);
                          st9.play();
                          st9.setOnFinished((event11) -> {

                              circle25.setVisible(true);
                           st10 = new ScaleTransition(Duration.seconds(2), circle25);
                          st10.setFromX(2.5);
                          st10.setFromY(2.5);
                          st10.setToX(1.0);
                          st10.setToY(1.0);
                          st10.play();
                          st10.setOnFinished((event12) -> {

                              circle24.setVisible(true);
                           st11 = new ScaleTransition(Duration.seconds(2), circle24);
                          st11.setFromX(2.5);
                          st11.setFromY(2.5);
                          st11.setToX(1.0);
                          st11.setToY(1.0);
                          st11.play();
                          st11.setOnFinished((event13) -> {

                              circle27.setVisible(true);
                           st12 = new ScaleTransition(Duration.seconds(2), circle27);
                          st12.setFromX(2.5);
                          st12.setFromY(2.5);
                          st12.setToX(1.0);
                          st12.setToY(1.0);
                          st12.play();
                          st12.setOnFinished((event14) -> {

                              circle30.setVisible(true);
                           st13 = new ScaleTransition(Duration.seconds(2), circle30);
                          st13.setFromX(2.5);
                          st13.setFromY(2.5);
                          st13.setToX(1.0);
                          st13.setToY(1.0);
                          st13.play();
                          st13.setOnFinished((event15) -> {

                              circle29.setVisible(true);
                           st14 = new ScaleTransition(Duration.seconds(2), circle29);
                          st14.setFromX(2.5);
                          st14.setFromY(2.5);
                          st14.setToX(1.4);
                          st14.setToY(1.4);
                          st14.play();
                          st14.setOnFinished((event16) -> {

                              circle28.setVisible(true);
                           st15 = new ScaleTransition(Duration.seconds(2), circle28);
                          st15.setFromX(2.5);
                          st15.setFromY(2.5);
                          st15.setToX(1.0);
                          st15.setToY(1.0);
                          st15.play();
                          st15.setOnFinished((event17) -> {
                          });
                          });

                          });
                          });
                          });
                          });
                          });

                          });
                          });

                          });

                          });
                          });
                          });
                          });

                          });

                          });



                 });
            } else {
                 tt.setWrappingWidth(850.0);
                tt.setText(str.substring(0, i.get()));

                i.set(i.get() + 1);

            }

        });
timeline.getKeyFrames().add(keyFrame);
timeline.setCycleCount(Animation.INDEFINITE);
timeline.play();















}


@FXML

void lot(ActionEvent event) throws InterruptedException {

try {

    try {
        audioInputStream2 = AudioSystem.getAudioInputStream(new File(drums).getAbsoluteFile());
    } catch (UnsupportedAudioFileException ex) {
        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
    }

    Clip clip2 = AudioSystem.getClip();
    clip2.open(audioInputStream2);
    clip2.start();

    //this willn't work
    if(clip2.isRunning() == false){
        clip2.start();
    }



    fade5 = new FadeTransition();
    fade5.setDuration(Duration.millis(500));
    fade5.setNode(circle16);
    fade5.setFromValue(1);
    fade5.setToValue(0);
    fade5.play();

    fade6 = new FadeTransition();
    fade6.setDuration(Duration.millis(500));
    fade6.setNode(circle17);
    fade6.setFromValue(1);
    fade6.setToValue(0);
    fade6.play();

    fade7 = new FadeTransition();
    fade7.setDuration(Duration.millis(500));
    fade7.setNode(circle18);
    fade7.setFromValue(1);
    fade7.setToValue(0);
    fade7.play();

    fade8 = new FadeTransition();
    fade8.setDuration(Duration.millis(500));
    fade8.setNode(circle19);
    fade8.setFromValue(1);
    fade8.setToValue(0);
    fade8.play();

    fade9 = new FadeTransition();
    fade9.setDuration(Duration.millis(500));
    fade9.setNode(circle20);
    fade9.setFromValue(1);
    fade9.setToValue(0);
    fade9.play();

    fade10 = new FadeTransition();
    fade10.setDuration(Duration.millis(500));
    fade10.setNode(circle21);
    fade10.setFromValue(1);
    fade10.setToValue(0);
    fade10.play();

    fade11 = new FadeTransition();
    fade11.setDuration(Duration.millis(500));
    fade11.setNode(circle22);
    fade11.setFromValue(1);
    fade11.setToValue(0);
    fade11.play();

    fade12 = new FadeTransition();
    fade12.setDuration(Duration.millis(500));
    fade12.setNode(circle23);
    fade12.setFromValue(1);
    fade12.setToValue(0);
    fade12.play();

    fade13 = new FadeTransition();
    fade13.setDuration(Duration.millis(500));
    fade13.setNode(circle24);
    fade13.setFromValue(1);
    fade13.setToValue(0);
    fade13.play();

    fade14 = new FadeTransition();
    fade14.setDuration(Duration.millis(500));
    fade14.setNode(circle25);
    fade14.setFromValue(1);
    fade14.setToValue(0);
    fade14.play();

    fade15 = new FadeTransition();
    fade15.setDuration(Duration.millis(500));
    fade15.setNode(circle26);
    fade15.setFromValue(1);
    fade15.setToValue(0);
    fade15.play();

    fade16 = new FadeTransition();
    fade16.setDuration(Duration.millis(500));
    fade16.setNode(circle27);
    fade16.setFromValue(1);
    fade16.setToValue(0);
    fade16.play();

    fade17 = new FadeTransition();
    fade17.setDuration(Duration.millis(500));
    fade17.setNode(circle28);
    fade17.setFromValue(1);
    fade17.setToValue(0);
    fade17.play();

    fade18 = new FadeTransition();
    fade18.setDuration(Duration.millis(500));
    fade18.setNode(circle29);
    fade18.setFromValue(1);
    fade18.setToValue(0);
    fade18.play();

    fade19 = new FadeTransition();
    fade19.setDuration(Duration.millis(500));
    fade19.setNode(circle30);
    fade19.setFromValue(1);
    fade19.setToValue(0);
    fade19.play();
    /* fade21 = new FadeTransition();
    fade21.setDuration(Duration.millis(500));
    fade21.setNode(image);
    fade21.setFromValue(0);
    fade21.setToValue(1);
    fade21.play();*/
    image.setOpacity(1);
    fade20 = new FadeTransition();
    fade20.setDuration(Duration.millis(500));
    fade20.setNode(circle31);
    fade20.setFromValue(1);
    fade20.setToValue(0);
    fade20.setOnFinished((event2) -> {
        circle16.setVisible(false);
        circle17.setVisible(false);
        circle18.setVisible(false);
        circle19.setVisible(false);
        circle20.setVisible(false);
        circle21.setVisible(false);
        circle22.setVisible(false);
        circle23.setVisible(false);
        circle24.setVisible(false);
        circle25.setVisible(false);
        circle26.setVisible(false);
        circle27.setVisible(false);
        circle28.setVisible(false);
        circle29.setVisible(false);
        circle30.setVisible(false);
        circle31.setVisible(false);
    });
    fade20.play();





    if (text==true){
        lbl.getStyleClass().add("animated");










        text=false;
    }
    if( groups.qualifiedFirst.isEmpty()) {




        JFXDialogLayout jfxdl = new JFXDialogLayout();
        JFXDialog dialog = new JFXDialog(sp, jfxdl, JFXDialog.DialogTransition.CENTER,true);
        jfxdl.getStyleClass().add("dialoglayout");
        JFXButton okey = new JFXButton("okey");
        okey.getStyleClass().add("dialog-okey");
        BoxBlur blur = new BoxBlur(3,3,3);
        jfxdl.setBody(new Label("the lot has end "));


        okey.addEventHandler(MouseEvent.MOUSE_CLICKED,( MouseEvent mousEevent)->{

            dialog.close();
        });



        jfxdl.setActions(okey);

        ap.setEffect(blur);
        dialog.show();


        dialog.setOnDialogClosed((JFXDialogEvent event1)->{
            ap.setEffect(null);

        });


        return;
    }
    else {




        c1 = new Circle(390, 130, 200);




        transition1  = new PathTransition();
        transition2  = new PathTransition();
        transition3  = new PathTransition();
        transition4  = new PathTransition();
        transition5  = new PathTransition();
        transition6  = new PathTransition();
        transition7  = new PathTransition();
        transition8  = new PathTransition();
        transition9  = new PathTransition();
        transition10  = new PathTransition();
        transition11  = new PathTransition();
        transition12  = new PathTransition();
        transition13  = new PathTransition();
        transition14  = new PathTransition();
        transition15  = new PathTransition();
        transition16  = new PathTransition();

        circle0.setVisible(true);
        circle1.setVisible(true);
        circle2.setVisible(true);
        circle3.setVisible(true);
        circle4.setVisible(true);
        circle5.setVisible(true);
        circle6.setVisible(true);
        circle7.setVisible(true);
        circle8.setVisible(true);
        circle9.setVisible(true);
        circle10.setVisible(true);
        circle11.setVisible(true);
        circle12.setVisible(true);
        circle13.setVisible(true);
        circle14.setVisible(true);
        circle15.setVisible(true);


        circle0.setFill(new ImagePattern(image1));
        circle1.setFill(new ImagePattern(image2));
        circle2.setFill(new ImagePattern(image3));
        circle3.setFill(new ImagePattern(image4));
        circle4.setFill(new ImagePattern(image5));
        circle5.setFill(new ImagePattern(image6));
        circle6.setFill(new ImagePattern(image7));
        circle7.setFill(new ImagePattern(image8));
        circle8.setFill(new ImagePattern(image9));
        circle9.setFill(new ImagePattern(image10));
        circle10.setFill(new ImagePattern(image11));
        circle11.setFill(new ImagePattern(image12));
        circle12.setFill(new ImagePattern(image13));
        circle13.setFill(new ImagePattern(image14));
        circle14.setFill(new ImagePattern(image15));
        circle15.setFill(new ImagePattern(image16));

        transition1.setNode(circle0);
        transition2.setNode(circle1);
        transition3.setNode(circle2);
        transition4.setNode(circle3);
        transition5.setNode(circle4);
        transition6.setNode(circle5);
        transition7.setNode(circle6);
        transition8.setNode(circle7);
        transition9.setNode(circle8);
        transition10.setNode(circle9);
        transition11.setNode(circle10);
        transition12.setNode(circle11);
        transition13.setNode(circle12);
        transition14.setNode(circle13);
        transition15.setNode(circle14);
        transition16.setNode(circle15);









        transition1.setDuration(Duration.seconds(TimeDuration));
        transition2.setDuration(Duration.seconds(TimeDuration));
        transition3.setDuration(Duration.seconds(TimeDuration));
        transition4.setDuration(Duration.seconds(TimeDuration));
        transition5.setDuration(Duration.seconds(TimeDuration));
        transition6.setDuration(Duration.seconds(TimeDuration));
        transition7.setDuration(Duration.seconds(TimeDuration));
        transition8.setDuration(Duration.seconds(TimeDuration));
        transition9.setDuration(Duration.seconds(TimeDuration));
        transition10.setDuration(Duration.seconds(TimeDuration));
        transition11.setDuration(Duration.seconds(TimeDuration));
        transition12.setDuration(Duration.seconds(TimeDuration));
        transition13.setDuration(Duration.seconds(TimeDuration));
        transition14.setDuration(Duration.seconds(TimeDuration));
        transition15.setDuration(Duration.seconds(TimeDuration));
        transition16.setDuration(Duration.seconds(TimeDuration));



        transition1.setPath(c1);
        transition2.setPath(c1);
        transition3.setPath(c1);
        transition4.setPath(c1);
        transition5.setPath(c1);
        transition6.setPath(c1);
        transition7.setPath(c1);
        transition8.setPath(c1);
        transition9.setPath(c1);
        transition10.setPath(c1);
        transition11.setPath(c1);
        transition12.setPath(c1);
        transition13.setPath(c1);
        transition14.setPath(c1);
        transition15.setPath(c1);
        transition16.setPath(c1);



        transition1.setCycleCount(4);

        transition2.setCycleCount(4);

        transition3.setCycleCount(4);
        transition4.setCycleCount(4);
        transition5.setCycleCount(4);
        transition6.setCycleCount(4);
        transition7.setCycleCount(4);
        transition8.setCycleCount(4);
        transition9.setCycleCount(4);
        transition10.setCycleCount(4);
        transition11.setCycleCount(4);
        transition12.setCycleCount(4);
        transition13.setCycleCount(4);
        transition14.setCycleCount(4);
        transition15.setCycleCount(4);
        transition16.setCycleCount(4);




        transition1.playFrom(Duration.seconds(time1));
        transition2.playFrom(Duration.seconds(time2));//54-----55.14
        transition3.playFrom(Duration.seconds(time3));//60
        transition4.playFrom(Duration.seconds(time4));//56
        transition5.playFrom(Duration.seconds(time5));//61
        transition6.playFrom(Duration.seconds(time6));//63           //0.2757
        transition7.playFrom(Duration.seconds(time7));//56
        transition8.playFrom(Duration.seconds(time8));//59
        transition9.playFrom(Duration.seconds(time9));//58
        transition10.playFrom(Duration.seconds(time10));//49
        transition11.playFrom(Duration.seconds(time11));//49
        transition12.playFrom(Duration.seconds(time12));//60
        transition13.playFrom(Duration.seconds(time13));//53
        transition14.playFrom(Duration.seconds(time14));//49
        transition15.playFrom(Duration.seconds(time15));//45
        transition16.playFrom(Duration.seconds(time16));





        BoxBlur blur1 = new BoxBlur(9,9,9);
        lbl.setEffect(blur1);
        lbl1.setEffect(blur1);
        btn.setEffect(blur1);
        btn1.setEffect(blur1);
        me.setEffect(blur1);
        image.setOpacity(1);




        transition16.setOnFinished((event4) -> {
            lbl.setEffect(null);

            lbl1.setEffect(null);
            btn.setEffect(null);
            btn1.setEffect(null);
            me.setEffect(null);
            circle0.setVisible(false);
            circle1.setVisible(false);
            circle2.setVisible(false);
            circle3.setVisible(false);
            circle4.setVisible(false);
            circle5.setVisible(false);
            circle6.setVisible(false);
            circle7.setVisible(false);
            circle8.setVisible(false);
            circle9.setVisible(false);
            circle10.setVisible(false);
            circle11.setVisible(false);
            circle12.setVisible(false);
            circle13.setVisible(false);
            circle14.setVisible(false);
            circle15.setVisible(false);
            image.setOpacity(0.5);



            groups.placee();


            int randomPlace1 = new Random().nextInt(groups.place.size());

            home = groups.place.get(randomPlace1);

            int      randomFirst = new Random().nextInt(groups.qualifiedFirst.size());


            firstClub = groups.qualifiedFirst.get(randomFirst);

            groups.qualifiedFirst.remove(randomFirst);
            groups.place.remove(randomPlace1);
            int randomPlace2 = new Random().nextInt(groups.place.size());
            away = groups.place.get(randomPlace2);
            groups.place.remove(randomPlace2);



            if(firstClub=="FC KURDSTARZ"){



                int nn = new Random().nextInt(groups.forkurdstars.size());



                secondClub = groups.forkurdstars.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();

                lbl.setText(gettext1 +" ("+home+") "+  firstClub +" VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);
                //  homePlace.setVisible(true);
                //  homePlace.setLayoutX(lbl.getLayoutX()+240);
                //  homePlace.setLayoutY(lbl.getLayoutY()+160.0);

                circle0.setOpacity(0.0);
                time2=time2-0.2757;
                time3=time3-0.2757;
                time4=time4-0.2757;
                time5=time5-0.2757;
                time6=time6-0.2757;
                time7=time7-0.2757;
                time8=time8-0.2757;
                time9=time9-0.2757;
                time10=time10-0.2757;
                time11=time11-0.2757;
                time12=time12-0.2757;
                time13=time13-0.2757;
                time14=time14-0.2757;
                time15=time15-0.2757;
                time16=time16-0.2757;
            }
            if(firstClub=="AMARJI UNITED"){

                int  nn = new Random().nextInt(groups.forkurdstars.size());



                secondClub = groups.forkurdstars.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);

                circle1.setOpacity(0.0);
                time3=time3-0.2757;
                time4=time4-0.2757;
                time5=time5-0.2757;
                time6=time6-0.2757;
                time7=time7-0.2757;
                time8=time8-0.2757;
                time9=time9-0.2757;
                time10=time10-0.2757;
                time11=time11-0.2757;
                time12=time12-0.2757;
                time13=time13-0.2757;
                time14=time14-0.2757;
                time15=time15-0.2757;
                time16=time16-0.2757;
            }





            if(firstClub=="IRAQ UNITED"){

                int  nn = new Random().nextInt(groups.forIraqUnited.size());



                secondClub = groups.forIraqUnited.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);

                circle7.setOpacity(0.0);
                time9=time9-0.2757;
                time10=time10-0.2757;
                time11=time11-0.2757;
                time12=time12-0.2757;
                time13=time13-0.2757;
                time14=time14-0.2757;
                time15=time15-0.2757;
                time16=time16-0.2757;
            }

            if(firstClub=="KILLERZ FC"){

                int  nn = new Random().nextInt(groups.forKillerz.size());



                secondClub = groups.forKillerz.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");
                hide(secondClub);

                circle9.setOpacity(0.0);
                time11=time11-0.2757;
                time12=time12-0.2757;
                time13=time13-0.2757;
                time14=time14-0.2757;
                time15=time15-0.2757;
                time16=time16-0.2757;
            }
            if(firstClub=="LIVERPOOL IQ"){
                int  nn = new Random().nextInt(groups.forLiverpool.size());



                secondClub = groups.forLiverpool.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);

                circle10.setOpacity(0.0);
                time12=time12-0.2757;
                time13=time13-0.2757;
                time14=time14-0.2757;
                time15=time15-0.2757;
                time16=time16-0.2757;
            }

            if(firstClub=="IRAQ MONSTERS"){

                int  nn = new Random().nextInt(groups.forMonster.size());



                secondClub = groups.forMonster.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);

                circle12.setOpacity(0.0);
                time14=time14-0.2757;
                time15=time15-0.2757;
                time16=time16-0.2757;
            }
            if(firstClub=="X SHADOWS"){

                int  nn = new Random().nextInt(groups.forLiverpool.size());



                secondClub = groups.forLiverpool.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);

                circle13.setOpacity(0.0);
                time15=time15-0.2757;
                time16=time16-0.2757;
            }

            if(firstClub=="REAL ZAYONA CF"){

                int  nn = new Random().nextInt(groups.forZayona.size());



                secondClub = groups.forZayona.get(nn);
                groups.forIraqUnited.remove(secondClub);
                groups.forKillerz.remove(secondClub);
                groups.forLiverpool.remove(secondClub);
                groups.forMonster.remove(secondClub);
                groups.forZayona.remove(secondClub);
                groups.forkurdstars.remove(secondClub);
                String gettext1 =lbl.getText();
                lbl.setText(gettext1 + " ("+home+") "+ firstClub + " VS "+ secondClub + " ("+away+")"+ "\n\n");

                hide(secondClub);

                circle15.setOpacity(0.0);

            }




        });






        //  textArea.setText( gettext + firstClub + " VS "+ secondClub + "\n");





    }






} catch (LineUnavailableException ex) {
    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
}






                }



private void hide (String s){




                                        if(s=="FC ATTACKERS"){
                                            circle2.setOpacity(0.0);
                                            time4=time4-0.2757;
                                            time5=time5-0.2757;
                                            time6=time6-0.2757;
                                            time7=time7-0.2757;
                                            time8=time8-0.2757;
                                            time9=time9-0.2757;
                                            time10=time10-0.2757;
                                            time11=time11-0.2757;
                                            time12=time12-0.2757;
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }
                                        if(s=="BRAYATI FC"){
                                            circle3.setOpacity(0.0);
                                            time5=time5-0.2757;
                                            time6=time6-0.2757;
                                            time7=time7-0.2757;
                                            time8=time8-0.2757;
                                            time9=time9-0.2757;
                                            time10=time10-0.2757;
                                            time11=time11-0.2757;
                                            time12=time12-0.2757;
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }
                                        if(s=="ESSE BLACK"){
                                            circle4.setOpacity(0.0);
                                            time6=time6-0.2757;
                                            time7=time7-0.2757;
                                            time8=time8-0.2757;
                                            time9=time9-0.2757;
                                            time10=time10-0.2757;
                                            time11=time11-0.2757;
                                            time12=time12-0.2757;
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }
                                        if(s=="FC GOAT"){
                                            circle5.setOpacity(0.0);
                                            time7=time7-0.2757;
                                            time8=time8-0.2757;
                                            time9=time9-0.2757;
                                            time10=time10-0.2757;
                                            time11=time11-0.2757;
                                            time12=time12-0.2757;
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }
                                        if(s=="IRAQ FORCE"){
                                            circle6.setOpacity(0.0);
                                            time8=time8-0.2757;
                                            time9=time9-0.2757;
                                            time10=time10-0.2757;
                                            time11=time11-0.2757;
                                            time12=time12-0.2757;
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }

                                        if(s=="IRAQI ULTRAS FCB"){
                                            circle8.setOpacity(0.0);
                                            time10=time10-0.2757;
                                            time11=time11-0.2757;
                                            time12=time12-0.2757;
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }

                                        if(s=="FC MARAKANA"){
                                            circle11.setOpacity(0.0);
                                            time13=time13-0.2757;
                                            time14=time14-0.2757;
                                            time15=time15-0.2757;
                                            time16=time16-0.2757;
                                        }


                                        if(s=="TRUE KING"){
                                            circle14.setOpacity(0.0);
                                            time16=time16-0.2757;
                                        }







}


@Override
public void initialize(URL url, ResourceBundle rb) {

// groups.groups2();
// TODO

groups.first();
groups.kurd();
groups.iraqUnited();
groups.liverpool();
groups.zayona();
groups.monster();
groups.killerz();

 image1 = new Image ("kurdstars.png");
        image2 = new Image ("amarji.png");
       image3 = new Image ("attackers.png");
        image4 = new Image ("brayati.png");
        image5 = new Image ("esseblack.png");
        image6 = new Image ("goat.png");
        image7 = new Image ("iraqforce.png");
        image8 = new Image ("iraqunited.png");
        image9 = new Image ("iufcb.png");
        image10 = new Image ("killerz.png");
        image11 = new Image ("liverpool.png");
        image12 = new Image ("marakana.png");
        image13 = new Image ("monsters.png");
        image14 = new Image ("shadowa.png");
        image15 = new Image ("trueking.png");
        image16 = new Image ("zayona.png");
        image17 = new Image ("iraq-pro-cup.png");
circle0.setVisible(false);
circle1.setVisible(false);
circle2.setVisible(false);
circle3.setVisible(false);
circle4.setVisible(false);
circle5.setVisible(false);
circle6.setVisible(false);
circle7.setVisible(false);
circle8.setVisible(false);
circle9.setVisible(false);
circle10.setVisible(false);
circle11.setVisible(false);
circle12.setVisible(false);
circle13.setVisible(false);
circle14.setVisible(false);
circle15.setVisible(false);
circle16.setVisible(false);
circle17.setVisible(false);
circle18.setVisible(false);
circle19.setVisible(false);
circle20.setVisible(false);
circle21.setVisible(false);
circle22.setVisible(false);
circle23.setVisible(false);
circle24.setVisible(false);
circle25.setVisible(false);
circle26.setVisible(false);
circle27.setVisible(false);
circle28.setVisible(false);
circle29.setVisible(false);
circle30.setVisible(false);
circle31.setVisible(false);
btn1.setOpacity(0.0);

//txt.setOpacity(0.0);

}


}

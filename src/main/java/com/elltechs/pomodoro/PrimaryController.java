package com.elltechs.pomodoro;

import com.elltechs.pomodoro.Ppoint.PSTATE;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class PrimaryController implements Initializable {

    @FXML
    private AnchorPane pane1;
    @FXML
    private Label timer1;
    @FXML
    private Label clockTime;
    @FXML
    private AnchorPane TimerID;
    @FXML
    private Label WorkLabelID;
    PpointFactory pf = new PpointFactory();
    PomList pl = new PomList(pf.getpListArg());

    private PSTATE state = PSTATE.PAUSE;
    private Ppoint currentPoint;
    long passedTime;
    long workPeriod;
    long remainingTime;

    // URL root = PrimaryController.class.getResource("piglevelwin2mp3-14800.mp3");
    //  Media media = new Media(root.toString()); 
    // MediaPlayer mediaPlayer ;
    ///tring path = "src\\main\\resources\\com\\elltechs\\pomodoro\\piglevelwin2mp3-14800.mp3";
    //Media media = new Media(new File(path).toURI().toString()); 
    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // creating timer task, timer 

        //mediaPlayer = new MediaPlayer(media); 
        // System.out.println(root);
        Timer t = new Timer();
        TimerTask tt;
        tt = new TimerTask() {
            @Override
            public void run() {

                Platform.runLater(() -> {

                    clockTime.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                });
                Calendar c = Calendar.getInstance();
                currentPoint = pl.findPpoint(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE));
                state = currentPoint.getpState();
                System.out.println("Current State = " + pl.findState(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE)));
                System.out.println("Work Period State = " + pl.findWorkPeriod(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE)));
                passedTime = (c.get(Calendar.HOUR_OF_DAY) - currentPoint.getpHour()) * 3600 * 1000
                        + (c.get(Calendar.MINUTE) - currentPoint.getpMin()) * 60 * 1000
                        + c.get(Calendar.SECOND) * 1000;
                workPeriod = pl.findWorkPeriod(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE));
                remainingTime = workPeriod - passedTime;
                System.out.println("Passed Time = " + passedTime + " remaining  = " + remainingTime);

                switch (state) {
                    case LONGREST:
                        longrestFunc();
                        break;
                    case PAUSE:
                        pauseFunc();
                        break;
                    case POMODORO:
                        pomodoroFunc();
                        break;
                    case SHORTREST:
                        shortrestFunc();
                        break;
                    case FREEWORKING:
                        freeworkFunc();
                        break;
                }

            }
        ;
        };
        t.schedule(tt, new Date(), 1000);

    }

    private void pauseFunc() {

    }

    private void pomodoroFunc() {
        if (remainingTime <= 3000 && remainingTime > 2000)
        
            //if (mediaPlayer != null)
             //    mediaPlayer.play();
       ;

        Platform.runLater(() -> {

            long sec = (remainingTime % 60000) / 1000 % 60;
            long min = remainingTime / 60000;
            System.out.println("com.elltechs.pomodoro.PrimaryController.freeworkFunc() " + remainingTime);
            timer1.setText(String.format("%02d:%02d", min, sec));
            pane1.setStyle("-fx-background-color: #ff4040;");
            timer1.setStyle("-fx-text-fill: #FEF6F8;");
            TimerID.setStyle("-fx-background-color: #ff8000;");
            //TimerID.setStyle("-fx-background-color: #ff5c33;");
            TimerID.setPrefWidth(pane1.getPrefWidth()
                    - pane1.getPrefWidth() * remainingTime / workPeriod
            );
            WorkLabelID.setText("Work Time!");
            WorkLabelID.setStyle("-fx-text-fill: #FEF6F8;");
        });
    }

    private void shortrestFunc() {
        if (remainingTime <= 3000 && remainingTime > 2000)
             //if (mediaPlayer != null)
              //   mediaPlayer.play();
             ;
        Platform.runLater(() -> {

            long sec = (remainingTime % 60000) / 1000 % 60;
            long min = remainingTime / 60000;
            System.out.println("com.elltechs.pomodoro.PrimaryController.freeworkFunc() " + remainingTime);
            timer1.setText(String.format("%02d:%02d", min, sec));
            pane1.setStyle("-fx-background-color: #00CC00;");
            timer1.setStyle("-fx-text-fill: #FEF6F8;");
            TimerID.setStyle("-fx-background-color: #00FF00;");
            TimerID.setPrefWidth(pane1.getPrefWidth()
                    - pane1.getPrefWidth() * remainingTime / workPeriod
            );
            WorkLabelID.setText("Rest Time!");
            WorkLabelID.setStyle("-fx-text-fill: #FEF6F8;");
        });
    }

    private void longrestFunc() {
        if (remainingTime <= 3000 && remainingTime > 2000)
           //  if (mediaPlayer != null)
              //   mediaPlayer.play();
             ;
        Platform.runLater(() -> {

            long sec = (remainingTime % 60000) / 1000 % 60;
            long min = remainingTime / 60000;
            System.out.println("com.elltechs.pomodoro.PrimaryController.freeworkFunc() " + remainingTime);
            timer1.setText(String.format("%02d:%02d", min, sec));
            pane1.setStyle("-fx-background-color: #0033CC;");
            timer1.setStyle("-fx-text-fill: #FEF6F8;");
            TimerID.setStyle("-fx-background-color: #1A53FF;");
            TimerID.setPrefWidth(pane1.getPrefWidth()
                    - pane1.getPrefWidth() * remainingTime / workPeriod
            );
            WorkLabelID.setText("Sweet Long Rest!");
            WorkLabelID.setStyle("-fx-text-fill: #FEF6F8;");
        });
    }

    private void freeworkFunc() {

        if (remainingTime <= 3000 && remainingTime > 2000)
           // if (mediaPlayer != null)
            //     mediaPlayer.play();
            ;
        Platform.runLater(() -> {

            long sec = (remainingTime % 60000) / 1000 % 60;
            long min = remainingTime / 60000;
            System.out.println("com.elltechs.pomodoro.PrimaryController.freeworkFunc() " + remainingTime);
            timer1.setText(String.format("%02d:%02d", min, sec));
            pane1.setStyle("-fx-background-color: #ff9900;");
            timer1.setStyle("-fx-text-fill: #FEF6F8;");
            TimerID.setStyle("-fx-background-color: #ffb84d;");
            TimerID.setPrefWidth(pane1.getPrefWidth()
                    - pane1.getPrefWidth() * remainingTime / workPeriod
            );
            WorkLabelID.setText("FreeRunning Work Time!");
            WorkLabelID.setStyle("-fx-text-fill: #FEF6F8;");
        });
    }

}

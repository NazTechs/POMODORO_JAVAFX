# POMODORO_JAVAFX

This code is a JavaFX application that implements a Pomodoro Timer. The Pomodoro technique is a time management method used to increase productivity. The code uses a TimerTask to update the current state of the Pomodoro timer based on the current time. The current state can be one of five states: LONG REST, PAUSE, POMODORO, SHORT REST, and FREE WORKING.

![SEQ3](https://user-images.githubusercontent.com/24310606/217923360-1a5977bf-5199-490f-b5f0-2ef2b33a83e0.gif)

The code also includes methods for each state: longrestFunc(), pauseFunc(), pomodoroFunc(), shortrestFunc(), and freeworkFunc(). For example, the pomodoroFunc() method is executed when the state is set to POMODORO. In this method, the remaining time of the current POMODORO state is calculated and displayed on the timer. The code also includes some media player functionality, but it's commented out.
![image](https://user-images.githubusercontent.com/24310606/217923255-299a8a90-6d11-4f97-82b7-a30969a323d7.png)

# POMODORO_JAVAFX

The code is a JavaFX-based Pomodoro timer, which is optimized for running on a Banana Pi M2 Zero device with an Allwinner H2 processor. The code implements a Pomodoro timer, which is a time management technique that helps individuals to work efficiently by breaking work into intervals, usually 25 minutes in length, separated by short breaks. The Pomodoro timer is designed to increase productivity and focus.

The code consists of a main class called "PrimaryController" that implements the Initializable interface. The class has several instance variables that are used to store the state of the timer, the current time, and the remaining time. It also contains several switch cases that determine what actions to take based on the state of the timer.



![SEQ3](https://user-images.githubusercontent.com/24310606/217923360-1a5977bf-5199-490f-b5f0-2ef2b33a83e0.gif)

The "initialize" method creates a timer and a timer task that updates the time and state of the timer every second. The method also implements switch cases that determine what actions to take based on the state of the timer, such as playing a sound when the timer is in the pomodoro state and the remaining time is less than three seconds.

The code also includes several private methods such as "pauseFunc," "pomodoroFunc," "shortrestFunc," and "freeworkFunc," which are called by the switch cases in the "initialize" method to carry out the appropriate actions for each state of the timer.
![image](https://user-images.githubusercontent.com/24310606/217923255-299a8a90-6d11-4f97-82b7-a30969a323d7.png)

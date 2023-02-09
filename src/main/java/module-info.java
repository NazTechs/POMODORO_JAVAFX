module com.elltechs.pomodoro {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.lang;
    requires javafx.media;
    opens com.elltechs.pomodoro to javafx.fxml;
    exports com.elltechs.pomodoro;
}

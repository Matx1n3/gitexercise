module eus.ehu.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.gitexercise to javafx.fxml;
    exports eus.ehu.gitexercise;
}
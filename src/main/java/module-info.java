module eus.ehu.lab1 {
  requires javafx.controls;
  requires javafx.fxml;

  opens eus.ehu.presentation to javafx.fxml;
  exports eus.ehu.presentation;
}

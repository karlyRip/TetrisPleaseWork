module com.example.tetrispleasework {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tetrispleasework to javafx.fxml;
    exports com.example.tetrispleasework;
}
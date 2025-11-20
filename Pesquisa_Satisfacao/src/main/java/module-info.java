module com.example.pesquisa_satisfacao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pesquisa_satisfacao to javafx.fxml;
    exports com.example.pesquisa_satisfacao;
}
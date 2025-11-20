package com.example.pesquisa_satisfacao;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class ApplicationGUI extends Application {

    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();
        VBox leftmenu = new VBox(10);
        leftmenu.setPadding(new Insets(10));

        Label menuTitle = new Label("Pesquisa Sobre IA's");
        Button btnIdnt = new Button("Identificação");
        Button btnFormulario = new Button("Formulario");
        Button btnIntegracao = new Button("Integração");


        menuTitle.setPrefSize(130, 50);
        menuTitle.setAlignment(Pos.CENTER);
        menuTitle.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        btnIdnt.setPrefSize(130, 50);
        btnIntegracao.setPrefSize(130, 50);
        btnFormulario.setPrefSize(130, 50);

        leftmenu.getChildren().addAll(
                menuTitle,
                btnIdnt,
                btnFormulario,
                btnIntegracao
        );


        // Deve ter um jeito facil de fazer ir direto pro formulario mas eu nao sei como
        Label firsInfo = new Label("Escolha o Formulario");
        StackPane contentArea = new StackPane(firsInfo);

        // espaço para set action
        btnIdnt.setOnAction(e -> contentArea.getChildren().setAll(Identificacao()));
        btnFormulario.setOnAction(e -> contentArea.getChildren().setAll(Formulario()));
        btnIntegracao.setOnAction(e -> contentArea.getChildren().setAll(Integracao()));

        root.setLeft(leftmenu);
        root.setCenter(contentArea);


        Scene scene = new Scene(root, 800, 500);

        stage.setScene(scene);
        stage.setTitle("Pesquisa Satisfação");
        stage.show();

    }

    private VBox Identificacao(){
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Label lblTitulo = new Label("Identificação");
        lblTitulo.setPrefSize(Double.MAX_VALUE, 50);
        lblTitulo.setAlignment(Pos.CENTER);
        lblTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        //Caixa de texto do nome
        TextField txtNome = new TextField();
        txtNome.setPromptText("Digite seu nome");

        //Caixa de texto perguntando idade
        TextField txtIdade = new TextField();
        txtIdade.setPromptText("Digite sua idade");

        //Caixa de texto pergutando a função
        ComboBox<String> cBFuncao = new ComboBox<>();
        cBFuncao.setValue("Qual o seu departamento na empresa");
        cBFuncao.getItems().addAll("TI","Marketing","RH");
        cBFuncao.setPrefSize(Double.MAX_VALUE, 0);

        Region spacer = new Region();
        spacer.setMinHeight(20);

        Button btnSave = new Button("Enviar Formulario");
        btnSave.setPrefSize(Double.MAX_VALUE, 50);
        btnSave.setOnAction(e -> showAlert("Sucesso", "Formulario enviado com sucesso"));

        vbox.getChildren().addAll(lblTitulo,txtNome,txtIdade,cBFuncao,spacer,btnSave);
        return  vbox;
    }


    private VBox Formulario(){

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Label lblTitulo = new Label("Formulário");
        lblTitulo.setPrefSize(Double.MAX_VALUE, 50);
        lblTitulo.setAlignment(Pos.CENTER);
        lblTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        //Perguntas do formulario
        Label lblpergunta1 = new Label("Você está familiarizado com o uso de IA (Inteligencia Artificial)?");
        lblpergunta1.setPrefSize(Double.MAX_VALUE, 0);
        lblpergunta1.setAlignment(Pos.CENTER_LEFT);

        Label lblpergunta2 = new Label("Qual ambiente você mais utiliza as IAs (Casa ou Trabalho)?");
        lblpergunta2.setAlignment(Pos.CENTER);

        Label lblpergunta3 = new Label("Qual o principal uso da IA nesse ambiente (pesquisas simples ou automação de processos)?");
        lblpergunta3.setAlignment(Pos.CENTER);

        Label lblpergunta4 = new Label("Em quais momentos você acha necessario o uso da IA? ");
        lblpergunta4.setAlignment(Pos.CENTER);



        //Respostas do formulario
        TextField txtResposta1 = new TextField();
        txtResposta1.setAlignment(Pos.CENTER_LEFT);

        TextField txtResposta2 = new TextField();
        txtResposta2.setAlignment(Pos.CENTER_LEFT);

        TextField txtResposta3 = new TextField();
        txtResposta3.setAlignment(Pos.CENTER_LEFT);

        TextField txtResposta4 = new TextField();
        txtResposta4.setAlignment(Pos.CENTER_LEFT);


        Region spacer = new Region();
        spacer.setMinHeight(20);

        Button btnEnviar = new Button("Enviar Formulario");
        btnEnviar.setPrefSize(Double.MAX_VALUE, 50);
        btnEnviar.setOnAction(e -> showAlert("Sucesso", "Formulario enviado com sucesso"));

        vbox.getChildren().addAll(lblTitulo,lblpergunta1,txtResposta1,lblpergunta2,txtResposta2,lblpergunta3,txtResposta3,lblpergunta4,txtResposta4,spacer,btnEnviar);
        return  vbox;

    }

    private VBox Integracao(){

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        Label lbtitulo = new Label("Integração");
        lbtitulo.setPrefSize(Double.MAX_VALUE, 50);
        lbtitulo.setAlignment(Pos.CENTER);
        lbtitulo.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        //Perguntas
        Label lblpergunta1 = new Label("Você apoiaria a integração de IA's oficialmente ao ambiente de trabalho?");
        lblpergunta1.setAlignment(Pos.CENTER);

        Label lblpergunta2 = new Label("Qual é o maior benefício da IA no seu trabalho? ");
        lblpergunta2.setAlignment(Pos.CENTER_LEFT);

        Label lblpergunta3 = new Label("Acredita que a IA tornará a sua função ou área de trabalho obsoleta nos próximos 10 anos?");
        lblpergunta3.setAlignment(Pos.CENTER_LEFT);

        ComboBox<String> cbPergunta3 = new ComboBox<>();
        cbPergunta3.getItems().addAll("Muito improvável", "Pouco provável", "Neutro", "Provável", "Muito provável");
        cbPergunta3.setPrefSize(Double.MAX_VALUE, 0);


        //Respostas

        TextField txtResposta1 = new TextField();
        txtResposta1.setAlignment(Pos.CENTER_LEFT);

        TextField txtResposta2 = new TextField();
        txtResposta2.setAlignment(Pos.CENTER_LEFT);

        Region spacer = new Region();
        spacer.setMinHeight(20);

        Button btnEnviar = new Button("Enviar Formulario");
        btnEnviar.setPrefSize(Double.MAX_VALUE, 50);
        btnEnviar.setOnAction(e -> showAlert("Sucesso", "Formulario enviado com sucesso"));


        vbox.getChildren().addAll(lbtitulo,lblpergunta1,txtResposta1,lblpergunta2,txtResposta2,lblpergunta3,cbPergunta3,spacer,btnEnviar);
        return  vbox;


    }

    private void showAlert(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(titulo);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    public static void main(String[] args) {launch();}
}

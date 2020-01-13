package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene startup, game_intro,starting_game,
            scene1, scene1_win, scene1_setup, //(set up for next scene)
            scene2, scene2_win, scene2_setup,
            scene3, scene3_win, scene3_setup,
            scene4, scene4_win, scene4_setup,
            scene5, scene5_win, scene5_setup,
            scene6, scene6_win, scene6_setup,
            scene7, scene7_win, scene7_setup,
            scene8, scene8_win, scene8_setup,
            scene9, scene9_win, scene9_setup,
            scene10, scene10_win, credits;


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        //Startup Label and buttons
        Label welcome = new Label("Welcome to the guessing game! Do you know how the game works?");
        Button welcome_butt_yes = new Button("Yes");
        Button welcome_butt_no = new Button("No");
        welcome_butt_yes.setOnAction(e -> window.setScene(starting_game));
        welcome_butt_no.setOnAction(e -> window.setScene(game_intro));

        //Startup layout
        VBox start_up = new VBox();
        start_up.getChildren().addAll(welcome, welcome_butt_yes,welcome_butt_no);
        start_up.setAlignment(Pos.CENTER);
        startup = new Scene (start_up, 500,500);




        //Game intro : Label and buttons
        Label intro_text = new Label("I see. This is how the game works. You will think of a number from \n1 to 100000 and I will " +
                "read you mind and find it... eventually. \n\nha. ha. ha. \n\nAnyways, think of that number and click 'I AM SO READY' when you are SO READY!\n");
        Button intro_butt_ready = new Button("I AM SO READY!");
        intro_butt_ready.setOnAction(e -> window.setScene(starting_game));

        //Game intro : Layout
        VBox intro_lay = new VBox();
        intro_lay.getChildren().addAll(intro_text, intro_butt_ready);
        intro_lay.setAlignment(Pos.CENTER);
        game_intro = new Scene (intro_lay,500,500);




        //Game starting : Label and buttons
        Label starting_label = new Label("Though I do not have a mind because I am a program I sure can read them. ha. ha. ha." +
                "\nHave you thought of your number? If you have, please begin game!");
        Button starting_butt_begin = new Button("Begin");
        starting_butt_begin.setOnAction(e -> window.setScene(scene1));

        //Game starting : layout
        VBox starting_lay = new VBox();
        starting_lay.getChildren().addAll(starting_label,starting_butt_begin);
        starting_lay.setAlignment(Pos.CENTER);
        starting_game = new Scene(starting_lay, 500,500);




        //Scene 1 : Labels and Buttons
        Label scene1_label = new Label("Alright, Lets begin... hmmmmm What should I guess...... \n\n\nis your number 50000?");
        Button scene1_butt_yes = new Button("Yes!");
        Button scene1_butt_no = new Button("No");
        scene1_butt_yes.setOnAction(e -> window.setScene(scene1_win));
        scene1_butt_no.setOnAction(e -> window.setScene(scene2));

        //Scene 1 : layout
        VBox scene1_lay = new VBox();
        scene1_lay.getChildren().addAll(scene1_label, scene1_butt_yes, scene1_butt_no);
        scene1_lay.setAlignment(Pos.CENTER);
        scene1 = new Scene(scene1_lay,1500,200);




        //Scene1 Win



        window.setScene(startup);
        window.setTitle("Guessing Game");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

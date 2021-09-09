package ex02;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		Controller ctl = loader.getController();
		ctl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("fx08.ex02.video");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

/*
 media(영상) 설정시 추가 설정 필요 : ﻿
${javafxCompControls},javafx.fxml,javafx.web
*/


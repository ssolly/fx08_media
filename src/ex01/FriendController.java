package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class FriendController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

	public void add() {
		System.out.println("친구추가 버튼 클릭");
	}
	
	public void back() {
		System.out.println("이전으로 돌아가기 클릭");
	}
}

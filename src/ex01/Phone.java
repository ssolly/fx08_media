package ex01;

import javafx.beans.property.SimpleStringProperty;

public class Phone {

			//fx에서 쓰는 String
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;
	
	public Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}

	public String getSmartPhone() {
		return smartPhone.get();
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
	}

	public String getImage() {
		return image.get();
	}

	public void setImage(String image) {
		this.image = new SimpleStringProperty(image);
	}
	
	
}

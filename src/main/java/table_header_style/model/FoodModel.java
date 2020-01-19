package table_header_style.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FoodModel {

	public FoodModel() {
		this(null, "");
	}

	public FoodModel(Integer id, String name) {
		this.id = new SimpleObjectProperty<>(id);
		this.name = new SimpleStringProperty(name);
	}

	private ObjectProperty<Integer> id;
	private StringProperty name;

	public Integer getId() {
		return id.get();
	}

	public ObjectProperty<Integer> idProperty() {
		return id;
	}

	public void setId(Integer id) {
		this.id.set(id);
	}

	public String getName() {
		return name.get();
	}

	public StringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}
}

package table_header_style.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FoodModel {

	public FoodModel() {
		this(null, "");
	}

	public FoodModel(Long id, String name) {
		this.id = new SimpleObjectProperty<>(id);
		this.name = new SimpleStringProperty(name);
	}

	private ObjectProperty<Long> id;
	private StringProperty name;

	public Long getId() {
		return id.get();
	}

	public ObjectProperty<Long> idProperty() {
		return id;
	}

	public void setId(Long id) {
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

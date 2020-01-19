package table_header_style.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import table_header_style.model.FoodModel;

import java.net.URL;
import java.util.ResourceBundle;

public class TableHeaderStyleController implements Initializable {

	@FXML
	private TableView<FoodModel> mainTable;
	@FXML
	private TableColumn<FoodModel, Long> idCol;
	@FXML
	private TableColumn<FoodModel, String> nameCol;

	// データ
	private ObservableList<FoodModel> data = FXCollections.observableArrayList(
			new FoodModel(1, "寿司")
			, new FoodModel(2, "うどん")
			, new FoodModel(3, "カレーライス")
			, new FoodModel(4, "天ぷら")
	);

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		mainTable.setItems(data);
	}
}

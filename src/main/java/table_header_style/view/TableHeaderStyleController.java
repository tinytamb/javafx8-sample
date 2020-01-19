package table_header_style.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

	}
}

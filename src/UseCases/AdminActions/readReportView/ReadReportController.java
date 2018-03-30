package UseCases.AdminActions.readReportView;

import java.util.*;

import JavaFxUI.ViewManager;
import domain.*;
import facade.FacadeManageUser;
import facade.FacadeReadReport;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * 
 */
public class ReadReportController {


    @FXML
    private ScrollPane reportBox;


    private String username;


    private String storyname;

    private Date date;


    public void delete(ActionEvent event) {
        // TODO implement here
        return;
    }

    public void init() {
        //FacadeReadReport.getFacadeReadReport().getLatestReport()
    	Set<Report> reports = null;
    	reports = new HashSet<Report>();
    	reports.add(new Report());
    	reports.add(new Report());
    	setReportList(reports);
        
    }
    
    private void setReportList(Set<Report> reports) {
    	VBox grosConteneur = new VBox();
    	for(Report report : reports) {
    		grosConteneur.getChildren().add(createLittleVBox(report));
    		
    	}
    	
    	
    	reportBox.setContent(grosConteneur);
    	
    }
    
    
    private VBox createLittleVBox(Report report) {
    	VBox newVbox = new VBox();
    	HBox newHbox =new HBox();
    	Label dateLabel = new Label("date"); //report.getDate().toString()
    	Label reasonLabel = new Label("raison");//report.getreason()
    	Label targetLabel = new Label("accuse");//report.getstory().getTitle() + " : page " + report.page.pagenumber
    	Button unreview = new Button("X");
    	unreview.setOnAction(new HideHandler(newVbox,report));// faire une classe perso et lui passer la vbox pour la hide
    	
    	newHbox.getChildren().add(unreview);
    	newHbox.getChildren().add(dateLabel);
    	newHbox.getChildren().add(targetLabel);
    	newHbox.getChildren().add(reasonLabel);
    	
    	
    	VBox expandedBox = new VBox();
    	expandedBox.setOnMouseReleased(ev -> {
    		Page page = FacadeReadReport.getFacadeReadReport().getPage("demoStory", 1);
    		Story story = FacadeReadReport.getFacadeReadReport().getStory("demoStory");
    		ViewManager.goToStoryPage(page, story);
    	});
    	
    	Button expandButton = new Button("expand");
    	expandButton.setOnAction(new HideAndShowHandler(expandedBox));
    	newHbox.getChildren().add(expandButton);
    	
    	newVbox.getChildren().add(newHbox);
    	
    	
    	TextFlow reasonTextFlow = new TextFlow();
    	reasonTextFlow.getChildren().add(new Text("blablabla lorem ipsum doloris sit amen mon Luke")); //report.getText()
    	Label reportNumberLabel = new Label("a ete reporte x fois"); // "cette page a ete reporte " + report.getNbreport() + " fois"
    	Label reportUserLabel = new Label("reporte par une personne");// "report realise par " + report.getUser().getUsername()
    	
    	
    	
    	
    	expandedBox.getChildren().add(reasonTextFlow);
    	expandedBox.getChildren().add(reportUserLabel);
    	expandedBox.getChildren().add(reportNumberLabel);
    	
    	expandedBox.setVisible(false);
    	newVbox.getChildren().add(expandedBox);
    	
    	return newVbox;
    }

    
    class HideAndShowHandler implements EventHandler<ActionEvent>{
    	Node node;
    	HideAndShowHandler(Node e){
    		this.node = e;
    	}
		@Override
		public void handle(ActionEvent event) {
			if(node.isVisible()==true) {
				node.setVisible(false);
			}
			else {
				node.setVisible(true);
			}
		}
    	
    }
    class HideHandler implements EventHandler<ActionEvent>{
    	Node node;
    	Report report;
    	HideHandler(Node e,Report report){
    		this.node = e;
    		this.report = report;
    	}
		@Override
		public void handle(ActionEvent event) {
			node.setVisible(false);
			
			
		}
    	
    }

    private void changeDisplayedReport(Report[] replist) {
        // TODO implement here
        return;
    }

    /**
     * @param event ActionEvent 
     * @return
     */
    public void displayReportByDate(ActionEvent event) {
        // TODO implement here
        return;
    }

    /**
     * @param event ActionEvent 
     * @return
     */
    public void displayReportByStory(ActionEvent event) {
        // TODO implement here
        return;
    }

    /**
     * @param event ActionEvent 
     * @return
     */
    public void displayReportByUser(ActionEvent event) {
        // TODO implement here
        return;
    }

    public void displatMultiSearchResult(ActionEvent event) {
        // TODO implement here
        return;
    }

}
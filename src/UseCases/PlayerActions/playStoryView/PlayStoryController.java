package UseCases.PlayerActions.playStoryView;

import java.util.*;

import JavaFxUI.ViewManager;
import domain.Link;
import domain.Page;
import domain.Story;
import facade.FacadePlayStory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

/**
 * 
 */
public class PlayStoryController {

	private Story story;
	private Page page;
	
	@FXML ScrollPane linksBox;
	@FXML TextFlow text1;
	@FXML TextFlow text2;

	protected void setStory(Story story) {
		this.story = story;
	}
	protected void setPage(Page page) {
		this.page = page;
		text1.getChildren().add(new Text(page.text1));
		text2.getChildren().add(new Text(page.text2));
		
		// Set Buttons to next pages.
		Button newButton;
		HBox newHBox = new HBox(10);
		newHBox.setFillHeight(true);
		linksBox.setContent(newHBox);
		for(Link link : this.page.links) {
			newButton = new Button(link.linkText);
			newButton.setStyle("-fx-pref-width:200; -fx-pref-height: 45");
			newButton.setWrapText(true);
			newButton.setTextAlignment(TextAlignment.LEFT);
			newButton.setAlignment(Pos.TOP_LEFT);
			newHBox.getChildren().add(newButton);
			newButton.setOnAction(new LinkHandler(link));
		}
	}
	
	class LinkHandler implements EventHandler<ActionEvent>{
    	private Link link;
    	public LinkHandler(Link link) {
    		this.link = link;
    	}
		@Override
		public void handle(ActionEvent event) {
			Page nextPage = FacadePlayStory.getFacade().getNextPage(story.title, link.nextPage);
			ViewManager.goToStoryPage(nextPage, story);
		}
    }

    public void quitToStoryInfo(ActionEvent event) {
    	ViewManager.goToStoryInfo(story);
    }

    public void load(ActionEvent event) {
    
    }

    public void saveProgression(ActionEvent event) {
       
    }
}



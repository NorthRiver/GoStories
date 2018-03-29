package UseCases.PlayerActions.storyInfoView;

import java.util.*;

import JavaFxUI.ViewManager;
import domain.*;
import facade.FacadeStoryInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

/**
 * 
 */
public class StoryInfoController {
	
	@FXML private Label storyTitleLabel;
	@FXML private Label authorLabel;
	@FXML private Label ratingsLabel;
	@FXML private Label tagsLabel;
	@FXML private TextArea sumupArea;
	@FXML private Button callButton;
	
	private Story story;
	
	protected void setStory(Story story) {
		this.story = story;
    	storyTitleLabel.setText(this.story.title);
    	authorLabel.setText(this.story.authorName);
    	sumupArea.setText(this.story.sumUp);
    	callButton.setText("Buy : " + this.story.price + "$");
    	
//    	int ratingsSum = 0;
//    	for(Rating rating: story.ratings) {
//    		ratingsSum += rating.ratingValue;
//    	}
//    	ratingsLabel.setText("Rating: " + ratingsSum/story.ratings.size());
//    	
//    	tagsLabel.setText("Tags: Fantasy, Dragons, red");
	}


    public void buy(ActionEvent event) {
       
    }

    public void play(ActionEvent event) {
        
    }

    public void watchAuthor() {
    	User author = FacadeStoryInfo.getFacade().getAuthor(story.authorName);
    	ViewManager.goToUserProfile(author);
    }

}

package c.o.a.s.t;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import static javafx.scene.control.Tooltip.install;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Kevin Navarro
 */
public class ActiveTurn extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Character char1 = new Monk("Tom", 2, "human");
        Stage openingStage = new Stage();
        openingStage.setTitle("C.O.A.S.T.");
        openingStage.setResizable(false);
        Button enterTheCoast = new Button("Welcome to the C.O.A.S.T.");//Opening window to greet the user
        enterTheCoast.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                openingStage.hide();
            }
        });
        openingStage.setScene(new Scene(enterTheCoast, 300, 50));
        openingStage.showAndWait();
        
        Option attack = new Action();//initializing game actions here till i figure out how to invoke it from action class.
        Option castSpell = new Action();
        Option dash = new Action();
        Option disengage = new Action();
        Option dodge = new Action();
        Option help = new Action();
        Option hide = new Action();
        Option ready = new Action();
        Option search = new Action();
        Option object = new Action();
        Option improvise = new Action();
        
        Stage reactionStage = new Stage();//stage for the reactions menu
        reactionStage.setWidth(300);
        reactionStage.setHeight(300);
        reactionStage.setResizable(false);
        reactionStage.setTitle("Available reactions");
        
        Button reactionBtn = new Button();//main menu reaction button
        reactionBtn.setText("Reaction");
        reactionBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                reactionStage.show();
            }
        });
        
        Button opportunityAttackBtn = new Button();
        opportunityAttackBtn.setText("Opportunity Attack");
        opportunityAttackBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                reactionStage.hide();
                reactionBtn.setDisable(true);
            }
        });
        
        Button improviseReactionBtn = new Button();
        improviseReactionBtn.setText("Improvise reaction");
        improviseReactionBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                reactionStage.hide();
                reactionBtn.setDisable(true);
            }
        });
        
        Button useReadiedActionBtn = new Button(); //set the default to false so that it can be available should the user use the ready action
        useReadiedActionBtn.setText("Readied Action");
        useReadiedActionBtn.setDisable(true);
        useReadiedActionBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                reactionStage.hide();
                reactionBtn.setDisable(true);
            }
        });
        
        VBox reactionMenu = new VBox();
        reactionMenu.setSpacing(2);
        reactionMenu.getChildren().add(opportunityAttackBtn);
        reactionMenu.getChildren().add(improviseReactionBtn);
        reactionMenu.getChildren().add(useReadiedActionBtn);
        
        Scene reactionScene = new Scene(reactionMenu, 300, 300);
        reactionStage.setScene(reactionScene);
        
        Stage bonusActionStage = new Stage();//window where you can see what acitons you can take this turn
        bonusActionStage.setWidth(300);
        bonusActionStage.setHeight(300);
        bonusActionStage.setResizable(false);
        bonusActionStage.setTitle("Available bonus actions");
        
        Button bonusActionBtn = new Button();
        bonusActionBtn.setText("Bonus Actions");
        bonusActionBtn.setOnAction(new EventHandler<ActionEvent>(){//see the available bonus actions
        
            @Override
            public void handle(ActionEvent event){
                bonusActionStage.show();
            }
        });
        
        Button unarmedStrikeBtn = new Button();
        unarmedStrikeBtn.setText("Unarmed strike");
        unarmedStrikeBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                bonusActionStage.hide();
                bonusActionBtn.setDisable(true);
            }
        });
        Button flurryOfBlowsBtn = new Button();
        flurryOfBlowsBtn.setText("Flurry of blows");
        flurryOfBlowsBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                bonusActionStage.hide();
                bonusActionBtn.setDisable(true);
            }
        });
        Button patientDefenseBtn = new Button();
        patientDefenseBtn.setText("Patient defense");
        patientDefenseBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                bonusActionStage.hide();
                bonusActionBtn.setDisable(true);
            }
        });
        Button stepOfTheWindBtn = new Button();
        stepOfTheWindBtn.setText("Step of the wind");
        stepOfTheWindBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                bonusActionStage.hide();
                bonusActionBtn.setDisable(true);
            }
        });
        
        VBox bonusActionMenu = new VBox();
        bonusActionMenu.setSpacing(1.5);
        bonusActionMenu.getChildren().add(unarmedStrikeBtn);
        bonusActionMenu.getChildren().add(flurryOfBlowsBtn);
        bonusActionMenu.getChildren().add(patientDefenseBtn);
        bonusActionMenu.getChildren().add(stepOfTheWindBtn);
        
        Scene bonusActionScene = new Scene(bonusActionMenu, 300, 300);
        bonusActionStage.setScene(bonusActionScene);
        
        Stage actionStage = new Stage();//window where you can see what acitons you can take this turn
        actionStage.setWidth(300);
        actionStage.setHeight(300);
        actionStage.setResizable(false);
        actionStage.setTitle("Available actions");
        
        Button actionBtn = new Button();
        actionBtn.setText("Actions");
        actionBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.show();
            }
        });
        
        Button attackBtn = new Button();//Button a player can take to use the attack action. Subsequent buttons do the same respective to their name.
        attackBtn.setText("Attack");
        attackBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button dashBtn = new Button();
        dashBtn.setText("Dash");
        dashBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button disengageBtn = new Button();
        disengageBtn.setText("Disengage");
        disengageBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button dodgeBtn = new Button();
        dodgeBtn.setText("Dodge");
        dodgeBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button helpBtn = new Button();
        helpBtn.setText("Help");
        helpBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button hideBtn = new Button();
        hideBtn.setText("Hide");
        hideBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button readyBtn = new Button();
        readyBtn.setText("Ready");
        readyBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
                useReadiedActionBtn.setDisable(false);
            }
        });
        Button searchBtn = new Button();
        searchBtn.setText("Search");
        searchBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button objectBtn = new Button();
        objectBtn.setText("Free object interaction");
        objectBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        Button improviseBtn = new Button();
        improviseBtn.setText("Improvise");
        improviseBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                actionStage.hide();
                actionBtn.setDisable(true);
            }
        });
        
        VBox actionMenu = new VBox();
        actionMenu.setSpacing(1.5);
        actionMenu.getChildren().add(attackBtn);
        actionMenu.getChildren().add(dashBtn);
        actionMenu.getChildren().add(disengageBtn);
        actionMenu.getChildren().add(dodgeBtn);
        actionMenu.getChildren().add(helpBtn);
        actionMenu.getChildren().add(hideBtn);
        actionMenu.getChildren().add(readyBtn);
        actionMenu.getChildren().add(searchBtn);
        actionMenu.getChildren().add(objectBtn);
        actionMenu.getChildren().add(improviseBtn);
        
        Scene actionMenuScene = new Scene(actionMenu, 300, 300);
        actionStage.setScene(actionMenuScene);
        
        Button movementBtn = new Button();    //might change this in the future to detail how many feet you can move, right now it seems a bit pedantic
        movementBtn.setText("Movement");
        movementBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                movementBtn.setDisable(true);
            }
        });
        /**/
        Button objectInteractionBtn = new Button(); //made only to be gray out, items that require a use of object interaction will be put in the actions menu
        objectInteractionBtn.setText("Object Interaction");
        objectInteractionBtn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event){
                objectInteractionBtn.setDisable(true);
            }
        });
        /**/
        
        Button resetTurnBtn = new Button(); //resets everything to default states to start your turn over again
        resetTurnBtn.setText("Reset your turn");
        resetTurnBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionBtn.setDisable(false);
                bonusActionBtn.setDisable(false);
                objectInteractionBtn.setDisable(false);
                movementBtn.setDisable(false);
                reactionBtn.setDisable(false);
                useReadiedActionBtn.setDisable(true);
            }
        });
        
        Button characterBtn = new Button(); //just keeping this right now even though it only prints to console, will change to a display window with the char info
        characterBtn.setText("What's my character?");
        characterBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println(char1);
            }
        });
        
        HBox root = new HBox();
        VBox mainMenu = new VBox();
        mainMenu.getChildren().add(characterBtn);
        mainMenu.getChildren().add(actionBtn);
        mainMenu.getChildren().add(bonusActionBtn);
        mainMenu.getChildren().add(movementBtn);
        mainMenu.getChildren().add(objectInteractionBtn);
        mainMenu.getChildren().add(reactionBtn);
        
        root.getChildren().add(mainMenu);
        root.getChildren().add(resetTurnBtn);
        root.spacingProperty().bind(root.widthProperty().divide(4));
                
        Scene scene = new Scene(root, 300, 250);
                
        primaryStage.setTitle("C.O.A.S.T.");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

package fr.univ_amu.iut;
import client1.application;
import com.sun.tools.javac.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.util.NodeQueryUtils.hasText;


@ExtendWith(ApplicationExtension.class)
public class AccueilTest {

    Pane mainroot;
    Stage mainstage;
    Stage stage;
    @BeforeEach
    public void setUpClass() throws Exception {
        ApplicationTest.launch(application.class);
    }

    @Start
   public void onStart(Stage stage) throws Exception {
        this.stage = stage;
    }

    @Test
    public void test_should_never_fail() {
        assertThat(true).isTrue();
    }

    @Test
   public void should_initialize_stage_with_correct_title() {
        assertThat(stage.getTitle()).isEqualTo("Application DNE");
    }

    @Test
    public void background_color() {
        //verifyThat().;
    }

    /* Tests bouton page accueil */
    @Test
    public void should_initialize_button_with_text_click() {
        verifyThat("#btnapp", hasText("Accéder à l'application"));
    }
    @Test
    public void bouton_accueil_emmene_application() {
            clickOn("#btnapp");

    }



    private void clickOn(String s) {
    }
}



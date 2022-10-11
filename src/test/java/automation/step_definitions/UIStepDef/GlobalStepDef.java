package automation.step_definitions.UIStepDef;


import com.automation.pages.GlobalPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class GlobalStepDef {

  GlobalPage globalPage=new GlobalPage();
Actions actions=new Actions(Driver.getDriver());
    @When("User is on MainPage")
    public void user_is_on_main_page() {
        Driver.getDriver().get(
                "https://www.globalplayer.com/live/capital/uk/");
      BrowserUtils.sleep(5);
    }
    @When("User clicks accept button")
    public void userClicksAcceptButton() {
        //BrowserUtils.sleep(5);
        //BrowserUtils.hover(globalPage.accept);
        BrowserUtils.doubleClick(globalPage.accept);

    }
    @When("User clicks the popUp")
    public void user_clicks_the_pop_up() {


      globalPage.closePopUp.click();
      BrowserUtils.sleep(5);
    }
    @When("User clicks the playlist")
    public void user_clicks_the_playlist() {
 globalPage.playList.click();
    }
    @When("User  clicks the live  Playlists")
    public void user_clicks_the_live_playlists() {
        globalPage.LivesongList.size();
    }


}

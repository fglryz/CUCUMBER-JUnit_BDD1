package automation.pages;

import automation.utilities.Driver;

public class PageInitializer extends Driver {
    public static TaskPage taskPage;
    public static LogInPage loginPage;
    public static PoolPage poolPage;
    public static MessagePage messagePage;

    public static  void initialize(){
        taskPage=new TaskPage();
        loginPage=new LogInPage();
        poolPage=new PoolPage();
        messagePage=new MessagePage();
    }
}

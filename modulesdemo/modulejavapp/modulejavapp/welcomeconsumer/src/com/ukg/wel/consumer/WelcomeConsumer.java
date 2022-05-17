package com.ukg.wel.consumer;

import com.ukg.welcome.Welcome;
import com.ukg.welcome.parent.WelcomeParent;

import java.sql.Connection;

public class WelcomeConsumer {
    public String getWelcome() {
        Welcome welcome = new Welcome();
        WelcomeParent welcomeParent = new WelcomeParent();
        return welcome.sayWelcome();
    }
    public void connect(){
        Connection connection = null;
    }
}

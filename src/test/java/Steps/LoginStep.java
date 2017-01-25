package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 1/23/2017.
 */
public class LoginStep {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("Navigatge to page");

    }

    @And("^I enter the username as admin and passwrod$")
    public void iEnterTheUsernameAsAdminAndPasswrod() throws Throwable {
        System.out.println("enter the username as admin and passwrod");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("I should see the userform page");
    }

    @And("^I enter the username as \"([^\"]*)\" and as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndAs(String user, String password) throws Throwable {
        System.out.println("UserName is " + user + " and password is " + password);

    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
//         List<List<String>> data=  table.raw();
  /*       System.out.println("The Value is: " + data.get(0).get(0).toString());
         System.out.println("The Value is: " + data.get(0).get(1).toString());*/
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The user name is" + user.username);
            System.out.println("The username is" + user.password);

        }


    }



    @And("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String Uname, String Pword) throws Throwable {
        System.out.println("Username is "+Uname);
        System.out.println("Password is "+Pword);


    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}

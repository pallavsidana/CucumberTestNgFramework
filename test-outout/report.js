$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/pallav.sidana/eclipse-workspace/CucumberPOM/src/main/java/com/qa/features/qaClick.feature");
formatter.feature({
  "line": 1,
  "name": "qaClickAcademy application Test",
  "description": "",
  "id": "qaclickacademy-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate QAClick Academy Home Page Test",
  "description": "",
  "id": "qaclickacademy-application-test;validate-qaclick-academy-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user opens browsers",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Validate logged in usrname label is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browsers()"
});
formatter.result({
  "duration": 13022619000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 20000359100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat com.qa.pages.LoginPage.popup(LoginPage.java:43)\r\n\tat com.qa.stepDefinitions.HomePageSteps.user_is_on_Login_Page(HomePageSteps.java:28)\r\n\tat ✽.Then user is on Login Page(C:/Users/pallav.sidana/eclipse-workspace/CucumberPOM/src/main/java/com/qa/features/qaClick.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_click_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.home_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_usrname_label_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});
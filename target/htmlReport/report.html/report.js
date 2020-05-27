$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/guru99/features/logFunctionality.feature");
formatter.feature({
  "name": "user credentials",
  "description": "  as a customer\n  i want the ability to loging in to website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify manager Id after successfly logined",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i navigate to guru HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "logFunctionalitySteps.i_navigate_to_guru_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter vaild user ID as \"mngr261507\"",
  "keyword": "When "
});
formatter.match({
  "location": "logFunctionalitySteps.i_enter_vaild_user_ID_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter valid password as \"jAjEmEd\"",
  "keyword": "And "
});
formatter.match({
  "location": "logFunctionalitySteps.i_enter_valid_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "logFunctionalitySteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is successfully logged in and manger ID should be dispalyed as \"Manger I : mngr261507\"",
  "keyword": "Then "
});
formatter.match({
  "location": "logFunctionalitySteps.user_is_successfully_logged_in_and_manger_ID_should_be_dispalyed_as(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.guru99.pages.ManagerHomePage.verfiyMngrID(ManagerHomePage.java:33)\n\tat com.guru99.stepDefinitions.logFunctionalitySteps.user_is_successfully_logged_in_and_manger_ID_should_be_dispalyed_as(logFunctionalitySteps.java:80)\n\tat ✽.user is successfully logged in and manger ID should be dispalyed as \"Manger I : mngr261507\"(file:src/test/java/com/guru99/features/logFunctionality.feature:60)\n",
  "status": "failed"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});
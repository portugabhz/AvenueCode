$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ToDoApp.feature");
formatter.feature({
  "line": 1,
  "name": "Test Create Task Scenario",
  "description": "",
  "id": "test-create-task-scenario",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13896208300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Check for My Tasks link on navigation bar",
  "description": "",
  "id": "test-create-task-scenario;check-for-my-tasks-link-on-navigation-bar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am logged into ToDo Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I see loging in sucessfull",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I see My Tasks link on NavBar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on My Tasks link on NavBar",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.I_am_logged_into_ToDo_Application()"
});
formatter.result({
  "duration": 8098321243,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_see_loging_in_sucessfull()"
});
formatter.result({
  "duration": 64115174,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_see_My_Tasks_link_on_NavBar()"
});
formatter.result({
  "duration": 215369171,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_click_on_My_Tasks_link_on_NavBar()"
});
formatter.result({
  "duration": 1668428398,
  "status": "passed"
});
formatter.after({
  "duration": 3794446931,
  "status": "passed"
});
});
Feature: Test Create Task Scenario

Scenario: Check for My Tasks link on navigation bar
Given I am logged into ToDo Application
Then I see loging in sucessfull
And I see My Tasks link on Navigation Bar

Scenario: Click on My Tasks link on navigation bar
Given I am logged into ToDo Application
Then I see loging in sucessfull
When I see My Tasks link on NavBar
Then I click on My Tasks link on NavBar

Scenario: Add new task
Given I am logged into ToDo Application
Then I see loging in sucessfull
When I see My Tasks link on NavBar
Then I click on My Tasks link on NavBar
And enter new task

Scenario: Check for Manage SubTask button
Given I am logged into ToDo Application
Then I see loging in sucessfull
When I see My Tasks link on NavBar
Then I click on My Tasks link on NavBar
When I am on ToDo MyTask Page
Then I see Manage SubTask button

Scenario: Click on Manage SubTask button
Given I am logged into ToDo Application
Then I see loging in sucessfull
When I see My Tasks link on NavBar
Then I click on My Tasks link on NavBar
When I am on ToDo MyTask Page
Then I see Manage SubTask button
And I click on Manage SubTask button
When I see subTask pop page 
Then I close sub task popup

Scenario: Add new SubTask
Given I am logged into ToDo Application
Then I see loging in sucessfull
When I see My Tasks link on NavBar
Then I click on My Tasks link on NavBar
When I am on ToDo MyTask Page
Then I see Manage SubTask button
And I click on Manage SubTask button
When I see subTask pop page 
Then add new sub task
And I close sub task popup



Feature: I as a user want to authenticate in the application to check my credentials


  @auth_incorrect
  Scenario: check login with incorrect username and password
    When Catch older version pop_up
    When I login with username incompany and password company
    Then you should see the information toast


  @auth_correct
  Scenario: check login with correct username and password
    When Catch older version pop_up
    When I login with username company and password company
    Then you should see the home page




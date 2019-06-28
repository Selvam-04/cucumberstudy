 @tag
Feature: login


  @tag1
  Scenario Outline: signin
      Given  User enters SignIn
      Given  Users enters "<username>"
      When   User enters password "<password>"
      And    Click on login
      Then   Homepage is displayed
     
    Examples:
      | username    | password          | 
      | lalitha     | password123       | 
      

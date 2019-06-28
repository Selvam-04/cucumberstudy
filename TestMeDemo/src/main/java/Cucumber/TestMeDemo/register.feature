 @tag
Feature: Register

  @tag1
  Scenario: Signup Details
    Given user enters into TestMeApp
    Given User enters username as "Mukesh M"
    Given User enter firstname as "Mukesh"
    Given User enters lastname as "M" 
    And   User gives password as "Mukesh21@"
    And   User gives confirm password as "Mukesh21@"
    Then  User selects gender as "Male"
    Then  User gives email as "selva210797@gmail.com"
    And   User gives mobileno as "6383620183"
    And   User gives dob as "21/07/1997"
    Then  User gives address as "coimbatore"
    And   User clicks security question as "what is your birthplace"
    And   User gives answer as "Gandhipuram"
    When  User clicks register button "Login page is displayed"
   
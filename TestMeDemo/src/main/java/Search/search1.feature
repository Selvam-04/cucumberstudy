 @tag
 Feature: Search Item
 

  @tag1
  Scenario: Add item
    Given user is in homepage "lalitha" and "password123"
    When user enters "head" in searchbox
    Then user must be in addtocart page

  
   
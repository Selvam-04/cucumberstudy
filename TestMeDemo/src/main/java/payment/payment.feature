 
@tag
 
Feature: Add to Cart function
I want to use this template for my feature file

 
@tag
 
Scenario: user moves to cart without adding any item in it
 Given lalitha will  Login into TestMeApp
 When lalitha searches product "Headphones"
 And lalitha try to go to payment without adding any item in cart
 Then TestMEapp Doesn't display Cart Icon

 
@Pass
 Scenario: The one where the user moves to cart adding any item in it.
 Given lalitha has Login into the TestMeApp
 Given lalitha types "Head" in search box
 When lalitha Clicks Find Details Button
 And  Add the Product to cart
 Then Click the Cart Icon
 And  Quantity is given and click Checkout
 Then The User Redirected to Payments Page and Proceed to pay
 When The payment page is opened
 Then Order details is displayed
 
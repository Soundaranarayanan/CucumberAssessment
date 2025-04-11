@ValidAndInvalid
Feature: Login Functionality

  Scenario Outline: Login with valid and invalid credentials
    Given user is on the "https://tutorialsninja.com/demo/"
    When user clicks My Account
    And user clicks Login
    And User enters email "<email>" and password "<password>"
    And User clicks on Login button
    Then user should see "<status>" message

    Examples:
      |email                  |password      |status            |
      |2k21eee52@kiot.ac.in   |Kiot1234@     |My Account        |
      |vikram@gmail.com       |123           |Warning: No match for E-Mail Address and/or Password.|

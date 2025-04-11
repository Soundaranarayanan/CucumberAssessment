Feature: Registration Functionality

  @ValidCredentials
  Scenario Outline: Register a new user
    Given user is on the "https://tutorialsninja.com/demo/"
    When user clicks My Account
    And user clicks Register
    Then user should see the registration page
    And user enters required credentials "<firstName>" "<lastName>" "<email>" "<telephone>" "<password>" "<confirmPassword>"
    Then user should be registered successfully

    Examples:
      |firstName |lastName |email                 |telephone  |password  |confirmPassword |
      |giriii   |M        |2k21eee32@kiot.ac.in  |1236587890 |Kiot1234@ |Kiot1234@       |

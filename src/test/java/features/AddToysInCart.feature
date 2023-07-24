Feature: Check the addition to the shopping cart feature
  Background:
    Given user open the page
    And user insert the  username: "florentina.arcan02+test@gmail.com"
    And user click on the continue button
    And user insert the password: "Admin123!"
    When user click on login button
    Then user is login on the page

  Scenario: Check the addition to the shopping cart scenario
    Given user go to figures menu
    And user adds one figure to the shopping cart
    Then user go to puzzle menu
    And user add one puzzle to the shopping cart
    Then user go to educational games
    And user add one educational game to the shopping cart
    When user click on shopping cart
    Then user sees all objects added
    And user clears the shopping cart
    And user closes the browser
Feature: Simple Form Demo

  Scenario: As a user, I want to input form information, so that I can show a message.
    Given The user is on the simple form demo site.
    When The user enters a message into the Enter Message Field.
    When The user clicks the show message button.
    Then The user can see the message appear in the your message output.

  Scenario: As a user, I want to input two numbers, so that I can get the sum.
    Given The user is on the simple form demo site.
    When The user enters a number into the a input box.
    When The user enters a number into the b input box.
    When The user clicks the get total button.
    Then The total appears in the result area.
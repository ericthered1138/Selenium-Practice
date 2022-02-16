Feature: Select dropdown list form.

  Scenario: As a user, I want to select an item from the drop down list, so that I can pick something.
    Given The user is on the select drop down list page.
    When The user selects an item from the dropdown list.
    Then The day selected is there.

  Scenario: As a user, I want to select an item from a list, so that I can pick something.
    Given The user is on the select drop down list page.
    When The user selects a place.
    When The user clicks the first selected button.
    Then The place selected is there.
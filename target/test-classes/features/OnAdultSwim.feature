Feature: Be on adult swim.

  Scenario: As a user, I want to make sure that I am on adult swim, so that I can laugh
    Given The user is on adult swim.
    Then The user is definitely on adult swim.


  Scenario: As a user, I want to click on the shows link to be redirected to the shows page
    Given The user is on adult swim.
    When The user clicks on the shows button.
    Then The user is redirected to the shows page.

  Scenario: As a user, I want to watch an episode of Aqua Teen Hungerforce
    Given The user is on adult swim.
    When The user clicks on the shows button.
    When The user clicks on the Aqua Teen Hunger Force button.
    When The user clicks on the episode eight button.
    Then The user is on the episode eight page.

  Scenario Outline: As a user, I want to make different searches.
    Given The user is on adult swim.
    When The user inputs a "<query>" into the search bar.
    When The user clicks on the search button.
    Then The user is redirected to search results.
    When The user clicks on the "<episode>" in the search results.
    Then The user is on the "<episodeTitle>" page.
    Examples:
      | query        | episode                                                   | episodeTitle                                                |
      | mooninite    | /html/body/div[1]/div[2]/div/main/div/div/div[1]/a/div[1] | Revenge of the Mooninites - S1 EP8 - Aqua Teen Hunger Force |
      | dumber dolls | /html/body/div[1]/div[2]/div/main/div/div/div[1]/a/div[1] | Dumber Dolls - S1 EP13 - Aqua Teen Hunger Force             |
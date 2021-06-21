Feature: Search items feature
  Scenario: user able to search for java
    Given user opens the browser and navigate
    When user can see search bar
    Then user types java Books  In search bar
    And user can click on search button
    And user can see search result of java
    And user close the browser

Scenario Outline: user able to search for java
  Given user opens the browser and navigate
  When user can see search bar
  Then user types <bookname> In search bar
  And user can click on search button
  And user can see search result of java
  And user close the browser
  Examples:
  |bookname      |
  |data srructure|
  |selemium      |










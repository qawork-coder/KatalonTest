Feature: To enter the form inputs

  Scenario: Enter valid user Details
    Given User should launch the website
    When User enters the input Details
      | TJ         |
      | TJ         |
      | tj@tj.com  |
      | 8765432451 |
      | Male       |
      | Selenium   |
    Then click on submit button 
    And verify title

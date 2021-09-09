Feature: To enter the form inputs

  Scenario: Enter valid user Details1
    Given User should launch the website1
    When User enters the input Details1
      | firstName | TJ         |
      | lastName  | TJ         |
      | emailID   | tj@tj.com  |
      | PhoneNo   | 8765432451 |
      | Gender    | Male       |
      | Course    | Selenium   |
    Then click on submit button1

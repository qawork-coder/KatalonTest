@Feature
Feature: Sign Up

  Background: 
    Given User has opened the website

@Regression
  Scenario: Login with valid Credentials
    ## Given User has opened the website
    When User enters username mngr352172
    And User enters Password EdEdAzA
    Then Click on login
    
@Sanity
  Scenario: Login with Invalid Credentials
    ## Given User has opened the website
    When User enters username mngr352172
    And User enters Password tj
    Then Click on login

@Regression
  Scenario Outline: Login with multiple Credentials
    ## Given User has opened the website
    When User enters username <username>
    And User enters Password <password>
    Then Click on login

    Examples: 
      | username   | password |
      | mngr352172 | EdEdAzA  |
      | mngr352172 | EdEdAzA  |

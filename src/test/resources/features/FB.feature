Feature: FacebookLogin1
  To login facebook we have to enter the username and password

  Scenario: Facebook with invalid credentials1  
    Given As a user i am in the home pagea 
    When I have enter invalid credentialsa "<name>" and "<value>" 
      | Sachin |     abcd@100100 |
    Then It should not successfully logged ina
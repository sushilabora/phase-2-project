Feature: Login Feature Scenarios
  @Login 
  Scenario Outline: Verify Login Functionality with correct username and password
    Given : User has launched the swag labs application
    When User enters username"<UserName>"
    And User enters  password"<Password>"
    And User clicks on Login button
    Then User should be landed on the Products page

    Examples: 
      | User Name     | Password     |
      | Standard_user | secret_sauce |

  Scenario Outline: Verify Login Functionality with incorrect username and password
    Given : User has launched the Swag Labs application
    When User enters  username"<UserName>"
    And User enters  password"<Password>"
    And User clicks on Login button
    Then User should get error "<Error>"

    Examples: 
      | User Name | Password | Error                                                                   |
      | Std       | secre    | Epic sadface:Username and password  do not match any user in the series |

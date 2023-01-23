Feature: Login to ASAI

  @login
  Scenario Template: <testcase>
    Given I Launch ASAI Application
    Then I Verify static page default contents
    When I Click start button
    And I Navigate to ASAI Login page by clicking login under start button
    Then I Verify login page default contents
    And I enter email <email> in ASAI
    And I enter password <password> in ASAI
    And I click Login button in ASAI
    And I Verify dashboard page default contents

    Examples: 
      | testcase                | email                           | user_name             | password |
      | Gold User Login to ASAI | gopi.jeedimalla@gmail.com       | Gopi Kumar Jeedimalla | Dnis@123 |
      #| Free User Login to ASAI | gopikumar+6@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 |

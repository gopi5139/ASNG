Feature: Liquidation

  @liquidation
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Liquidation
    And Enter Mandatory Liquidation Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Liquidation Company Name <company_name>
    And Enter Mandatory Liquidation Effective Date <effective_date>
    And Enter Mandatory Liquidation Time Zone <time_zone>
    And Click Liquidation Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <company_name>
    And Enter Search Company Action "liquidation"
    And Click Search Apply Filter
    Then Click popup based on company name <company_name> and effective date <effective_date>
    And Verify Liquidation Company Name <company_name>
    And Verify Liquidation Effective Date <effective_date>
    And Verify Liquidation Time Zone <time_zone>

    Examples: 
      | testcase                             | email                         | password | user_name             | role | article_url            | company_name | effective_date | time_zone    |
      | Create a Liquidation with all fields | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | wipro        | 2021-11-22     | Asia/Kolkata |

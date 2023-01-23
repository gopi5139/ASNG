Feature: Headquarters Change

  @headquarters_change
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Headquarters Change
    And Enter Mandatory Headquarters_Change Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Headquarters_Change Company Name <company_name>
    And Enter Mandatory Headquarters_Change New Headquarters <new_headquarters>
    And Enter Mandatory Headquarters_Change New State <new_state>
    And Enter Mandatory Headquarters_Change New City <new_city>
    And Enter Mandatory Headquarters_Change Effective Date <effective_date>
    And Enter Mandatory Headquarters_Change Time Zone <time_zone>
    And Click Headquarters_Change Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <company_name>
    And Enter Search Company Action "head_quarters_change"
    And Click Search Apply Filter
    Then Click popup based on company name <company_name> and effective date <effective_date>
    And Verify Headquarters_Change Company Name <company_name>
    And Verify Headquarters_Change New Headquarters <new_headquarters>
    And Verify Headquarters_Change New State <new_state>
    And Verify Headquarters_Change New City <new_city>
    And Verify Headquarters_Change Effective Date <effective_date>
    And Verify Headquarters_Change Time Zone <time_zone>

    Examples: 
      | testcase                     | email                         | password | user_name             | role | article_url            | company_name | new_headquarters | new_state  | new_city | effective_date | time_zone    |
      | Create a Headquarters Change | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Decathlon    | United States    | California | Adelanto | 2021-11-22     | Asia/Kolkata |

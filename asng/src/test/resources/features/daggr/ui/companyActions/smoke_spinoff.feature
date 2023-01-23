Feature: Spinoff

  @smoke_spinoff @smoke
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Spinoff
    And Enter Mandatory Spinoff Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Spinoff Parent Company Name <parent_company_name>
    And Enter Mandatory Spinoff Spin-off Company Name <spin_off_company_name>
    And Enter Mandatory Spinoff Effective Date <effective_date>
    And Enter Mandatory Spinoff Time Zone <time_zone>
    And Click Spinoff Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <parent_company_name>
    And Enter Search Company Action "spin_off"
    And Click Search Apply Filter
    Then Click popup based on company name <parent_company_name> and effective date <effective_date>
    Then Click popup based on company name <parent_company_name> and effective date <effective_date>
    And Verify Spinoff Parent Company Name <parent_company_name>
    #And Verify Company Name in Spinoff Company Names <spin_off_company_name>
    #And Verify Company Name in Spinoff Company Names <spin_off_company_name>
    And Verify Spinoff Effective Date <effective_date>
    And Verify Spinoff Time Zone <time_zone>

    Examples: 
      | testcase         | email                         | password | user_name             | role | article_url            | parent_company_name | spin_off_company_name | spin_off_company_name_1                       | effective_date | time_zone    |
      | Create a spinoff | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Decathlon           | wipro                 | Charles River Laboratories International, inc | 2021-11-22     | Asia/Kolkata |

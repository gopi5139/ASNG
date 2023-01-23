Feature: Bankruptcy

  @smoke_bankruptcy @smoke
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Bankruptcy
    And Enter Mandatory Bankruptcy Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Bankruptcy Company Name <company_name>
    And Select Mandatory Bankruptcy Type <bankruptcy_type>
    And Enter Mandatory Bankruptcy Effective Date <effective_date>
    And Enter Mandatory Bankruptcy Time Zone <time_zone>
    And Click Bankruptcy Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <company_name>
    And Enter Search Company Action "bankruptcy"
    And Click Search Apply Filter
    Then Click popup based on company name <company_name> and effective date <effective_date>
    And Verify Bankruptcy Company Name <company_name>
    And Verify Bankruptcy Type <bankruptcy_type>
    And Verify Bankruptcy Effective Date <effective_date>
    And Verify Bankruptcy Time Zone <time_zone>

    Examples: 
      | testcase            | email                         | password | user_name             | role | article_url            | company_name | bankruptcy_type | effective_date | time_zone    |
      | Create a Bankruptcy | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Zomato       | Chapter 7       | 2021-11-26     | Asia/Kolkata |

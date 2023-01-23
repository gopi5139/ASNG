Feature: Company Name Change

  @smoke_company_name_change @smoke
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Company Name Change
    And Enter Mandatory Company_Name_Change Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Company_Name_Change Company Name <company_name>
    And Enter Mandatory Company_Name_Change New Company Name <new_company_name>
    And Enter Mandatory Company_Name_Change Effective Date <effective_date>
    And Enter Mandatory Company_Name_Change Time Zone <time_zone>
    And Click Company_Name_Change Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <company_name>
    And Enter Search Company Action "company_name_change"
    And Click Search Apply Filter
    Then Click popup based on company name <company_name> and effective date <effective_date>
    And Verify Company_Name_Change Company Name <company_name>
    And Verify Company_Name_Change New Company Name <new_company_name>
    And Verify Company_Name_Change Effective Date <effective_date>
    And Verify Company_Name_Change Time Zone <time_zone>

    Examples: 
      | testcase                     | email                         | password | user_name             | role | article_url            | company_name | new_company_name | effective_date | time_zone    |
      | Create a Company Name Change | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Zomato       | Git Hub          | 2021-11-26     | Asia/Kolkata |

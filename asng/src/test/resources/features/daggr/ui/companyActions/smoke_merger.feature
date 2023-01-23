Feature: Merger

  @smoke_merger @smoke
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Merger
    And Enter Mandatory Merger Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Merger Company Name_1 <company_name_1>
    And Enter Mandatory Merger Company Name_2 <company_name_2>
    And Enter Mandatory Merger Effective Date <effective_date>
    And Enter Mandatory Merger Time Zone <time_zone>
    And Enter Mandatory Merger Merged Company Name <merged_company_name>
    And Click Merger Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <merged_company_name>
    And Enter Search Company Action "merger"
    And Click Search Apply Filter
    Then Click popup based on company name <merged_company_name> and effective date <effective_date>
    And Verify Company Name in Merger Company Names <company_name_1>
    And Verify Company Name in Merger Company Names <company_name_2>
    And Verify Merger Effective Date <effective_date>
    And Verify Merger Time Zone <time_zone>
    And Verify Merger Merged Company Name <merged_company_name>
    
    Examples: 
      | testcase        | email                         | password | user_name             | role | article_url            | company_name_1 | company_name_2 | effective_date | time_zone    | merged_company_name |
      | Create a merger | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Decathlon      | wipro          | 2021-11-22     | Asia/Kolkata | decorindesign       |

  @merger_with_3_companies
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Merger
    And Enter Mandatory Merger Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Merger Company Name_1 <company_name_1>
    And Enter Mandatory Merger Company Name_2 <company_name_2>
    And Add Merger Company <company_name_3>
    And Enter Mandatory Merger Effective Date <effective_date>
    And Enter Mandatory Merger Time Zone <time_zone>
    And Enter Mandatory Merger Merged Company Name <merged_company_name>
    And Click Merger Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <merged_company_name>
    And Enter Search Company Action "merger"
    And Click Search Apply Filter
    Then Click popup based on company name <merged_company_name> and effective date <effective_date>
    And Verify Company Name in Merger Company Names <company_name_1>
    And Verify Company Name in Merger Company Names <company_name_2>
    And Verify Company Name in Merger Company Names <company_name_3>
    And Verify Merger Effective Date <effective_date>
    And Verify Merger Time Zone <time_zone>
    And Verify Merger Merged Company Name <merged_company_name>
    
    Examples: 
      | testcase                         | email                         | password | user_name             | role | article_url            | company_name_1 | company_name_2 | company_name_3                                | effective_date | time_zone    | merged_company_name |
      | Create a merger with 3 companies | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Decathlon      | wipro          | Charles River Laboratories International, inc | 2021-11-22     | Asia/Kolkata | decorindesign       |

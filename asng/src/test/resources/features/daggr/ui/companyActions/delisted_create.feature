Feature: Delisted

  @create_delisted
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Delisted
    And Enter Mandatory Delisted Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Delisted Company Name <company_name>
    And Select Mandatory Delisted Ticker-Exchange <ticker_exchange>
    And Select Mandatory Delisted Trading Status <trading_status>
    And Select Mandatory Delisted Mark Company as Private <mark_company_as_private>
    And Enter Mandatory Delisted Effective Date <effective_date>
    And Enter Mandatory Delisted Time Zone <time_zone>
    And Click Delisted Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <company_name>
    And Enter Search Company Action "delisted"
    And Click Search Apply Filter
    Then Click popup based on company name <company_name> and effective date <effective_date>
    And Verify Delisted Company Name <company_name>
    And Verify Delisted Ticker-Exchange <ticker_exchange>
    And Verify Delisted Trading Status <trading_status>
    And Verify Delisted Mark Company as Private <mark_company_as_private>
    And Verify Delisted Effective Date <effective_date>
    And Verify Delisted Time Zone <time_zone>

    Examples: 
      | testcase                                             | email                         | password | user_name             | role | article_url            | company_name | ticker_exchange | trading_status | mark_company_as_private | effective_date | time_zone    |
      | Create a Delisted with mark company as private true  | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Zomato       | RTY-NASDAQ      | Delisted       | true                    | 2021-11-14     | Asia/Kolkata |
      | Create a Delisted with mark company as private false | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Zomato       | RTY-NASDAQ      | Delisted       | false                   | 2021-11-15     | Asia/Kolkata |

Feature: Exchange & Ticker Change

  @exchange_and_ticker_change
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Exchange & Ticker Change
    And Enter Mandatory Exchange_and_Ticker_Change Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Exchange_and_Ticker_Change Company Name <company_name>
    And Select Mandatory Exchange_and_Ticker_Change Ticker-Exchange <ticker_exchange>
    And Enter Mandatory Exchange_and_Ticker_Change New Exchange <new_exchange>
    And Enter Mandatory Exchange_and_Ticker_Change New Ticker <new_ticker>
    And Enter Mandatory Exchange_and_Ticker_Change Effective Date <effective_date>
    And Enter Mandatory Exchange_and_Ticker_Change Time Zone <time_zone>
    And Click Exchange_and_Ticker_Change Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <company_name>
    And Enter Search Company Action "exchange_ticker_change"
    And Click Search Apply Filter
    Then Click popup based on company name <company_name> and effective date <effective_date>
    And Verify Exchange_and_Ticker_Change Company Name <company_name>
    And Verify Exchange_and_Ticker_Change Ticker-Exchange <ticker_exchange>
    And Verify Exchange_and_Ticker_Change New Exchange <new_exchange>
    And Verify Exchange_and_Ticker_Change New Ticker <new_ticker>
    And Verify Exchange_and_Ticker_Change Effective Date <effective_date>
    And Verify Exchange_and_Ticker_Change Time Zone <time_zone>

    Examples: 
      | testcase                                            | email                         | password | user_name             | role | article_url            | company_name | ticker_exchange | new_exchange | new_ticker | effective_date | time_zone    |
      | Create a Exchange and Ticker Change with all fields | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Zomato       | RTY-NASDAQ      | CASE         | ZTO        | 2021-11-26     | Asia/Kolkata |

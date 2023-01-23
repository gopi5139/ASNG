Feature: Update Ticker Information

  @update_ticker
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then Click Manual Job
    Then Select Add Ticker Information
    And Enter Mandatory Add Ticker Article Link <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Add Ticker Company Name <company_name>
    And Enter Mandatory Add Ticker Value <ticker>
    And Enter Mandatory Add Ticker Exchange <exchanges>
    And Select Optional Add Ticker Security Type "<security_type>"
    And Select Optional Add Ticker Security Category "<security_category>"
    And Select Optional Add Ticker Trading Start Date "<trading_start_date>"
    And Select Optional Add Ticker Trading End Date "<trading_end_date>"
    And Select Mandatory Add Ticker Trading Status <trading_status>
    And Select Mandatory Add Ticker Primary Ticker <primary_ticker>
    #Unable to upload file
    And Click Ticker Submit
    Then Check Success Message
    Then Navigate To Securities List Page
    Then Search By Securities Company Name <company_name>
    Then Click Popup on Created Secuirty <ticker>,<exchanges>
    And Check Securities Company Name <company_name>
    And Check Securities Ticker <ticker>
    And Check Securities Exchange <exchanges>
    And Check Securities Security Type "<security_type>"
    And Check Securities Security Category "<security_category>"
    And Check Securities Trading Start Date "<trading_start_date>"
    And Check Securities Trading End Date "<trading_end_date>"
    And Check Securities Trading Status <trading_status>
    And Check Securities Primary Ticker <primary_ticker>
    And Close Popup
    Then Click Secuirty Update Action <ticker>,<exchanges>
    And Update Mandatory Add Ticker Company Name <update_company_name>
    And Update Mandatory Add Ticker Value <update_ticker>
    And Update Mandatory Add Ticker Exchange <update_exchanges>
    And Update Optional Add Ticker Security Type "<update_security_type>"
    And Update Optional Add Ticker Security Category "<update_security_category>"
    And Update Optional Add Ticker Trading Start Date "<update_trading_start_date>"
    And Update Optional Add Ticker Trading End Date "<update_trading_end_date>"
    And Update Mandatory Add Ticker Trading Status <update_trading_status>
    And Update Mandatory Add Ticker Primary Ticker <update_primary_ticker>
    And Click Ticker Update
    Then Check Confirmation Popup
    And Close Popup
    Then Search By Securities Company Name <update_company_name>
    Then Click Popup on Created Secuirty <update_ticker>,<update_exchanges>
    And Check Securities Company Name <update_company_name>
    And Check Securities Ticker <update_ticker>
    And Check Securities Exchange <update_exchanges>
    And Check Securities Security Type "<update_security_type>"
    And Check Securities Security Category "<update_security_category>"
    And Check Securities Trading Start Date "<update_trading_start_date>"
    And Check Securities Trading End Date "<update_trading_end_date>"
    And Check Securities Trading Status <update_trading_status>
    And Check Securities Primary Ticker <update_primary_ticker>

    Examples: 
      | testcase                                                     | email                         | user_name             | password | role | article_url            | company_name | ticker | exchanges | security_type   | security_category | trading_start_date | trading_end_date | trading_status | primary_ticker | update_company_name | update_ticker | update_exchanges | update_security_type | update_security_category | update_trading_start_date | update_trading_end_date | update_trading_status | update_primary_ticker |
      | Update ticker information with all fields as delisted        | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | ZMO    | NASDAQ    | Preferred Stock | Class B           | 2020-03-26         | 2024-03-26       | Delisted       | No             | Decathlon           | ZMQ           | CASE             | Depository Receipt   | Class D                  | 2021-09-26                | 2021-12-25              | Suspended             | No                    |
      | Update ticker information with all fields as active          | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | MTQ    | NASDAQ    | Preferred Stock | Class B           | 2020-03-26         |                  | Active         | No             | Decathlon           | ZMQ           | CASE             | Depository Receipt   | Class D                  | 2021-09-26                | 2021-12-25              | Suspended             | No                    |
      | Update ticker information with mandatory fields as delisted  | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | ZMO    | NASDAQ    | Preferred Stock | Class B           | 2020-03-26         | 2024-03-26       | Delisted       | No             | Decathlon           | ZMQ           | CASE             |                      |                          |                           |                         | Suspended             | No                    |
      | Update ticker information with mandatory fields as active    | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | MTQ    | NASDAQ    | Preferred Stock | Class B           | 2020-03-26         |                  | Active         | No             | Decathlon           | ZMQ           | CASE             |                      |                          |                           |                         | Suspended             | No                    |
      | Create with mandatory and update with all fields as delisted | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | ZMO    | NASDAQ    |                 |                   |                    |                  | Delisted       | No             | Decathlon           | ZMQ           | CASE             | Depository Receipt   | Class D                  | 2021-09-26                | 2021-12-25              | Suspended             | No                    |
      | Create with mandatory and update with all fields as active   | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | MTQ    | NASDAQ    |                 |                   |                    |                  | Active         | No             | Decathlon           | ZMQ           | CASE             | Depository Receipt   | Class D                  | 2021-09-26                | 2021-12-25              | Suspended             | No                    |

Feature: Datasource

  @add_datasource
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then Navigate To Datasource
    Then Enter Mandatory Datasource Company Name <company_name>
    And Select Mandatory Datasource Traking Type <tracking_type>
    And Enter Mandatory Datasource Tracking Link <tracking_link>
    And Enter Mandatory Datasource Tracking Status <tracking_status>
    And Enter Mandatory Datasource Scraping Frequency <scraping_frequency>
    And Enter Mandatory/Optional Datasource Comments "<comments>"
    And Click Datasource Submit
    And Check Confirmation Popup
    And Click Confirmation Popup Yes
    Then Check Success Message
    Then Navigate To Company Datasource ""
    Then Search By Datasource Company Name <company_name>
    And Click Datasource Action <tracking_link>
    Then Check Mandatory Datasource Company Name <company_name>
    And Check Mandatory Datasource Tracking Type <tracking_type>
    And Check Mandatory Datasource Tracking Link <tracking_link>
    And Check Mandatory Datasource Status <tracking_status>
    And Check Mandatory Datasource Scraping Frequency <scraping_frequency>
    And Check Mandatory/Optional Datasource Comments "<comments>"

    Examples: 
      | testcase                                           | email                         | user_name             | password | role | company_name | tracking_type | tracking_link                | tracking_status | scraping_frequency | comments  |
      | Create a rss datasource with all fields            | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | Hathway      | RSS           | https://www.ing.com/news.rss | Active          | 1 month            | Ceomments |
      | Create a Manual datasource with all fields         | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | Hathway      | Manual        | https://www.ing.com/news.rss | Active          | 1 month            | Ceomments |
      | Create a rss datasource with only mandatory fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | Hathway      | RSS           | https://www.ing.com/news.rss | Active          | 1 month            |           |

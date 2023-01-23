Feature: Add Tracking Information

  @add_tracking_information
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then Click Manual Job
    Then Select Add Tracking Information
    Then Enter Mandatory Tracking Article Link <article_link>
    And Enter Mandatory Tracking Company Name <company_name>
    And Select Mandatory Tracking Traking Type <tracking_type>
    And Enter Mandatory Tracking Tracking Link <tracking_link>
    And Enter Mandatory Tracking Tracking Status <tracking_status>
    And Enter Mandatory Tracking Scraping Frequency <scraping_frequency>
    And Enter Mandatory/Optional Tracking Comments "<comments>"
    And Click Tracking Submit
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
      | testcase                                                         | email                         | user_name             | password | role | article_link                                   | company_name | tracking_type | tracking_link                          | tracking_status | scraping_frequency | comments  |
      | Create a rss Add Tracking Information with all fields            | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://mail.google.com/mail/u/0/?tab=rinbox   | Hathway      | RSS           | https://www.financialexpress.com/feed/ | Active          | 1 month            | Ceomments |
      | Create a Manual Add Tracking Information with all fields         | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://mail.google.com/mail/u/0/?tab=rminbox  | Hathway      | Manual        | https://cloudconvert.com/mp4-to-gif    | Active          | 1 month            | Ceomments |
      | Create a rss Add Tracking Information with only mandatory fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://mail.google.com/mail/u/0/?tab=rm#inbox | Hathway      | RSS           | https://www.ing.com/news.rss           | Active          | 1 month            |           |

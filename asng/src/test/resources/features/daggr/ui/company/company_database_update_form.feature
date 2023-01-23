Feature: Company Database Update

  @manual_job_company_database_update
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Company Database Update
    And Enter Mandatory Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Database Update Company Name <company_name>
    Then Update Mandatory Website Url <update_website_url>
    And Update Optional Employees "<update_employees>"
    And Update Optional Start Date "<update_start_date>"
    And Update Optional Sector "<update_sector>"
    And Update Optional Industry "<update_industry>"
    And Update Optional Address "<update_address>"
    And Update Optional Phone Number "<update_phone_number>"
    And Update Optional Company Description "<update_company_description>"
    And Update Optional ISIN "<update_ISIN>"
    And Update Optional CIK "<update_CIK>"
    And Update Optional CUSIP "<update_CUSIP>"
    And Update Optional SEDOL "<update_SEDOL>"
    And Click Next
    And Update Mandatory IR Section Link <update_ir_section_link>
    And Update Optional PR Section Link "<update_pr_section_link>"
    And Update Optional IR Name "<update_ir_name>"
    And Update Optional IR Designation "<update_ir_designation>"
    And Update Optional IR Phone Number "<update_ir_phone_number>"
    And Update Optional IR Email "<update_ir_email>"
    And Update Optional IR Responding to Email "<update_ir_responding_to_email>"
    And Update Optional IR Responding to Phone Call "<update_ir_responding_to_phone>"
    And Update Optional Executives Section Link "<update_executives_section_link>"
    And Update Optional Analyst Coverage Link "<update_analyst_coverage_link>"
    And Click Next
    And Update Mandatory Events Section Link <update_events_section_link>
    And Update Optional Earnings Announcement "<update_earnings_announcement>"
    And Update Optional Earnings Call Conducted "<update_earnings_call_conducted>"
    And Update Optional Languages "<update_languages>"
    And Update Optional Earnings Call Frequency "<update_earnings_call_frequency>"
    And Update Optional Email Alert Setup "<update_email_alert_setup>"
    And Update Optional Add to Calendar Option "<update_add_to_calendar_option>"
    And Update Optional Company Comments "<update_company_comments>"
    And Click Submit
    Then Check Success Message
    Then Navigate To Companies List Page ""
    Then Search By Company Name <company_name>
    Then Company Name is Displayed In Table <company_name>
    And Click Action
    Then Check Mandatory Company Name <company_name>
    And Check Mandatory Website Url <update_website_url>
    And Check Optional Employees "<update_employees>"
    And Check Optional Start Date "<update_start_date>"
    And Check Optional Sector "<update_sector>"
    And Check Optional Industry "<update_industry>"
    And Check Optional Address "<update_address>"
    And Check Optional Phone Number "<update_phone_number>"
    And Check Optional Company Description "<update_company_description>"
    And Check Optional ISIN "<update_ISIN>"
    And Check Optional CIK "<update_CIK>"
    And Check Optional CUSIP "<update_CUSIP>"
    And Check Optional SEDOL "<update_SEDOL>"
    And Click Next
    And Check Mandatory IR Section Link <update_ir_section_link>
    And Check Optional PR Section Link "<update_pr_section_link>"
    And Check Optional IR Name "<update_ir_name>"
    And Check Optional IR Designation "<update_ir_designation>"
    And Check Optional IR Phone Number "<update_ir_phone_number>"
    And Check Optional IR Email "<update_ir_email>"
    And Check Optional IR Responding to Email "<update_ir_responding_to_email>"
    And Check Optional IR Responding to Phone Call "<update_ir_responding_to_phone>"
    And Check Optional Executives Section Link "<update_executives_section_link>"
    And Check Optional Analyst Coverage Link "<update_analyst_coverage_link>"
    And Click Next
    And Check Mandatory Events Section Link <update_events_section_link>
    And Check Optional Earnings Announcement "<update_earnings_announcement>"
    And Check Optional Earnings Call Conducted "<update_earnings_call_conducted>"
    And Check Optional Languages "<update_languages>"
    And Check Optional Earnings Call Frequency "<update_earnings_call_frequency>"
    And Check Optional Email Alert Setup "<update_email_alert_setup>"
    And Check Optional Add to Calendar Option "<update_add_to_calendar_option>"
    And Check Optional Company Comments "<update_company_comments>"

    Examples: 
      | testcase                                    | email                         | user_name             | password | role | article_url            | company_name | update_website_url          | update_employees | update_start_date | update_sector    | update_industry | update_address         | update_phone_number | update_company_description | update_ISIN | update_CIK | update_CUSIP | update_SEDOL | update_ir_section_link            | update_pr_section_link            | update_ir_name | update_ir_designation  | update_ir_phone_number | update_ir_email               | update_ir_responding_to_email | update_ir_responding_to_phone | update_executives_section_link           | update_analyst_coverage_link           | update_events_section_link           | update_earnings_announcement | update_earnings_call_conducted | update_languages            | update_earnings_call_frequency | update_email_alert_setup | update_add_to_calendar_option | update_company_comments |
      | Update a company with only mandatory fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | mnoq         | https://www.update.test.in/ |                  |                   |                  |                 |                        |                     |                            |             |            |              |              | https://update.zomato.ir-section  |                                   |                |                        |                        |                               | No                            | Yes                           |                                          |                                        | https://update.colin.events.section  | No                           | Yes                            |                             |                                | No                       | Yes                           |                         |
      | Update a company with all fields            | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | https://www.update.test.in/ |               56 | 2015-06-26        | Consumer Staples | IT              | Company Address Update |           895639659 | Company Description Update | fsdf2330    |   54637830 | scs65652     | ss65232      | https://update.hathway.ir-section | https://update.hathway.pr-section | Gopi           | Software Test Engineer |              656563252 | gopikumar@digital-nirvana.com | No                            | Yes                           | https://update.hatway.excecutive.section | https://update.hatway.analyst.coverage | https://update.hatway.events.section | No                           | Yes                            | french,tamil,spanish,telugu | Quarterly                      | No                       | Yes                           | company comments        |

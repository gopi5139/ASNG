Feature: Company Database

  @create_public_company
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Company Database
    And Enter Mandatory Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Company Name <company_name>
    And Enter Mandatory Company Type <company_type>
    And Enter Mandatory Company Status <company_status>
    And Enter Mandatory Website Url <website_url>
    And Enter Optional Employees "<employees>"
    And Enter Optional Start Date "<start_date>"
    And Enter Optional End Date "<end_date>"
    And Enter Optional Sector "<sector>"
    And Enter Optional Industry "<industry>"
    And Enter Mandatory Country <country>
    And Enter Optional State "<state>"
    And Enter Optional City "<city>"
    And Enter Optional Address "<address>"
    And Enter Optional Phone Number "<phone_number>"
    And Enter Optional Company Description "<company_description>"
    And Enter Optional ISIN "<ISIN>"
    And Enter Optional CIK "<CIK>"
    And Enter Optional CUSIP "<CUSIP>"
    And Enter Optional SEDOL "<SEDOL>"
    And Click Next
    And Enter Mandatory IR Section Link <ir_section_link>
    And Enter Optional PR Section Link "<pr_section_link>"
    And Enter Optional IR Name "<ir_name>"
    And Enter Optional IR Designation "<ir_designation>"
    And Enter Optional IR Phone Number "<ir_phone_number>"
    And Enter Optional IR Email "<ir_email>"
    And Enter Optional IR Responding to Email "<ir_responding_to_email>"
    And Enter Optional IR Responding to Phone Call "<ir_responding_to_phone>"
    And Enter Optional Executives Section Link "<executives_section_link>"
    And Enter Optional Analyst Coverage Link "<analyst_coverage_link>"
    And Click Next
    And Enter Mandatory Events Section Link <events_section_link>
    And Select Optional Earnings Announcement "<earnings_announcement>"
    And Select Optional Earnings Call Conducted "<earnings_call_conducted>"
    And Select Optional Languages "<languages>"
    And Select Optional Earnings Call Frequency "<earnings_call_frequency>"
    And Select Optional Email Alert Setup "<email_alert_setup>"
    And Select Optional Add to Calander Option "<add_to_calendar_option>"
    And Enter Optional Company Comments "<company_comments>"
    And Click Next
    And Select Mandatory Traking Type <tracking_type>
    And Enter Mandatory Tracking Link <tracking_link>
    And Enter Mandatory Tracking Status <tracking_status>
    And Enter Mandatory Scraping Frequency <scraping_frequency>
    And Enter Mandatory/Optional Data Source Comments "<datasource_comments>"
    And Click Next
    And Enter Mandatory Ticker <ticker>
    And Enter Mandatory Exchanges <exchanges>
    And Enter Optional Security Type "<security_type>"
    And Enter Optional Security Category "<security_category>"
    And Enter Optional Trading Start Date "<trading_start_date>"
    And Enter Optional Trading End Date "<trading_end_date>"
    And Select Mandatory Trading Status <trading_status>
    And Select Mandatory Primary Ticker <primary_ticker>
    #Unable to upload file
    And Click Submit
    Then Check Success Message
    Then Navigate To Companies List Page ""
    Then Search By Company Name <company_name>
    Then Company Name is Displayed In Table <company_name>
    And Click Action
    Then Check Mandatory Company Name <company_name>
    And Check Mandatory Company Type <company_type>
    And Check Mandatory Company Status <company_status>
    And Check Mandatory Website Url <website_url>
    And Check Optional Employees "<employees>"
    And Check Optional Start Date "<start_date>"
    And Check Optional End Date "<end_date>"
    And Check Optional Sector "<sector>"
    And Check Optional Industry "<industry>"
    And Check Mandatory Country <country>
    And Check Optional State "<state>"
    And Check Optional City "<city>"
    And Check Optional Address "<address>"
    And Check Optional Phone Number "<phone_number>"
    And Check Optional Company Description "<company_description>"
    And Check Optional ISIN "<ISIN>"
    And Check Optional CIK "<CIK>"
    And Check Optional CUSIP "<CUSIP>"
    And Check Optional SEDOL "<SEDOL>"
    And Click Next
    And Check Mandatory IR Section Link <ir_section_link>
    And Check Optional PR Section Link "<pr_section_link>"
    And Check Optional IR Name "<ir_name>"
    And Check Optional IR Designation "<ir_designation>"
    And Check Optional IR Phone Number "<ir_phone_number>"
    And Check Optional IR Email "<ir_email>"
    And Check Optional IR Responding to Email "<ir_responding_to_email>"
    And Check Optional IR Responding to Phone Call "<ir_responding_to_phone>"
    And Check Optional Executives Section Link "<executives_section_link>"
    And Check Optional Analyst Coverage Link "<analyst_coverage_link>"
    And Click Next
    And Check Mandatory Events Section Link <events_section_link>
    And Check Optional Earnings Announcement "<earnings_announcement>"
    And Check Optional Earnings Call Conducted "<earnings_call_conducted>"
    And Check Optional Languages "<languages>"
    And Check Optional Earnings Call Frequency "<earnings_call_frequency>"
    And Check Optional Email Alert Setup "<email_alert_setup>"
    And Check Optional Add to Calendar Option "<add_to_calendar_option>"
    And Check Optional Company Comments "<company_comments>"

    Examples: 
      | testcase                                                  | email                         | user_name             | password | role | article_url            | company_name | company_type | company_status | website_url           | employees | start_date | end_date   | sector      | industry | country       | state  | city    | address                                | phone_number | company_description        | ISIN     | CIK      | CUSIP  | SEDOL   | ir_section_link          | pr_section_link          | ir_name | ir_designation | ir_phone_number | ir_email      | ir_responding_to_email | ir_responding_to_phone | executives_section_link          | analyst_coverage_link          | events_section_link            | earnings_announcement | earnings_call_conducted | languages           | earnings_call_frequency | email_alert_setup | add_to_calendar_option | company_comments | tracking_type | tracking_link                                                                       | tracking_status | scraping_frequency | datasource_comments  | ticker | exchanges       | security_type   | security_category | trading_start_date | trading_end_date | trading_status | primary_ticker |
      | Create a public rss company with all fields               | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Zomato       | Public       | Active         | https://www.test1.in/ |        56 | 2000-02-13 | 2040-02-13 | Health Care | IT       | United States | Alaska | College | 1-1542/A Beckkam street, North Atlanta |   9999999999 | It is basically IT company | svv6520h | 56210262 | c511w1 | fssv523 | https://chubb.ir-section | https://chubb.pr-section | xyz     | Team Lead      |      9999999999 | xyz@gmail.com | Yes                    | No                     | https://chubb.executives-section | https://chubb.analyst-coverage | https://chubb.analyst-coverage | Yes                   | No                      | Telugu,Tamil,French | Yearly                  | Yes               | No                     | Company Comments | RSS Feed      | https://investors.delltechnologies.com/rss/events.xml                               | ACTIVE          | 1 month            | Data Source Comments | ACT    | NASDAQ - NASDAQ | Preferred Stock | Class B           | 2020-03-26         | 2024-03-26       | Active         | Yes            |
      | Create a public manual company with all fields            | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Prime        | Public       | Active         | https://www.test2.in/ |        56 | 2000-02-13 | 2040-02-13 | Health Care | IT       | United States | Alaska | College | 1-1542/A Beckkam street, North Atlanta |   9999999999 | It is basically IT company | svv6520h | 56237541 | c511w1 | fssv523 | https://chubb.ir-section | https://chubb.pr-section | xyz     | Team Lead      |      9999999999 | xyz@gmail.com | Yes                    | No                     | https://chubb.executives-section | https://chubb.analyst-coverage | https://chubb.analyst-coverage | Yes                   | No                      | Telugu,Tamil,French | Yearly                  | Yes               | No                     | Company Comments | Manual        | https://github.com/prabhurajarathinam16/AUT/blob/main/rssfeed2.xml                  | ACTIVE          | 1 month            | Data Source Comments | ACT    | NASDAQ          | Preferred Stock | Class B           | 2020-03-26         | 2024-03-26       | Active         | Yes            |
      | Create a public rss company with empty optional fields    | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Team Spirit  | Public       | Active         | https://www.test1.in/ |           |            |            |             |          | United States |        |         |                                        |              |                            |          |          |        |         | https://chubb.ir-section |                          |         |                |                 |               |                        |                        |                                  |                                | https://chubb.analyst-coverage |                       |                         |                     |                         |                   |                        |                  | RSS Feed      | https://cpfl.riweb.com.br/rss.aspx?idCanal=U8S2pdYyN87kyvGiaE3pGg==&linguagem=en-US | ACTIVE          | 1 month            |                      | ACT    | NASDAQ - NASDAQ |                 |                   |                    |                  | Active         | Yes            |
      | Create a public manual company with empty optional fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Centro       | Public       | Active         | https://www.test2.in/ |           |            |            |             |          | United States |        |         |                                        |              |                            |          |          |        |         | https://chubb.ir-section |                          |         |                |                 |               |                        |                        |                                  |                                | https://chubb.analyst-coverage |                       |                         |                     |                         |                   |                        |                  | Manual        | https://credicorp.gcs-web.com/rss/news-releases.xml                                 | ACTIVE          | 1 month            | Data Source Comments | ACT    | NASDAQ          |                 |                   |                    |                  | Active         | Yes            |

  @create_private_company
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Company Database
    And Enter Mandatory Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Company Name <company_name>
    And Enter Mandatory Company Type <company_type>
    And Enter Mandatory Company Status <company_status>
    And Enter Mandatory Website Url <website_url>
    And Enter Optional Employees "<employees>"
    And Enter Optional Start Date "<start_date>"
    And Enter Optional End Date "<end_date>"
    And Enter Optional Sector "<sector>"
    And Enter Optional Industry "<industry>"
    And Enter Mandatory Country <country>
    And Enter Optional State "<state>"
    And Enter Optional City "<city>"
    And Enter Optional Address "<address>"
    And Enter Optional Phone Number "<phone_number>"
    And Enter Optional Company Description "<company_description>"
    And Enter Optional ISIN "<ISIN>"
    And Enter Optional CIK "<CIK>"
    And Enter Optional CUSIP "<CUSIP>"
    And Enter Optional SEDOL "<SEDOL>"
    And Click Next
    And Enter Mandatory IR Section Link <ir_section_link>
    And Enter Optional PR Section Link "<pr_section_link>"
    And Enter Optional IR Name "<ir_name>"
    And Enter Optional IR Designation "<ir_designation>"
    And Enter Optional IR Phone Number "<ir_phone_number>"
    And Enter Optional IR Email "<ir_email>"
    And Enter Optional IR Responding to Email "<ir_responding_to_email>"
    And Enter Optional IR Responding to Phone Call "<ir_responding_to_phone>"
    And Enter Optional Executives Section Link "<executives_section_link>"
    And Enter Optional Analyst Coverage Link "<analyst_coverage_link>"
    And Click Next
    And Enter Mandatory Events Section Link <events_section_link>
    And Select Optional Earnings Announcement "<earnings_announcement>"
    And Select Optional Earnings Call Conducted "<earnings_call_conducted>"
    And Select Optional Languages "<languages>"
    And Select Optional Earnings Call Frequency "<earnings_call_frequency>"
    And Select Optional Email Alert Setup "<email_alert_setup>"
    And Select Optional Add to Calander Option "<add_to_calendar_option>"
    And Enter Optional Company Comments "<company_comments>"
    And Click Next
    And Select Mandatory Traking Type <tracking_type>
    And Enter Mandatory Tracking Link <tracking_link>
    And Enter Mandatory Tracking Status <tracking_status>
    And Enter Mandatory Scraping Frequency <scraping_frequency>
    And Enter Mandatory/Optional Data Source Comments "<datasource_comments>"
    #Unable to upload file
    And Click Submit
    Then Check Success Message
    Then Navigate To Companies List Page ""
    Then Search By Company Name <company_name>
    Then Company Name is Displayed In Table <company_name>
    And Click Action
    Then Check Mandatory Company Name <company_name>
    And Check Mandatory Company Type <company_type>
    And Check Mandatory Company Status <company_status>
    And Check Mandatory Website Url <website_url>
    And Check Optional Employees "<employees>"
    And Check Optional Start Date "<start_date>"
    And Check Optional End Date "<end_date>"
    And Check Optional Sector "<sector>"
    And Check Optional Industry "<industry>"
    And Check Mandatory Country <country>
    And Check Optional State "<state>"
    And Check Optional City "<city>"
    And Check Optional Address "<address>"
    And Check Optional Phone Number "<phone_number>"
    And Check Optional Company Description "<company_description>"
    And Check Optional ISIN "<ISIN>"
    And Check Optional CIK "<CIK>"
    And Check Optional CUSIP "<CUSIP>"
    And Check Optional SEDOL "<SEDOL>"
    And Click Next
    And Check Mandatory IR Section Link <ir_section_link>
    And Check Optional PR Section Link "<pr_section_link>"
    And Check Optional IR Name "<ir_name>"
    And Check Optional IR Designation "<ir_designation>"
    And Check Optional IR Phone Number "<ir_phone_number>"
    And Check Optional IR Email "<ir_email>"
    And Check Optional IR Responding to Email "<ir_responding_to_email>"
    And Check Optional IR Responding to Phone Call "<ir_responding_to_phone>"
    And Check Optional Executives Section Link "<executives_section_link>"
    And Check Optional Analyst Coverage Link "<analyst_coverage_link>"
    And Click Next
    And Check Mandatory Events Section Link <events_section_link>
    And Check Optional Earnings Announcement "<earnings_announcement>"
    And Check Optional Earnings Call Conducted "<earnings_call_conducted>"
    And Check Optional Languages "<languages>"
    And Check Optional Earnings Call Frequency "<earnings_call_frequency>"
    And Check Optional Email Alert Setup "<email_alert_setup>"
    And Check Optional Add to Calendar Option "<add_to_calendar_option>"
    And Check Optional Company Comments "<company_comments>"

    Examples: 
      | testcase                                                   | email                         | user_name             | password | role | article_url            | company_name | company_type | company_status | website_url           | employees | start_date | end_date   | sector      | industry | country       | state  | city    | address                                | phone_number | company_description        | ISIN     | CIK      | CUSIP  | SEDOL   | ir_section_link          | pr_section_link          | ir_name | ir_designation | ir_phone_number | ir_email      | ir_responding_to_email | ir_responding_to_phone | executives_section_link          | analyst_coverage_link          | events_section_link            | earnings_announcement | earnings_call_conducted | languages           | earnings_call_frequency | email_alert_setup | add_to_calendar_option | company_comments | tracking_type | tracking_link                                                                                                                 | tracking_status | scraping_frequency | datasource_comments  |
      | Create a private rss company with all fields               | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Levis        | Private      | Active         | https://www.test1.in/ |        56 | 2000-02-13 | 2040-02-13 | Health Care | IT       | United States | Alaska | College | 1-1542/A Beckkam street, North Atlanta |   9999999999 | It is basically IT company | svv6520h | 56210240 | c511w1 | fssv523 | https://chubb.ir-section | https://chubb.pr-section | xyz     | Team Lead      |      9999999999 | xyz@gmail.com | Yes                    | No                     | https://chubb.executives-section | https://chubb.analyst-coverage | https://chubb.analyst-coverage | Yes                   | No                      | Telugu,Tamil,French | Yearly                  | Yes               | No                     | Company Comments | RSS Feed      | https://investor.corning.com/rss/PressRelease.aspx?LanguageId=1&CategoryWorkflowId=1cb807d2-208f-4bc3-9133-6a9ad45ac3b0&tags= | ACTIVE          | 1 month            | Data Source Comments |
      | Create a private manual company with all fields            | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Spykar       | Private      | Active         | https://www.test2.in/ |        56 | 2000-02-13 | 2040-02-13 | Health Care | IT       | United States | Alaska | College | 1-1542/A Beckkam street, North Atlanta |   9999999999 | It is basically IT company | svv6520h | 56210241 | c511w1 | fssv523 | https://chubb.ir-section | https://chubb.pr-section | xyz     | Team Lead      |      9999999999 | xyz@gmail.com | Yes                    | No                     | https://chubb.executives-section | https://chubb.analyst-coverage | https://chubb.analyst-coverage | Yes                   | No                      | Telugu,Tamil,French | Yearly                  | Yes               | No                     | Company Comments | Manual        | https://globenewswire.com/RssFeed/organization/RaDFbZsJPO3E-_kFb5Yw8A==                                                       | ACTIVE          | 1 month            | Data Source Comments |
      | Create a private rss company with empty optional fields    | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Team Spirit  | Private      | Active         | https://www.test1.in/ |           |            |            |             |          | United States |        |         |                                        |              |                            |          |          |        |         | https://chubb.ir-section |                          |         |                |                 |               |                        |                        |                                  |                                | https://chubb.analyst-coverage |                       |                         |                     |                         |                   |                        |                  | RSS Feed      | https://cpfl.riweb.com.br/rss.aspx?idCanal=U8S2pdYyN87kyvGiaE3pGg==&linguagem=en-US                                           | ACTIVE          | 1 month            |                      |
      | Create a private manual company with empty optional fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Centro       | Private      | Active         | https://www.test2.in/ |           |            |            |             |          | United States |        |         |                                        |              |                            |          |          |        |         | https://chubb.ir-section |                          |         |                |                 |               |                        |                        |                                  |                                | https://chubb.analyst-coverage |                       |                         |                     |                         |                   |                        |                  | Manual        | https://credicorp.gcs-web.com/rss/news-releases.xml                                                                           | ACTIVE          | 1 month            | Data Source Comments |

  @create_public_company_only_mandatory
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Company Database
    And Enter Mandatory Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Company Name <company_name>
    And Enter Mandatory Company Type <company_type>
    And Enter Mandatory Company Status <company_status>
    And Enter Mandatory Website Url <website_url>
    And Enter Mandatory Country <country>
    And Click Next
    And Enter Mandatory IR Section Link <ir_section_link>
    And Click Next
    And Enter Mandatory Events Section Link <events_section_link>
    And Click Next
    And Select Mandatory Traking Type <tracking_type>
    And Enter Mandatory Tracking Link <tracking_link>
    And Enter Mandatory Tracking Status <tracking_status>
    And Enter Mandatory Scraping Frequency <scraping_frequency>
    And Enter Mandatory/Optional Data Source Comments "<datasource_comments>"
    And Click Next
    And Enter Mandatory Ticker <ticker>
    And Enter Mandatory Exchanges <exchanges>
    And Select Mandatory Trading Status <trading_status>
    And Select Mandatory Primary Ticker <primary_ticker>
    #Unable to upload file
    And Click Submit
    Then Check Success Message
    Then Navigate To Companies List Page ""
    Then Search By Company Name <company_name>
    Then Company Name is Displayed In Table <company_name>
    And Click Action
    Then Check Mandatory Company Name <company_name>
    And Check Mandatory Company Type <company_type>
    And Check Mandatory Company Status <company_status>
    And Check Mandatory Website Url <website_url>
    And Check Mandatory Country <country>
    And Click Next
    And Check Mandatory IR Section Link <ir_section_link>
    And Click Next
    And Check Mandatory Events Section Link <events_section_link>

    Examples: 
      | testcase                                             | email                         | user_name             | password | role | article_url            | company_name | company_type | company_status | website_url           | country       | ir_section_link          | events_section_link            | tracking_type | tracking_link                                                 | tracking_status | scraping_frequency | datasource_comments  | ticker | exchanges | trading_status | primary_ticker |
      | Create a public rss company with mandatory fields    | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Kroger       | Public       | Active         | https://www.chubb.in/ | United States | https://chubb.ir-section | https://chubb.analyst-coverage | RSS Feed      | https://investorshub.advfn.com/boards/rss.aspx?board_id=23917 | ACTIVE          | 1 month            | Data Source Comments | ACT    | NASDAQ    | Active         | Yes            |
      | Create a public manual company with mandatory fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Kroger       | Public       | Active         | https://www.chubb.in/ | United States | https://chubb.ir-section | https://chubb.analyst-coverage | Manual        | https://investorshub.advfn.com/boards/rss.aspx?board_id=23917 | ACTIVE          | 1 month            | Data Source Comments | ACT    | NASDAQ    | Active         | Yes            |

  @create_private_company_only_mandatory
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Company Database
    And Enter Mandatory Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Company Name <company_name>
    And Enter Mandatory Company Type <company_type>
    And Enter Mandatory Company Status <company_status>
    And Enter Mandatory Website Url <website_url>
    And Enter Mandatory Country <country>
    And Click Next
    And Enter Mandatory IR Section Link <ir_section_link>
    And Click Next
    And Enter Mandatory Events Section Link <events_section_link>
    And Click Next
    And Select Mandatory Traking Type <tracking_type>
    And Enter Mandatory Tracking Link <tracking_link>
    And Enter Mandatory Tracking Status <tracking_status>
    And Enter Mandatory Scraping Frequency <scraping_frequency>
    And Enter Mandatory/Optional Data Source Comments "<datasource_comments>"
    #Unable to upload file
    And Click Submit
    Then Check Success Message
    Then Navigate To Companies List Page ""
    Then Search By Company Name <company_name>
    Then Company Name is Displayed In Table <company_name>
    And Click Action
    Then Check Mandatory Company Name <company_name>
    And Check Mandatory Company Type <company_type>
    And Check Mandatory Company Status <company_status>
    And Check Mandatory Website Url <website_url>
    And Check Mandatory Country <country>
    And Click Next
    And Check Mandatory IR Section Link <ir_section_link>
    And Click Next
    And Check Mandatory Events Section Link <events_section_link>

    Examples: 
      | testcase                                              | email                         | user_name             | password | role | article_url            | company_name | company_type | company_status | website_url           | country       | ir_section_link          | events_section_link            | tracking_type | tracking_link                                                 | tracking_status | scraping_frequency | datasource_comments  |
      | Create a private rss company with mandatory fields    | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Kroger       | Private      | Active         | https://www.chubb.in/ | United States | https://chubb.ir-section | https://chubb.analyst-coverage | RSS Feed      | https://investorshub.advfn.com/boards/rss.aspx?board_id=23917 | ACTIVE          | 1 month            | Data Source Comments |
      | Create a private manual company with mandatory fields | gopikumar@digital-nirvana.com | Gopi Kumar Jeedimalla | Dnis@123 | TL   | https://www.kroger.in/ | Kroger       | Private      | Active         | https://www.chubb.in/ | United States | https://chubb.ir-section | https://chubb.analyst-coverage | Manual        | https://investorshub.advfn.com/boards/rss.aspx?board_id=23917 | ACTIVE          | 1 month            | Data Source Comments |

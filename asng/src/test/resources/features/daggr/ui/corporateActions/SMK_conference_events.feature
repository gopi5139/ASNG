Feature: Events Smoke

  @smoke_analyst_or_investor_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                    | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                     | list_event_type                | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               |
      | Create analyst or investor conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Polimeras | Analyst or Investor Conference | analyst_or_investor_conference | 2022-03-17        | Active | 2022-03-17 | Yes           | 02:35:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-16      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://edge.media-server.com/mmc/p/see9a82o | https://edge.media-server.com/mmc/p/see9a82o |                       |                         | DAggr GUI Cucumber POC |

  @smoke_annual_general_meeting_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter event description "<event_description>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter event link "<event_link>"
    And I enter registration link "<registration_link>"
    And I enter schedule link "<schedule_link>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify event description "<event_description>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify event link "<event_link>"
    And I verify registration link "<registration_link>"
    And I verify schedule link "<schedule_link>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                       | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                        | list_event_type                   | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | event_link                                                          | registration_link                                    | schedule_link                                        | comments               |
      | Create annual general meeting conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Annual General Meeting Conference | annual_general_meeting_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://edge.media-server.com/mmc/p/see9a82o | https://edge.media-server.com/mmc/p/see9a82o |                       |                         | https://ir.arcosa.com/news-events/events-presentations/default.aspx | https://services.choruscall.com/links/aca211104.html | https://services.choruscall.com/links/aca211104.html | DAggr GUI Cucumber POC |

  @smoke_business_update_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter event description "<event_description>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter replay beginning date as "<replay_beginning_date>"
    And I enter replay beginning date as "<replay_end_date>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify event description "<event_description>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify replay beginning date as "<replay_beginning_date>"
    And I verify replay beginning date as "<replay_end_date>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                 | list_event_type      | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | replay_beginning_date | replay_end_date | live_webcast_passcode | replay_webcast_passcode | event_description                 | comments               |
      | Create business update conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Business Update Conference | business_update_call | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI | 2023-11-01            | 2023-11-30      |                       |                         | business update event description | DAggr GUI Cucumber POC |

  @smoke_corporate_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                          | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type           | list_event_type      | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               |
      | Create corporate conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Corporate Conference | corporate_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC |

  @smoke_earnings_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                         | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type          | list_event_type     | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               |
      | Create earnings conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Earnings Conference | earnings_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC |

  @smoke_guidance_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                         | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type          | list_event_type     | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               |
      | Create guidance conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Guidance Conference | guidance_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC |

  @smoke_sales_or_revenue_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                 | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                  | list_event_type             | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               |
      | Create sales or revenue conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Sales or Revenue Conference | sales_or_revenue_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC |

  @smoke_special_or_m_and_a_conference @smoke_conference
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter live phone-us as "<live_phone_us>"
    And I enter live passcode-us as "<live_passcode_us>"
    And I enter live phone international as "<live_phone_international>"
    And I enter live passcode international as "<live_passcode_international>"
    And I enter replay phone-us as "<replay_phone_us>"
    And I enter replay passcode-us as "<replay_passcode_us>"
    And I enter replay phone international as "<replay_phone_international>"
    And I enter replay passcode international as "<replay_passcode_international>"
    And I enter registration phone as "<registration_phone>"
    And I enter registration passcode as "<registration_passcode>"
    And I enter live webcast url as "<live_webcast_url>"
    And I enter replay webcast url as "<replay_webcast_url>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify live phone-us as "<live_phone_us>"
    And I verify live passcode-us as "<live_passcode_us>"
    And I verify live phone international as "<live_phone_international>"
    And I verify live passcode international as "<live_passcode_international>"
    And I verify replay phone-us as "<replay_phone_us>"
    And I verify replay passcode-us as "<replay_passcode_us>"
    And I verify replay phone international as "<replay_phone_international>"
    And I verify replay passcode international as "<replay_passcode_international>"
    And I verify registration phone as "<registration_phone>"
    And I verify registration passcode as "<registration_passcode>"
    And I verify live webcast url as "<live_webcast_url>"
    And I verify replay webcast url as "<replay_webcast_url>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                   | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                    | list_event_type               | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               |
      | Create special or m and a conference event | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Special or M and A Conference | special_or_m_and_a_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC |

  @smoke_board_meeting
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select status as "<status>"
    And I enter agenda as "<agenda>"
    And I select start date as "<start_date>"
    And I select end date as "<end_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<start_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify status as "<status>"
    And I verify agenda as "<agenda>"
    And I verify start date as "<start_date>"
    And I verify end date as "<end_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                      | daggr_operator_type | user_name | email                     | password | article_link         | upload_document | article_relevancy | company_name | event_type    | list_event_type | announcement_date | status | start_date | end_date   | time_provided | event_time | time_zone        | comments               | agenda       |
      | Create & Verify Board Meeting with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes             | Yes               | Polimeras    | Board Meeting | board_meeting   | 2022-03-10        | Active | 2022-03-10 | 2022-03-10 | Yes           | 10:00:AM   | America/New_York | DAggr GUI Cucumber POC | event agenda |

  @smoke_capital_markets_day
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select start date as "<start_date>"
    And I select end date as "<end_date>"
    And I select time provided as "<time_provided>"
    And I select start time as "<start_time>" time provided as "<time_provided>"
    And I select end time as "<end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<start_date>","<start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify start date as "<start_date>"
    And I verify end date as "<end_date>"
    And I verify time provided as "<time_provided>"
    And I verify start time as "<start_time>"
    And I verify end time as "<end_time>"
    And I verify time zone as "<time_zone>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                            | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type          | list_event_type     | announcement_date | capital_markets_day_name | event_organizer     | event_description   | status | start_date | end_date   | time_provided | start_time | end_time | time_zone        | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | comments                 |
      | Create & Verify Capital Markets Day with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Polimeras    | Capital Markets Day | capital_markets_day | 2022-03-10        | Capital Markets Day      | Capital Markets Day | Capital Markets Day | Active | 2022-03-10 | 2022-03-11 | Yes           | 10:00:AM   | 04:00:PM | America/New_York | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | DAggr_Automation_Comment |

  @smoke_comp_store_sales_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select event date as "<event_date>"
    And I select time provided as "<time_provided>"
    And I select event time as "<event_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select time period as "<time_period>"
    And I select financial year as "<financial_year>"
    And I select calendar year "<calendar_year>"
    And I select period end date as "<period_end_date>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_date>","<event_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify event date as "<event_date>"
    And I verify time provided as "<time_provided>"
    And I verify event time as "<event_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial year as "<financial_year>"
    And I verify calendar year "<calendar_year>"
    And I verify period end date as "<period_end_date>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                                 | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type               | list_event_type          | announcement_date | release_segment     | list_release_segment | event_date | time_provided | event_time | time_zone        | time_period | financial_year | calendar_year | period_end_date | comments                 |
      | Create & Verify Comp Store Sales Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Comp Store Sales Release | comp_store_sales_release | 2021-06-22        | Before Market Hours | BEFORE_MARKET_HOURS  | 2021-06-22 | Yes           | 10:00:AM   | America/New_York | Q4          |           2021 |          2021 | 2021-06-21      | DAggr_Automation_Comment |

  @smoke_company_roadshow
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select start date as "<start_date>"
    And I select end date as "<end_date>"
    And I select time provided as "<time_provided>"
    And I select start time as "<start_time>" time provided as "<time_provided>"
    And I select end time as "<end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<start_date>","<start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify start date as "<start_date>"
    And I verify end date as "<end_date>"
    And I verify time provided as "<time_provided>"
    And I verify start time as "<start_time>"
    And I verify end time as "<end_time>"
    And I verify time zone as "<time_zone>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                         | daggr_operator_type | user_name | email                     | password | login   | Manual Job           | article_link         | upload_document | article_relevancy | company_name | event_type       | list_event_type  | announcement_date | company_roadshow_name | event_organizer  | event_description | status | start_date | end_date   | time_provided | start_time | end_time | time_zone        | venue | address   | country     | state      | city      | event_link          | registration_link   | schedule_link       | comments               |
      | Create & Verify Company Roadshow with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | Welcome | Job Type: Manual Job | https://facebook.com | Yes             | Yes               | Mahenda      | Company Roadshow | company_roadshow | 2021-03-16        | company_roadshow      | company_roadshow | company_roadshow  | Active | 2021-03-16 | 2021-03-17 | Yes           | 10:00:AM   | 04:00:PM | America/New_York | TAJ   | 01 Avenue | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | DAggr GUI Cucumber POC |

  @smoke_dividend_suspended_or_resumed
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select dividend status as "<dividend_status>"
    And I select suspended/resumed date as "<suspended_or_resumed_date>"
    And I enter dividend amount as "<dividend_amount>"
    And I select currency as "<currency>"
    And I select frequency as "<frequency>"
    And I select ex dividend date as "<ex_dividend_date>"
    And I select record date as "<record_date>"
    And I select pay date as "<pay_date>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select dividend trend as "<dividend_trend>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<suspended_or_resumed_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify dividend status as "<dividend_status>"
    And I verify suspended/resumed date as "<suspended_or_resumed_date>"
    And I verify dividend amount as "<dividend_amount>"
    And I verify currency as "<currency>"
    And I verify frequency as "<frequency>"
    And I verify ex dividend date as "<ex_dividend_date>"
    And I verify record date as "<record_date>"
    And I verify pay date as "<pay_date>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify comments as "<comments>"
    And I Click Daggr Logout

    Examples: 
      | testcase                                                      | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type                    | list_event_type               | announcement_date | dividend_status | suspended_or_resumed_date | dividend_amount | currency  | frequency | ex_dividend_date | record_date | pay_date   | financial_quarter | financial_year | dividend_trend | comments               |
      | Create & Verify Dividend Suspended Or Resumed with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Dividend Suspended Or Resumed | dividend_suspended_or_resumed | 2021-07-14        | RESUMED         | 2021-07-14                |             200 | US DOLLAR | QUARTERLY | 2021-07-15       | 2021-07-15  | 2021-07-15 | Q2                |           2021 |                | DAggr GUI Cucumber POC |

  @smoke_dividend_update
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter dividend amount as "<dividend_amount>"
    And I select currency as "<currency>"
    And I select frequency as "<frequency>"
    And I select ex dividend date as "<ex_dividend_date>"
    And I select record date as "<record_date>"
    And I select pay date as "<pay_date>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select dividend trend as "<dividend_trend>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify dividend amount as "<dividend_amount>"
    And I verify currency as "<currency>"
    And I verify frequency as "<frequency>"
    And I verify ex dividend date as "<ex_dividend_date>"
    And I verify record date as "<record_date>"
    And I verify pay date as "<pay_date>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify dividend trend as "<dividend_trend>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                        | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type      | list_event_type | announcement_date | dividend_amount | currency  | frequency | ex_dividend_date | record_date | pay_date   | financial_quarter | financial_year | dividend_trend | comments               |
      | Create & Verify Dividend Update with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Dividend Update | dividend_update | 2024-05-13        |             200 | US DOLLAR | QUARTERLY | 2024-05-14       | 2024-05-14  | 2024-05-14 | Q2                |           2021 | INCREASED      | DAggr GUI Cucumber POC |

  @smoke_earnings_announcement_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select release date as "<release_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<release_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify release date as "<release_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                      | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type                    | list_event_type               | announcement_date | release_segment     | list_release_segment | release_date | time_provided | release_time | time_zone        | event_description | financial_quarter | financial_year | period_end_date | title                            | comments                 |
      | Create & Verify Earnings Announcement Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Earnings Announcement Release | earnings_announcement_release | 2021-05-16        | Before Market Hours | BEFORE_MARKET_HOURS  | 2021-05-16   | Yes           | 10:00:AM     | America/New_York |                   | Q4                |           2021 | 2021-05-15      | Earnings Announcement Release_04 | DAggr_Automation_Comment |

  @smoke_earnings_release_date_change
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"
    #Create Earnings Release Change
    When I click on white space
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type_change>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select recent earnings release
    And I select new announcement date as "<announcement_date>"
    And I select revised earnings_release_date as "<revised_earnings_release_date>"
    And I select time provided as "<time_provided>"
    And I select revised earnings_release_time as "<revised_earnings_release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select new release_segment as "<release_segment>"
    And I select status as "<status>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<revised_earnings_release_date>","<revised_earnings_release_time>","<time_zone>","<event_type_change_list>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<event_type_change_list>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify revised earnings_release_date as "<revised_earnings_release_date>"
    And I verify time provided as "<time_provided>"
    And I verify revised earnings_release_time as "<revised_earnings_release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify status as "<status>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                                  | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type       | list_event_type  | event_type_change            | event_type_change_list       | announcement_date | release_segment     | list_release_segment | status    | time_provided | release_time | time_zone        | event_description | financial_quarter | financial_year | period_end_date | title                   | comments               | recent_earnings_release | revised_earnings_release_date | revised_earnings_release_time |
      | Create & Verify Earnings Release Change with required and optional fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Earnings Release | earnings_release | Earnings Release Date Change | earnings_release_date_change | 2022-06-29        | Before Market Hours | BEFORE_MARKET_HOURS  | Confirmed | Yes           | 10:00:AM     | America/New_York | ear               | Q4                |           2025 | 2022-06-26      | Earnings Release Change | DAggr GUI Cucumber POC | recent_earnings_release | 2022-06-29                    | 11:00:AM                      |

  @smoke_earnings_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                         | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type       | list_event_type  | announcement_date | release_segment     | list_release_segment | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | title               | comments                 |
      | Create & Verify Earnings Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Earnings Release | earnings_release | 2021-06-27        | Before Market Hours | BEFORE_MARKET_HOURS  | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-06-26      | Earnings Release_04 | DAggr_Automation_Comment |

  @smoke_forecasted_earnings_release_date
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select projected release date as "<release_date>"
    And I select time provided as "<time_provided>"
    And I select projected release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter earnings date status as "<earnings_date_status>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<release_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify projected release date as "<release_date>"
    And I verify time provided as "<time_provided>"
    And I verify projected release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify earnings date status as "<list_earnings_date_status>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                         | daggr_operator_type | user_name | email                     | password | article_link                                                     | upload_document | article_relevancy | company_name | event_type                       | list_event_type                  | announcement_date | release_segment     | list_release_segment | release_date | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | earnings_date_status | list_earnings_date_status | comments                 |
      | Create & Verify Forecasted Earnings Release Date with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes             | Yes               | Mahenda      | Forecasted Earnings Release Date | forecasted_earnings_release_date | 2021-06-14        | Before Market Hours | BEFORE_MARKET_HOURS  | 2021-06-14   | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-06-14      | Confirmed            | CONFIRMED                 | DAggr_Automation_Comment |

  @smoke_forum
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter forum name as "<forum_name>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select event start date as "<event_start_date>"
    And I select event end date as "<event_end_date>"
    And I select time provided as "<time_provided>"
    And I select event start time as "<event_start_time>" time provided as "<time_provided>"
    And I select event end time as "<event_end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select registration deadline as "<registration_deadline>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter seminar passcode as "<seminar_passcode>"
    And I enter contact person name as "<contact_person_name>"
    And I enter designation as "<designation>"
    And I enter phone number as "<phone_number>"
    And I enter email as "<email>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_start_date>","<event_start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify forum name as "<forum_name>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify event start date as "<event_start_date>"
    And I verify event end date as "<event_end_date>"
    And I verify time provided as "<time_provided>"
    And I verify event start time as "<event_start_time>"
    And I verify event end time as "<event_end_time>"
    And I verify time zone as "<time_zone>"
    And I verify registration deadline as "<registration_deadline>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify seminar passcode as "<seminar_passcode>"
    And I verify contact person name as "<contact_person_name>"
    And I verify designation as "<designation>"
    And I verify phone number as "<phone_number>"
    And I verify email as "<email>"

    Examples: 
      | testcase                              | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type | list_event_type | announcement_date | forum_name | event_organizer | event_description | status | event_start_date | event_end_date | time_provided | event_start_time | event_end_time | time_zone        | registration_deadline | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | seminar_passcode | contact_person_name | designation | phone_number | email                         | comments                 |
      | Create & Verify Forum with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Forum      | forum           | 2021-06-27        | forum      | Forum           | Forum             | Active | 2021-06-27       | 2021-06-28     | Yes           | 10:00:AM         | 04:00:PM       | America/New_York | 2021-04-01            | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | passcode         | PR                  | LALA        | +12766955095 | sqa_testc@digital-nirvana.com | DAggr_Automation_Comment |

  @smoke_guidance_update
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select preliminary guidance as "<preliminary_guidance>"
    And I select status as "<status>"
    And I select guidance period as "<guidance_period>"
    And I select guidance quarter as "<guidance_quarter>"
    And I select guidance financial year as "<guidance_financial_year>"
    And I select revenue range as "<revenue_range>"
    And I select revenue acct standard as "<revenue_acct_standard>" and revenue range as "<revenue_range>"
    And I select revenue currency code as "<revenue_currency_code>" and revenue range as "<revenue_range>"
    And I enter revenue from as "<revenue_from>" and revenue  to as "<revenue_to>" and revenue range as "<revenue_range>"
    And I select revenue monetary unit as "<revenue_monetary_unit>" and ebitda range as "<revenue_range>"
    And I select eps range as "<eps_range>"
    And I select eps acct standard as "<eps_acct_standard>" and eps range as "<eps_range>"
    And I select eps currency code as "<eps_currency_code>" and eps range as "<eps_range>"
    And I enter eps from as "<eps_from>" and eps to as "<eps_to>" and eps range as "<eps_range>"
    And I select ebitda range as "<ebitda_range>"
    And I select ebitda acct standard as "<ebitda_acct_standard>" and ebitda range as "<ebitda_range>"
    And I select ebitda currency code as "<ebitda_currency_code>" and ebitda range as "<ebitda_range>"
    And I enter ebitda from as "<ebitda_from>" and ebitda to as "<ebitda_to>" and ebitda range as "<ebitda_range>"
    And I select ebitda monetary unit as "<ebitda_monetary_unit>" and ebitda range as "<ebitda_range>"
    And I select capital expenditure as "<capital_expenditure>"
    And I select capital expenditure currency code as "<capital_currency_code>" and capital expenditure as "<capital_expenditure>"
    And I enter capital expenditure from as "<capital_from>" and capital expenditure to as "<capital_to>" and capital expenditure as "<capital_expenditure>"
    And I select capital expenditure monetary unit as "<capital_monetary_unit>" and capital expenditure as "<capital_expenditure>"
    And I select operating expenses as "<operating_expenses>"
    And I select operating expenses currency code as "<operating_expenses_currency_code>" and operating expenses as "<operating_expenses>"
    And I enter operating expenses from as "<operating_expenses_from>" and operating expenses to as "<operating_expenses_to>" and operating expenses as "<operating_expenses>"
    And I select operating expenses monetary unit as "<operating_expenses_monetary_unit>" and operating expenses as "<operating_expenses>"
    And I enter outlook info as "<outlook_info>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify preliminary guidance as "<preliminary_guidance_list>"
    And I verify status as "<status>"
    And I verify guidance period as "<guidance_period_list>"
    And I verify guidance quarter as "<guidance_quarter>"
    And I verify guidance financial year as "<guidance_financial_year>"
    And I verify revenue acct standard as "<revenue_acct_standard>"
    And I verify revenue currency code as "<revenue_currency_code>"
    And I verify revenue from as "<revenue_from>" and revenue  to as "<revenue_to>"
    And I verify revenue monetary unit as "<revenue_monetary_unit>"
    And I verify eps acct standard as "<eps_acct_standard>"
    And I verify eps currency code as "<eps_currency_code>"
    And I verify eps from as "<eps_from>" and eps to as "<eps_to>"
    And I verify ebitda acct standard as "<ebitda_acct_standard>"
    And I verify ebitda currency code as "<ebitda_currency_code>"
    And I verify ebitda from as "<ebitda_from>" and ebitda to as "<ebitda_to>"
    And I verify ebitda monetary unit as "<ebitda_monetary_unit>"
    And I verify capital expenditure currency code as "<capital_currency_code>"
    And I verify capital expenditure from as "<capital_from>" and capital expenditure to as "<capital_to>"
    And I verify capital expenditure monetary unit as "<capital_monetary_unit>"
    And I verify operating expenses currency code as "<operating_expenses_currency_code>"
    And I verify operating expenses from as "<operating_expenses_from>" and operating expenses to as "<operating_expenses_to>"
    And I verify operating expenses monetary unit as "<operating_expenses_monetary_unit>"
    And I verify outlook info as "<outlook_info>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                          | daggr_operator_type | user_name | email                                  | password | article_link         | article_relevancy | company_name | event_type      | list_event_type | announcement_date | financial_quarter | financial_year | preliminary_guidance | preliminary_guidance_list | status | guidance_period    | guidance_period_list | guidance_quarter | guidance_financial_year | revenue_range | revenue_acct_standard | revenue_currency_code | revenue_from | revenue_to | revenue_monetary_unit | eps_range | eps_acct_standard | eps_currency_code | eps_from | eps_to | ebitda_range | ebitda_acct_standard | ebitda_currency_code | ebitda_from | ebitda_to | ebitda_monetary_unit | capital_expenditure | capital_currency_code | capital_from | capital_to | capital_monetary_unit | operating_expenses | operating_expenses_currency_code | operating_expenses_from | operating_expenses_to | operating_expenses_monetary_unit | outlook_info      | comments |
      | Create & Verify Guidance Update with required and optional fields | Operator            | Gopi      | prabhurajarathinam@digital-nirvana.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Guidance Update | guidance_update | 2023-04-15        | Q1                |           2021 | Yes                  | true                      | New    | Quarterly Guidance | QUARTERLY_GUIDANCE   | Q1               |                    2021 | Yes           | GAAP                  | USD                   |            1 |         99 | Trillion              | Yes       | GAAP              | USD               |        1 |     99 | Yes          | GAAP                 | USD                  |           1 |        99 | Trillion             | Yes                 | USD                   |            1 |         99 | Trillion              | Yes                | USD                              |                       1 |                    99 | Trillion                         | outlook_info_test | Test     |

  @smoke_index_change
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select change status as "<change_status>"
    And I select index as "<index>"
    And I select effective date as "<effective_date>"
    And I enter company name added as "<company_name_added>"
    And I enter company name removed as "<company_name_removed>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<effective_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify change status as "<change_status_list>"
    And I verify index as "<index>"
    And I verify effective date as "<effective_date>"
    And I verify company name added as "<company_name_added>"
    And I verify company name removed as "<company_name_removed>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                     | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type   | list_event_type | announcement_date | change_status | change_status_list | index   | effective_date | company_name_added | company_name_removed | comments               |
      | Create & Verify Index Change with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Index Change | index_change    | 2021-05-17        | added         | ADDED              | S&P 400 | 2021-05-17     | Daktronics, Inc.   | Facebook, inc        | DAggr GUI Cucumber POC |

  @smoke_ipos
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select filling date as "<filling_date>"
    And I select offering date as "<offering_date>"
    And I select status as "<status>"
    And I enter share price as "<share_price>"
    And I enter share offered as "<share_offered>"
    And I enter offer amount as "<offer_amount>"
    And I enter low end share price as "<low_end_share_price>"
    And I enter high end share price as "<high_end_share_price>"
    And I enter lead managers as "<lead_managers>"
    And I select quiet period as "<quiet_period>"
    And I select lockup period as "<lockup_period>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<offering_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify filling date as "<filling_date>"
    And I verify offering date as "<offering_date>"
    And I verify status as "<status>"
    And I verify share price as "<share_price>"
    And I verify share offered as "<share_offered>"
    And I verify offer amount as "<offer_amount>"
    And I verify low end share price as "<low_end_share_price>"
    And I verify high end share price as "<high_end_share_price>"
    And I verify lead managers as "<lead_managers>"
    And I verify quiet period as "<quiet_period>"
    And I verify lockup period as "<lockup_period>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                             | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type | list_event_type | announcement_date | filling_date | offering_date | status | share_price | share_offered | offer_amount | low_end_share_price | high_end_share_price | lead_managers | quiet_period | lockup_period | comments               |
      | Create & Verify Ipos with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Ipos       | ipos            | 2023-03-19        | 2023-03-19   | 2023-03-19    | Priced |         100 |            15 |          150 |                 213 |                  321 | Testing       | 2023-03-19   | 2023-03-19    | DAggr GUI Cucumber POC |

  @smoke_legal_or_lawsuit_update
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select lawsuit category as "<lawsuit_category>"
    And I select lawsuit stage as "<lawsuit_stage>"
    And I enter lawsuit link as "<lawsuit_link>"
    And I enter lawsuit description as "<lawsuit_description>"
    And I enter plaintiff name as "<plaintiff_name>"
    And I enter plaintiff email as "<plaintiff_email>"
    And I enter plaintiff address as "<enter_plaintiff_address>"
    And I enter plaintiff phone number as "<plaintiff_phone_number>"
    And I enter lawfirm name as "<lawfirm_name>"
    And I enter lawfirm url as "<lawfirm_url>"
    And I select class action start date as "<class_action_start_date>"
    And I select class action end date as "<class_action_end_date>"
    And I select motion deadline as "<motion_deadline>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify lawsuit category as "<lawsuit_category>"
    And I verify lawsuit stage as "<lawsuit_stage>"
    And I verify lawsuit link as "<lawsuit_link>"
    And I verify lawsuit description as "<lawsuit_description>"
    And I verify plaintiff name as "<plaintiff_name>"
    And I verify plaintiff email as "<plaintiff_email>"
    And I verify plaintiff address as "<enter_plaintiff_address>"
    And I verify plaintiff phone number as "<plaintiff_phone_number>"
    And I verify lawfirm name as "<lawfirm_name>"
    And I verify lawfirm url as "<lawfirm_url>"
    And I verify class action start date as "<class_action_start_date>"
    And I verify class action end date as "<class_action_end_date>"
    And I verify motion deadline as "<motion_deadline>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type              | list_event_type         | announcement_date | lawsuit_category | lawsuit_stage | lawsuit_link  | lawsuit_description | plaintiff_name | plaintiff_email                         | enter_plaintiff_address | plaintiff_phone_number | lawfirm_name | lawfirm_url    | class_action_start_date | class_action_end_date | motion_deadline | comments               |
      | Create & Verify Legal or Lawsuit Update with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Legal or Lawsuit Update | legal_or_lawsuit_update | 2021-04-17        | Employment       | Investigation | https://..com | Investigation       | AUT_TEST       | prabhurajarathinam1@digital-nirvana.com | enter_plaintiff_address |              979465456 | lawfirm_name | http://url.com | 2021-04-17              | 2021-04-18            | 2021-04-17      | DAggr GUI Cucumber POC |

  @smoke_m_and_a_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                        | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type      | list_event_type | announcement_date | release_segment     | list_release_segment | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | title              | comments                 |
      | Create & Verify M and A Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | M and A Release | m_and_a_release | 2021-04-19        | Before Market Hours | BEFORE_MARKET_HOURS  | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-04-18      | M and A Release_04 | DAggr_Automation_Comment |

  @smoke_management_update_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                  | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type                | list_event_type           | announcement_date | release_segment     | list_release_segment | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | title                        | comments                 |
      | Create & Verify Management Update Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Management Update Release | management_update_release | 2021-06-17        | Before Market Hours | BEFORE_MARKET_HOURS  | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-06-16      | Management Update Release_04 | DAggr_Automation_Comment |

  @smoke_other_releases
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                       | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type     | list_event_type | announcement_date | release_segment     | list_release_segment | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | title             | comments                 |
      | Create & Verify Other Releases with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Other Releases | other_releases  | 2021-04-18        | Before Market Hours | BEFORE_MARKET_HOURS  | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-04-17      | Other Releases_04 | DAggr_Automation_Comment |

  @smoke_product_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                        | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type      | list_event_type | announcement_date | release_segment     | list_release_segment | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | title              | comments                 |
      | Create & Verify Product Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Product Release | product_release | 2021-04-06        | Before Market Hours | BEFORE_MARKET_HOURS  | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-04-05      | Product Release_04 | DAggr_Automation_Comment |

  @smoke_r_and_d_day
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select start date as "<start_date>"
    And I select end date as "<end_date>"
    And I select time provided as "<time_provided>"
    And I select start time as "<start_time>" time provided as "<time_provided>"
    And I select end time as "<end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<start_date>","<start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify start date as "<start_date>"
    And I verify end date as "<end_date>"
    And I verify time provided as "<time_provided>"
    And I verify start time as "<start_time>"
    And I verify end time as "<end_time>"
    And I verify time zone as "<time_zone>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                    | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type  | list_event_type | announcement_date | r_and_d_day_name | event_organizer | event_description | status | start_date | end_date   | time_provided | start_time | end_time | time_zone        | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | comments                 |
      | Create & Verify R and D Day with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | R and D Day | r_and_d_day     | 2021-05-16        | r_and_d_day      | r_and_d_day     | r_and_d_day       | Active | 2021-05-16 | 2021-05-17 | Yes           | 10:00:AM   | 04:00:PM | America/New_York | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | DAggr_Automation_Comment |

  @smoke_sales_or_revenue_release
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select release date as "<release_date>"
    And I select time provided as "<time_provided>"
    And I select release time as "<release_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select release_segment as "<release_segment>"
    And I select financial quarter "<financial_quarter>"
    And I select financial year as "<financial_year>"
    And I select period end date as "<period_end_date>"
    And I enter title as "<title>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<release_date>","<release_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify release date as "<release_date>"
    And I verify time provided as "<time_provided>"
    And I verify release time as "<release_time>"
    And I verify time zone as "<time_zone>"
    And I verify release_segment as "<list_release_segment>"
    And I verify financial quarter "<financial_quarter>"
    And I verify financial year as "<financial_year>"
    And I verify period end date as "<period_end_date>"
    And I verify title as "<title>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                                 | daggr_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type               | list_event_type          | announcement_date | release_segment     | list_release_segment | release_date | time_provided | release_time | time_zone        | financial_quarter | financial_year | period_end_date | title                       | comments                 |
      | Create & Verify Sales or Revenue Release with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Mahenda      | Sales or Revenue Release | sales_or_revenue_release | 2021-05-18        | Before Market Hours | BEFORE_MARKET_HOURS  | 2021-05-18   | Yes           | 10:00:AM     | America/New_York | Q4                |           2021 | 2021-05-17      | Sales or Revenue Release_04 | DAggr_Automation_Comment |

  @smoke_secondary_offering
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select offering status as "<offering_status>"
    And I select selling shareholder as "<selling_shareholder>"
    And I enter number of shares for sale as "<number_of_shares_for_sale>"
    And I enter share price as "<share_price>"
    And I select currency as "<currency>"
    And I select effective date as "<effective_date>"
    And I select closing date as "<closing_date>"
    And I enter proceeds received by company as "<proceeds_received_by_company>"
    And I enter under writing manager as "<under_writing_manager>"
    And I enter prospectus link as "<prospectus_link>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify offering status as "<offering_status>"
    And I verify selling shareholder as "<selling_shareholder>"
    And I verify number of shares for sale as "<number_of_shares_for_sale>"
    And I verify share price as "<share_price>"
    And I verify currency as "<currency>"
    And I verify effective date as "<effective_date>"
    And I verify closing date as "<closing_date>"
    And I verify proceeds received by company as "<proceeds_received_by_company>"
    And I verify under writing manager as "<under_writing_manager>"
    And I verify prospectus link as "<prospectus_link>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                           | daggr_operator_type | user_name | email                     | password | article_link         | article_relevancy | company_name | event_type         | list_event_type    | announcement_date | offering_status | selling_shareholder | number_of_shares_for_sale | share_price | currency  | effective_date | closing_date | proceeds_received_by_company | under_writing_manager | prospectus_link      | comments               |
      | Create & Verify Secondary Offering with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Secondary Offering | secondary_offering | 2024-04-21        | Open            | Individual          |                      1000 |         154 | US Dollar | 2024-04-21     | 2024-04-21   | Testing                      | Testing               | https://facebook.com | DAggr GUI Cucumber POC |

  @smoke_seminar
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter seminar name as "<seminar_name>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select event start date as "<event_start_date>"
    And I select event end date as "<event_end_date>"
    And I select time provided as "<time_provided>"
    And I select event start time as "<event_start_time>" time provided as "<time_provided>"
    And I select event end time as "<event_end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select registration deadline as "<registration_deadline>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter seminar passcode as "<seminar_passcode>"
    And I enter contact person name as "<contact_person_name>"
    And I enter designation as "<designation>"
    And I enter phone number as "<phone_number>"
    And I enter email as "<email>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_start_date>","<event_start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify seminar name as "<seminar_name>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify event start date as "<event_start_date>"
    And I verify event end date as "<event_end_date>"
    And I verify time provided as "<time_provided>"
    And I verify event start time as "<event_start_time>"
    And I verify event end time as "<event_end_time>"
    And I verify time zone as "<time_zone>"
    And I verify registration deadline as "<registration_deadline>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify seminar passcode as "<seminar_passcode>"
    And I verify contact person name as "<contact_person_name>"
    And I verify designation as "<designation>"
    And I verify phone number as "<phone_number>"
    And I verify email as "<email>"

    Examples: 
      | testcase                                | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type | list_event_type | announcement_date | seminar_name | event_organizer | event_description | status | event_start_date | event_end_date | time_provided | event_start_time | event_end_time | time_zone        | registration_deadline | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | seminar_passcode | contact_person_name | designation | phone_number | email                         | comments                 |
      | Create & Verify Seminar with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Seminar    | seminar         | 2021-04-17        | seminar      | seminar         | seminar           | Active | 2021-04-17       | 2021-04-18     | Yes           | 10:00:AM         | 04:00:PM       | America/New_York | 2021-04-02            | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | passcode         | PR                  | LALA        | +12766955095 | sqa_testc@digital-nirvana.com | DAggr_Automation_Comment |

  @smoke_share_buyback
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select record type as "<record_type>"
    And I select buyback status as "<buyback_status>"
    And I select buyback method as "<buyback_method>"
    And I select modification announcement date as "<modification_announcement_date>"
    And I select approval date as "<approval_date>"
    And I enter no of authorized shares as "<no_of_authorized_shares>"
    And I enter authorized share value as "<authorized_share_value>"
    And I enter share value currency as "<share_value_currency>"
    And I select buyback end date as "<buyback_end_date>"
    And I enter low end price range as "<low_end_price_range>"
    And I enter high end price range as "<high_end_price_range>"
    And I enter purchase price as "<purchase_price>"
    And I select tender expiration date as "<tender_expiration_date>"
    And I select time provided as "<time_provided>"
    And I select tender expiration time as "<tender_expiration_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify record type as "<record_type_list>"
    And I verify buyback status as "<buyback_status_list>"
    And I verify buyback method as "<buyback_method_list>"
    And I verify modification announcement date as "<modification_announcement_date>"
    And I verify approval date as "<approval_date>"
    And I verify no of authorized shares as "<no_of_authorized_shares>"
    And I verify authorized share value as "<authorized_share_value>"
    And I verify share value currency as "<share_value_currency>"
    And I verify buyback end date as "<buyback_end_date>"
    And I verify low end price range as "<low_end_price_range>"
    And I verify high end price range as "<high_end_price_range>"
    And I verify purchase price as "<purchase_price>"
    And I verify tender expiration date as "<tender_expiration_date>"
    And I verify time provided as "<time_provided>"
    And I verify tender expiration time as "<tender_expiration_time>"
    And I verify time zone as "<time_zone>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                      | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type    | list_event_type | announcement_date | record_type | record_type_list | buyback_status | buyback_status_list | buyback_method | buyback_method_list | modification_announcement_date | approval_date | no_of_authorized_shares | authorized_share_value | share_value_currency | buyback_end_date | low_end_price_range | high_end_price_range | purchase_price | tender_expiration_date | time_provided | tender_expiration_time | time_zone        | comments               |
      | Create & Verify Share Buyback with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Share Buyback | share_buyback   | 2021-03-20        | initial     | INITIAL          | open           | OPEN                | open_market    | OPEN_MARKET         | 2021-03-20                     | 2021-03-20    |                    1000 |                   1000 |                10000 | 2021-03-20       |               10000 |                99999 |            999 | 2021-03-20             | Yes           | 10:00:AM               | America/New_York | DAggr GUI Cucumber POC |

  @smoke_shareholder_meeting
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select meeting type as "<meeting_type>"
    And I enter meeting description as "<meeting_description>"
    And I select status as "<status>"
    And I select record date as "<record_date>"
    And I select start date as "<start_date>"
    And I select end date as "<end_date>"
    And I select time provided as "<time_provided>"
    And I select start time as "<start_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter virtual shareholder meeting as "<virtual_shareholder_meeting>"
    And I enter distance between head quarters and venue as "<distance_between_head_quarters_and_venue>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<start_date>","<start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify meeting type as "<meeting_type_list>"
    And I verify meeting description as "<meeting_description>"
    And I verify status as "<status>"
    And I verify record date as "<record_date>"
    And I verify start date as "<start_date>"
    And I verify end date as "<end_date>"
    And I verify time provided as "<time_provided>"
    And I verify start time as "<start_time>"
    And I verify time zone as "<time_zone>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify virtual shareholder meeting as "<virtual_shareholder_meeting>"
    And I verify distance between head quarters and venue as "<distance_between_head_quarters_and_venue>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                            | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type          | list_event_type     | announcement_date | shareholder_meeting_name | meeting_type | meeting_type_list | meeting_description | status | status_list | record_date | start_date | end_date   | time_provided | start_time | time_zone        | venue | address   | country     | state      | city      | virtual_shareholder_meeting | distance_between_head_quarters_and_venue | registration_link   | schedule_link       | comments               |
      | Create & Verify Shareholder Meeting with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Shareholder Meeting | shareholder_meeting | 2021-04-28        | shareholder_meeting      | annual       | ANNUAL            | shareholder_meeting | Active | ACTIVE      | 2021-04-28  | 2021-04-28 | 2021-04-28 | Yes           | 04:00:PM   | America/New_York | TAJ   | 01 Avenue | Afghanistan | Badakhshan | Eshkashem | http://facebook.com         | 10Miles                                  | http://facebook.com | http://facebook.com | DAggr GUI Cucumber POC |

  @smoke_spinoff
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I enter spin-off company name as "<spin_off_company_name>"
    And I select Announcement Date as "<announcement_date>"
    And I select transaction status as "<transaction_status>"
    And I enter parent company shares cutoff as "<parent_company_shares_cutoff>"
    And I enter spin off company shares received as "<spin_off_company_shares_received>"
    And I select taxable as "<taxable>"
    And I select fractional payment type as "<fractional_payment_type>"
    And I enter estimated market cap as "<estimated_market_cap>"
    And I select record date as "<record_date>"
    And I select distribution date as "<distribution_date>"
    And I select trade date as "<trade_date>"
    And I select approval date as "<approval_date>"
    And I select parent company trading when issued from date as "<parent_company_trading_when_issued_from_date>"
    And I select parent company trading when issued to date as "<parent_company_trading_when_issued_to_date>"
    And I select spin off company trading when issued from date as "<spin_off_company_trading_when_issued_from_date>"
    And I select spin off company trading when issued to date as "<spin_off_company_trading_when_issued_to_date>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<announcement_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify spin-off company name as "<spin_off_company_name>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify transaction status as "<transaction_status_list>"
    And I verify parent company shares cutoff as "<parent_company_shares_cutoff>"
    And I verify spin off company shares received as "<spin_off_company_shares_received>"
    And I verify taxable as "<taxable>"
    And I verify fractional payment type as "<fractional_payment_type>"
    And I verify estimated market cap as "<estimated_market_cap>"
    And I verify record date as "<record_date>"
    And I verify distribution date as "<distribution_date>"
    And I verify trade date as "<trade_date>"
    And I verify approval date as "<approval_date>"
    And I verify parent company trading when issued from date as "<parent_company_trading_when_issued_from_date>"
    And I verify parent company trading when issued to date as "<parent_company_trading_when_issued_to_date>"
    And I verify spin off company trading when issued from date as "<spin_off_company_trading_when_issued_from_date>"
    And I verify spin off company trading when issued to date as "<spin_off_company_trading_when_issued_to_date>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type | list_event_type | spin_off_company_name | announcement_date | transaction_status | transaction_status_list | parent_company_shares_cutoff | spin_off_company_shares_received | taxable | fractional_payment_type | estimated_market_cap | record_date | distribution_date | trade_date | approval_date | parent_company_trading_when_issued_from_date | parent_company_trading_when_issued_to_date | spin_off_company_trading_when_issued_from_date | spin_off_company_trading_when_issued_to_date | comments               |
      | Create & Verify Spinoff with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Spinoff    | spinoff         | Facebook, inc         | 2021-03-25        | Approved           | APPROVED                |                           54 |                              100 | Yes     | Shares                  |                 6565 | 2021-03-25  | 2021-03-25        | 2021-03-25 | 2021-03-25    | 2021-03-25                                   | 2021-03-25                                 | 2021-03-25                                     | 2021-03-25                                   | DAggr GUI Cucumber POC |

  @smoke_stock_split
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I select stock split type as "<stock_split_type>"
    And I select status as "<status>"
    And I enter split ratio as "<split_ratio>"
    And I select revised stock trading date as "<revised_stock_trading_date>"
    And I select record date as "<record_date>"
    And I select split effective date as "<split_effective_date>"
    And I enter comments as "<comments>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<record_date>","","","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify Announcement Date as "<announcement_date>"
    And I verify stock split type as "<stock_split_type>"
    And I verify status as "<status>"
    And I verify split ratio as "<split_ratio>"
    And I verify revised stock trading date as "<revised_stock_trading_date>"
    And I verify record date as "<record_date>"
    And I verify split effective date as "<split_effective_date>"
    And I verify comments as "<comments>"

    Examples: 
      | testcase                                    | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type  | list_event_type | announcement_date | stock_split_type | status   | split_ratio | revised_stock_trading_date | record_date | split_effective_date | comments               |
      | Create & Verify Stock Split with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Stock Split | stock_split     | 2021-04-13        | STOCK_SPLIT      | APPROVED | 1:1         | 2021-04-13                 | 2021-04-13  | 2021-04-13           | DAggr GUI Cucumber POC |

  @smoke_summit_meeting
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter summit meeting name as "<summit_meeting_name>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select event start date as "<event_start_date>"
    And I select event end date as "<event_end_date>"
    And I select time provided as "<time_provided>"
    And I select event start time as "<event_start_time>" time provided as "<time_provided>"
    And I select event end time as "<event_end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select registration deadline as "<registration_deadline>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter seminar passcode as "<seminar_passcode>"
    And I enter contact person name as "<contact_person_name>"
    And I enter designation as "<designation>"
    And I enter phone number as "<phone_number>"
    And I enter email as "<email>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_start_date>","<event_start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify summit meeting name as "<summit_meeting_name>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify event start date as "<event_start_date>"
    And I verify event end date as "<event_end_date>"
    And I verify time provided as "<time_provided>"
    And I verify event start time as "<event_start_time>"
    And I verify event end time as "<event_end_time>"
    And I verify time zone as "<time_zone>"
    And I verify registration deadline as "<registration_deadline>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify seminar passcode as "<seminar_passcode>"
    And I verify contact person name as "<contact_person_name>"
    And I verify designation as "<designation>"
    And I verify phone number as "<phone_number>"
    And I verify email as "<email>"

    Examples: 
      | testcase                                       | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type     | list_event_type | announcement_date | summit_meeting_name | event_organizer | event_description | status | event_start_date | event_end_date | time_provided | event_start_time | event_end_time | time_zone        | registration_deadline | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | seminar_passcode | contact_person_name | designation | phone_number | email                         | comments                 |
      | Create & Verify Summit Meeting with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Summit Meeting | summit_meeting  | 2021-05-14        | summit_meeting      | summit_meeting  | summit_meeting    | Active | 2021-05-14       | 2021-05-15     | Yes           | 10:00:AM         | 04:00:PM       | America/New_York | 2021-04-02            | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | passcode         | PR                  | LALA        | +12766955095 | sqa_testc@digital-nirvana.com | DAggr_Automation_Comment |

  @smoke_trade_show
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter trade show name as "<trade_show_name>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select event start date as "<event_start_date>"
    And I select event end date as "<event_end_date>"
    And I select time provided as "<time_provided>"
    And I select event start time as "<event_start_time>" time provided as "<time_provided>"
    And I select event end time as "<event_end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select registration deadline as "<registration_deadline>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter seminar passcode as "<seminar_passcode>"
    And I enter contact person name as "<contact_person_name>"
    And I enter designation as "<designation>"
    And I enter phone number as "<phone_number>"
    And I enter email as "<email>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_start_date>","<event_start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify trade show name as "<trade_show_name>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify event start date as "<event_start_date>"
    And I verify event end date as "<event_end_date>"
    And I verify time provided as "<time_provided>"
    And I verify event start time as "<event_start_time>"
    And I verify event end time as "<event_end_time>"
    And I verify time zone as "<time_zone>"
    And I verify registration deadline as "<registration_deadline>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify seminar passcode as "<seminar_passcode>"
    And I verify contact person name as "<contact_person_name>"
    And I verify designation as "<designation>"
    And I verify phone number as "<phone_number>"
    And I verify email as "<email>"

    Examples: 
      | testcase                                   | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type | list_event_type | announcement_date | trade_show_name | event_organizer | event_description | status | event_start_date | event_end_date | time_provided | event_start_time | event_end_time | time_zone        | registration_deadline | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | seminar_passcode | contact_person_name | designation | phone_number | email                         | comments                 |
      | Create & Verify Trade Show with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Trade Show | trade_show      | 2021-05-16        | trade_show      | trade_show      | trade_show        | Active | 2021-05-16       | 2021-05-17     | Yes           | 10:00:AM         | 04:00:PM       | America/New_York | 2021-04-02            | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | passcode         | PR                  | LALA        | +12766955095 | sqa_testc@digital-nirvana.com | DAggr_Automation_Comment |

  @smoke_work_shop
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<login_email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<daggr_operator_type>
    When I navigate to File > Manual Job
    And I verify the form default as "corporate_actions"
    When I select article_link as "<article_link>"
    And I select Article Relevancy as "<article_relevancy>"
    And I enter Company Name as "<company_name>"
    And I select Event Type as "<event_type>"
    And I select Announcement Date as "<announcement_date>"
    And I enter work shop name as "<work_shop_name>"
    And I enter event organizer as "<event_organizer>"
    And I enter event description "<event_description>"
    And I select status as "<status>"
    And I select event start date as "<event_start_date>"
    And I select event end date as "<event_end_date>"
    And I select time provided as "<time_provided>"
    And I select event start time as "<event_start_time>" time provided as "<time_provided>"
    And I select event end time as "<event_end_time>" time provided as "<time_provided>"
    And I select time zone as "<time_zone>" time provided as "<time_provided>"
    And I select registration deadline as "<registration_deadline>"
    And I enter venue as "<venue>"
    And I enter address as "<address>"
    And I select country as "<country>"
    And I select state as "<state>"
    And I select city as "<city>"
    And I enter event link as "<event_link>"
    And I enter registration link as "<registration_link>"
    And I enter schedule link as "<schedule_link>"
    And I enter seminar passcode as "<seminar_passcode>"
    And I enter contact person name as "<contact_person_name>"
    And I enter designation as "<designation>"
    And I enter phone number as "<phone_number>"
    And I enter email as "<email>"
    And I click submit
    Then Check Success Message
    Then Navigate To Event List Page
    And I Click Event Popup "<company_name>","<event_start_date>","<event_start_time>","<time_zone>","<list_event_type>"
    And I verify Company Name as "<company_name>"
    And I verify Event Type as "<list_event_type>"
    And I verify work shop name as "<work_shop_name>"
    And I verify event organizer as "<event_organizer>"
    And I verify event description "<event_description>"
    And I verify status as "<status>"
    And I verify event start date as "<event_start_date>"
    And I verify event end date as "<event_end_date>"
    And I verify time provided as "<time_provided>"
    And I verify event start time as "<event_start_time>"
    And I verify event end time as "<event_end_time>"
    And I verify time zone as "<time_zone>"
    And I verify registration deadline as "<registration_deadline>"
    And I verify venue as "<venue>"
    And I verify address as "<address>"
    And I verify country as "<country>"
    And I verify state as "<state>"
    And I verify city as "<city>"
    And I verify event link as "<event_link>"
    And I verify registration link as "<registration_link>"
    And I verify schedule link as "<schedule_link>"
    And I verify seminar passcode as "<seminar_passcode>"
    And I verify contact person name as "<contact_person_name>"
    And I verify designation as "<designation>"
    And I verify phone number as "<phone_number>"
    And I verify email as "<email>"

    Examples: 
      | testcase                                  | daggr_operator_type | user_name | login_email               | password | article_link         | article_relevancy | company_name | event_type | list_event_type | announcement_date | work_shop_name | event_organizer | event_description | status | event_start_date | event_end_date | time_provided | event_start_time | event_end_time | time_zone        | registration_deadline | venue | address | country     | state      | city      | event_link          | registration_link   | schedule_link       | seminar_passcode | contact_person_name | designation | phone_number | email                         | comments                 |
      | Create & Verify Work Shop with all fields | Operator            | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://facebook.com | Yes               | Mahenda      | Work Shop  | work_shop       | 2021-05-20        | work_shop      | work_shop       | work_shop         | Active | 2021-05-20       | 2021-05-21     | Yes           | 10:00:AM         | 04:00:PM       | America/New_York | 2021-04-02            | DN    | HY      | Afghanistan | Badakhshan | Eshkashem | http://facebook.com | http://facebook.com | http://facebook.com | passcode         | PR                  | LALA        | +12766955095 | sqa_testc@digital-nirvana.com | DAggr_Automation_Comment |

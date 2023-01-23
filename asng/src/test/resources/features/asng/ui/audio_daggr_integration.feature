Feature: Daggr - Audio Integration

  @analyst_or_investor_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    # job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                                    | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name | event_type                     | list_event_type                | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value |
      | Create analyst or investor conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Polimeras    | Analyst or Investor Conference | analyst_or_investor_conference | 2022-03-15        | Active | 2022-03-15 | Yes           | 10:24:AM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-15  | All         | Company name      | Polimeras           |

  @annual_general_meeting_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    ##job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                                       | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                        | list_event_type                   | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | event_link                                                          | registration_link                                    | schedule_link                                        | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  | event_description        |
      | Create annual general meeting conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Annual General Meeting Conference | annual_general_meeting_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | https://ir.arcosa.com/news-events/events-presentations/default.aspx | https://services.choruscall.com/links/aca211104.html | https://services.choruscall.com/links/aca211104.html | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV | Annaul Event Description |

  @business_update_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    ##job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                                | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                 | list_event_type      | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | replay_beginning_date | replay_end_date | live_webcast_passcode | replay_webcast_passcode | event_description                 | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  |
      | Create business update conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Business Update Conference | business_update_call | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI | 2023-11-01            | 2023-11-30      |                       |                         | business update event description | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV |

  @corporate_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    # job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                          | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type           | list_event_type      | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  |
      | Create corporate conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Corporate Conference | corporate_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV |

  @earnings_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    ## job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                         | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type          | list_event_type     | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  |
      | Create earnings conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Earnings Conference | earnings_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV |

  @guidance_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    # job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                         | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type          | list_event_type     | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  |
      | Create guidance conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Guidance Conference | guidance_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV |

  @sales_or_revenue_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    # job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                                 | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                  | list_event_type             | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  |
      | Create sales or revenue conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Sales or Revenue Conference | sales_or_revenue_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV |

  @special_or_m_and_a_conference
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
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<audio_service_operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_date>,<event_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    # job_type values = "Live Phone and Live Webcast","Replay Phone and Replay Webcast","Live Phone","Replay Phone","Live Webcast","Replay Webcast"
    And I Click Pick Job <company_name>,<event_date>,<event_time>,<time_zone>
    And I Click Yes In Confirmation Popup In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Common Pool Success Popup <user_name>,<ticker>
    And I Close Common Pool Success Popup
    And I Verify Picked Job In Common Pool <company_name>,<event_date>,<event_time>,<time_zone>
    Then I Navigate To Call Recording Page
    And I Select Call Status In Call Recording <call_status>
    And I Select From Date In Call Recording <job_date_from>
    And I Select To Date In Call Recording <job_date_to>
    And I Select Call Recording Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Call Recording Apply Filter
    Then I Verify Search Results In Call Recording <call_status>,<job_date_from>,<job_date_to>,<search_filter_key>,<search_filter_value>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast_url>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_phone_international>","<live_passcode_international>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast_url>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_phone_international>","<replay_passcode_international>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Enable Preload Browser In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Select Webcast Link To Capture In Call Recording <job_type>
    And I Click Try To Auto Capture CheckBox In Call Recording
    And I Click Launch Browser In VNC In Call Recording
    And I Close Webcast Popup In Call Recording
    And I Click Start Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Started Toaster Message In Call Recording
    And I Switch Tab
    And I Click Connect In VNC
    And I Switch Tab
    And I Click Stop Recording In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Yes In Confirmation Popup In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    Then I Verify Recording Stopped Toaster Message In Call Recording
    And I Click Refresh Data In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Audio Player In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Close Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Verify Closed Job In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                                                   | daggr_operator_type | audio_service_operator_type | user_name | email                     | password | article_link                                                     | article_relevancy | company_name         | event_type                    | list_event_type               | announcement_date | status | event_date | time_provided | event_time | time_zone    | financial_quarter | financial_year | period_end_date | title                  | live_phone_us | live_passcode_us | live_phone_international | live_passcode_international | replay_phone_us | replay_passcode_us | replay_phone_international | replay_passcode_international | registration_phone | registration_passcode | live_webcast_url             | replay_webcast_url           | live_webcast_passcode | replay_webcast_passcode | comments               | ticker | product_type | job_type                    | job_date_from | job_date_to | call_status | search_filter_key | search_filter_value  |
      | Create special or m and a conference event & Record a call | Operator            | Operator                    | Gopi      | gopi.jeedimalla@gmail.com | Dnis@123 | https://www.cnbc.com/2021/07/26/tesla-tsla-earnings-q2-2021.html | Yes               | Core Laboratories NV | Special or M and A Conference | special_or_m_and_a_conference | 2022-03-09        | Active | 2022-03-10 | Yes           | 03:08:PM   | Asia/Kolkata | Q1                |           2021 | 2022-03-07      | Q1 Decorindesign Title | +184-45122921 |         13727051 | +185-54525696            |                     1696142 | +171-94570820   |            4954318 | +164-67224969              |                     425017855 |         8885446681 |                 45262 | https://youtu.be/2Hltnio7vhI | https://youtu.be/2Hltnio7vhI |                       |                         | DAggr GUI Cucumber POC | CLB    | delayed      | Live Phone and Live Webcast | 2022-03-09    | 2022-03-10  | All         | Company name      | Core Laboratories NV |

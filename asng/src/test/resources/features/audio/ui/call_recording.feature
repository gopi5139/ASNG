Feature: Call Recording

  @call_recording @preload_browser
  Scenario Template: <testcase>
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_international_phone>","<live_international_passcode>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
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
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_international_phone>","<live_international_passcode>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
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
      | testcase                            | email                     | password | user_name | operator_type | search_filter_key | search_filter_value | event_date  | event_time | ticker | company_name             | event_title                    | event_added_date | live_webcast                                 | live_phone_us | live_international_phone | registration_phone | event_type          | event_added_time | live_webcast_passcode | live_passcode_us | live_international_passcode | registration_passcode | replay_phone_us | replay_international_phone | replay_passcode_us | replay_international_passcode | replay_webcast                              | replay_webcast_passcode | product_type | job_type                    | job_date_from | job_date_to | call_status | time_zone    |
      | Record a call using preload browser | gopi.jeedimalla@gmail.com | Dnis@123 | Gopi      | Operator      | Ticker            | NNB                 | 25-Feb-2022 | 07:15 AM   | NNB    | Sri automobiles industry | Earnings Conference Ticker Nnb | 25-Feb-2022      | https://edge.media-server.com/mmc/p/see9a82o | +184-45122921 | +185-54525696            |         8885446681 | Earnings Conference | 12:45 PM         |                       |         13727051 |                     1696142 |                 45262 | +171-94570820   | +164-67224969              |            4954318 |                     425017855 | https://www.youtube.com/watch?v=-gpeiYwu1pk |                         | delayed      | Live Phone and Live Webcast | 2022-02-25    | 2022-02-25  | All         | Asia/Kolkata |

  @call_recording @container_url
  Scenario Template: <testcase>
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_international_phone>","<live_international_passcode>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
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
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_international_phone>","<live_international_passcode>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
    And I Click Webcast Link In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Container URL Copy In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Container URL New Tab In Call Recording <event_date>,<event_time>,<company_name>,<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                            | email                     | password | user_name | operator_type | search_filter_key | search_filter_value | event_date  | event_time | ticker | company_name             | event_title                    | event_added_date | live_webcast                                 | live_phone_us | live_international_phone | registration_phone | event_type          | event_added_time | live_webcast_passcode | live_passcode_us | live_international_passcode | registration_passcode | replay_phone_us | replay_international_phone | replay_passcode_us | replay_international_passcode | replay_webcast                              | replay_webcast_passcode | product_type | job_type                    | job_date_from | job_date_to | call_status | time_zone    |
      | Record a call using preload browser | gopi.jeedimalla@gmail.com | Dnis@123 | Gopi      | Operator      | Ticker            | NNB                 | 25-Feb-2022 | 07:15 AM   | NNB    | Sri automobiles industry | Earnings Conference Ticker Nnb | 25-Feb-2022      | https://edge.media-server.com/mmc/p/see9a82o | +184-45122921 | +185-54525696            |         8885446681 | Earnings Conference | 12:45 PM         |                       |         13727051 |                     1696142 |                 45262 | +171-94570820   | +164-67224969              |            4954318 |                     425017855 | https://www.youtube.com/watch?v=-gpeiYwu1pk |                         | delayed      | Live Phone and Live Webcast | 2022-02-25    | 2022-02-25  | All         | Asia/Kolkata |

  @call_recording @update_job_details
  Scenario Template: <testcase>
    Given I Launch Audio Service Application
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<operator_type>
    Then I Navigate To Common Pool Page
    And I Select Common Pool Search Filter Type Is <search_filter_key> And Search Keyword Is <search_filter_value>
    And I Click Common Pool Apply Filter
    Then I Verify Search Results In Common Pool <search_filter_key>,<search_filter_value>
    And I Verify Job Details In Common Pool <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Common Pool <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Common Pool <company_name>,<event_date>,<event_time>,"<live_webcast>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_international_phone>","<live_international_passcode>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Common Pool <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
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
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<live_webcast>","<live_webcast_passcode>","<live_phone_us>","<live_passcode_us>","<live_international_phone>","<live_international_passcode>","<registration_phone>","<registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
    And I Click Edit In Call Recording <company_name>,<event_date>,<event_time>,<time_zone>
    And I Enter Webcast Link In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_live_webcast>"
    And I Enter Password In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_live_webcast_passcode>"
    And I Enter Meeting ID In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_meeting_id>"
    And I Enter Control Number In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_control_number>"
    And I Enter Live Phone Us In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_live_phone_us>"
    And I Enter Live Passcode Us In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_live_passcode_us>"
    And I Enter Live Phone International In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_live_phone_international>"
    And I Enter Live International Us In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_live_passcode_international>"
    And I Enter Registration Phone In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_registration_phone>"
    And I Enter Registration Passcode In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>,"<update_registration_passcode>"
    And I Click Save In Call Recording Edit Popup <company_name>,<event_date>,<event_time>,<time_zone>
    And I Verify Job Details In Call Recording <company_name>,<event_date>,<event_time>,<ticker>,"<live_passcode_us>",<job_type>,<time_zone>
    And I Verify Event Details In Call Recording <company_name>,<event_date>,<event_time>,<event_title>,<event_type>,<event_added_date>,<event_added_time>,<product_type>,<time_zone>
    And I Verify Live Details In Call Recording <company_name>,<event_date>,<event_time>,"<update_live_webcast>","<update_live_webcast_passcode>","<update_live_phone_us>","<update_live_passcode_us>","<update_live_phone_international>","<update_live_passcode_international>","<update_registration_phone>","<update_registration_passcode>",<time_zone>
    And I Verify Replay Details In Call Recording <company_name>,<event_date>,<event_time>,"<replay_webcast>","<replay_webcast_passcode>","<replay_phone_us>","<replay_passcode_us>","<replay_international_phone>","<replay_international_passcode>",<time_zone>
    And I Click Audio Service Log Out

    Examples: 
      | testcase                            | email                     | password | user_name | operator_type | search_filter_key | search_filter_value | event_date  | event_time | ticker | company_name             | event_title                    | event_added_date | live_webcast                                 | live_phone_us | live_international_phone | registration_phone | event_type          | event_added_time | live_webcast_passcode | live_passcode_us | live_international_passcode | registration_passcode | replay_phone_us | replay_international_phone | replay_passcode_us | replay_international_passcode | replay_webcast                              | replay_webcast_passcode | product_type | job_type                    | job_date_from | job_date_to | call_status | time_zone    | update_live_webcast    |update_live_webcast_passcode|update_meeting_id|update_control_number|update_live_phone_us|update_live_passcode_us|update_live_phone_international|update_live_passcode_international|update_registration_phone|update_registration_passcode|
      | Record a call using preload browser | gopi.jeedimalla@gmail.com | Dnis@123 | Gopi      | Operator      | Ticker            | NNB                 | 25-Feb-2022 | 07:15 AM   | NNB    | Sri automobiles industry | Earnings Conference Ticker Nnb | 25-Feb-2022      | https://edge.media-server.com/mmc/p/see9a82o | +184-45122921 | +185-54525696            |         8885446681 | Earnings Conference | 12:45 PM         |                       |         13727051 |                     1696142 |                 45262 | +171-94570820   | +164-67224969              |            4954318 |                     425017855 | https://www.youtube.com/watch?v=-gpeiYwu1pk |                         | delayed      | Live Phone and Live Webcast | 2022-02-25    | 2022-02-25  | All         | Asia/Kolkata | https://edge.media-server.com/mmc/p/see9a82o    |5896520|45685|98589526852|+1-56829420|56823|+1-526205620|632550|9666696666|785626|
   
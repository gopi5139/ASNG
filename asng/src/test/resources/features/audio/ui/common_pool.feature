Feature: Common Pool

  @common_pool
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
    And I Click Audio Service Log Out

    Examples: 
      | testcase                            | email                     | password | user_name | operator_type | search_filter_key | search_filter_value | event_date  | event_time | ticker | company_name             | event_title                    | event_added_date | live_webcast                                 | live_phone_us | live_international_phone | registration_phone | event_type          | event_added_time | live_webcast_passcode | live_passcode_us | live_international_passcode | registration_passcode | replay_phone_us | replay_international_phone | replay_passcode_us | replay_international_passcode | replay_webcast                              | replay_webcast_passcode | product_type | job_type                    |time_zone|
      | Record a call using preload browser | gopi.jeedimalla@gmail.com | Dnis@123 | Gopi      | Operator      | Ticker            | NNB                 | 25-Feb-2022 | 07:15 AM   | NNB    | Sri automobiles industry | Earnings Conference Ticker Nnb | 25-Feb-2022      | https://edge.media-server.com/mmc/p/see9a82o | +184-45122921 | +185-54525696            |         8885446681 | Earnings Conference | 12:45 PM         |                       |         13727051 |                     1696142 |                 45262 | +171-94570820   | +164-67224969              |            4954318 |                     425017855 | https://www.youtube.com/watch?v=-gpeiYwu1pk |                         | delayed      | Live Phone and Live Webcast |Asia/Kolkata|

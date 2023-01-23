Feature: Job Status

  @job_status
  Scenario Template: <testcase>
    When I Enter Username <email> and Password <password>
    Then I Click Audio Service Signin
    Then I Verify Audio Service Navbar <user_name>,<operator_type>
    Then I Navigate To Job Status Page
    And I Select Job Status In Job Status <job_status>
    And I Select From Date In Job Status <from_date>
    And I Select To Date In Job Status <to_date>
    And I Select Search Filter Key <search_filter_key> And Search Value <search_filter_value> In Job Status
    And I Click Job Status Apply Filter
    And I Verify Search Results In Job Status "<job_status>","<from_date>","<to_date>","<upload_status>","<search_filter_key>","<search_filter_value>","<event_date>","<event_time>","<company_name>","<event_title>","<call_status>","<recorded_by>","<ticker>","<job_date>"

    Examples: 
      | testcase                 | email                     | password | user_name | operator_type | job_status  | from_date  | to_date    | search_filter_key | search_filter_value      | upload_status | event_date  | event_time | company_name             | event_title                    | call_status | recorded_by                          | ticker | event_id                             | short_id  | job_date    |
      | Check Job Status Filters | gopi.jeedimalla@gmail.com | Dnis@123 | Gopi      | Operator      | In Progress | 2022-02-12 | 2022-02-16 | Company name      | Sri automobiles industry |               | 16-Feb-2022 | 08:47 AM   | Sri automobiles industry | Earnings Conference Ticker Nnb | In Progress | 83fa807a-186f-4648-9b98-40e9d232ff10 | NNB    | a270b5c2-20eb-4a78-af5a-c179a420d873 | BrLEgB-dI | 16-Feb-2022 |

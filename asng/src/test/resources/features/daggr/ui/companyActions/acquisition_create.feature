Feature: Acquisition

  @create_acquisition
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then I Verify Daggr Navbar <user_name>,<role>
    Then Click Manual Job
    Then Select Acquisition
    And Enter Mandatory Acquisition Article Url <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Acquisition Acquirer Company Name <acquirer_company_name>
    And Enter Mandatory Acquisition Target Company Name <target_company_name>
    And Enter Mandatory Acquisition Effective Date <effective_date>
    And Enter Mandatory Acquistion Time Zone <time_zone>
    And Select Optional Company Name Changed Post Acquisition "<company_name_changed_post_acquisition>"
    And Enter Mandatory/Optional New Company Name "<new_company_name>"
    And Click Acquisition Submit
    Then Check Success Message
    Then Navigate To Company Actions
    And Enter Search Company Name <acquirer_company_name>
    And Enter Search Company Action "acquisition"
    And Click Search Apply Filter
    Then Click popup based on company name <acquirer_company_name> and effective date <effective_date>
    And Verify Acquistion Acquirer Company Name <acquirer_company_name>
    And Verify Acquistion Target Company Name <target_company_name>
    And Verify Acquistion Effective Date <effective_date>
    And Verify Acquistion Time Zone <time_zone>
    And Verify Acquistion Company Name Changed Post Acquisition "<company_name_changed_post_acquisition>"
    And Verify Acquistion New Company Name "<new_company_name>"

    Examples: 
      | testcase                           | email                         | password | user_name             | role | article_url            | acquirer_company_name | target_company_name | effective_date | time_zone    | company_name_changed_post_acquisition | new_company_name |
      | Create a post acquisition with Yes | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Decathlon             | wipro               | 2021-11-22     | Asia/Kolkata | Yes                                   | Marsh            |
      | Create a post acquisition with No  | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | wipro                 | Decathlon           | 2021-10-26     | Asia/Kolkata | No                                    |                  |

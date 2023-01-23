Feature: Add Persons

  @smoke_person @smoke
  Scenario Template: <testcase>
    Given I Launch Daggr Application
    When I enter "<email>" and "<password>"
    And I click Daggr Signin button
    Then Click Manual Job
    Then Select Add Persons
    And Enter Mandatory Add Persons Article Link <article_url>
    #Unable to upload document in automation.
    And Enter Mandatory Person Name <person_name>
    And Enter Mandatory Gender <gender>
    And Select Optional Status "<status>"
    And Select Optional Resigned Date "<resigned_date>"
    #And Select Optional Retired Date "<retired_date>"
    #And Select Optional Dismissed Date "<dismissed_date>"
    And Enter Optional Person Email "<person_email>"
    And Select Optional Date of Birth "<dob>"
    And Select Optional Deceased "<deceased>"
    #And Select Optional Deceased Date "<deceased_date>"
    And Enter Optional Biography "<biography>"
    And Click Optional Add Education
    And Enter Mandatory Eductational Institution <educational_institution>
    And Enter Optional Eductational Qualification "<educational_qualificaton>"
    And Enter Optional Eductational Description "<educational_description>"
    And Select Optional Educational Start Date "<educational_start_date>"
    And Select Optional Educational End Date "<educational_end_date>"
    And Click Optional Add Work History
    And Enter Mandatory Work History Company Name <work_history_company_name>
    And Select Mandatory Currently Working <currently_working>
    And Enter Mandatory Work History Designation <work_history_designation>
    And Enter Optional Work History Description "<work_history_description>"
    And Select Optional Work History Start Date "<work_history_start_date>"
    And Select Optional Work History End Date "<work_history_end_date>"
    And Select Mandatory Details Type <details_type>
    And Enter Optional Year "<year>"
    And Enter Optional Currency "<currency>"
    And Enter Optional Salary "<salary>"
    And Enter Optional Bonus "<bonus>"
    And Enter Optional Cash Awards "<cash_awards>"
    And Enter Optional Stock Awards "<stock_awards>"
    And Enter Optional Option Awards "<option_awards>"
    And Enter Optional Pension & Deferred "<pension_deferred>"
    And Enter Optional Non Equity Incentives "<non_equity_incentives>"
    And Enter Optional Other Compensation "<other_compensation>"
    And Enter Optional Total "<total>"
    And Select Optional Sector Coverage "<sector_coverage>"
    And Enter Optional Work History Phone Number "<work_history_phone_number>"
    And Enter Optional Work History Email "<work_history_email>"
    And Enter Optional Currency Type "<currency_type>"
    And Enter Mandatory Coverage Company Name <company_coverage_company_name>
    And Select Optional Coverage Start Date "<coverage_start_date>"
    And Select Optional Coverage End Date "<coverage_end_date>"
    And Click Person Submit button
    Then Check Success Message
    Then Navigate To Persons List Page ""
    Then Search By Person Name <person_name>
    And Click Action
    Then Check Mandatory Person Name <person_name>
    And Check Mandatory Gender <gender>
    And Check Optional Status "<status>"
    And Check Optional Resigned Date "<resigned_date>"
    #And Check Optional Retired Date "<retired_date>"
    #And Check Optional Dismissed Date "<dismissed_date>"
    And Check Optional Person Email "<person_email>"
    And Check Optional Date of Birth "<dob>"
    #And Check Optional Deceased "<deceased>"
    #And Check Optional Deceased Date "<deceased_date>"
    And Check Optional Biography "<biography>"
    And Check Mandatory Eductational Institution <educational_institution>
    And Check Optional Eductational Qualification "<educational_qualificaton>"
    And Check Optional Eductational Description "<educational_description>"
    And Check Optional Educational Start Date "<educational_start_date>"
    And Check Optional Educational End Date "<educational_end_date>"
    And Check Mandatory Work History Company Name <work_history_company_name>
    And Check Mandatory Currently Working <currently_working>
    And Check Mandatory Work History Designation <work_history_designation>
    And Check Optional Work History Description "<work_history_description>"
    And Check Optional Work History Start Date "<work_history_start_date>"
    And Check Optional Work History End Date "<work_history_end_date>"
    And Check Mandatory Details Type <details_type>
    And Check Optional Year "<year>"
    And Check Optional Currency "<currency>"
    And Check Optional Salary "<salary>"
    And Check Optional Bonus "<bonus>"
    And Check Optional Cash Awards "<cash_awards>"
    And Check Optional Stock Awards "<stock_awards>"
    And Check Optional Option Awards "<option_awards>"
    And Check Optional Pension & Deferred "<pension_deferred>"
    And Check Optional Non Equity Incentives "<non_equity_incentives>"
    And Check Optional Other Compensation "<other_compensation>"
    And Check Optional Total "<total>"
    And Check Optional Sector Coverage "<sector_coverage>"
    And Check Optional Work History Phone Number "<work_history_phone_number>"
    And Check Optional Work History Email "<work_history_email>"
    And Check Optional Currency Type "<currency_type>"
    And Check Mandatory Coverage Company Name <company_coverage_company_name>
    And Check Optional Coverage Start Date "<coverage_start_date>"
    And Check Optional Coverage End Date "<coverage_end_date>"

    Examples: 
      | testcase        | email                         | password | user_name             | role | article_url            | person_name | gender | status   | resigned_date | retired_date | dismissed_date | person_email     | dob        | deceased | deceased_date | biography      | educational_institution | educational_qualificaton | educational_description          | educational_start_date | educational_end_date | work_history_company_name          | currently_working | work_history_designation | work_history_description       | work_history_start_date | work_history_end_date | details_type | year | currency     | salary | bonus | cash_awards | stock_awards | option_awards | pension_deferred | non_equity_incentives | other_compensation | total       | sector_coverage                              | work_history_phone_number | work_history_email     | currency_type | company_coverage_company_name | coverage_start_date | coverage_end_date |
      | Create a person | gopikumar@digital-nirvana.com | Dnis@123 | Gopi Kumar Jeedimalla | TL   | https://www.kroger.in/ | Sasank      | Male   | Resigned | 2021-10-07    | 2021-10-07   | 2021-10-07     | sasank@gmail.com | 1992-09-25 | No       | 2021-03-20    | An IT Employee | Vignan                  | Bachelor Of Technology   | Computer Science and Engineering | 2008-06-12             | 2012-05-16           | State Street India Private Limited | No                | Senior Software Engineer | Worked as a software developer | 2014-10-01              | 2020-06-05            | Analyst      | 2020 | Indian Rupee | 656233 | 42424 |        4245 |        54545 |          5454 |             2144 |                  2465 |               4646 | 12552438654 | Technology,Health Care,Communications,Energy |               99999999999 | sasank@statestreet.com | Indian Rupee  | Decathlon                     | 2014-10-01          | 2020-06-05        |

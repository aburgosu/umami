Feature: Search
  Scenario: Search basic validation
  Given the user creates the following jobs
      |with car title             |car driver |
      |without keyword in tittle  |job2       |
      |job3                       |car driver2|
      |car driver3                |job4       |
      |carlos                     |job5       |
      |job6                       |carmen     |
      |car                        |job7       |
      |job8                       |car        |
    And the user in in the search page
    When the user search for a job with "car" keyword
    Then the job "with car title" should be displayed
    Then the job "without keyword in tittle" should not be displayed
    Then the job "job3" should be displayed
    Then the job "car driver3" should be displayed
    Then the job "carlos" should not be displayed
    Then the job "job6" should not be displayed
    Then the job "car" should be displayed
    Then the job "job8" should be displayed





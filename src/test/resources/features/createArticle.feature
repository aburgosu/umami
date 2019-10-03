Feature: Create new Article

  Background:
    Given I login page as administrator

  Scenario: Create a new Article
    When I go to createArticle page
    And I fill the Article form with the following data
      | Title            | Article Test title  |
      | Body             | Article description |
      | Tags             | tagtest             |
      | Moderation state | published           |
    Then the confirmation message is displayed
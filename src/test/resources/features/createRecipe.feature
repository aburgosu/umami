Feature: Recipe Creation
    Scenario: Create a new Recipe content
    Given I go the login page
      And I login as administrator
    When I go to to the new recipe page
      And I fill the new recipe form with the following description
        | title           | Recipe test           |
        | preparationTime | 25                    |
        | numberOfServing | 4                     |
        | dificulty       | Medio                 |
        | summary         | recipe summary        |
        | ingredients     | onions, carrots, eggs |
        | instruction     | Step1, Step2, Step3   |
        | saveAs          | Borrador              |
     Then the new Recipe's title should be displayed
      And the Recipe's difficulty should be displayed

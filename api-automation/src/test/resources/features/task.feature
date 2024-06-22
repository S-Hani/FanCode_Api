Feature: Task Percentage verification
  Scenario: All the users of city FanCode should have more than half of their todo tasks completed
    Given User has todo tasks
    And User belongs to the city FanCode
    Then User completed task percentage should be greater than 50%


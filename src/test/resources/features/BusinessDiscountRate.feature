Feature: Test

  Scenario Outline: Check giam gia
    Given Customer <name> and <isMember> and <memberType>
    When Customer shopping in <date> with <serviceExpense> and <productExpense>
    Then Total expense is <totalExpense>

    Examples:
      | name       | isMember | memberType | date       | serviceExpense | productExpense | totalExpense |
      | John       | TRUE     | GOLD       | 01/01/2022 | 500            | 400            | 785          |
      | Jame       | FALSE    |            | 10/10/2021 | 499.99         | 349.99         | 849.98       |
      | Emily      | TRUE     | PREMIUM    | 5/10/2021  | 799            | 567.999        | 1150.399     |
      | Jessica    | TRUE     | PREMIUM    | 5/1/2022   | 799            |                | 639.2        |
      | Brian      | FALSE    |            | 7/1/2022   | 899.99         |                | 899.99       |
      | Hiddleston | TRUE     | SILVER     | 10/10/2020 | 789            | 199            | 889.2        |
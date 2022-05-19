Feature: thu nghiem may tinh
  Scenario: thuc hien phep cong
    Given tao mot may tinh
    When tinh tong 5 va 6
    Then ket qua nen bang 11

#    Scenario outline la chay nhieu scenario
    Scenario Outline:
      Given tao mot may tinh
      When tinh tong <a> va <b>
      Then ket qua nen bang <c>
      Examples:
        | a | b | c |
        | 3 | 4 | 7 |
        | 4 | 5 | 9 |

      Scenario: chia cho 0
        Given tao mot may tinh
        When tinh thuong 5 va 0
        Then nem ra exception "RuntimeException"
        And noi dung la "Mau so phai khac 0"


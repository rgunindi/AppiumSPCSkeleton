Feature: make a payment to three different client

  @payment
  Scenario Outline: make payment for each country in countries list
    When Catch older version pop_up And LoginApp
    Then Open payment page
    When client country is <Country> Country and <Amount> Amount and <Phone> Phone and <Name> Name
    Then client balance check <Amount> amount
    Then client logout successfully
    Examples:
      | Country   |  | Amount    || Phone    |     | Name        |
      | Canada    |    | 10 |    | 5557891501|    | Isac         |
      | USA       |    | 20 |    | 5303241302|    | Einstein     |
      | JAPAN     |    | 30 |    | 5451841501|    | Frankenstein |
      | New Zealand |  | 100 |   | 9541841501|    | Hezarfen |


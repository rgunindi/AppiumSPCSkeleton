<h1 align="center">Hi 👋, I'm Ramazan Günindi</h1>
<h3 align="center">The steps applied in this project are described below.</h3>

```feature  
Feature: I as a user want to authenticate in the application to check my credentials


  @auth_incorrect
  Scenario: check login with incorrect username and password
    When Catch older version pop_up
    When I login with username incompany and password company
    Then you should see the information toast


  @auth_correct
  Scenario: check login with correct username and password<p>
    When Catch older version pop_up
    When I login with username company and password company 
    Then you should see the home page
```    
     
     Payment Steps Descriptions[Feature 2:]

```feature     
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
```    

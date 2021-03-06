Feature: Booking The Hotel in Adactin Hotel App
Scenario Outline: Login Functionality
Given user Enter The Url
When  user Enter The "<username>" In Username Field
And user Enter The "<password>" In The Password Field
Then Click The Login And Navigates To Search Hotel Page

Examples:
|username|password|
|revathi|revathi7|
|abc|123|
|revathimuthu|revathi7|

Scenario: Search Hotel Functionality
When user select the "Brisbane" In the Location Field
And User Select The "Hotel Cornice" In The Hotel Field
And User Select The "Double" In Roomtype Field
And User Select The "2" In This Field
And user Select The "2" In AdaultperRoom Field
And user Select The "1" In ChildrenPerRoom Field
Then user Click The Search Button And Its Navigates To Select Hotel Page

Scenario: Select Hotel Functionality
When User Click The Radio Button In The Select Field
Then User Click The Continue Button And Navigates To Book A Hotel Page

Scenario: Book The Hotel Functionality
When user Must Enter The FirstName In The Name Field
And user Must Enter The LastName In The LastName Field  
And User Must Enter The Billing Address In Address Field
And User Must CreditCard Number In The CreditCard Field
And user Select CreditCard Type In The Creditcardtype Field
And user Select Year And Month In The ExpiryDate Field
And user Enter cvvNumber In The Cvv Number Field
Then User Click The Book Button And Navigates to Booking Confirmaion Page

Scenario: Booking Confirmation Functionality
Then User Click The MyItinary In MyInTinary Button

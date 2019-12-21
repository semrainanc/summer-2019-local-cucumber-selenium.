@nav_menu
Feature: sales managers should be able to navigate to pages using the top menu


  Scenario: Fleet --> Vehicles
    Given the user is on the login page
    And the user enters the sales manager login information
    When the user goes to Fleet, Vehicles
    Then the url should be https://qa3.vytrack.com/entity/Extend_Entity_Carreservation


  @sales_manager
  Scenario: Marketing --> Campaigns
    Given the user is on the login page
    And the user enters the sales manager login information
    When the user goes to Marketing, Campaigns
    Then the url should be https://qa3.vytrack.com/campaign/

  @nav_menu
  Scenario: Marketing --> Campaigns
    Given the user is on the login page
    And the user enters the sales manager login information
    When the user goes to Activities, Calendar Events
    Then the url should be https://qa3.vytrack.com/calendar/event
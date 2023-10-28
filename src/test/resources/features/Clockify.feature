
Feature: jhkhjik
  @Clockify
  Scenario Outline: login
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    #Then Home page is displayed

    Examples:
      | email             | password  |
      | xnahuex@gmail.com | Asdasd123 |
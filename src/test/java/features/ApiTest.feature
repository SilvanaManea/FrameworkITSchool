Feature: Check health test endpoint

  Scenario: Check health test endpoint
    Given I send a GET request to the health check API
    Then the response body contains "Notes API is Running"

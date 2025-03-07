Feature: Get all products from API

  Scenario: Verify the get api for products
    Given I hit the url of get products api endpoint
    When I pass the url in the request
    Then I receive the response code as 200
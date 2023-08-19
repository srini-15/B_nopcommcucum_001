@smoke
Feature: Edit feature in products

  Scenario: Edit the product name with valid name
    Given user is in login page
    When user enters email "admin@yourstore.com" and pass as "admin"
    And clicks on login button
    Then user should in homepage
    And user click on catalog dropdown
    And user select on products option
    Then product page should be displayed
    And enter product name as "nikon"
    And click on search button
    When scroll down till end
    And click on edit button
    And edit the product as "NIKON_V0001" in product name
    When user save the product
    Then user received the message "The product has been updated successfully."
    And enter product name as "nikon"
    And click on search button
    When scroll down till end
    And see the same name "NIKON_V0001" is appeared and take the screenshot

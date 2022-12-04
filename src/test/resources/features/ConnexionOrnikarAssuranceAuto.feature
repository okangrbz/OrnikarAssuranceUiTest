
@connexionOrnikarAssuranceAuto
Feature: Login OrnikarAssurance Ui Test

  Background: Steps commun
    Given I go to the OrnikarAssurance-Auto page
    When  I accept cookies
    And I press <Connexion>
    And I choose OrnikarAssurance


  @Ns_EmailInvalide
  Scenario: TC07 The user cannot connect his OrnikarAssurance user account by entering an INVALID password
    And I entre a INVALID email
    And I entre a valid Password
    Then   I click on the sign-in button below the page
    And  I check sign-in is done unsuccessfully
    And I close the browser


  @Ns_PassInvalide
  Scenario: TC08 The user cannot connect his OrnikarAssurance user account by entering an INVALID password
    And I entre a valid email
    And I entre an INVALID Password
    Then   I click on the sign-in button below the page
    And  I verify sign-in is done unsuccessfully
    And I close the browser
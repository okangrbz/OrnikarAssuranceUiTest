
  @connexionOrnikar
  Feature: Login Ornikar Ui Test

    Background: Steps commun
      Given I go to the OrnikarAssurance-Auto page
      When  I accept cookies
      And I press <Connexion>
      And I choose Ornikar


      @NonRegressionTest
      @smokeTest
    Scenario:  TC06 The user can connect his Ornikar user account by entering his valid password and email
      And I entre a valid email
      And I entre a valid Password
      Then   I click on the sign-in button below the page
      And  I verify sign-in is done successfully
      And I close the browser


    @NonRegressionTest
   Scenario: TC07 The user cannot connect his Ornikar user account by entering an INVALID password
      And I entre a INVALID email
      And I entre a valid Password
      Then   I click on the sign-in button below the page
      And  I check sign-in is done unsuccessfully
      And I close the browser


    @NonRegressionTest
    Scenario: TC08 The user cannot connect his Ornikar user account by entering an INVALID password
      And I entre a valid email
      And I entre an INVALID Password
      Then   I click on the sign-in button below the page
      And  I verify sign-in is done unsuccessfully
      And I close the browser
